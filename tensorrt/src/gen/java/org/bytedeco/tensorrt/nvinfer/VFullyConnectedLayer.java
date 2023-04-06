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
public class VFullyConnectedLayer extends VRoot {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VFullyConnectedLayer(Pointer p) { super(p); }

    public native @NoException(true) void setNbOutputChannels(int nbOutputs);
    public native @NoException(true) int getNbOutputChannels();
    public native @NoException(true) void setKernelWeights(@ByVal Weights weights);
    public native @ByVal @NoException(true) Weights getKernelWeights();
    public native @NoException(true) void setBiasWeights(@ByVal Weights weights);
    public native @ByVal @NoException(true) Weights getBiasWeights();
}
