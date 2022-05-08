// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_structured_light;

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
import org.bytedeco.opencv.opencv_phase_unwrapping.*;
import static org.bytedeco.opencv.global.opencv_phase_unwrapping.*;
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

import static org.bytedeco.opencv.global.opencv_structured_light.*;

/**
 * \brief Class implementing Fourier transform profilometry (FTP) , phase-shifting profilometry (PSP)
 * and Fourier-assisted phase-shifting profilometry (FAPS) based on \cite faps.
 <p>
 * This class generates sinusoidal patterns that can be used with FTP, PSP and FAPS.
*/
@Namespace("cv::structured_light") @Properties(inherit = org.bytedeco.opencv.presets.opencv_structured_light.class)
public class SinusoidalPattern extends StructuredLightPattern {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SinusoidalPattern(Pointer p) { super(p); }

    /**
     * \brief Parameters of SinusoidalPattern constructor
     * @param width Projector's width.
     * @param height Projector's height.
     * @param nbrOfPeriods Number of period along the patterns direction.
     * @param shiftValue Phase shift between two consecutive patterns.
     * @param methodId Allow to choose between FTP, PSP and FAPS.
     * @param nbrOfPixelsBetweenMarkers Number of pixels between two consecutive markers on the same row.
     * @param setMarkers Allow to set markers on the patterns.
     * @param markersLocation vector used to store markers location on the patterns.
     */
    @NoOffset public static class Params extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Params(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public Params(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public Params position(long position) {
            return (Params)super.position(position);
        }
        @Override public Params getPointer(long i) {
            return new Params((Pointer)this).offsetAddress(i);
        }
    
        public Params() { super((Pointer)null); allocate(); }
        private native void allocate();
        public native int width(); public native Params width(int setter);
        public native int height(); public native Params height(int setter);
        public native int nbrOfPeriods(); public native Params nbrOfPeriods(int setter);
        public native float shiftValue(); public native Params shiftValue(float setter);
        public native int methodId(); public native Params methodId(int setter);
        public native int nbrOfPixelsBetweenMarkers(); public native Params nbrOfPixelsBetweenMarkers(int setter);
        public native @Cast("bool") boolean horizontal(); public native Params horizontal(boolean setter);
        public native @Cast("bool") boolean setMarkers(); public native Params setMarkers(boolean setter);
        public native @ByRef Point2fVector markersLocation(); public native Params markersLocation(Point2fVector setter);
    }
    /**
     * \brief Constructor.
     * @param parameters SinusoidalPattern parameters SinusoidalPattern::Params: width, height of the projector and patterns parameters.
     *
     */
    public static native @Ptr SinusoidalPattern create( @Ptr Params parameters/*=makePtr<cv::structured_light::SinusoidalPattern::Params>()*/ );
    public static native @Ptr SinusoidalPattern create( );
    /**
     * \brief Compute a wrapped phase map from sinusoidal patterns.
     * @param patternImages Input data to compute the wrapped phase map.
     * @param wrappedPhaseMap Wrapped phase map obtained through one of the three methods.
     * @param shadowMask Mask used to discard shadow regions.
     * @param fundamental Fundamental matrix used to compute epipolar lines and ease the matching step.
     */
    public native void computePhaseMap( @ByVal MatVector patternImages,
                                      @ByVal Mat wrappedPhaseMap,
                                      @ByVal(nullValue = "cv::OutputArray(cv::noArray())") Mat shadowMask,
                                      @ByVal(nullValue = "cv::InputArray(cv::noArray())") Mat fundamental);
    public native void computePhaseMap( @ByVal MatVector patternImages,
                                      @ByVal Mat wrappedPhaseMap);
    public native void computePhaseMap( @ByVal UMatVector patternImages,
                                      @ByVal Mat wrappedPhaseMap,
                                      @ByVal(nullValue = "cv::OutputArray(cv::noArray())") Mat shadowMask,
                                      @ByVal(nullValue = "cv::InputArray(cv::noArray())") Mat fundamental);
    public native void computePhaseMap( @ByVal UMatVector patternImages,
                                      @ByVal Mat wrappedPhaseMap);
    public native void computePhaseMap( @ByVal GpuMatVector patternImages,
                                      @ByVal Mat wrappedPhaseMap,
                                      @ByVal(nullValue = "cv::OutputArray(cv::noArray())") Mat shadowMask,
                                      @ByVal(nullValue = "cv::InputArray(cv::noArray())") Mat fundamental);
    public native void computePhaseMap( @ByVal GpuMatVector patternImages,
                                      @ByVal Mat wrappedPhaseMap);
    public native void computePhaseMap( @ByVal MatVector patternImages,
                                      @ByVal UMat wrappedPhaseMap,
                                      @ByVal(nullValue = "cv::OutputArray(cv::noArray())") UMat shadowMask,
                                      @ByVal(nullValue = "cv::InputArray(cv::noArray())") UMat fundamental);
    public native void computePhaseMap( @ByVal MatVector patternImages,
                                      @ByVal UMat wrappedPhaseMap);
    public native void computePhaseMap( @ByVal UMatVector patternImages,
                                      @ByVal UMat wrappedPhaseMap,
                                      @ByVal(nullValue = "cv::OutputArray(cv::noArray())") UMat shadowMask,
                                      @ByVal(nullValue = "cv::InputArray(cv::noArray())") UMat fundamental);
    public native void computePhaseMap( @ByVal UMatVector patternImages,
                                      @ByVal UMat wrappedPhaseMap);
    public native void computePhaseMap( @ByVal GpuMatVector patternImages,
                                      @ByVal UMat wrappedPhaseMap,
                                      @ByVal(nullValue = "cv::OutputArray(cv::noArray())") UMat shadowMask,
                                      @ByVal(nullValue = "cv::InputArray(cv::noArray())") UMat fundamental);
    public native void computePhaseMap( @ByVal GpuMatVector patternImages,
                                      @ByVal UMat wrappedPhaseMap);
    public native void computePhaseMap( @ByVal MatVector patternImages,
                                      @ByVal GpuMat wrappedPhaseMap,
                                      @ByVal(nullValue = "cv::OutputArray(cv::noArray())") GpuMat shadowMask,
                                      @ByVal(nullValue = "cv::InputArray(cv::noArray())") GpuMat fundamental);
    public native void computePhaseMap( @ByVal MatVector patternImages,
                                      @ByVal GpuMat wrappedPhaseMap);
    public native void computePhaseMap( @ByVal UMatVector patternImages,
                                      @ByVal GpuMat wrappedPhaseMap,
                                      @ByVal(nullValue = "cv::OutputArray(cv::noArray())") GpuMat shadowMask,
                                      @ByVal(nullValue = "cv::InputArray(cv::noArray())") GpuMat fundamental);
    public native void computePhaseMap( @ByVal UMatVector patternImages,
                                      @ByVal GpuMat wrappedPhaseMap);
    public native void computePhaseMap( @ByVal GpuMatVector patternImages,
                                      @ByVal GpuMat wrappedPhaseMap,
                                      @ByVal(nullValue = "cv::OutputArray(cv::noArray())") GpuMat shadowMask,
                                      @ByVal(nullValue = "cv::InputArray(cv::noArray())") GpuMat fundamental);
    public native void computePhaseMap( @ByVal GpuMatVector patternImages,
                                      @ByVal GpuMat wrappedPhaseMap);
    /**
     * \brief Unwrap the wrapped phase map to remove phase ambiguities.
     * @param wrappedPhaseMap The wrapped phase map computed from the pattern.
     * @param unwrappedPhaseMap The unwrapped phase map used to find correspondences between the two devices.
     * @param camSize Resolution of the camera.
     * @param shadowMask Mask used to discard shadow regions.
     */
    public native void unwrapPhaseMap( @ByVal Mat wrappedPhaseMap,
                                     @ByVal Mat unwrappedPhaseMap,
                                     @ByVal Size camSize,
                                     @ByVal(nullValue = "cv::InputArray(cv::noArray())") Mat shadowMask );
    public native void unwrapPhaseMap( @ByVal Mat wrappedPhaseMap,
                                     @ByVal Mat unwrappedPhaseMap,
                                     @ByVal Size camSize );
    public native void unwrapPhaseMap( @ByVal UMat wrappedPhaseMap,
                                     @ByVal UMat unwrappedPhaseMap,
                                     @ByVal Size camSize,
                                     @ByVal(nullValue = "cv::InputArray(cv::noArray())") UMat shadowMask );
    public native void unwrapPhaseMap( @ByVal UMat wrappedPhaseMap,
                                     @ByVal UMat unwrappedPhaseMap,
                                     @ByVal Size camSize );
    public native void unwrapPhaseMap( @ByVal GpuMat wrappedPhaseMap,
                                     @ByVal GpuMat unwrappedPhaseMap,
                                     @ByVal Size camSize,
                                     @ByVal(nullValue = "cv::InputArray(cv::noArray())") GpuMat shadowMask );
    public native void unwrapPhaseMap( @ByVal GpuMat wrappedPhaseMap,
                                     @ByVal GpuMat unwrappedPhaseMap,
                                     @ByVal Size camSize );
    /**
     * \brief Find correspondences between the two devices thanks to unwrapped phase maps.
     * @param projUnwrappedPhaseMap Projector's unwrapped phase map.
     * @param camUnwrappedPhaseMap Camera's unwrapped phase map.
     * @param matches Images used to display correspondences map.
     */
    public native void findProCamMatches( @ByVal Mat projUnwrappedPhaseMap, @ByVal Mat camUnwrappedPhaseMap,
                                        @ByVal MatVector matches );
    public native void findProCamMatches( @ByVal Mat projUnwrappedPhaseMap, @ByVal Mat camUnwrappedPhaseMap,
                                        @ByVal UMatVector matches );
    public native void findProCamMatches( @ByVal Mat projUnwrappedPhaseMap, @ByVal Mat camUnwrappedPhaseMap,
                                        @ByVal GpuMatVector matches );
    public native void findProCamMatches( @ByVal UMat projUnwrappedPhaseMap, @ByVal UMat camUnwrappedPhaseMap,
                                        @ByVal MatVector matches );
    public native void findProCamMatches( @ByVal UMat projUnwrappedPhaseMap, @ByVal UMat camUnwrappedPhaseMap,
                                        @ByVal UMatVector matches );
    public native void findProCamMatches( @ByVal UMat projUnwrappedPhaseMap, @ByVal UMat camUnwrappedPhaseMap,
                                        @ByVal GpuMatVector matches );
    public native void findProCamMatches( @ByVal GpuMat projUnwrappedPhaseMap, @ByVal GpuMat camUnwrappedPhaseMap,
                                        @ByVal MatVector matches );
    public native void findProCamMatches( @ByVal GpuMat projUnwrappedPhaseMap, @ByVal GpuMat camUnwrappedPhaseMap,
                                        @ByVal UMatVector matches );
    public native void findProCamMatches( @ByVal GpuMat projUnwrappedPhaseMap, @ByVal GpuMat camUnwrappedPhaseMap,
                                        @ByVal GpuMatVector matches );

    /**
     * \brief compute the data modulation term.
     * @param patternImages captured images with projected patterns.
     * @param dataModulationTerm Mat where the data modulation term is saved.
     * @param shadowMask Mask used to discard shadow regions.
     */
    public native void computeDataModulationTerm( @ByVal MatVector patternImages,
                                                @ByVal Mat dataModulationTerm,
                                                @ByVal Mat shadowMask );
    public native void computeDataModulationTerm( @ByVal UMatVector patternImages,
                                                @ByVal Mat dataModulationTerm,
                                                @ByVal Mat shadowMask );
    public native void computeDataModulationTerm( @ByVal GpuMatVector patternImages,
                                                @ByVal Mat dataModulationTerm,
                                                @ByVal Mat shadowMask );
    public native void computeDataModulationTerm( @ByVal MatVector patternImages,
                                                @ByVal UMat dataModulationTerm,
                                                @ByVal UMat shadowMask );
    public native void computeDataModulationTerm( @ByVal UMatVector patternImages,
                                                @ByVal UMat dataModulationTerm,
                                                @ByVal UMat shadowMask );
    public native void computeDataModulationTerm( @ByVal GpuMatVector patternImages,
                                                @ByVal UMat dataModulationTerm,
                                                @ByVal UMat shadowMask );
    public native void computeDataModulationTerm( @ByVal MatVector patternImages,
                                                @ByVal GpuMat dataModulationTerm,
                                                @ByVal GpuMat shadowMask );
    public native void computeDataModulationTerm( @ByVal UMatVector patternImages,
                                                @ByVal GpuMat dataModulationTerm,
                                                @ByVal GpuMat shadowMask );
    public native void computeDataModulationTerm( @ByVal GpuMatVector patternImages,
                                                @ByVal GpuMat dataModulationTerm,
                                                @ByVal GpuMat shadowMask );

}
