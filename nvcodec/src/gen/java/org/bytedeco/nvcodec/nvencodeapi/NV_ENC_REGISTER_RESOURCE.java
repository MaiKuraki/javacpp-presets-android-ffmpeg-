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


/**
 * \struct _NV_ENC_REGISTER_RESOURCE
 * Register a resource for future use with the Nvidia Video Encoder Interface.
 */
@Properties(inherit = org.bytedeco.nvcodec.presets.nvencodeapi.class)
public class NV_ENC_REGISTER_RESOURCE extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NV_ENC_REGISTER_RESOURCE() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NV_ENC_REGISTER_RESOURCE(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NV_ENC_REGISTER_RESOURCE(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NV_ENC_REGISTER_RESOURCE position(long position) {
        return (NV_ENC_REGISTER_RESOURCE)super.position(position);
    }
    @Override public NV_ENC_REGISTER_RESOURCE getPointer(long i) {
        return new NV_ENC_REGISTER_RESOURCE((Pointer)this).offsetAddress(i);
    }

    /** [in]: Struct version. Must be set to ::NV_ENC_REGISTER_RESOURCE_VER. */
    public native @Cast("uint32_t") int version(); public native NV_ENC_REGISTER_RESOURCE version(int setter);
    /** [in]: Specifies the type of resource to be registered.
                                                                               Supported values are
                                                                               ::NV_ENC_INPUT_RESOURCE_TYPE_DIRECTX,
                                                                               ::NV_ENC_INPUT_RESOURCE_TYPE_CUDADEVICEPTR,
                                                                               ::NV_ENC_INPUT_RESOURCE_TYPE_OPENGL_TEX */
    public native @Cast("NV_ENC_INPUT_RESOURCE_TYPE") int resourceType(); public native NV_ENC_REGISTER_RESOURCE resourceType(int setter);
    /** [in]: Input frame width. */
    public native @Cast("uint32_t") int width(); public native NV_ENC_REGISTER_RESOURCE width(int setter);
    /** [in]: Input frame height. */
    public native @Cast("uint32_t") int height(); public native NV_ENC_REGISTER_RESOURCE height(int setter);
    /** [in]: Input buffer pitch.
                                                                               For ::NV_ENC_INPUT_RESOURCE_TYPE_DIRECTX resources, set this to 0.
                                                                               For ::NV_ENC_INPUT_RESOURCE_TYPE_CUDADEVICEPTR resources, set this to
                                                                                 the pitch as obtained from cuMemAllocPitch(), or to the width in
                                                                                 bytes (if this resource was created by using cuMemAlloc()). This
                                                                                 value must be a multiple of 4.
                                                                               For ::NV_ENC_INPUT_RESOURCE_TYPE_CUDAARRAY resources, set this to the
                                                                                 width of the allocation in bytes (i.e.
                                                                                 CUDA_ARRAY3D_DESCRIPTOR::Width * CUDA_ARRAY3D_DESCRIPTOR::NumChannels).
                                                                               For ::NV_ENC_INPUT_RESOURCE_TYPE_OPENGL_TEX resources, set this to the
                                                                                 texture width multiplied by the number of components in the texture
                                                                                 format. */
    public native @Cast("uint32_t") int pitch(); public native NV_ENC_REGISTER_RESOURCE pitch(int setter);
    /** [in]: Subresource Index of the DirectX resource to be registered. Should be set to 0 for other interfaces. */
    public native @Cast("uint32_t") int subResourceIndex(); public native NV_ENC_REGISTER_RESOURCE subResourceIndex(int setter);
    /** [in]: Handle to the resource that is being registered. */
    public native Pointer resourceToRegister(); public native NV_ENC_REGISTER_RESOURCE resourceToRegister(Pointer setter);
    /** [out]: Registered resource handle. This should be used in future interactions with the Nvidia Video Encoder Interface. */
    public native NV_ENC_REGISTERED_PTR registeredResource(); public native NV_ENC_REGISTER_RESOURCE registeredResource(NV_ENC_REGISTERED_PTR setter);
    /** [in]: Buffer format of resource to be registered. */
    public native @Cast("NV_ENC_BUFFER_FORMAT") int bufferFormat(); public native NV_ENC_REGISTER_RESOURCE bufferFormat(int setter);
    /** [in]: Usage of resource to be registered. */
    public native @Cast("NV_ENC_BUFFER_USAGE") int bufferUsage(); public native NV_ENC_REGISTER_RESOURCE bufferUsage(int setter);
    /** [in]: Specifies the input fence and corresponding fence values to do GPU wait and signal.
                                                                               To be used only when NV_ENC_REGISTER_RESOURCE::resourceToRegister represents D3D12 surface and
                                                                               NV_ENC_BUFFER_USAGE::bufferUsage is NV_ENC_INPUT_IMAGE.
                                                                               The fence NV_ENC_FENCE_POINT_D3D12::pFence and NV_ENC_FENCE_POINT_D3D12::waitValue will be used to do GPU wait
                                                                               before starting GPU operation, if NV_ENC_FENCE_POINT_D3D12::bWait is set.
                                                                               The fence NV_ENC_FENCE_POINT_D3D12::pFence and NV_ENC_FENCE_POINT_D3D12::signalValue will be used to do GPU signal
                                                                               when GPU operation finishes, if NV_ENC_FENCE_POINT_D3D12::bSignal is set. */
    public native NV_ENC_FENCE_POINT_D3D12 pInputFencePoint(); public native NV_ENC_REGISTER_RESOURCE pInputFencePoint(NV_ENC_FENCE_POINT_D3D12 setter);
    /** [in]: Reserved and must be set to 0. */
    public native @Cast("uint32_t") int reserved1(int i); public native NV_ENC_REGISTER_RESOURCE reserved1(int i, int setter);
    @MemberGetter public native @Cast("uint32_t*") IntPointer reserved1();
    /** [in]: Reserved and must be set to NULL. */
    public native Pointer reserved2(int i); public native NV_ENC_REGISTER_RESOURCE reserved2(int i, Pointer setter);
    @MemberGetter public native @Cast("void**") PointerPointer reserved2();
}
