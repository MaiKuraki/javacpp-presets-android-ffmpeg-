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


/** RawImageManipConfig structure */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class RawImageManipConfig extends RawBuffer {
    static { Loader.load(); }
    /** Default native constructor. */
    public RawImageManipConfig() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RawImageManipConfig(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RawImageManipConfig(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public RawImageManipConfig position(long position) {
        return (RawImageManipConfig)super.position(position);
    }
    @Override public RawImageManipConfig getPointer(long i) {
        return new RawImageManipConfig((Pointer)this).offsetAddress(i);
    }

    // NNData data is in PoBuf
    public static class CropRect extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public CropRect() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public CropRect(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CropRect(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public CropRect position(long position) {
            return (CropRect)super.position(position);
        }
        @Override public CropRect getPointer(long i) {
            return new CropRect((Pointer)this).offsetAddress(i);
        }
    
        // Normalized range 0-1
        public native float xmin(); public native CropRect xmin(float setter);
        public native float ymin(); public native CropRect ymin(float setter);
        public native float xmax(); public native CropRect xmax(float setter);
        public native float ymax(); public native CropRect ymax(float setter);
    }

    public static class CropConfig extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public CropConfig() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public CropConfig(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CropConfig(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public CropConfig position(long position) {
            return (CropConfig)super.position(position);
        }
        @Override public CropConfig getPointer(long i) {
            return new CropConfig((Pointer)this).offsetAddress(i);
        }
    
        public native @ByRef CropRect cropRect(); public native CropConfig cropRect(CropRect setter);
        public native @ByRef RotatedRect cropRotatedRect(); public native CropConfig cropRotatedRect(RotatedRect setter);

        public native @Cast("bool") boolean enableCenterCropRectangle(); public native CropConfig enableCenterCropRectangle(boolean setter);
        // if enableCenterCropRectangle -> automatically calculated crop parameters
        public native float cropRatio(); public native CropConfig cropRatio(float setter);
        public native float widthHeightAspectRatio(); public native CropConfig widthHeightAspectRatio(float setter);

        public native @Cast("bool") boolean enableRotatedRect(); public native CropConfig enableRotatedRect(boolean setter);

        // Range 0..1 by default. Set 'false' to specify in pixels
        public native @Cast("bool") boolean normalizedCoords(); public native CropConfig normalizedCoords(boolean setter);
    }

    public static class ResizeConfig extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public ResizeConfig() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public ResizeConfig(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public ResizeConfig(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public ResizeConfig position(long position) {
            return (ResizeConfig)super.position(position);
        }
        @Override public ResizeConfig getPointer(long i) {
            return new ResizeConfig((Pointer)this).offsetAddress(i);
        }
    
        public native int width(); public native ResizeConfig width(int setter);
        public native int height(); public native ResizeConfig height(int setter);
        public native @Cast("bool") boolean lockAspectRatioFill(); public native ResizeConfig lockAspectRatioFill(boolean setter);
        public native @Cast("char") byte bgRed(); public native ResizeConfig bgRed(byte setter);
        public native @Cast("char") byte bgGreen(); public native ResizeConfig bgGreen(byte setter);
        public native @Cast("char") byte bgBlue(); public native ResizeConfig bgBlue(byte setter);

        //  clockwise order, pt[0] is mapped to the top-left output corner
        public native @ByRef Point2fVector warpFourPoints(); public native ResizeConfig warpFourPoints(Point2fVector setter);
        public native @Cast("bool") boolean normalizedCoords(); public native ResizeConfig normalizedCoords(boolean setter);
        public native @Cast("bool") boolean enableWarp4pt(); public native ResizeConfig enableWarp4pt(boolean setter);

        public native @StdVector FloatPointer warpMatrix3x3(); public native ResizeConfig warpMatrix3x3(FloatPointer setter);
        public native @Cast("bool") boolean enableWarpMatrix(); public native ResizeConfig enableWarpMatrix(boolean setter);

        // Warp background / border mode: replicates pixels if true,
        // otherwise fills with a constant color defined by: bgRed, bgGreen, bgBlue
        public native @Cast("bool") boolean warpBorderReplicate(); public native ResizeConfig warpBorderReplicate(boolean setter);

        // clockwise
        public native float rotationAngleDeg(); public native ResizeConfig rotationAngleDeg(float setter);
        public native @Cast("bool") boolean enableRotation(); public native ResizeConfig enableRotation(boolean setter);

        /**
         * Whether to keep aspect ratio of input or not
         */
        public native @Cast("bool") boolean keepAspectRatio(); public native ResizeConfig keepAspectRatio(boolean setter);
    }

    public static class FormatConfig extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public FormatConfig() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public FormatConfig(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public FormatConfig(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public FormatConfig position(long position) {
            return (FormatConfig)super.position(position);
        }
        @Override public FormatConfig getPointer(long i) {
            return new FormatConfig((Pointer)this).offsetAddress(i);
        }
    
        public native RawImgFrame.Type type(); public native FormatConfig type(RawImgFrame.Type setter);
        public native @Cast("bool") boolean flipHorizontal(); public native FormatConfig flipHorizontal(boolean setter);
        public native @Cast("bool") boolean flipVertical(); public native FormatConfig flipVertical(boolean setter);
        public native Colormap colormap(); public native FormatConfig colormap(Colormap setter);
        public native int colormapMin(); public native FormatConfig colormapMin(int setter);
        public native int colormapMax(); public native FormatConfig colormapMax(int setter);
    }

    public native @ByRef CropConfig cropConfig(); public native RawImageManipConfig cropConfig(CropConfig setter);
    public native @ByRef ResizeConfig resizeConfig(); public native RawImageManipConfig resizeConfig(ResizeConfig setter);
    public native @ByRef FormatConfig formatConfig(); public native RawImageManipConfig formatConfig(FormatConfig setter);

    public native @Cast("bool") boolean enableCrop(); public native RawImageManipConfig enableCrop(boolean setter);
    public native @Cast("bool") boolean enableResize(); public native RawImageManipConfig enableResize(boolean setter);
    public native @Cast("bool") boolean enableFormat(); public native RawImageManipConfig enableFormat(boolean setter);

    // Usable with runtime config only,
    // when ImageManipProperties.inputConfig.setWaitForMessage(true) is set
    public native @Cast("bool") boolean reusePreviousImage(); public native RawImageManipConfig reusePreviousImage(boolean setter);
    public native @Cast("bool") boolean skipCurrentImage(); public native RawImageManipConfig skipCurrentImage(boolean setter);

    public native @Override void serialize(@Cast("std::uint8_t*") @StdVector BytePointer metadata, @ByRef @Cast("dai::DatatypeEnum*") IntPointer datatype);
    public native @Override void serialize(@Cast("std::uint8_t*") @StdVector ByteBuffer metadata, @ByRef @Cast("dai::DatatypeEnum*") IntBuffer datatype);
    public native @Override void serialize(@Cast("std::uint8_t*") @StdVector byte[] metadata, @ByRef @Cast("dai::DatatypeEnum*") int[] datatype);
}
