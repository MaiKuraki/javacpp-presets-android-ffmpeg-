// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cublas;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.cublas.*;


/** Semi-opaque descriptor for cublasLtMatmul() operation details
 */
@Properties(inherit = org.bytedeco.cuda.presets.cublas.class)
public class cublasLtMatmulDescOpaque_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cublasLtMatmulDescOpaque_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cublasLtMatmulDescOpaque_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cublasLtMatmulDescOpaque_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cublasLtMatmulDescOpaque_t position(long position) {
        return (cublasLtMatmulDescOpaque_t)super.position(position);
    }
    @Override public cublasLtMatmulDescOpaque_t getPointer(long i) {
        return new cublasLtMatmulDescOpaque_t((Pointer)this).offsetAddress(i);
    }

  public native @Cast("uint64_t") long data(int i); public native cublasLtMatmulDescOpaque_t data(int i, long setter);
  @MemberGetter public native @Cast("uint64_t*") LongPointer data();
}
