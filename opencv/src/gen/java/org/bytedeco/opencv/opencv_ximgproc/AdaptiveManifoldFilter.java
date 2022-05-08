// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_ximgproc;

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
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;

import static org.bytedeco.opencv.global.opencv_ximgproc.*;


//////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////

/** \brief Interface for Adaptive Manifold Filter realizations.
<p>
For more details about this filter see \cite Gastal12 and References_.
<p>
Below listed optional parameters which may be set up with Algorithm::set function.
-   member double sigma_s = 16.0
Spatial standard deviation.
-   member double sigma_r = 0.2
Color space standard deviation.
-   member int tree_height = -1
Height of the manifold tree (default = -1 : automatically computed).
-   member int num_pca_iterations = 1
Number of iterations to computed the eigenvector.
-   member bool adjust_outliers = false
Specify adjust outliers using Eq. 9 or not.
-   member bool use_RNG = true
Specify use random number generator to compute eigenvector or not.
 */
@Namespace("cv::ximgproc") @Properties(inherit = org.bytedeco.opencv.presets.opencv_ximgproc.class)
public class AdaptiveManifoldFilter extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AdaptiveManifoldFilter(Pointer p) { super(p); }

    /** \brief Apply high-dimensional filtering using adaptive manifolds.
    <p>
    @param src filtering image with any numbers of channels.
    <p>
    @param dst output image.
    <p>
    @param joint optional joint (also called as guided) image with any numbers of channels.
     */
    public native void filter(@ByVal Mat src, @ByVal Mat dst, @ByVal(nullValue = "cv::InputArray(cv::noArray())") Mat joint);
    public native void filter(@ByVal Mat src, @ByVal Mat dst);
    public native void filter(@ByVal UMat src, @ByVal UMat dst, @ByVal(nullValue = "cv::InputArray(cv::noArray())") UMat joint);
    public native void filter(@ByVal UMat src, @ByVal UMat dst);
    public native void filter(@ByVal GpuMat src, @ByVal GpuMat dst, @ByVal(nullValue = "cv::InputArray(cv::noArray())") GpuMat joint);
    public native void filter(@ByVal GpuMat src, @ByVal GpuMat dst);

    public native void collectGarbage();

    public static native @Ptr AdaptiveManifoldFilter create();

    /** @see setSigmaS */
    public native double getSigmaS();
    /** \copybrief getSigmaS @see getSigmaS */
    public native void setSigmaS(double val);
    /** @see setSigmaR */
    public native double getSigmaR();
    /** \copybrief getSigmaR @see getSigmaR */
    public native void setSigmaR(double val);
    /** @see setTreeHeight */
    public native int getTreeHeight();
    /** \copybrief getTreeHeight @see getTreeHeight */
    public native void setTreeHeight(int val);
    /** @see setPCAIterations */
    public native int getPCAIterations();
    /** \copybrief getPCAIterations @see getPCAIterations */
    public native void setPCAIterations(int val);
    /** @see setAdjustOutliers */
    public native @Cast("bool") boolean getAdjustOutliers();
    /** \copybrief getAdjustOutliers @see getAdjustOutliers */
    public native void setAdjustOutliers(@Cast("bool") boolean val);
    /** @see setUseRNG */
    public native @Cast("bool") boolean getUseRNG();
    /** \copybrief getUseRNG @see getUseRNG */
    public native void setUseRNG(@Cast("bool") boolean val);
}
