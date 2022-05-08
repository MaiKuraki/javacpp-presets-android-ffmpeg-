// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_video;

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
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;

import static org.bytedeco.opencv.global.opencv_video.*;


/** \brief DIS optical flow algorithm.
<p>
This class implements the Dense Inverse Search (DIS) optical flow algorithm. More
details about the algorithm can be found at \cite Kroeger2016 . Includes three presets with preselected
parameters to provide reasonable trade-off between speed and quality. However, even the slowest preset is
still relatively fast, use DeepFlow if you need better quality and don't care about speed.
<p>
This implementation includes several additional features compared to the algorithm described in the paper,
including spatial propagation of flow vectors (\ref getUseSpatialPropagation), as well as an option to
utilize an initial flow approximation passed to \ref calc (which is, essentially, temporal propagation,
if the previous frame's flow field is passed).
*/
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_video.class)
public class DISOpticalFlow extends DenseOpticalFlow {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DISOpticalFlow(Pointer p) { super(p); }

    /** enum cv::DISOpticalFlow:: */
    public static final int
        PRESET_ULTRAFAST = 0,
        PRESET_FAST = 1,
        PRESET_MEDIUM = 2;

    /** \brief Finest level of the Gaussian pyramid on which the flow is computed (zero level
        corresponds to the original image resolution). The final flow is obtained by bilinear upscaling.
        @see setFinestScale */
    public native int getFinestScale();
    /** \copybrief getFinestScale @see getFinestScale */
    public native void setFinestScale(int val);

    /** \brief Size of an image patch for matching (in pixels). Normally, default 8x8 patches work well
        enough in most cases.
        @see setPatchSize */
    public native int getPatchSize();
    /** \copybrief getPatchSize @see getPatchSize */
    public native void setPatchSize(int val);

    /** \brief Stride between neighbor patches. Must be less than patch size. Lower values correspond
        to higher flow quality.
        @see setPatchStride */
    public native int getPatchStride();
    /** \copybrief getPatchStride @see getPatchStride */
    public native void setPatchStride(int val);

    /** \brief Maximum number of gradient descent iterations in the patch inverse search stage. Higher values
        may improve quality in some cases.
        @see setGradientDescentIterations */
    public native int getGradientDescentIterations();
    /** \copybrief getGradientDescentIterations @see getGradientDescentIterations */
    public native void setGradientDescentIterations(int val);

    /** \brief Number of fixed point iterations of variational refinement per scale. Set to zero to
        disable variational refinement completely. Higher values will typically result in more smooth and
        high-quality flow.
    @see setGradientDescentIterations */
    public native int getVariationalRefinementIterations();
    /** \copybrief getGradientDescentIterations @see getGradientDescentIterations */
    public native void setVariationalRefinementIterations(int val);

    /** \brief Weight of the smoothness term
    @see setVariationalRefinementAlpha */
    public native float getVariationalRefinementAlpha();
    /** \copybrief getVariationalRefinementAlpha @see getVariationalRefinementAlpha */
    public native void setVariationalRefinementAlpha(float val);

    /** \brief Weight of the color constancy term
    @see setVariationalRefinementDelta */
    public native float getVariationalRefinementDelta();
    /** \copybrief getVariationalRefinementDelta @see getVariationalRefinementDelta */
    public native void setVariationalRefinementDelta(float val);

    /** \brief Weight of the gradient constancy term
    @see setVariationalRefinementGamma */
    public native float getVariationalRefinementGamma();
    /** \copybrief getVariationalRefinementGamma @see getVariationalRefinementGamma */
    public native void setVariationalRefinementGamma(float val);


    /** \brief Whether to use mean-normalization of patches when computing patch distance. It is turned on
        by default as it typically provides a noticeable quality boost because of increased robustness to
        illumination variations. Turn it off if you are certain that your sequence doesn't contain any changes
        in illumination.
    @see setUseMeanNormalization */
    public native @Cast("bool") boolean getUseMeanNormalization();
    /** \copybrief getUseMeanNormalization @see getUseMeanNormalization */
    public native void setUseMeanNormalization(@Cast("bool") boolean val);

    /** \brief Whether to use spatial propagation of good optical flow vectors. This option is turned on by
        default, as it tends to work better on average and can sometimes help recover from major errors
        introduced by the coarse-to-fine scheme employed by the DIS optical flow algorithm. Turning this
        option off can make the output flow field a bit smoother, however.
    @see setUseSpatialPropagation */
    public native @Cast("bool") boolean getUseSpatialPropagation();
    /** \copybrief getUseSpatialPropagation @see getUseSpatialPropagation */
    public native void setUseSpatialPropagation(@Cast("bool") boolean val);

    /** \brief Creates an instance of DISOpticalFlow
    <p>
    @param preset one of PRESET_ULTRAFAST, PRESET_FAST and PRESET_MEDIUM
    */
    public static native @Ptr DISOpticalFlow create(int preset/*=cv::DISOpticalFlow::PRESET_FAST*/);
    public static native @Ptr DISOpticalFlow create();
}
