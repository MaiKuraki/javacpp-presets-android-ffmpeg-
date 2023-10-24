// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Memcpy node parameters
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaMemcpyNodeParams extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaMemcpyNodeParams() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaMemcpyNodeParams(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaMemcpyNodeParams(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaMemcpyNodeParams position(long position) {
        return (cudaMemcpyNodeParams)super.position(position);
    }
    @Override public cudaMemcpyNodeParams getPointer(long i) {
        return new cudaMemcpyNodeParams((Pointer)this).offsetAddress(i);
    }

    /** Must be zero */
    public native int flags(); public native cudaMemcpyNodeParams flags(int setter);
    /** Must be zero */
    public native int reserved(int i); public native cudaMemcpyNodeParams reserved(int i, int setter);
    @MemberGetter public native IntPointer reserved();
    /** Parameters for the memory copy */
    public native @ByRef cudaMemcpy3DParms copyParams(); public native cudaMemcpyNodeParams copyParams(cudaMemcpy3DParms setter);
}
