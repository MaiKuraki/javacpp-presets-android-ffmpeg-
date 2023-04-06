// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvcuvid;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.nvcodec.global.nvcuvid.*;



/***********************************************************/
/** \struct CUVIDVP8PICPARAMS
/** VP8 picture parameters
/** This structure is used in CUVIDPICPARAMS structure
/***********************************************************/
@Properties(inherit = org.bytedeco.nvcodec.presets.nvcuvid.class)
public class CUVIDVP8PICPARAMS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUVIDVP8PICPARAMS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUVIDVP8PICPARAMS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUVIDVP8PICPARAMS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUVIDVP8PICPARAMS position(long position) {
        return (CUVIDVP8PICPARAMS)super.position(position);
    }
    @Override public CUVIDVP8PICPARAMS getPointer(long i) {
        return new CUVIDVP8PICPARAMS((Pointer)this).offsetAddress(i);
    }

    public native int width(); public native CUVIDVP8PICPARAMS width(int setter);
    public native int height(); public native CUVIDVP8PICPARAMS height(int setter);
    public native @Cast("unsigned int") int first_partition_size(); public native CUVIDVP8PICPARAMS first_partition_size(int setter);
    //Frame Indexes
    public native @Cast("unsigned char") byte LastRefIdx(); public native CUVIDVP8PICPARAMS LastRefIdx(byte setter);
    public native @Cast("unsigned char") byte GoldenRefIdx(); public native CUVIDVP8PICPARAMS GoldenRefIdx(byte setter);
    public native @Cast("unsigned char") byte AltRefIdx(); public native CUVIDVP8PICPARAMS AltRefIdx(byte setter);
            /** 0 = KEYFRAME, 1 = INTERFRAME  */
            @Name("vp8_frame_tag.frame_type") public native @Cast("unsigned char") @NoOffset byte vp8_frame_tag_frame_type(); public native CUVIDVP8PICPARAMS vp8_frame_tag_frame_type(byte setter);
            @Name("vp8_frame_tag.version") public native @Cast("unsigned char") @NoOffset byte vp8_frame_tag_version(); public native CUVIDVP8PICPARAMS vp8_frame_tag_version(byte setter);
            @Name("vp8_frame_tag.show_frame") public native @Cast("unsigned char") @NoOffset byte vp8_frame_tag_show_frame(); public native CUVIDVP8PICPARAMS vp8_frame_tag_show_frame(byte setter);
            /** Must be 0 if segmentation is not enabled */
            @Name("vp8_frame_tag.update_mb_segmentation_data") public native @Cast("unsigned char") @NoOffset byte vp8_frame_tag_update_mb_segmentation_data(); public native CUVIDVP8PICPARAMS vp8_frame_tag_update_mb_segmentation_data(byte setter);
            @Name("vp8_frame_tag.Reserved2Bits") public native @Cast("unsigned char") @NoOffset byte vp8_frame_tag_Reserved2Bits(); public native CUVIDVP8PICPARAMS vp8_frame_tag_Reserved2Bits(byte setter);
        public native @Cast("unsigned char") byte wFrameTagFlags(); public native CUVIDVP8PICPARAMS wFrameTagFlags(byte setter);
    public native @Cast("unsigned char") byte Reserved1(int i); public native CUVIDVP8PICPARAMS Reserved1(int i, byte setter);
    @MemberGetter public native @Cast("unsigned char*") BytePointer Reserved1();
    public native @Cast("unsigned int") int Reserved2(int i); public native CUVIDVP8PICPARAMS Reserved2(int i, int setter);
    @MemberGetter public native @Cast("unsigned int*") IntPointer Reserved2();
}
