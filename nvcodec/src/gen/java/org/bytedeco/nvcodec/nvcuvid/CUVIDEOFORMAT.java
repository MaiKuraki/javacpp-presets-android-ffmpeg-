// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvcuvid;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.nvcodec.global.nvcuvid.*;


/************************************************************************************************/
/** \ingroup STRUCTS
/** \struct CUVIDEOFORMAT
/** Video format
/** Used in cuvidGetSourceVideoFormat API
/************************************************************************************************/
@Properties(inherit = org.bytedeco.nvcodec.presets.nvcuvid.class)
public class CUVIDEOFORMAT extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUVIDEOFORMAT() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUVIDEOFORMAT(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUVIDEOFORMAT(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUVIDEOFORMAT position(long position) {
        return (CUVIDEOFORMAT)super.position(position);
    }
    @Override public CUVIDEOFORMAT getPointer(long i) {
        return new CUVIDEOFORMAT((Pointer)this).offsetAddress(i);
    }

    /** OUT: Compression format          */
    public native @Cast("cudaVideoCodec") int codec(); public native CUVIDEOFORMAT codec(int setter);
   /**
    * OUT: frame rate = numerator / denominator (for example: 30000/1001)
    */
        
        /** OUT: frame rate denominator (0 = unspecified or variable frame rate) */
        @Name("frame_rate.numerator") public native @Cast("unsigned int") int frame_rate_numerator(); public native CUVIDEOFORMAT frame_rate_numerator(int setter);
        @Name("frame_rate.denominator") public native @Cast("unsigned int") int frame_rate_denominator(); public native CUVIDEOFORMAT frame_rate_denominator(int setter);
    /** OUT: 0=interlaced, 1=progressive                                      */
    public native @Cast("unsigned char") byte progressive_sequence(); public native CUVIDEOFORMAT progressive_sequence(byte setter);
    /** OUT: high bit depth luma. E.g, 2 for 10-bitdepth, 4 for 12-bitdepth   */
    public native @Cast("unsigned char") byte bit_depth_luma_minus8(); public native CUVIDEOFORMAT bit_depth_luma_minus8(byte setter);
    /** OUT: high bit depth chroma. E.g, 2 for 10-bitdepth, 4 for 12-bitdepth */
    public native @Cast("unsigned char") byte bit_depth_chroma_minus8(); public native CUVIDEOFORMAT bit_depth_chroma_minus8(byte setter);
    /** OUT: Minimum number of decode surfaces to be allocated for correct
                                                          decoding. The client can send this value in ulNumDecodeSurfaces
                                                          (in CUVIDDECODECREATEINFO structure).
                                                          This guarantees correct functionality and optimal video memory
                                                          usage but not necessarily the best performance, which depends on
                                                          the design of the overall application. The optimal number of
                                                          decode surfaces (in terms of performance and memory utilization)
                                                          should be decided by experimentation for each application, but it
                                                          cannot go below min_num_decode_surfaces.
                                                          If this value is used for ulNumDecodeSurfaces then it must be
                                                          returned to parser during sequence callback.                     */
    public native @Cast("unsigned char") byte min_num_decode_surfaces(); public native CUVIDEOFORMAT min_num_decode_surfaces(byte setter);
    /** OUT: coded frame width in pixels                                      */
    public native @Cast("unsigned int") int coded_width(); public native CUVIDEOFORMAT coded_width(int setter);
    /** OUT: coded frame height in pixels                                     */
    public native @Cast("unsigned int") int coded_height(); public native CUVIDEOFORMAT coded_height(int setter);
   /**
    * area of the frame that should be displayed
    * typical example:
    * coded_width = 1920, coded_height = 1088
    * display_area = { 0,0,1920,1080 }
    */
        /** OUT: left position of display rect    */
        @Name("display_area.left") public native int display_area_left(); public native CUVIDEOFORMAT display_area_left(int setter);
        /** OUT: top position of display rect     */
        @Name("display_area.top") public native int display_area_top(); public native CUVIDEOFORMAT display_area_top(int setter);
        /** OUT: right position of display rect   */
        @Name("display_area.right") public native int display_area_right(); public native CUVIDEOFORMAT display_area_right(int setter);
        /** OUT: bottom position of display rect  */
        @Name("display_area.bottom") public native int display_area_bottom(); public native CUVIDEOFORMAT display_area_bottom(int setter);
    /** OUT:  Chroma format                   */
    public native @Cast("cudaVideoChromaFormat") int chroma_format(); public native CUVIDEOFORMAT chroma_format(int setter);
    /** OUT: video bitrate (bps, 0=unknown)   */
    public native @Cast("unsigned int") int bitrate(); public native CUVIDEOFORMAT bitrate(int setter);
   /**
    * OUT: Display Aspect Ratio = x:y (4:3, 16:9, etc)
    */
        @Name("display_aspect_ratio.x") public native int display_aspect_ratio_x(); public native CUVIDEOFORMAT display_aspect_ratio_x(int setter);
        @Name("display_aspect_ratio.y") public native int display_aspect_ratio_y(); public native CUVIDEOFORMAT display_aspect_ratio_y(int setter);
    /**
    * Video Signal Description
    * Refer section E.2.1 (VUI parameters semantics) of H264 spec file
    */
        /** OUT: 0-Component, 1-PAL, 2-NTSC, 3-SECAM, 4-MAC, 5-Unspecified     */
        @Name("video_signal_description.video_format") public native @Cast("unsigned char") @NoOffset byte video_signal_description_video_format(); public native CUVIDEOFORMAT video_signal_description_video_format(byte setter);
        /** OUT: indicates the black level and luma and chroma range           */
        @Name("video_signal_description.video_full_range_flag") public native @Cast("unsigned char") @NoOffset byte video_signal_description_video_full_range_flag(); public native CUVIDEOFORMAT video_signal_description_video_full_range_flag(byte setter);
        /** Reserved bits                                                      */
        @Name("video_signal_description.reserved_zero_bits") public native @Cast("unsigned char") @NoOffset byte video_signal_description_reserved_zero_bits(); public native CUVIDEOFORMAT video_signal_description_reserved_zero_bits(byte setter);
        /** OUT: chromaticity coordinates of source primaries                  */
        @Name("video_signal_description.color_primaries") public native @Cast("unsigned char") byte video_signal_description_color_primaries(); public native CUVIDEOFORMAT video_signal_description_color_primaries(byte setter);
        /** OUT: opto-electronic transfer characteristic of the source picture */
        @Name("video_signal_description.transfer_characteristics") public native @Cast("unsigned char") byte video_signal_description_transfer_characteristics(); public native CUVIDEOFORMAT video_signal_description_transfer_characteristics(byte setter);
        /** OUT: used in deriving luma and chroma signals from RGB primaries   */
        @Name("video_signal_description.matrix_coefficients") public native @Cast("unsigned char") byte video_signal_description_matrix_coefficients(); public native CUVIDEOFORMAT video_signal_description_matrix_coefficients(byte setter);
    /** OUT: Additional bytes following (CUVIDEOFORMATEX)                  */
    public native @Cast("unsigned int") int seqhdr_data_length(); public native CUVIDEOFORMAT seqhdr_data_length(int setter);
}
