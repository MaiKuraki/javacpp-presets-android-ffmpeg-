// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvcuvid;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.nvcodec.global.nvcuvid.*;


/**************************************************************************************************************/
/** \struct CUVIDDECODECREATEINFO
/** This structure is used in cuvidCreateDecoder API
/**************************************************************************************************************/
@Properties(inherit = org.bytedeco.nvcodec.presets.nvcuvid.class)
public class CUVIDDECODECREATEINFO extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUVIDDECODECREATEINFO() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUVIDDECODECREATEINFO(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUVIDDECODECREATEINFO(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUVIDDECODECREATEINFO position(long position) {
        return (CUVIDDECODECREATEINFO)super.position(position);
    }
    @Override public CUVIDDECODECREATEINFO getPointer(long i) {
        return new CUVIDDECODECREATEINFO((Pointer)this).offsetAddress(i);
    }

    /** IN: Coded sequence width in pixels                                             */
    public native @Cast("unsigned long") long ulWidth(); public native CUVIDDECODECREATEINFO ulWidth(long setter);
    /** IN: Coded sequence height in pixels                                            */
    public native @Cast("unsigned long") long ulHeight(); public native CUVIDDECODECREATEINFO ulHeight(long setter);
    /** IN: Maximum number of internal decode surfaces                                 */
    public native @Cast("unsigned long") long ulNumDecodeSurfaces(); public native CUVIDDECODECREATEINFO ulNumDecodeSurfaces(long setter);
    /** IN: cudaVideoCodec_XXX                                                         */
    public native @Cast("cudaVideoCodec") int CodecType(); public native CUVIDDECODECREATEINFO CodecType(int setter);
    /** IN: cudaVideoChromaFormat_XXX                                                  */
    public native @Cast("cudaVideoChromaFormat") int ChromaFormat(); public native CUVIDDECODECREATEINFO ChromaFormat(int setter);
    /** IN: Decoder creation flags (cudaVideoCreateFlags_XXX)                          */
    public native @Cast("unsigned long") long ulCreationFlags(); public native CUVIDDECODECREATEINFO ulCreationFlags(long setter);
    /** IN: The value "BitDepth minus 8"                                               */
    public native @Cast("unsigned long") long bitDepthMinus8(); public native CUVIDDECODECREATEINFO bitDepthMinus8(long setter);
    /** IN: Set 1 only if video has all intra frames (default value is 0). This will
                                                 optimize video memory for Intra frames only decoding. The support is limited
                                                 to specific codecs - H264, HEVC, VP9, the flag will be ignored for codecs which
                                                 are not supported. However decoding might fail if the flag is enabled in case
                                                 of supported codecs for regular bit streams having P and/or B frames.          */
    public native @Cast("unsigned long") long ulIntraDecodeOnly(); public native CUVIDDECODECREATEINFO ulIntraDecodeOnly(long setter);
    /** IN: Coded sequence max width in pixels used with reconfigure Decoder           */
    public native @Cast("unsigned long") long ulMaxWidth(); public native CUVIDDECODECREATEINFO ulMaxWidth(long setter);
    /** IN: Coded sequence max height in pixels used with reconfigure Decoder          */
    public native @Cast("unsigned long") long ulMaxHeight(); public native CUVIDDECODECREATEINFO ulMaxHeight(long setter);                                           
    /** Reserved for future use - set to zero                                          */
    public native @Cast("unsigned long") long Reserved1(); public native CUVIDDECODECREATEINFO Reserved1(long setter);
    /**
    * IN: area of the frame that should be displayed
    */
        @Name("display_area.left") public native short display_area_left(); public native CUVIDDECODECREATEINFO display_area_left(short setter);
        @Name("display_area.top") public native short display_area_top(); public native CUVIDDECODECREATEINFO display_area_top(short setter);
        @Name("display_area.right") public native short display_area_right(); public native CUVIDDECODECREATEINFO display_area_right(short setter);
        @Name("display_area.bottom") public native short display_area_bottom(); public native CUVIDDECODECREATEINFO display_area_bottom(short setter);

    /** IN: cudaVideoSurfaceFormat_XXX                                     */
    public native @Cast("cudaVideoSurfaceFormat") int OutputFormat(); public native CUVIDDECODECREATEINFO OutputFormat(int setter);
    /** IN: cudaVideoDeinterlaceMode_XXX                                   */
    public native @Cast("cudaVideoDeinterlaceMode") int DeinterlaceMode(); public native CUVIDDECODECREATEINFO DeinterlaceMode(int setter);
    /** IN: Post-processed output width (Should be aligned to 2)           */
    public native @Cast("unsigned long") long ulTargetWidth(); public native CUVIDDECODECREATEINFO ulTargetWidth(long setter);
    /** IN: Post-processed output height (Should be aligned to 2)          */
    public native @Cast("unsigned long") long ulTargetHeight(); public native CUVIDDECODECREATEINFO ulTargetHeight(long setter);
    /** IN: Maximum number of output surfaces simultaneously mapped        */
    public native @Cast("unsigned long") long ulNumOutputSurfaces(); public native CUVIDDECODECREATEINFO ulNumOutputSurfaces(long setter);
    /** IN: If non-NULL, context lock used for synchronizing ownership of 
                                                        the cuda context. Needed for cudaVideoCreate_PreferCUDA decode     */
    public native _CUcontextlock_st vidLock(); public native CUVIDDECODECREATEINFO vidLock(_CUcontextlock_st setter);
    /**
    * IN: target rectangle in the output frame (for aspect ratio conversion)
    * if a null rectangle is specified, {0,0,ulTargetWidth,ulTargetHeight} will be used
    */
        @Name("target_rect.left") public native short target_rect_left(); public native CUVIDDECODECREATEINFO target_rect_left(short setter);
        @Name("target_rect.top") public native short target_rect_top(); public native CUVIDDECODECREATEINFO target_rect_top(short setter);
        @Name("target_rect.right") public native short target_rect_right(); public native CUVIDDECODECREATEINFO target_rect_right(short setter);
        @Name("target_rect.bottom") public native short target_rect_bottom(); public native CUVIDDECODECREATEINFO target_rect_bottom(short setter);

    /** IN: enable histogram output, if supported */
    public native @Cast("unsigned long") long enableHistogram(); public native CUVIDDECODECREATEINFO enableHistogram(long setter);
    /** Reserved for future use - set to zero */
    public native @Cast("unsigned long") long Reserved2(int i); public native CUVIDDECODECREATEINFO Reserved2(int i, long setter);
    @MemberGetter public native @Cast("unsigned long*") CLongPointer Reserved2();
}
