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
 * \struct _NV_ENC_PIC_PARAMS_MVC
 * MVC-specific parameters to be sent on a per-frame basis.
 */
@Properties(inherit = org.bytedeco.nvcodec.presets.nvencodeapi.class)
public class NV_ENC_PIC_PARAMS_MVC extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NV_ENC_PIC_PARAMS_MVC() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NV_ENC_PIC_PARAMS_MVC(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NV_ENC_PIC_PARAMS_MVC(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NV_ENC_PIC_PARAMS_MVC position(long position) {
        return (NV_ENC_PIC_PARAMS_MVC)super.position(position);
    }
    @Override public NV_ENC_PIC_PARAMS_MVC getPointer(long i) {
        return new NV_ENC_PIC_PARAMS_MVC((Pointer)this).offsetAddress(i);
    }

    /** [in]: Struct version. Must be set to ::NV_ENC_PIC_PARAMS_MVC_VER. */
    public native @Cast("uint32_t") int version(); public native NV_ENC_PIC_PARAMS_MVC version(int setter);
    /** [in]: Specifies the view ID associated with the current input view. */
    public native @Cast("uint32_t") int viewID(); public native NV_ENC_PIC_PARAMS_MVC viewID(int setter);
    /** [in]: Specifies the temporal ID associated with the current input view. */
    public native @Cast("uint32_t") int temporalID(); public native NV_ENC_PIC_PARAMS_MVC temporalID(int setter);
    /** [in]: Specifies the priority ID associated with the current input view. Reserved and ignored by the NvEncodeAPI interface. */
    public native @Cast("uint32_t") int priorityID(); public native NV_ENC_PIC_PARAMS_MVC priorityID(int setter);
    /** [in]: Reserved and must be set to 0. */
    public native @Cast("uint32_t") int reserved1(int i); public native NV_ENC_PIC_PARAMS_MVC reserved1(int i, int setter);
    @MemberGetter public native @Cast("uint32_t*") IntPointer reserved1();
    /** [in]: Reserved and must be set to NULL. */
    public native Pointer reserved2(int i); public native NV_ENC_PIC_PARAMS_MVC reserved2(int i, Pointer setter);
    @MemberGetter public native @Cast("void**") PointerPointer reserved2();
}
