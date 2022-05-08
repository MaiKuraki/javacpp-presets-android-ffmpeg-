// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_mcc;

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

import static org.bytedeco.opencv.global.opencv_mcc.*;


/** \brief checker draw
 *
 *  This class contains the functions for drawing a detected chart.  This class
 *  expects a pointer to the checker which will be drawn by this object in the
 *  constructor and then later on whenever the draw function is called the
 *  checker will be drawn. Remember that it is not possible to change the
 *  checkers which will be draw by a given object, as it is decided in the
 *  constructor itself. If you want to draw some other object you can create a
 *  new CCheckerDraw instance.
 *
 *  The reason for this type of design is that in some videos we can assume that
 *  the checker is always in the same position, even if the image changes, so
 *  the drawing will always take place at the same position.
*/
@Namespace("cv::mcc") @Properties(inherit = org.bytedeco.opencv.presets.opencv_mcc.class)
public class CCheckerDraw extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CCheckerDraw(Pointer p) { super(p); }

    /** \brief Draws the checker to the given image.
    * @param img image in color space BGR
    * @return void
    */
    public native void draw(@ByVal Mat img);
    public native void draw(@ByVal UMat img);
    public native void draw(@ByVal GpuMat img);
    /** \brief Create a new CCheckerDraw object.
    * @param pChecker The checker which will be drawn by this object.
    * @param color The color by with which the squares of the checker
    *              will be drawn
    * @param thickness The thickness with which the sqaures will be
    *                  drawn
    * @return A pointer to the implementation of the CCheckerDraw
    */
    public static native @Ptr CCheckerDraw create(@Ptr CChecker pChecker,
                                                @ByVal(nullValue = "cv::Scalar(( 0), ( 250), (0), 0)") Scalar color,
                                                int thickness/*=2*/);
    public static native @Ptr CCheckerDraw create(@Ptr CChecker pChecker);
}
