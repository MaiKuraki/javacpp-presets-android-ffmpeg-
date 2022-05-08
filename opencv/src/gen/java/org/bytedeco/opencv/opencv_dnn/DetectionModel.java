// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_dnn;

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

import static org.bytedeco.opencv.global.opencv_dnn.*;


     /** \brief This class represents high-level API for object detection networks.
      *
      * DetectionModel allows to set params for preprocessing input image.
      * DetectionModel creates net from file with trained weights and config,
      * sets preprocessing input, runs forward pass and return result detections.
      * For DetectionModel SSD, Faster R-CNN, YOLO topologies are supported.
      */
     @Namespace("cv::dnn") @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class DetectionModel extends Model {
         static { Loader.load(); }
         /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
         public DetectionModel(Pointer p) { super(p); }
         /** Native array allocator. Access with {@link Pointer#position(long)}. */
         public DetectionModel(long size) { super((Pointer)null); allocateArray(size); }
         private native void allocateArray(long size);
         @Override public DetectionModel position(long position) {
             return (DetectionModel)super.position(position);
         }
         @Override public DetectionModel getPointer(long i) {
             return new DetectionModel((Pointer)this).offsetAddress(i);
         }
     
         /**
          * \brief Create detection model from network represented in one of the supported formats.
          * An order of \p model and \p config arguments does not matter.
          * @param model [in] Binary file contains trained weights.
          * @param config [in] Text file contains network configuration.
          */
         public DetectionModel(@Str BytePointer model, @Str BytePointer config/*=""*/) { super((Pointer)null); allocate(model, config); }
         private native void allocate(@Str BytePointer model, @Str BytePointer config/*=""*/);
         public DetectionModel(@Str BytePointer model) { super((Pointer)null); allocate(model); }
         private native void allocate(@Str BytePointer model);
         public DetectionModel(@Str String model, @Str String config/*=""*/) { super((Pointer)null); allocate(model, config); }
         private native void allocate(@Str String model, @Str String config/*=""*/);
         public DetectionModel(@Str String model) { super((Pointer)null); allocate(model); }
         private native void allocate(@Str String model);

         /**
          * \brief Create model from deep learning network.
          * @param network [in] Net object.
          */
         public DetectionModel(@Const @ByRef Net network) { super((Pointer)null); allocate(network); }
         private native void allocate(@Const @ByRef Net network);

         public DetectionModel() { super((Pointer)null); allocate(); }
         @Deprecated private native void allocate();

         /**
          * \brief nmsAcrossClasses defaults to false,
          * such that when non max suppression is used during the detect() function, it will do so per-class.
          * This function allows you to toggle this behaviour.
          * @param value [in] The new value for nmsAcrossClasses
          */
         public native @ByRef DetectionModel setNmsAcrossClasses(@Cast("bool") boolean value);

         /**
          * \brief Getter for nmsAcrossClasses. This variable defaults to false,
          * such that when non max suppression is used during the detect() function, it will do so only per-class
          */
         public native @Cast("bool") boolean getNmsAcrossClasses();

         /** \brief Given the \p input frame, create input blob, run net and return result detections.
          *  @param frame [in]  The input image.
          *  @param classIds [out] Class indexes in result detection.
          *  @param confidences [out] A set of corresponding confidences.
          *  @param boxes [out] A set of bounding boxes.
          *  @param confThreshold [in] A threshold used to filter boxes by confidences.
          *  @param nmsThreshold [in] A threshold used in non maximum suppression.
          */
         public native void detect(@ByVal Mat frame, @StdVector IntPointer classIds,
                                      @StdVector FloatPointer confidences, @ByRef RectVector boxes,
                                      float confThreshold/*=0.5f*/, float nmsThreshold/*=0.0f*/);
         public native void detect(@ByVal Mat frame, @StdVector IntPointer classIds,
                                      @StdVector FloatPointer confidences, @ByRef RectVector boxes);
         public native void detect(@ByVal Mat frame, @StdVector IntBuffer classIds,
                                      @StdVector FloatBuffer confidences, @ByRef RectVector boxes,
                                      float confThreshold/*=0.5f*/, float nmsThreshold/*=0.0f*/);
         public native void detect(@ByVal Mat frame, @StdVector IntBuffer classIds,
                                      @StdVector FloatBuffer confidences, @ByRef RectVector boxes);
         public native void detect(@ByVal Mat frame, @StdVector int[] classIds,
                                      @StdVector float[] confidences, @ByRef RectVector boxes,
                                      float confThreshold/*=0.5f*/, float nmsThreshold/*=0.0f*/);
         public native void detect(@ByVal Mat frame, @StdVector int[] classIds,
                                      @StdVector float[] confidences, @ByRef RectVector boxes);
         public native void detect(@ByVal UMat frame, @StdVector IntPointer classIds,
                                      @StdVector FloatPointer confidences, @ByRef RectVector boxes,
                                      float confThreshold/*=0.5f*/, float nmsThreshold/*=0.0f*/);
         public native void detect(@ByVal UMat frame, @StdVector IntPointer classIds,
                                      @StdVector FloatPointer confidences, @ByRef RectVector boxes);
         public native void detect(@ByVal UMat frame, @StdVector IntBuffer classIds,
                                      @StdVector FloatBuffer confidences, @ByRef RectVector boxes,
                                      float confThreshold/*=0.5f*/, float nmsThreshold/*=0.0f*/);
         public native void detect(@ByVal UMat frame, @StdVector IntBuffer classIds,
                                      @StdVector FloatBuffer confidences, @ByRef RectVector boxes);
         public native void detect(@ByVal UMat frame, @StdVector int[] classIds,
                                      @StdVector float[] confidences, @ByRef RectVector boxes,
                                      float confThreshold/*=0.5f*/, float nmsThreshold/*=0.0f*/);
         public native void detect(@ByVal UMat frame, @StdVector int[] classIds,
                                      @StdVector float[] confidences, @ByRef RectVector boxes);
         public native void detect(@ByVal GpuMat frame, @StdVector IntPointer classIds,
                                      @StdVector FloatPointer confidences, @ByRef RectVector boxes,
                                      float confThreshold/*=0.5f*/, float nmsThreshold/*=0.0f*/);
         public native void detect(@ByVal GpuMat frame, @StdVector IntPointer classIds,
                                      @StdVector FloatPointer confidences, @ByRef RectVector boxes);
         public native void detect(@ByVal GpuMat frame, @StdVector IntBuffer classIds,
                                      @StdVector FloatBuffer confidences, @ByRef RectVector boxes,
                                      float confThreshold/*=0.5f*/, float nmsThreshold/*=0.0f*/);
         public native void detect(@ByVal GpuMat frame, @StdVector IntBuffer classIds,
                                      @StdVector FloatBuffer confidences, @ByRef RectVector boxes);
         public native void detect(@ByVal GpuMat frame, @StdVector int[] classIds,
                                      @StdVector float[] confidences, @ByRef RectVector boxes,
                                      float confThreshold/*=0.5f*/, float nmsThreshold/*=0.0f*/);
         public native void detect(@ByVal GpuMat frame, @StdVector int[] classIds,
                                      @StdVector float[] confidences, @ByRef RectVector boxes);
     }
