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


     /** \brief This class represents high-level API for classification models.
      *
      * ClassificationModel allows to set params for preprocessing input image.
      * ClassificationModel creates net from file with trained weights and config,
      * sets preprocessing input, runs forward pass and return top-1 prediction.
      */
     @Namespace("cv::dnn") @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class ClassificationModel extends Model {
         static { Loader.load(); }
         /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
         public ClassificationModel(Pointer p) { super(p); }
     
         /**
          * \brief Create classification model from network represented in one of the supported formats.
          * An order of \p model and \p config arguments does not matter.
          * @param model [in] Binary file contains trained weights.
          * @param config [in] Text file contains network configuration.
          */
          public ClassificationModel(@Str BytePointer model, @Str BytePointer config/*=""*/) { super((Pointer)null); allocate(model, config); }
          private native void allocate(@Str BytePointer model, @Str BytePointer config/*=""*/);
          public ClassificationModel(@Str BytePointer model) { super((Pointer)null); allocate(model); }
          private native void allocate(@Str BytePointer model);
          public ClassificationModel(@Str String model, @Str String config/*=""*/) { super((Pointer)null); allocate(model, config); }
          private native void allocate(@Str String model, @Str String config/*=""*/);
          public ClassificationModel(@Str String model) { super((Pointer)null); allocate(model); }
          private native void allocate(@Str String model);

         /**
          * \brief Create model from deep learning network.
          * @param network [in] Net object.
          */
         public ClassificationModel(@Const @ByRef Net network) { super((Pointer)null); allocate(network); }
         private native void allocate(@Const @ByRef Net network);

         /** \brief Given the \p input frame, create input blob, run net and return top-1 prediction.
          *  @param frame [in]  The input image.
          */
         public native @ByVal IntFloatPair classify(@ByVal Mat frame);
         public native @ByVal IntFloatPair classify(@ByVal UMat frame);
         public native @ByVal IntFloatPair classify(@ByVal GpuMat frame);

         /** \overload */
         public native void classify(@ByVal Mat frame, @ByRef IntPointer classId, @ByRef FloatPointer conf);
         public native void classify(@ByVal Mat frame, @ByRef IntBuffer classId, @ByRef FloatBuffer conf);
         public native void classify(@ByVal Mat frame, @ByRef int[] classId, @ByRef float[] conf);
         public native void classify(@ByVal UMat frame, @ByRef IntPointer classId, @ByRef FloatPointer conf);
         public native void classify(@ByVal UMat frame, @ByRef IntBuffer classId, @ByRef FloatBuffer conf);
         public native void classify(@ByVal UMat frame, @ByRef int[] classId, @ByRef float[] conf);
         public native void classify(@ByVal GpuMat frame, @ByRef IntPointer classId, @ByRef FloatPointer conf);
         public native void classify(@ByVal GpuMat frame, @ByRef IntBuffer classId, @ByRef FloatBuffer conf);
         public native void classify(@ByVal GpuMat frame, @ByRef int[] classId, @ByRef float[] conf);
     }
