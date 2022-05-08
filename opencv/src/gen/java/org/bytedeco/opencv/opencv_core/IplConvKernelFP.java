// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


@Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class IplConvKernelFP extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IplConvKernelFP() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IplConvKernelFP(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IplConvKernelFP(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IplConvKernelFP position(long position) {
        return (IplConvKernelFP)super.position(position);
    }
    @Override public IplConvKernelFP getPointer(long i) {
        return new IplConvKernelFP((Pointer)this).offsetAddress(i);
    }

    public native int nCols(); public native IplConvKernelFP nCols(int setter);
    public native int nRows(); public native IplConvKernelFP nRows(int setter);
    public native int anchorX(); public native IplConvKernelFP anchorX(int setter);
    public native int anchorY(); public native IplConvKernelFP anchorY(int setter);
    public native FloatPointer values(); public native IplConvKernelFP values(FloatPointer setter);
}
