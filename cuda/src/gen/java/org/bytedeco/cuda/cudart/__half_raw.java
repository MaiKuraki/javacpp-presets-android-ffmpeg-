// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;

// #endif

/**
 * \ingroup CUDA_MATH_INTRINSIC_HALF
 * \brief __half_raw data type
 * \details Type allows static initialization of \p half until it becomes
 * a builtin type.
 * 
 * - Note: this initialization is as a bit-field representation of \p half,
 * and not a conversion from \p short to \p half.
 * Such representation will be deprecated in a future version of CUDA.
 * 
 * - Note: this is visible to non-nvcc compilers, including C-only compilations
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class __half_raw extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public __half_raw() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public __half_raw(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public __half_raw(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public __half_raw position(long position) {
        return (__half_raw)super.position(position);
    }
    @Override public __half_raw getPointer(long i) {
        return new __half_raw((Pointer)this).offsetAddress(i);
    }

    public native @Cast("unsigned short") short x(); public native __half_raw x(short setter);
}
