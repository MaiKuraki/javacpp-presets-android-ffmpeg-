// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

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

import static org.bytedeco.depthai.global.depthai.*;


/**
 * \brief ObjectTracker node. Performs object tracking using Kalman filter and hungarian algorithm.
 */
@Namespace("dai::node") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class ObjectTracker extends ObjectTrackerPropertiesNode {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ObjectTracker(Pointer p) { super(p); }

    @MemberGetter public static native @Cast("const char*") BytePointer NAME();

    public ObjectTracker(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId) { super((Pointer)null); allocate(par, nodeId); }
    private native void allocate(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId);
    public ObjectTracker(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId, @UniquePtr ObjectTrackerProperties props) { super((Pointer)null); allocate(par, nodeId, props); }
    private native void allocate(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId, @UniquePtr ObjectTrackerProperties props);

    /**
     * Input ImgFrame message on which tracking will be performed. RGBp, BGRp, NV12, YUV420p types are supported.
     * Default queue is non-blocking with size 4.
     */
    @MemberGetter public native @ByRef Input inputTrackerFrame();

    /**
     * Input ImgFrame message on which object detection was performed.
     * Default queue is non-blocking with size 4.
     */
    @MemberGetter public native @ByRef Input inputDetectionFrame();

    /**
     * Input message with image detection from neural network.
     * Default queue is non-blocking with size 4.
     */
    @MemberGetter public native @ByRef Input inputDetections();

    /**
     * Outputs Tracklets message that carries object tracking results.
     */
    @MemberGetter public native @ByRef Output out();

    /**
     * Passthrough ImgFrame message on which tracking was performed.
     * Suitable for when input queue is set to non-blocking behavior.
     */
    @MemberGetter public native @ByRef Output passthroughTrackerFrame();

    /**
     * Passthrough ImgFrame message on which object detection was performed.
     * Suitable for when input queue is set to non-blocking behavior.
     */
    @MemberGetter public native @ByRef Output passthroughDetectionFrame();

    /**
     * Passthrough image detections message from neural network output.
     * Suitable for when input queue is set to non-blocking behavior.
     */
    @MemberGetter public native @ByRef Output passthroughDetections();

    /**
     * Specify tracker threshold.
     * @param threshold Above this threshold the detected objects will be tracked. Default 0, all image detections are tracked.
     */
    public native void setTrackerThreshold(float threshold);

    /**
     * Specify maximum number of object to track.
     * @param maxObjectsToTrack Maximum number of object to track. Maximum 60 in case of SHORT_TERM_KCF, otherwise 1000.
     */
    public native void setMaxObjectsToTrack(@Cast("std::int32_t") int maxObjectsToTrack);

    /**
     * Specify detection labels to track.
     * @param labels Detection labels to track. Default every label is tracked from image detection network output.
     */
    public native void setDetectionLabelsToTrack(@Cast("std::uint32_t*") @StdVector IntPointer labels);
    public native void setDetectionLabelsToTrack(@Cast("std::uint32_t*") @StdVector IntBuffer labels);
    public native void setDetectionLabelsToTrack(@Cast("std::uint32_t*") @StdVector int[] labels);

    /**
     * Specify tracker type algorithm.
     * @param type Tracker type.
     */
    public native void setTrackerType(TrackerType type);
    public native void setTrackerType(@Cast("dai::TrackerType") int type);

    /**
     * Specify tracker ID assignment policy.
     * @param type Tracker ID assignment policy.
     */
    public native void setTrackerIdAssignmentPolicy(TrackerIdAssignmentPolicy type);
    public native void setTrackerIdAssignmentPolicy(@Cast("dai::TrackerIdAssignmentPolicy") int type);

    /**
     * Whether tracker should take into consideration class label for tracking.
     */
    public native void setTrackingPerClass(@Cast("bool") boolean trackingPerClass);
}
