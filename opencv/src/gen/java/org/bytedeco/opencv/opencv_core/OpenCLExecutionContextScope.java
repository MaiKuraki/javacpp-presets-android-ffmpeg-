// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


@Namespace("cv::ocl") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class OpenCLExecutionContextScope extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OpenCLExecutionContextScope(Pointer p) { super(p); }

    public OpenCLExecutionContextScope(@Const @ByRef OpenCLExecutionContext ctx) { super((Pointer)null); allocate(ctx); }
    private native void allocate(@Const @ByRef OpenCLExecutionContext ctx);
}
