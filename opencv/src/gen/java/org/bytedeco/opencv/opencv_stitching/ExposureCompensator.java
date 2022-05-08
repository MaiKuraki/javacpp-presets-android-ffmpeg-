// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_stitching;

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
import org.bytedeco.opencv.opencv_objdetect.*;
import static org.bytedeco.opencv.global.opencv_objdetect.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;
import org.bytedeco.opencv.opencv_shape.*;
import static org.bytedeco.opencv.global.opencv_shape.*;
import org.bytedeco.opencv.opencv_xfeatures2d.*;
import static org.bytedeco.opencv.global.opencv_xfeatures2d.*;

import static org.bytedeco.opencv.global.opencv_stitching.*;


/** \addtogroup stitching_exposure
 *  \{
<p>
/** \brief Base class for all exposure compensators.
 */
@Namespace("cv::detail") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_stitching.class)
public class ExposureCompensator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ExposureCompensator(Pointer p) { super(p); }


    /** enum cv::detail::ExposureCompensator:: */
    public static final int NO = 0, GAIN = 1, GAIN_BLOCKS = 2, CHANNELS = 3, CHANNELS_BLOCKS = 4;
    public static native @Ptr ExposureCompensator createDefault(int type);

    /**
    @param corners Source image top-left corners
    @param images Source images
    @param masks Image masks to update (second value in pair specifies the value which should be used
    to detect where image is)
        */
    public native void feed(@Const @ByRef PointVector corners, @Const @ByRef UMatVector images,
            @Const @ByRef UMatVector masks);
    /** \overload */
    public native void feed(@Const @ByRef PointVector corners, @Const @ByRef UMatVector images,
            @Const @ByRef UMatBytePairVector masks);
    /** \brief Compensate exposure in the specified image.
    <p>
    @param index Image index
    @param corner Image top-left corner
    @param image Image to process
    @param mask Image mask
        */
    public native void apply(int index, @ByVal Point corner, @ByVal Mat image, @ByVal Mat mask);
    public native void apply(int index, @ByVal Point corner, @ByVal UMat image, @ByVal UMat mask);
    public native void apply(int index, @ByVal Point corner, @ByVal GpuMat image, @ByVal GpuMat mask);
    public native void getMatGains(@ByRef MatVector arg0 );
    public native void setMatGains(@ByRef MatVector arg0 );
    public native void setUpdateGain(@Cast("bool") boolean b);
    public native @Cast("bool") boolean getUpdateGain();
}
