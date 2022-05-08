// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_calib3d;

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

import static org.bytedeco.opencv.global.opencv_calib3d.*;



/** \brief Class for computing stereo correspondence using the block matching algorithm, introduced and
contributed to OpenCV by K. Konolige.
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_calib3d.class)
public class StereoBM extends StereoMatcher {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StereoBM(Pointer p) { super(p); }

    /** enum cv::StereoBM:: */
    public static final int PREFILTER_NORMALIZED_RESPONSE = 0,
           PREFILTER_XSOBEL              = 1;

    public native int getPreFilterType();
    public native void setPreFilterType(int preFilterType);

    public native int getPreFilterSize();
    public native void setPreFilterSize(int preFilterSize);

    public native int getPreFilterCap();
    public native void setPreFilterCap(int preFilterCap);

    public native int getTextureThreshold();
    public native void setTextureThreshold(int textureThreshold);

    public native int getUniquenessRatio();
    public native void setUniquenessRatio(int uniquenessRatio);

    public native int getSmallerBlockSize();
    public native void setSmallerBlockSize(int blockSize);

    public native @ByVal Rect getROI1();
    public native void setROI1(@ByVal Rect roi1);

    public native @ByVal Rect getROI2();
    public native void setROI2(@ByVal Rect roi2);

    /** \brief Creates StereoBM object
    <p>
    @param numDisparities the disparity search range. For each pixel algorithm will find the best
    disparity from 0 (default minimum disparity) to numDisparities. The search range can then be
    shifted by changing the minimum disparity.
    @param blockSize the linear size of the blocks compared by the algorithm. The size should be odd
    (as the block is centered at the current pixel). Larger block size implies smoother, though less
    accurate disparity map. Smaller block size gives more detailed disparity map, but there is higher
    chance for algorithm to find a wrong correspondence.
    <p>
    The function create StereoBM object. You can then call StereoBM::compute() to compute disparity for
    a specific stereo pair.
     */
    public static native @Ptr StereoBM create(int numDisparities/*=0*/, int blockSize/*=21*/);
    public static native @Ptr StereoBM create();
}
