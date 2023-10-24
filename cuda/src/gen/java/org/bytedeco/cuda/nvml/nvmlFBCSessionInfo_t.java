// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;


/**
 * Structure to hold FBC session data
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlFBCSessionInfo_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlFBCSessionInfo_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlFBCSessionInfo_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlFBCSessionInfo_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlFBCSessionInfo_t position(long position) {
        return (nvmlFBCSessionInfo_t)super.position(position);
    }
    @Override public nvmlFBCSessionInfo_t getPointer(long i) {
        return new nvmlFBCSessionInfo_t((Pointer)this).offsetAddress(i);
    }

    /** Unique session ID */
    public native @Cast("unsigned int") int sessionId(); public native nvmlFBCSessionInfo_t sessionId(int setter);
    /** Owning process ID */
    public native @Cast("unsigned int") int pid(); public native nvmlFBCSessionInfo_t pid(int setter);
    /** Owning vGPU instance ID (only valid on vGPU hosts, otherwise zero) */
    public native @Cast("nvmlVgpuInstance_t") int vgpuInstance(); public native nvmlFBCSessionInfo_t vgpuInstance(int setter);
    /** Display identifier */
    public native @Cast("unsigned int") int displayOrdinal(); public native nvmlFBCSessionInfo_t displayOrdinal(int setter);
    /** Type of frame buffer capture session */
    public native @Cast("nvmlFBCSessionType_t") int sessionType(); public native nvmlFBCSessionInfo_t sessionType(int setter);
    /** Session flags (one or more of NVML_NVFBC_SESSION_FLAG_XXX). */
    public native @Cast("unsigned int") int sessionFlags(); public native nvmlFBCSessionInfo_t sessionFlags(int setter);
    /** Max horizontal resolution supported by the capture session */
    public native @Cast("unsigned int") int hMaxResolution(); public native nvmlFBCSessionInfo_t hMaxResolution(int setter);
    /** Max vertical resolution supported by the capture session */
    public native @Cast("unsigned int") int vMaxResolution(); public native nvmlFBCSessionInfo_t vMaxResolution(int setter);
    /** Horizontal resolution requested by caller in capture call */
    public native @Cast("unsigned int") int hResolution(); public native nvmlFBCSessionInfo_t hResolution(int setter);
    /** Vertical resolution requested by caller in capture call */
    public native @Cast("unsigned int") int vResolution(); public native nvmlFBCSessionInfo_t vResolution(int setter);
    /** Moving average new frames captured per second */
    public native @Cast("unsigned int") int averageFPS(); public native nvmlFBCSessionInfo_t averageFPS(int setter);
    /** Moving average new frame capture latency in microseconds */
    public native @Cast("unsigned int") int averageLatency(); public native nvmlFBCSessionInfo_t averageLatency(int setter);
}
