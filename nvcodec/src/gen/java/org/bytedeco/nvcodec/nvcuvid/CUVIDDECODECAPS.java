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
/** \struct CUVIDDECODECAPS;
/** This structure is used in cuvidGetDecoderCaps API
/**************************************************************************************************************/
@Properties(inherit = org.bytedeco.nvcodec.presets.nvcuvid.class)
public class CUVIDDECODECAPS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUVIDDECODECAPS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUVIDDECODECAPS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUVIDDECODECAPS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUVIDDECODECAPS position(long position) {
        return (CUVIDDECODECAPS)super.position(position);
    }
    @Override public CUVIDDECODECAPS getPointer(long i) {
        return new CUVIDDECODECAPS((Pointer)this).offsetAddress(i);
    }

    /** IN: cudaVideoCodec_XXX                                             */
    public native @Cast("cudaVideoCodec") int eCodecType(); public native CUVIDDECODECAPS eCodecType(int setter);
    /** IN: cudaVideoChromaFormat_XXX                                      */
    public native @Cast("cudaVideoChromaFormat") int eChromaFormat(); public native CUVIDDECODECAPS eChromaFormat(int setter);
    /** IN: The Value "BitDepth minus 8"                                   */
    public native @Cast("unsigned int") int nBitDepthMinus8(); public native CUVIDDECODECAPS nBitDepthMinus8(int setter);
    /** Reserved for future use - set to zero                              */
    public native @Cast("unsigned int") int reserved1(int i); public native CUVIDDECODECAPS reserved1(int i, int setter);
    @MemberGetter public native @Cast("unsigned int*") IntPointer reserved1();

    /** OUT: 1 if codec supported, 0 if not supported                      */
    public native @Cast("unsigned char") byte bIsSupported(); public native CUVIDDECODECAPS bIsSupported(byte setter);
    /** OUT: Number of NVDECs that can support IN params                   */
    public native @Cast("unsigned char") byte nNumNVDECs(); public native CUVIDDECODECAPS nNumNVDECs(byte setter);
    /** OUT: each bit represents corresponding cudaVideoSurfaceFormat enum */
    public native @Cast("unsigned short") short nOutputFormatMask(); public native CUVIDDECODECAPS nOutputFormatMask(short setter);
    /** OUT: Max supported coded width in pixels                           */
    public native @Cast("unsigned int") int nMaxWidth(); public native CUVIDDECODECAPS nMaxWidth(int setter);
    /** OUT: Max supported coded height in pixels                          */
    public native @Cast("unsigned int") int nMaxHeight(); public native CUVIDDECODECAPS nMaxHeight(int setter);
    /** OUT: Max supported macroblock count
                                                                      CodedWidth*CodedHeight/256 must be <= nMaxMBCount             */
    public native @Cast("unsigned int") int nMaxMBCount(); public native CUVIDDECODECAPS nMaxMBCount(int setter);
    /** OUT: Min supported coded width in pixels                           */
    public native @Cast("unsigned short") short nMinWidth(); public native CUVIDDECODECAPS nMinWidth(short setter);
    /** OUT: Min supported coded height in pixels                          */
    public native @Cast("unsigned short") short nMinHeight(); public native CUVIDDECODECAPS nMinHeight(short setter);
    /** OUT: 1 if Y component histogram output is supported, 0 if not
                                                                      Note: histogram is computed on original picture data before
                                                                      any post-processing like scaling, cropping, etc. is applied   */
    public native @Cast("unsigned char") byte bIsHistogramSupported(); public native CUVIDDECODECAPS bIsHistogramSupported(byte setter);
    /** OUT: histogram counter bit depth                                   */
    public native @Cast("unsigned char") byte nCounterBitDepth(); public native CUVIDDECODECAPS nCounterBitDepth(byte setter);
    /** OUT: Max number of histogram bins                                  */
    public native @Cast("unsigned short") short nMaxHistogramBins(); public native CUVIDDECODECAPS nMaxHistogramBins(short setter);
    /** Reserved for future use - set to zero                              */
    public native @Cast("unsigned int") int reserved3(int i); public native CUVIDDECODECAPS reserved3(int i, int setter);
    @MemberGetter public native @Cast("unsigned int*") IntPointer reserved3();
}
