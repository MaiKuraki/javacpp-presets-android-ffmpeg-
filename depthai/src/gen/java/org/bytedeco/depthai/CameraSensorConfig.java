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
 * Sensor config
 */
@Namespace("dai") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class CameraSensorConfig extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CameraSensorConfig() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CameraSensorConfig(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CameraSensorConfig(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CameraSensorConfig position(long position) {
        return (CameraSensorConfig)super.position(position);
    }
    @Override public CameraSensorConfig getPointer(long i) {
        return new CameraSensorConfig((Pointer)this).offsetAddress(i);
    }

    public native @Cast("std::int32_t") int width(); public native CameraSensorConfig width(int setter);
    public native @Cast("std::int32_t") int height(); public native CameraSensorConfig height(int setter);
    public native @Cast("std::int32_t") int minFps(); public native CameraSensorConfig minFps(int setter);
    public native @Cast("std::int32_t") int maxFps(); public native CameraSensorConfig maxFps(int setter);
    public native CameraSensorType type(); public native CameraSensorConfig type(CameraSensorType setter);
}
