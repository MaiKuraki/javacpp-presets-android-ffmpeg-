// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tvm;

import org.bytedeco.tvm.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;
import static org.bytedeco.mkl.global.mkl_rt.*;

import static org.bytedeco.tvm.global.tvm_runtime.*;


/** \brief A specialization of hash map that implements the idea of array-based hash map.
 * Another reference implementation can be found [1].
 *
 * A. Overview
 *
 * DenseMapNode did several improvements over traditional separate chaining hash,
 * in terms of cache locality, memory footprints and data organization.
 *
 * A1. Implicit linked list. For better cache locality, instead of using linked list
 * explicitly for each bucket, we store list data into a single array that spans contiguously
 * in memory, and then carefully design access patterns to make sure most of them fall into
 * a single cache line.
 *
 * A2. 1-byte metadata. There is only 1 byte overhead for each slot in the array to indexing and
 * traversal. This can be divided in 3 parts.
 * 1) Reserved code: (0b11111111)_2 indicates a slot is empty; (0b11111110)_2 indicates protected,
 * which means the slot is empty but not allowed to be written.
 * 2) If not empty or protected, the highest bit is used to indicate whether data in the slot is
 * head of a linked list.
 * 3) The rest 7 bits are used as the "next pointer" (i.e. pointer to the next element). On 64-bit
 * architecture, an ordinary pointer can take up to 8 bytes, which is not acceptable overhead when
 * dealing with 16-byte ObjectRef pairs. Based on a commonly noticed fact that the lists are
 * relatively short (length <= 3) in hash maps, we follow [1]'s idea that only allows the pointer to
 * be one of the 126 possible values, i.e. if the next element of i-th slot is (i + x)-th element,
 * then x must be one of the 126 pre-defined values.
 *
 * A3. Data blocking. We organize the array in the way that every 16 elements forms a data block.
 * The 16-byte metadata of those 16 elements are stored together, followed by the real data, i.e.
 * 16 key-value pairs.
 *
 * B. Implementation details
 *
 * B1. Power-of-2 table size and Fibonacci Hashing. We use power-of-two as table size to avoid
 * modulo for more efficient arithmetics. To make the hash-to-slot mapping distribute more evenly,
 * we use the Fibonacci Hashing [2] trick.
 *
 * B2. Traverse a linked list in the array.
 * 1) List head. Assume Fibonacci Hashing maps a given key to slot i, if metadata at slot i
 * indicates that it is list head, then we found the head; otherwise the list is empty. No probing
 * is done in this procedure. 2) Next element. To find the next element of a non-empty slot i, we
 * look at the last 7 bits of the metadata at slot i. If they are all zeros, then it is the end of
 * list; otherwise, we know that the next element is (i + candidates[the-last-7-bits]).
 *
 * B3. InsertMaybeReHash an element. Following B2, we first traverse the linked list to see if this
 * element is in the linked list, and if not, we put it at the end by probing the next empty
 * position in one of the 126 candidate positions. If the linked list does not even exist, but the
 * slot for list head has been occupied by another linked list, we should find this intruder another
 * place.
 *
 * B4. Quadratic probing with triangle numbers. In open address hashing, it is provable that probing
 * with triangle numbers can traverse power-of-2-sized table [3]. In our algorithm, we follow the
 * suggestion in [1] that also use triangle numbers for "next pointer" as well as sparing for list
 * head.
 *
 * [1] https://github.com/skarupke/flat_hash_map
 * [2] https://programmingpraxis.com/2018/06/19/fibonacci-hash/
 * [3] https://fgiesen.wordpress.com/2015/02/22/triangular-numbers-mod-2n/
 */
@Namespace("tvm::runtime") @NoOffset @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class DenseMapNode extends MapNode {
    static { Loader.load(); }
    /** Default native constructor. */
    public DenseMapNode() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DenseMapNode(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DenseMapNode(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public DenseMapNode position(long position) {
        return (DenseMapNode)super.position(position);
    }
    @Override public DenseMapNode getPointer(long i) {
        return new DenseMapNode((Pointer)this).offsetAddress(i);
    }


  /**
   * \brief Destroy the DenseMapNode
   */
  /** @return The number of elements of the key */
  public native @Cast("size_t") long count(@Const @ByRef ObjectRef key);
  /**
   * \brief Index value associated with a key, throw exception if the key does not exist
   * @param key The indexing key
   * @return The const reference to the value
   */
  /**
   * \brief Index value associated with a key, throw exception if the key does not exist
   * @param key The indexing key
   * @return The mutable reference to the value
   */
  public native @ByRef ObjectRef at(@Const @ByRef ObjectRef key);
  /**
   * \brief Index value associated with a key
   * @param key The indexing key
   * @return The iterator of the entry associated with the key, end iterator if not exists
   */
  public native @ByVal @Cast("tvm::runtime::MapNode::iterator*") Pointer find(@Const @ByRef ObjectRef key);
  /**
   * \brief Erase the entry associated with the iterator
   * @param position The iterator
   */
  public native void erase(@Cast("const tvm::runtime::MapNode::iterator*") @ByRef Pointer _position);
  /** @return begin iterator */
  public native @ByVal @Cast("tvm::runtime::MapNode::iterator*") Pointer begin();
  /** @return end iterator */
  public native @ByVal @Cast("tvm::runtime::MapNode::iterator*") Pointer end();
}
