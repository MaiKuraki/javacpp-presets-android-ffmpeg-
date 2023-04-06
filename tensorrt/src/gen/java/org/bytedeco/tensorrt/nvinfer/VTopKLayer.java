// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


@Namespace("nvinfer1::apiv") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class VTopKLayer extends VRoot {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VTopKLayer(Pointer p) { super(p); }

    public native @NoException(true) void setOperation(TopKOperation op);
    public native @NoException(true) void setOperation(@Cast("nvinfer1::TopKOperation") int op);
    public native @NoException(true) TopKOperation getOperation();
    public native @NoException(true) void setK(int k);
    public native @NoException(true) int getK();
    public native @NoException(true) void setReduceAxes(@Cast("uint32_t") int reduceAxes);
    public native @Cast("uint32_t") @NoException(true) int getReduceAxes();
}
