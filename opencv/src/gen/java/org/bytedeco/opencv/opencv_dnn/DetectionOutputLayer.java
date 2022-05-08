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


    /**
     * \brief Detection output layer.
     *
     * The layer size is: {@code  (1 \times 1 \times N \times 7) }
     *    where N is [keep_top_k] parameter multiplied by batch size. Each row is:
     *    [image_id, label, confidence, xmin, ymin, xmax, ymax]
     *    where image_id is the index of image input in the batch.
     */
    @Namespace("cv::dnn") @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class DetectionOutputLayer extends Layer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public DetectionOutputLayer(Pointer p) { super(p); }
    
        public static native @Ptr DetectionOutputLayer create(@Const @ByRef LayerParams params);
    }
