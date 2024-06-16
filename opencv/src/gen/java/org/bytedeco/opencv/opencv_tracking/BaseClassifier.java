// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_tracking;

import org.bytedeco.javacpp.annotation.Index;
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
import org.bytedeco.opencv.opencv_plot.*;
import static org.bytedeco.opencv.global.opencv_plot.*;
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

import static org.bytedeco.opencv.global.opencv_tracking.*;


@Namespace("cv::detail::tracking::online_boosting") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class BaseClassifier extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseClassifier(Pointer p) { super(p); }


  public BaseClassifier( int numWeakClassifier, int iterationInit ) { super((Pointer)null); allocate(numWeakClassifier, iterationInit); }
  private native void allocate( int numWeakClassifier, int iterationInit );
  public BaseClassifier( int numWeakClassifier, int iterationInit, @Cast("cv::detail::tracking::online_boosting::WeakClassifierHaarFeature**") PointerPointer weakCls ) { super((Pointer)null); allocate(numWeakClassifier, iterationInit, weakCls); }
  private native void allocate( int numWeakClassifier, int iterationInit, @Cast("cv::detail::tracking::online_boosting::WeakClassifierHaarFeature**") PointerPointer weakCls );
  public BaseClassifier( int numWeakClassifier, int iterationInit, @ByPtrPtr WeakClassifierHaarFeature weakCls ) { super((Pointer)null); allocate(numWeakClassifier, iterationInit, weakCls); }
  private native void allocate( int numWeakClassifier, int iterationInit, @ByPtrPtr WeakClassifierHaarFeature weakCls );

  public native @Cast("cv::detail::tracking::online_boosting::WeakClassifierHaarFeature**") PointerPointer getReferenceWeakClassifier();
  public native void trainClassifier( @Const @ByRef Mat image, int target, float importance, @Cast("bool*") @StdVector BoolPointer errorMask );
  public native void trainClassifier( @Const @ByRef Mat image, int target, float importance, @Cast("bool*") @StdVector boolean[] errorMask );
  public native int selectBestClassifier( @Cast("bool*") @StdVector BoolPointer errorMask, float importance, @StdVector FloatPointer errors );
  public native int selectBestClassifier( @Cast("bool*") @StdVector boolean[] errorMask, float importance, @StdVector FloatBuffer errors );
  public native int selectBestClassifier( @Cast("bool*") @StdVector BoolPointer errorMask, float importance, @StdVector float[] errors );
  public native int selectBestClassifier( @Cast("bool*") @StdVector boolean[] errorMask, float importance, @StdVector FloatPointer errors );
  public native int selectBestClassifier( @Cast("bool*") @StdVector BoolPointer errorMask, float importance, @StdVector FloatBuffer errors );
  public native int selectBestClassifier( @Cast("bool*") @StdVector boolean[] errorMask, float importance, @StdVector float[] errors );
  public native int computeReplaceWeakestClassifier( @StdVector FloatPointer errors );
  public native int computeReplaceWeakestClassifier( @StdVector FloatBuffer errors );
  public native int computeReplaceWeakestClassifier( @StdVector float[] errors );
  public native void replaceClassifierStatistic( int sourceIndex, int targetIndex );
  public native int getIdxOfNewWeakClassifier();
  public native int eval( @Const @ByRef Mat image );
  public native float getError( int curWeakClassifier );
  public native void getErrors( FloatPointer errors );
  public native void getErrors( FloatBuffer errors );
  public native void getErrors( float[] errors );
  public native int getSelectedClassifier();
  public native void replaceWeakClassifier( int index );

}
