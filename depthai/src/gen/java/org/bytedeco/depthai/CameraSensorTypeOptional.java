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

@NoOffset @Name("tl::optional<dai::CameraSensorType>") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class CameraSensorTypeOptional extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CameraSensorTypeOptional(Pointer p) { super(p); }
    public CameraSensorTypeOptional(CameraSensorType value) { this(); put(value); }
    public CameraSensorTypeOptional()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef CameraSensorTypeOptional put(@ByRef CameraSensorTypeOptional x);

    public native boolean has_value();
    public native @Name("value") @ByRef CameraSensorType get();
    @ValueSetter public native CameraSensorTypeOptional put(@ByRef CameraSensorType value);
}

