// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Graph instantiation parameters
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUDA_GRAPH_INSTANTIATE_PARAMS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDA_GRAPH_INSTANTIATE_PARAMS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUDA_GRAPH_INSTANTIATE_PARAMS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDA_GRAPH_INSTANTIATE_PARAMS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUDA_GRAPH_INSTANTIATE_PARAMS position(long position) {
        return (CUDA_GRAPH_INSTANTIATE_PARAMS)super.position(position);
    }
    @Override public CUDA_GRAPH_INSTANTIATE_PARAMS getPointer(long i) {
        return new CUDA_GRAPH_INSTANTIATE_PARAMS((Pointer)this).offsetAddress(i);
    }

	/** Instantiation flags */
	public native @Cast("cuuint64_t") long flags(); public native CUDA_GRAPH_INSTANTIATE_PARAMS flags(long setter);
	/** Upload stream */
	public native CUstream_st hUploadStream(); public native CUDA_GRAPH_INSTANTIATE_PARAMS hUploadStream(CUstream_st setter);
	/** The node which caused instantiation to fail, if any */
	public native CUgraphNode_st hErrNode_out(); public native CUDA_GRAPH_INSTANTIATE_PARAMS hErrNode_out(CUgraphNode_st setter);
	/** Whether instantiation was successful.  If it failed, the reason why */
	public native @Cast("CUgraphInstantiateResult") int result_out(); public native CUDA_GRAPH_INSTANTIATE_PARAMS result_out(int setter);
}
