// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.libffi;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libffi.global.ffi.*;

// #else
// #endif

/* The closure code assumes that this works on pointers, i.e. a size_t
   can hold a pointer.  */

@Properties(inherit = org.bytedeco.libffi.presets.ffi.class)
public class ffi_type extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ffi_type() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ffi_type(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ffi_type(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ffi_type position(long position) {
        return (ffi_type)super.position(position);
    }
    @Override public ffi_type getPointer(long i) {
        return new ffi_type((Pointer)this).offsetAddress(i);
    }

  public native @Cast("size_t") long size(); public native ffi_type size(long setter);
  public native @Cast("unsigned short") short alignment(); public native ffi_type alignment(short setter);
  public native @Cast("unsigned short") short type(); public native ffi_type type(short setter);
  public native ffi_type elements(int i); public native ffi_type elements(int i, ffi_type setter);
  public native @Cast("_ffi_type**") PointerPointer elements(); public native ffi_type elements(PointerPointer setter);
}
