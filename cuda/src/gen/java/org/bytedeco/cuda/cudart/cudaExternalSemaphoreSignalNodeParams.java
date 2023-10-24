// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * External semaphore signal node parameters
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaExternalSemaphoreSignalNodeParams extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaExternalSemaphoreSignalNodeParams() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaExternalSemaphoreSignalNodeParams(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaExternalSemaphoreSignalNodeParams(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaExternalSemaphoreSignalNodeParams position(long position) {
        return (cudaExternalSemaphoreSignalNodeParams)super.position(position);
    }
    @Override public cudaExternalSemaphoreSignalNodeParams getPointer(long i) {
        return new cudaExternalSemaphoreSignalNodeParams((Pointer)this).offsetAddress(i);
    }

    /** Array of external semaphore handles. */
    public native @ByPtrPtr CUexternalSemaphore_st extSemArray(); public native cudaExternalSemaphoreSignalNodeParams extSemArray(CUexternalSemaphore_st setter);
    /** Array of external semaphore signal parameters. */
    public native @Const cudaExternalSemaphoreSignalParams paramsArray(); public native cudaExternalSemaphoreSignalNodeParams paramsArray(cudaExternalSemaphoreSignalParams setter);
    /** Number of handles and parameters supplied in extSemArray and paramsArray. */
    public native @Cast("unsigned int") int numExtSems(); public native cudaExternalSemaphoreSignalNodeParams numExtSems(int setter);
}
