// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvencodeapi;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.nvcodec.nvcuvid.*;
import static org.bytedeco.nvcodec.global.nvcuvid.*;

import static org.bytedeco.nvcodec.global.nvencodeapi.*;


/** \struct NV_ENC_FENCE_POINT_D3D12
* Fence and fence value for synchronization.
*/
@Properties(inherit = org.bytedeco.nvcodec.presets.nvencodeapi.class)
public class NV_ENC_FENCE_POINT_D3D12 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NV_ENC_FENCE_POINT_D3D12() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NV_ENC_FENCE_POINT_D3D12(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NV_ENC_FENCE_POINT_D3D12(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NV_ENC_FENCE_POINT_D3D12 position(long position) {
        return (NV_ENC_FENCE_POINT_D3D12)super.position(position);
    }
    @Override public NV_ENC_FENCE_POINT_D3D12 getPointer(long i) {
        return new NV_ENC_FENCE_POINT_D3D12((Pointer)this).offsetAddress(i);
    }

    /** [in]: Struct version. Must be set to ::NV_ENC_FENCE_POINT_D3D12_VER. */
    public native @Cast("uint32_t") int version(); public native NV_ENC_FENCE_POINT_D3D12 version(int setter);
    /** [in]: Reserved and must be set to 0. */
    public native @Cast("uint32_t") int reserved(); public native NV_ENC_FENCE_POINT_D3D12 reserved(int setter);
    /** [in]: Pointer to ID3D12Fence. This fence object is used for synchronization. */
    public native Pointer pFence(); public native NV_ENC_FENCE_POINT_D3D12 pFence(Pointer setter);
    /** [in]: Fence value to reach or exceed before the GPU operation. */
    public native @Cast("uint64_t") long waitValue(); public native NV_ENC_FENCE_POINT_D3D12 waitValue(long setter);
    /** [in]: Fence value to set the fence to, after the GPU operation. */
    public native @Cast("uint64_t") long signalValue(); public native NV_ENC_FENCE_POINT_D3D12 signalValue(long setter);
    /** [in]: Wait on 'waitValue' if bWait is set to 1, before starting GPU operation. */
    public native @Cast("uint32_t") @NoOffset int bWait(); public native NV_ENC_FENCE_POINT_D3D12 bWait(int setter);
    /** [in]: Signal on 'signalValue' if bSignal is set to 1, after GPU operation is complete. */
    public native @Cast("uint32_t") @NoOffset int bSignal(); public native NV_ENC_FENCE_POINT_D3D12 bSignal(int setter);
    /** [in]: Reserved and must be set to 0. */
    public native @Cast("uint32_t") @NoOffset int reservedBitField(); public native NV_ENC_FENCE_POINT_D3D12 reservedBitField(int setter);
    /** [in]: Reserved and must be set to 0. */
    public native @Cast("uint32_t") int reserved1(int i); public native NV_ENC_FENCE_POINT_D3D12 reserved1(int i, int setter);
    @MemberGetter public native @Cast("uint32_t*") IntPointer reserved1();
}
