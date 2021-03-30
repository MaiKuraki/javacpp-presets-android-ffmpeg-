// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;

@Name("c10::ArrayRef<c10::IValue>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class IValueArrayRef extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IValueArrayRef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IValueArrayRef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public IValueArrayRef position(long position) {
        return (IValueArrayRef)super.position(position);
    }
    @Override public IValueArrayRef getPointer(long i) {
        return new IValueArrayRef((Pointer)this).position(position + i);
    }

  /** \name Constructors
   *  \{
   <p>
   *  Construct an empty ArrayRef. */
  /* implicit */ public IValueArrayRef() { super((Pointer)null); allocate(); }
private native void allocate();

  /** Construct an ArrayRef from a single element. */
  // TODO Make this explicit
  public IValueArrayRef(@Const @ByRef IValue OneElt) { super((Pointer)null); allocate(OneElt); }
  private native void allocate(@Const @ByRef IValue OneElt);

  /** Construct an ArrayRef from a pointer and length. */
  public IValueArrayRef(@Const IValue data, @Cast("size_t") long length) { super((Pointer)null); allocate(data, length); }
  private native void allocate(@Const IValue data, @Cast("size_t") long length);

  /** Construct an ArrayRef from a range. */
  public IValueArrayRef(@Const IValue begin, @Const IValue end) { super((Pointer)null); allocate(begin, end); }
  private native void allocate(@Const IValue begin, @Const IValue end);

  /** Construct an ArrayRef from a SmallVector. This is templated in order to
   *  avoid instantiating SmallVectorTemplateCommon<T> whenever we
   *  copy-construct an ArrayRef. */

  /** Construct an ArrayRef from a std::vector. */
  // The enable_if stuff here makes sure that this isn't used for std::vector<bool>,
  // because ArrayRef can't work on a std::vector<bool> bitfield.

  /** Construct an ArrayRef from a std::array */

  /** Construct an ArrayRef from a C array. */

  /** Construct an ArrayRef from a std::initializer_list. */
  /* implicit */

  /** \}
   *  \name Simple Operations
   *  \{ */

  public native @ByVal @Cast("const c10::ArrayRef<c10::IValue>::iterator*") IValue begin();
  public native @ByVal @Cast("const c10::ArrayRef<c10::IValue>::iterator*") IValue end();

  // These are actually the same as iterator, since ArrayRef only
  // gives you const iterators.
  public native @ByVal @Cast("const c10::ArrayRef<c10::IValue>::const_iterator*") IValue cbegin();
  public native @ByVal @Cast("const c10::ArrayRef<c10::IValue>::const_iterator*") IValue cend();

  /** empty - Check if the array is empty. */
  public native @Cast("const bool") boolean empty();

  public native @Const IValue data();

  /** size - Get the array size. */
  public native @Cast("const size_t") long size();

  /** front - Get the first element. */
  public native @Const @ByRef IValue front();

  /** back - Get the last element. */
  public native @Const @ByRef IValue back();

  /** equals - Check for element-wise equality. */
  public native @Cast("const bool") boolean equals(@ByVal IValueArrayRef RHS);

  /** slice(n, m) - Take M elements of the array starting at element N */
  public native @Const @ByVal IValueArrayRef slice(@Cast("size_t") long N, @Cast("size_t") long M);

  /** slice(n) - Chop off the first N elements of the array. */
  public native @Const @ByVal IValueArrayRef slice(@Cast("size_t") long N);

  /** \}
   *  \name Operator Overloads
   *  \{ */
  public native @Const @ByRef @Name("operator []") IValue get(@Cast("size_t") long Index);

  /** Vector compatibility */
  
  ///
  public native @Const @ByRef IValue at(@Cast("size_t") long Index);

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
  public native @StdVector IValue vec();

  /** \} */
}
