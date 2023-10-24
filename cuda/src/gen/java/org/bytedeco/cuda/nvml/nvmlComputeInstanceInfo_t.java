// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;


@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlComputeInstanceInfo_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlComputeInstanceInfo_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlComputeInstanceInfo_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlComputeInstanceInfo_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlComputeInstanceInfo_t position(long position) {
        return (nvmlComputeInstanceInfo_t)super.position(position);
    }
    @Override public nvmlComputeInstanceInfo_t getPointer(long i) {
        return new nvmlComputeInstanceInfo_t((Pointer)this).offsetAddress(i);
    }

    /** Parent device */
    public native nvmlDevice_st device(); public native nvmlComputeInstanceInfo_t device(nvmlDevice_st setter);
    /** Parent GPU instance */
    public native nvmlGpuInstance_st gpuInstance(); public native nvmlComputeInstanceInfo_t gpuInstance(nvmlGpuInstance_st setter);
    /** Unique instance ID within the GPU instance */
    public native @Cast("unsigned int") int id(); public native nvmlComputeInstanceInfo_t id(int setter);
    /** Unique profile ID within the GPU instance */
    public native @Cast("unsigned int") int profileId(); public native nvmlComputeInstanceInfo_t profileId(int setter);
    /** Placement for this instance within the GPU instance's compute slice range {0, sliceCount} */
    public native @ByRef nvmlComputeInstancePlacement_t placement(); public native nvmlComputeInstanceInfo_t placement(nvmlComputeInstancePlacement_t setter);
}
