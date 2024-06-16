// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_phase_unwrapping;

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

import static org.bytedeco.opencv.global.opencv_phase_unwrapping.*;

/** \addtogroup phase_unwrapping
 *  \{
    <p>
    /**
     \brief Abstract base class for phase unwrapping.
    */
@Namespace("cv::phase_unwrapping") @Properties(inherit = org.bytedeco.opencv.presets.opencv_phase_unwrapping.class)
public class PhaseUnwrapping extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PhaseUnwrapping(Pointer p) { super(p); }
    /** Downcast constructor. */
    public PhaseUnwrapping(Algorithm pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @Name("dynamic_cast<cv::phase_unwrapping::PhaseUnwrapping*>") void allocate(Algorithm pointer);
    @Override public Algorithm asAlgorithm() { return asAlgorithm(this); }
    @Namespace public static native @Name("static_cast<cv::Algorithm*>") Algorithm asAlgorithm(PhaseUnwrapping pointer);

    /**
     * \brief Unwraps a 2D phase map.
     <p>
     * @param wrappedPhaseMap The wrapped phase map of type CV_32FC1 that needs to be unwrapped.
     * @param unwrappedPhaseMap The unwrapped phase map.
     * @param shadowMask Optional CV_8UC1 mask image used when some pixels do not hold any phase information in the wrapped phase map.
     */
    public native void unwrapPhaseMap( @ByVal Mat wrappedPhaseMap, @ByVal Mat unwrappedPhaseMap,
                                     @ByVal(nullValue = "cv::InputArray(cv::noArray())") Mat shadowMask );
    public native void unwrapPhaseMap( @ByVal Mat wrappedPhaseMap, @ByVal Mat unwrappedPhaseMap );
    public native void unwrapPhaseMap( @ByVal UMat wrappedPhaseMap, @ByVal UMat unwrappedPhaseMap,
                                     @ByVal(nullValue = "cv::InputArray(cv::noArray())") UMat shadowMask );
    public native void unwrapPhaseMap( @ByVal UMat wrappedPhaseMap, @ByVal UMat unwrappedPhaseMap );
    public native void unwrapPhaseMap( @ByVal GpuMat wrappedPhaseMap, @ByVal GpuMat unwrappedPhaseMap,
                                     @ByVal(nullValue = "cv::InputArray(cv::noArray())") GpuMat shadowMask );
    public native void unwrapPhaseMap( @ByVal GpuMat wrappedPhaseMap, @ByVal GpuMat unwrappedPhaseMap );

}
