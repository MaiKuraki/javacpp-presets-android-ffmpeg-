// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;

// #endif /* !defined(__CUDA_NO_BFLOAT16_OPERATORS__) */

/**
* \ingroup CUDA_MATH_INTRINSIC_BFLOAT16
 * \brief nv_bfloat162 datatype
 * \details This structure implements the datatype for storing two 
 * nv_bfloat16 floating-point numbers. 
 * The structure implements assignment, arithmetic and comparison
 * operators, and type conversions. 
 * 
 * - NOTE: __nv_bfloat162 is visible to non-nvcc host compilers
 */
@NoOffset @Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class __nv_bfloat162 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public __nv_bfloat162(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public __nv_bfloat162(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public __nv_bfloat162 position(long position) {
        return (__nv_bfloat162)super.position(position);
    }
    @Override public __nv_bfloat162 getPointer(long i) {
        return new __nv_bfloat162((Pointer)this).offsetAddress(i);
    }

    /**
     * Storage field holding lower \p __nv_bfloat16 part.
     */
    public native @ByRef __nv_bfloat16 x(); public native __nv_bfloat162 x(__nv_bfloat16 setter);
    /**
     * Storage field holding upper \p __nv_bfloat16 part.
     */
    public native @ByRef __nv_bfloat16 y(); public native __nv_bfloat162 y(__nv_bfloat16 setter);
    /**
     * Constructor by default.
     */
// #if defined(__CPP_VERSION_AT_LEAST_11_BF16)
    public __nv_bfloat162() { super((Pointer)null); allocate(); }
    private native void allocate();
    /**
     * Move constructor, available for \p C++11 and later dialects
     */
    public __nv_bfloat162(@ByRef(true) __nv_bfloat162 src) { super((Pointer)null); allocate(src); }
    private native void allocate(@ByRef(true) __nv_bfloat162 src);
    /**
     * Move assignment operator, available for \p C++11 and later dialects
     */
    public native @ByRef @Name("operator =") __nv_bfloat162 put(@ByRef(true) __nv_bfloat162 src);
// #else
// #endif /* defined(__CPP_VERSION_AT_LEAST_11_BF16) */

    /**
     * Constructor from two \p __nv_bfloat16 variables
     */
    public __nv_bfloat162(@Const @ByRef __nv_bfloat16 a, @Const @ByRef __nv_bfloat16 b) { super((Pointer)null); allocate(a, b); }
    private native void allocate(@Const @ByRef __nv_bfloat16 a, @Const @ByRef __nv_bfloat16 b);
    /**
     * Copy constructor
     */
    /**
     * Copy assignment operator
     */

    /* Convert to/from __nv_bfloat162_raw */
    /**
     * Constructor from \p __nv_bfloat162_raw
     */
    public __nv_bfloat162(@Const @ByRef __nv_bfloat162_raw h2r ) { super((Pointer)null); allocate(h2r); }
    private native void allocate(@Const @ByRef __nv_bfloat162_raw h2r );
    /**
     * Assignment operator from \p __nv_bfloat162_raw
     */
    public native @ByRef @Name("operator =") __nv_bfloat162 put(@Const @ByRef __nv_bfloat162_raw h2r);
    /**
     * Conversion operator to \p __nv_bfloat162_raw
     */
    public native @ByVal @Name("operator __nv_bfloat162_raw") __nv_bfloat162_raw as__nv_bfloat162_raw();
}
