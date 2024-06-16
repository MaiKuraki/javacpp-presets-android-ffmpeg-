// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_text;

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
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;

import static org.bytedeco.opencv.global.opencv_text.*;


/** \brief OCRHMMDecoder class provides an interface for OCR using Hidden Markov Models.
<p>
\note
   -   (C++) An example on using OCRHMMDecoder recognition combined with scene text detection can
        be found at the webcam_demo sample:
        <https://github.com/opencv/opencv_contrib/blob/master/modules/text/samples/webcam_demo.cpp>
 */
@Namespace("cv::text") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_text.class)
public class OCRHMMDecoder extends BaseOCR {
    static { Loader.load(); }
    /** Default native constructor. */
    public OCRHMMDecoder() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OCRHMMDecoder(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OCRHMMDecoder(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public OCRHMMDecoder position(long position) {
        return (OCRHMMDecoder)super.position(position);
    }
    @Override public OCRHMMDecoder getPointer(long i) {
        return new OCRHMMDecoder((Pointer)this).offsetAddress(i);
    }


    /** \brief Callback with the character classifier is made a class.
    <p>
    This way it hides the feature extractor and the classifier itself, so developers can write
    their own OCR code.
    <p>
    The default character classifier and feature extractor can be loaded using the utility function
    loadOCRHMMClassifierNM and KNN model provided in
    <https://github.com/opencv/opencv_contrib/blob/master/modules/text/samples/OCRHMM_knn_model_data.xml.gz>.
     */
    public static class ClassifierCallback extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public ClassifierCallback() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public ClassifierCallback(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public ClassifierCallback(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public ClassifierCallback position(long position) {
            return (ClassifierCallback)super.position(position);
        }
        @Override public ClassifierCallback getPointer(long i) {
            return new ClassifierCallback((Pointer)this).offsetAddress(i);
        }
    
        /** \brief The character classifier must return a (ranked list of) class(es) id('s)
        <p>
        @param image Input image CV_8UC1 or CV_8UC3 with a single letter.
        @param out_class The classifier returns the character class categorical label, or list of
        class labels, to which the input image corresponds.
        @param out_confidence The classifier returns the probability of the input image
        corresponding to each classes in out_class.
         */
        public native void eval( @ByVal Mat image, @ByRef IntVector out_class, @ByRef DoubleVector out_confidence);
        public native void eval( @ByVal UMat image, @ByRef IntVector out_class, @ByRef DoubleVector out_confidence);
        public native void eval( @ByVal GpuMat image, @ByRef IntVector out_class, @ByRef DoubleVector out_confidence);
    }
    /** \brief Recognize text using HMM.
    <p>
    Takes binary image on input and returns recognized text in the output_text parameter. Optionally
    provides also the Rects for individual text elements found (e.g. words), and the list of those
    text elements with their confidence values.
    <p>
    @param image Input binary image CV_8UC1 with a single text line (or word).
    <p>
    @param output_text Output text. Most likely character sequence found by the HMM decoder.
    <p>
    @param component_rects If provided the method will output a list of Rects for the individual
    text elements found (e.g. words).
    <p>
    @param component_texts If provided the method will output a list of text strings for the
    recognition of individual text elements found (e.g. words).
    <p>
    @param component_confidences If provided the method will output a list of confidence values
    for the recognition of individual text elements found (e.g. words).
    <p>
    @param component_level Only OCR_LEVEL_WORD is supported.
     */
    public native @Override void run(@ByRef Mat image, @StdString @ByRef BytePointer output_text, RectVector component_rects/*=NULL*/,
                         StringVector component_texts/*=NULL*/, FloatVector component_confidences/*=NULL*/,
                         int component_level/*=0*/);
    public native void run(@ByRef Mat image, @StdString @ByRef BytePointer output_text);

    /** \brief Recognize text using HMM.
    <p>
    Takes an image and a mask (where each connected component corresponds to a segmented character)
    on input and returns recognized text in the output_text parameter. Optionally
    provides also the Rects for individual text elements found (e.g. words), and the list of those
    text elements with their confidence values.
    <p>
    @param image Input image CV_8UC1 or CV_8UC3 with a single text line (or word).
    @param mask Input binary image CV_8UC1 same size as input image. Each connected component in mask corresponds to a segmented character in the input image.
    <p>
    @param output_text Output text. Most likely character sequence found by the HMM decoder.
    <p>
    @param component_rects If provided the method will output a list of Rects for the individual
    text elements found (e.g. words).
    <p>
    @param component_texts If provided the method will output a list of text strings for the
    recognition of individual text elements found (e.g. words).
    <p>
    @param component_confidences If provided the method will output a list of confidence values
    for the recognition of individual text elements found (e.g. words).
    <p>
    @param component_level Only OCR_LEVEL_WORD is supported.
     */
    public native @Override void run(@ByRef Mat image, @ByRef Mat mask, @StdString @ByRef BytePointer output_text, RectVector component_rects/*=NULL*/,
                         StringVector component_texts/*=NULL*/, FloatVector component_confidences/*=NULL*/,
                         int component_level/*=0*/);
    public native void run(@ByRef Mat image, @ByRef Mat mask, @StdString @ByRef BytePointer output_text);

    // aliases for scripting
    public native @Str BytePointer run(@ByVal Mat image, int min_confidence, int component_level/*=0*/);
    public native @Str BytePointer run(@ByVal Mat image, int min_confidence);
    public native @Str String run(@ByVal UMat image, int min_confidence, int component_level/*=0*/);
    public native @Str String run(@ByVal UMat image, int min_confidence);
    public native @Str BytePointer run(@ByVal GpuMat image, int min_confidence, int component_level/*=0*/);
    public native @Str BytePointer run(@ByVal GpuMat image, int min_confidence);

    public native @Str BytePointer run(@ByVal Mat image, @ByVal Mat mask, int min_confidence, int component_level/*=0*/);
    public native @Str BytePointer run(@ByVal Mat image, @ByVal Mat mask, int min_confidence);
    public native @Str String run(@ByVal UMat image, @ByVal UMat mask, int min_confidence, int component_level/*=0*/);
    public native @Str String run(@ByVal UMat image, @ByVal UMat mask, int min_confidence);
    public native @Str BytePointer run(@ByVal GpuMat image, @ByVal GpuMat mask, int min_confidence, int component_level/*=0*/);
    public native @Str BytePointer run(@ByVal GpuMat image, @ByVal GpuMat mask, int min_confidence);

    /** \brief Creates an instance of the OCRHMMDecoder class. Initializes HMMDecoder.
    <p>
    @param classifier The character classifier with built in feature extractor.
    <p>
    @param vocabulary The language vocabulary (chars when ascii english text). vocabulary.size()
    must be equal to the number of classes of the classifier.
    <p>
    @param transition_probabilities_table Table with transition probabilities between character
    pairs. cols == rows == vocabulary.size().
    <p>
    @param emission_probabilities_table Table with observation emission probabilities. cols ==
    rows == vocabulary.size().
    <p>
    @param mode HMM Decoding algorithm. Only OCR_DECODER_VITERBI is available for the moment
    (<http://en.wikipedia.org/wiki/Viterbi_algorithm>).
     */

    public static native @Ptr OCRHMMDecoder create(@Ptr ClassifierCallback classifier,
                                         @Str BytePointer vocabulary,
                                         @ByVal Mat transition_probabilities_table,
                                         @ByVal Mat emission_probabilities_table,
                                         int mode/*=cv::text::OCR_DECODER_VITERBI*/);
    public static native @Ptr OCRHMMDecoder create(@Ptr ClassifierCallback classifier,
                                         @Str BytePointer vocabulary,
                                         @ByVal Mat transition_probabilities_table,
                                         @ByVal Mat emission_probabilities_table);
    public static native @Ptr OCRHMMDecoder create(@Ptr ClassifierCallback classifier,
                                         @Str String vocabulary,
                                         @ByVal Mat transition_probabilities_table,
                                         @ByVal Mat emission_probabilities_table,
                                         int mode/*=cv::text::OCR_DECODER_VITERBI*/);
    public static native @Ptr OCRHMMDecoder create(@Ptr ClassifierCallback classifier,
                                         @Str String vocabulary,
                                         @ByVal Mat transition_probabilities_table,
                                         @ByVal Mat emission_probabilities_table);
    public static native @Ptr OCRHMMDecoder create(@Ptr ClassifierCallback classifier,
                                         @Str String vocabulary,
                                         @ByVal UMat transition_probabilities_table,
                                         @ByVal UMat emission_probabilities_table,
                                         int mode/*=cv::text::OCR_DECODER_VITERBI*/);
    public static native @Ptr OCRHMMDecoder create(@Ptr ClassifierCallback classifier,
                                         @Str String vocabulary,
                                         @ByVal UMat transition_probabilities_table,
                                         @ByVal UMat emission_probabilities_table);
    public static native @Ptr OCRHMMDecoder create(@Ptr ClassifierCallback classifier,
                                         @Str BytePointer vocabulary,
                                         @ByVal UMat transition_probabilities_table,
                                         @ByVal UMat emission_probabilities_table,
                                         int mode/*=cv::text::OCR_DECODER_VITERBI*/);
    public static native @Ptr OCRHMMDecoder create(@Ptr ClassifierCallback classifier,
                                         @Str BytePointer vocabulary,
                                         @ByVal UMat transition_probabilities_table,
                                         @ByVal UMat emission_probabilities_table);
    public static native @Ptr OCRHMMDecoder create(@Ptr ClassifierCallback classifier,
                                         @Str BytePointer vocabulary,
                                         @ByVal GpuMat transition_probabilities_table,
                                         @ByVal GpuMat emission_probabilities_table,
                                         int mode/*=cv::text::OCR_DECODER_VITERBI*/);
    public static native @Ptr OCRHMMDecoder create(@Ptr ClassifierCallback classifier,
                                         @Str BytePointer vocabulary,
                                         @ByVal GpuMat transition_probabilities_table,
                                         @ByVal GpuMat emission_probabilities_table);
    public static native @Ptr OCRHMMDecoder create(@Ptr ClassifierCallback classifier,
                                         @Str String vocabulary,
                                         @ByVal GpuMat transition_probabilities_table,
                                         @ByVal GpuMat emission_probabilities_table,
                                         int mode/*=cv::text::OCR_DECODER_VITERBI*/);
    public static native @Ptr OCRHMMDecoder create(@Ptr ClassifierCallback classifier,
                                         @Str String vocabulary,
                                         @ByVal GpuMat transition_probabilities_table,
                                         @ByVal GpuMat emission_probabilities_table);         // HMM Decoding algorithm (only Viterbi for the moment)

    /** \brief Creates an instance of the OCRHMMDecoder class. Loads and initializes HMMDecoder from the specified path
     <p>
     \overload
     */
    public static native @Ptr OCRHMMDecoder create(@Str BytePointer filename,
    
                                         @Str BytePointer vocabulary,
                                         @ByVal Mat transition_probabilities_table,
                                         @ByVal Mat emission_probabilities_table,
                                         int mode/*=cv::text::OCR_DECODER_VITERBI*/,
    
                                         int classifier/*=cv::text::OCR_KNN_CLASSIFIER*/);
    public static native @Ptr OCRHMMDecoder create(@Str BytePointer filename,
    
                                         @Str BytePointer vocabulary,
                                         @ByVal Mat transition_probabilities_table,
                                         @ByVal Mat emission_probabilities_table);
    public static native @Ptr OCRHMMDecoder create(@Str String filename,
    
                                         @Str String vocabulary,
                                         @ByVal Mat transition_probabilities_table,
                                         @ByVal Mat emission_probabilities_table,
                                         int mode/*=cv::text::OCR_DECODER_VITERBI*/,
    
                                         int classifier/*=cv::text::OCR_KNN_CLASSIFIER*/);
    public static native @Ptr OCRHMMDecoder create(@Str String filename,
    
                                         @Str String vocabulary,
                                         @ByVal Mat transition_probabilities_table,
                                         @ByVal Mat emission_probabilities_table);
    public static native @Ptr OCRHMMDecoder create(@Str String filename,
    
                                         @Str String vocabulary,
                                         @ByVal UMat transition_probabilities_table,
                                         @ByVal UMat emission_probabilities_table,
                                         int mode/*=cv::text::OCR_DECODER_VITERBI*/,
    
                                         int classifier/*=cv::text::OCR_KNN_CLASSIFIER*/);
    public static native @Ptr OCRHMMDecoder create(@Str String filename,
    
                                         @Str String vocabulary,
                                         @ByVal UMat transition_probabilities_table,
                                         @ByVal UMat emission_probabilities_table);
    public static native @Ptr OCRHMMDecoder create(@Str BytePointer filename,
    
                                         @Str BytePointer vocabulary,
                                         @ByVal UMat transition_probabilities_table,
                                         @ByVal UMat emission_probabilities_table,
                                         int mode/*=cv::text::OCR_DECODER_VITERBI*/,
    
                                         int classifier/*=cv::text::OCR_KNN_CLASSIFIER*/);
    public static native @Ptr OCRHMMDecoder create(@Str BytePointer filename,
    
                                         @Str BytePointer vocabulary,
                                         @ByVal UMat transition_probabilities_table,
                                         @ByVal UMat emission_probabilities_table);
    public static native @Ptr OCRHMMDecoder create(@Str BytePointer filename,
    
                                         @Str BytePointer vocabulary,
                                         @ByVal GpuMat transition_probabilities_table,
                                         @ByVal GpuMat emission_probabilities_table,
                                         int mode/*=cv::text::OCR_DECODER_VITERBI*/,
    
                                         int classifier/*=cv::text::OCR_KNN_CLASSIFIER*/);
    public static native @Ptr OCRHMMDecoder create(@Str BytePointer filename,
    
                                         @Str BytePointer vocabulary,
                                         @ByVal GpuMat transition_probabilities_table,
                                         @ByVal GpuMat emission_probabilities_table);
    public static native @Ptr OCRHMMDecoder create(@Str String filename,
    
                                         @Str String vocabulary,
                                         @ByVal GpuMat transition_probabilities_table,
                                         @ByVal GpuMat emission_probabilities_table,
                                         int mode/*=cv::text::OCR_DECODER_VITERBI*/,
    
                                         int classifier/*=cv::text::OCR_KNN_CLASSIFIER*/);
    public static native @Ptr OCRHMMDecoder create(@Str String filename,
    
                                         @Str String vocabulary,
                                         @ByVal GpuMat transition_probabilities_table,
                                         @ByVal GpuMat emission_probabilities_table);
}
