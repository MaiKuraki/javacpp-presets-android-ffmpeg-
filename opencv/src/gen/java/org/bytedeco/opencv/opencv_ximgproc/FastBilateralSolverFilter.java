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

/** \brief Interface for implementations of Fast Bilateral Solver.
<p>
For more details about this solver see \cite BarronPoole2016 .
*/
@Namespace("cv::ximgproc") @Properties(inherit = org.bytedeco.opencv.presets.opencv_ximgproc.class)
public class FastBilateralSolverFilter extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FastBilateralSolverFilter(Pointer p) { super(p); }

    /** \brief Apply smoothing operation to the source image.
    <p>
    @param src source image for filtering with unsigned 8-bit or signed 16-bit or floating-point 32-bit depth and up to 3 channels.
    <p>
    @param confidence confidence image with unsigned 8-bit or floating-point 32-bit confidence and 1 channel.
    <p>
    @param dst destination image.
    <p>
    \note Confidence images with CV_8U depth are expected to in [0, 255] and CV_32F in [0, 1] range.
    */
    public native void filter(@ByVal Mat src, @ByVal Mat confidence, @ByVal Mat dst);
    public native void filter(@ByVal UMat src, @ByVal UMat confidence, @ByVal UMat dst);
    public native void filter(@ByVal GpuMat src, @ByVal GpuMat confidence, @ByVal GpuMat dst);
}
