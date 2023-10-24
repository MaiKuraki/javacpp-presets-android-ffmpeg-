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
 * GPU instance profile information (v2).
 *
 * Version 2 adds the \ref nvmlGpuInstanceProfileInfo_v2_t.version field
 * to the start of the structure, and the \ref nvmlGpuInstanceProfileInfo_v2_t.name
 * field to the end. This structure is not backwards-compatible with
 * \ref nvmlGpuInstanceProfileInfo_t.
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlGpuInstanceProfileInfo_v2_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlGpuInstanceProfileInfo_v2_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlGpuInstanceProfileInfo_v2_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlGpuInstanceProfileInfo_v2_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlGpuInstanceProfileInfo_v2_t position(long position) {
        return (nvmlGpuInstanceProfileInfo_v2_t)super.position(position);
    }
    @Override public nvmlGpuInstanceProfileInfo_v2_t getPointer(long i) {
        return new nvmlGpuInstanceProfileInfo_v2_t((Pointer)this).offsetAddress(i);
    }

    /** Structure version identifier (set to \ref nvmlGpuInstanceProfileInfo_v2) */
    public native @Cast("unsigned int") int version(); public native nvmlGpuInstanceProfileInfo_v2_t version(int setter);
    /** Unique profile ID within the device */
    public native @Cast("unsigned int") int id(); public native nvmlGpuInstanceProfileInfo_v2_t id(int setter);
    /** Peer-to-Peer support */
    public native @Cast("unsigned int") int isP2pSupported(); public native nvmlGpuInstanceProfileInfo_v2_t isP2pSupported(int setter);
    /** GPU Slice count */
    public native @Cast("unsigned int") int sliceCount(); public native nvmlGpuInstanceProfileInfo_v2_t sliceCount(int setter);
    /** GPU instance count */
    public native @Cast("unsigned int") int instanceCount(); public native nvmlGpuInstanceProfileInfo_v2_t instanceCount(int setter);
    /** Streaming Multiprocessor count */
    public native @Cast("unsigned int") int multiprocessorCount(); public native nvmlGpuInstanceProfileInfo_v2_t multiprocessorCount(int setter);
    /** Copy Engine count */
    public native @Cast("unsigned int") int copyEngineCount(); public native nvmlGpuInstanceProfileInfo_v2_t copyEngineCount(int setter);
    /** Decoder Engine count */
    public native @Cast("unsigned int") int decoderCount(); public native nvmlGpuInstanceProfileInfo_v2_t decoderCount(int setter);
    /** Encoder Engine count */
    public native @Cast("unsigned int") int encoderCount(); public native nvmlGpuInstanceProfileInfo_v2_t encoderCount(int setter);
    /** JPEG Engine count */
    public native @Cast("unsigned int") int jpegCount(); public native nvmlGpuInstanceProfileInfo_v2_t jpegCount(int setter);
    /** OFA Engine count */
    public native @Cast("unsigned int") int ofaCount(); public native nvmlGpuInstanceProfileInfo_v2_t ofaCount(int setter);
    /** Memory size in MBytes */
    public native @Cast("unsigned long long") long memorySizeMB(); public native nvmlGpuInstanceProfileInfo_v2_t memorySizeMB(long setter);
    /** Profile name */
    public native @Cast("char") byte name(int i); public native nvmlGpuInstanceProfileInfo_v2_t name(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer name();
}
