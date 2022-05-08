// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_quality;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;

import static org.bytedeco.opencv.global.opencv_quality.*;


/**
\brief Full reference structural similarity algorithm  https://en.wikipedia.org/wiki/Structural_similarity
*/
@Namespace("cv::quality") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_quality.class)
public class QualitySSIM extends QualityBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QualitySSIM(Pointer p) { super(p); }


    /**
    \brief Computes SSIM
    @param cmp Comparison image
    @return cv::Scalar with per-channel quality values.  Values range from 0 (worst) to 1 (best)
    */
    public native @ByVal @Override Scalar compute( @ByVal Mat cmp );
    public native @ByVal @Override Scalar compute( @ByVal UMat cmp );
    public native @ByVal @Override Scalar compute( @ByVal GpuMat cmp );

    /** \brief Implements Algorithm::empty()  */
    public native @Cast("bool") @Override boolean empty();

    /** \brief Implements Algorithm::clear()  */
    public native @Override void clear();

    /**
    \brief Create an object which calculates quality
    @param ref input image to use as the reference image for comparison
    */
    public static native @Ptr QualitySSIM create( @ByVal Mat ref );
    public static native @Ptr QualitySSIM create( @ByVal UMat ref );
    public static native @Ptr QualitySSIM create( @ByVal GpuMat ref );

    /**
    \brief static method for computing quality
    @param ref reference image
    @param cmp comparison image
    @param qualityMap output quality map, or cv::noArray()
    @return cv::Scalar with per-channel quality values.  Values range from 0 (worst) to 1 (best)
    */
    public static native @ByVal Scalar compute( @ByVal Mat ref, @ByVal Mat cmp, @ByVal Mat qualityMap );
    public static native @ByVal Scalar compute( @ByVal UMat ref, @ByVal UMat cmp, @ByVal UMat qualityMap );
    public static native @ByVal Scalar compute( @ByVal GpuMat ref, @ByVal GpuMat cmp, @ByVal GpuMat qualityMap );

}
