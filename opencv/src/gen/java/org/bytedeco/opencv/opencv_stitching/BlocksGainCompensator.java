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


/** \brief Exposure compensator which tries to remove exposure related artifacts by adjusting image block
intensities, see \cite UES01 for details.
 */
@Namespace("cv::detail") @Properties(inherit = org.bytedeco.opencv.presets.opencv_stitching.class)
public class BlocksGainCompensator extends BlocksCompensator {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BlocksGainCompensator(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BlocksGainCompensator(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BlocksGainCompensator position(long position) {
        return (BlocksGainCompensator)super.position(position);
    }
    @Override public BlocksGainCompensator getPointer(long i) {
        return new BlocksGainCompensator((Pointer)this).offsetAddress(i);
    }

    // This Constructor only exists to make source level compatibility detector happy
    public BlocksGainCompensator(int bl_width/*=32*/, int bl_height/*=32*/) { super((Pointer)null); allocate(bl_width, bl_height); }
    private native void allocate(int bl_width/*=32*/, int bl_height/*=32*/);
    public BlocksGainCompensator() { super((Pointer)null); allocate(); }
    private native void allocate();
    public BlocksGainCompensator(int bl_width, int bl_height, int nr_feeds) { super((Pointer)null); allocate(bl_width, bl_height, nr_feeds); }
    private native void allocate(int bl_width, int bl_height, int nr_feeds);

    public native void feed(@Const @ByRef PointVector corners, @Const @ByRef UMatVector images,
                  @Const @ByRef UMatBytePairVector masks);

    // This function only exists to make source level compatibility detector happy
    public native void apply(int index, @ByVal Point corner, @ByVal Mat image, @ByVal Mat mask);
    public native void apply(int index, @ByVal Point corner, @ByVal UMat image, @ByVal UMat mask);
    public native void apply(int index, @ByVal Point corner, @ByVal GpuMat image, @ByVal GpuMat mask);
    // This function only exists to make source level compatibility detector happy
    public native void getMatGains(@ByRef MatVector umv);
    // This function only exists to make source level compatibility detector happy
    public native void setMatGains(@ByRef MatVector umv);
}
