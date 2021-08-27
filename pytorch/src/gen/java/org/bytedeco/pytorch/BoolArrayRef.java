// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;

@Name("c10::ArrayRef<decltype(::c10::impl::ScalarTypeToCPPType<::c10::ScalarType::Bool>::t)>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class BoolArrayRef extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BoolArrayRef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BoolArrayRef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BoolArrayRef position(long position) {
        return (BoolArrayRef)super.position(position);
    }
    @Override public BoolArrayRef getPointer(long i) {
        return new BoolArrayRef((Pointer)this).offsetAddress(i);
    }

  /** \name Constructors
   *  \{
   <p>
   *  Construct an empty ArrayRef. */
  /* implicit */ public BoolArrayRef() { super((Pointer)null); allocate(); }
private native void allocate();

  /** Construct an ArrayRef from a single element. */
  // TODO Make this explicit
  public BoolArrayRef(@Cast("const decltype(::c10::impl::ScalarTypeToCPPType<::c10::ScalarType::Bool>::t)") boolean OneElt) { super((Pointer)null); allocate(OneElt); }
  private native void allocate(@Cast("const decltype(::c10::impl::ScalarTypeToCPPType<::c10::ScalarType::Bool>::t)") boolean OneElt);

  /** Construct an ArrayRef from a pointer and length. */
  public BoolArrayRef(@Cast("const decltype(::c10::impl::ScalarTypeToCPPType<::c10::ScalarType::Bool>::t)*") BoolPointer data, @Cast("size_t") long length) { super((Pointer)null); allocate(data, length); }
  private native void allocate(@Cast("const decltype(::c10::impl::ScalarTypeToCPPType<::c10::ScalarType::Bool>::t)*") BoolPointer data, @Cast("size_t") long length);

  /** Construct an ArrayRef from a range. */
  public BoolArrayRef(@Cast("const decltype(::c10::impl::ScalarTypeToCPPType<::c10::ScalarType::Bool>::t)*") BoolPointer begin, @Cast("const decltype(::c10::impl::ScalarTypeToCPPType<::c10::ScalarType::Bool>::t)*") BoolPointer end) { super((Pointer)null); allocate(begin, end); }
  private native void allocate(@Cast("const decltype(::c10::impl::ScalarTypeToCPPType<::c10::ScalarType::Bool>::t)*") BoolPointer begin, @Cast("const decltype(::c10::impl::ScalarTypeToCPPType<::c10::ScalarType::Bool>::t)*") BoolPointer end);

  /** Construct an ArrayRef from a SmallVector. This is templated in order to
   *  avoid instantiating SmallVectorTemplateCommon<T> whenever we
   *  copy-construct an ArrayRef. */

  /** Construct an ArrayRef from a std::vector. */
  // The enable_if stuff here makes sure that this isn't used for
  // std::vector<bool>, because ArrayRef can't work on a std::vector<bool>
  // bitfield.

  /** Construct an ArrayRef from a std::array */

  /** Construct an ArrayRef from a C array. */

  /** Construct an ArrayRef from a std::initializer_list. */
  /* implicit */

  /** \}
   *  \name Simple Operations
   *  \{ */

  public native @ByVal @Cast("const c10::ArrayRef<decltype(::c10::impl::ScalarTypeToCPPType<::c10::ScalarType::Bool>::t)>::iterator*") BoolPointer begin();
  public native @ByVal @Cast("const c10::ArrayRef<decltype(::c10::impl::ScalarTypeToCPPType<::c10::ScalarType::Bool>::t)>::iterator*") BoolPointer end();

  // These are actually the same as iterator, since ArrayRef only
  // gives you const iterators.
  public native @ByVal @Cast("const c10::ArrayRef<decltype(::c10::impl::ScalarTypeToCPPType<::c10::ScalarType::Bool>::t)>::const_iterator*") BoolPointer cbegin();
  public native @ByVal @Cast("const c10::ArrayRef<decltype(::c10::impl::ScalarTypeToCPPType<::c10::ScalarType::Bool>::t)>::const_iterator*") BoolPointer cend();

  /** empty - Check if the array is empty. */
  public native @Cast("const bool") boolean empty();

  public native @Cast("const decltype(::c10::impl::ScalarTypeToCPPType<::c10::ScalarType::Bool>::t)*") BoolPointer data();

  /** size - Get the array size. */
  public native @Cast("const size_t") long size();

  /** front - Get the first element. */
  public native @Cast("const decltype(::c10::impl::ScalarTypeToCPPType<::c10::ScalarType::Bool>::t)") boolean front();

  /** back - Get the last element. */
  public native @Cast("const decltype(::c10::impl::ScalarTypeToCPPType<::c10::ScalarType::Bool>::t)") boolean back();

  /** equals - Check for element-wise equality. */
  public native @Cast("const bool") boolean equals(@ByVal BoolArrayRef RHS);

  /** slice(n, m) - Take M elements of the array starting at element N */
  public native @Const @ByVal BoolArrayRef slice(@Cast("size_t") long N, @Cast("size_t") long M);

  /** slice(n) - Chop off the first N elements of the array. */
  public native @Const @ByVal BoolArrayRef slice(@Cast("size_t") long N);

  /** \}
   *  \name Operator Overloads
   *  \{ */
  public native @Cast("const decltype(::c10::impl::ScalarTypeToCPPType<::c10::ScalarType::Bool>::t)") @Name("operator []") boolean get(@Cast("size_t") long Index);

  /** Vector compatibility */
  
  ///
  public native @Cast("const decltype(::c10::impl::ScalarTypeToCPPType<::c10::ScalarType::Bool>::t)") boolean at(@Cast("size_t") long Index);

  /** Disallow accidental assignment from a temporary.
   * 
   *  The declaration here is extra complicated so that "arrayRef = {}"
   *  continues to select the move assignment operator. */
  

  /** Disallow accidental assignment from a temporary.
   * 
   *  The declaration here is extra complicated so that "arrayRef = {}"
   *  continues to select the move assignment operator. */
  

  /** \}
   *  \name Expensive Operations
   *  \{ */
  public native @Cast("decltype(::c10::impl::ScalarTypeToCPPType<::c10::ScalarType::Bool>::t)*") @StdVector BoolPointer vec();

  /** \} */
}
