// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


@Namespace("onnx") @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class OpSet_OnnxML_ver3 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public OpSet_OnnxML_ver3() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OpSet_OnnxML_ver3(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OpSet_OnnxML_ver3(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public OpSet_OnnxML_ver3 position(long position) {
        return (OpSet_OnnxML_ver3)super.position(position);
    }
    @Override public OpSet_OnnxML_ver3 getPointer(long i) {
        return new OpSet_OnnxML_ver3((Pointer)this).offsetAddress(i);
    }

}
