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
public class KernelArg extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public KernelArg(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public KernelArg(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public KernelArg position(long position) {
        return (KernelArg)super.position(position);
    }
    @Override public KernelArg getPointer(long i) {
        return new KernelArg((Pointer)this).offsetAddress(i);
    }

    /** enum cv::ocl::KernelArg:: */
    public static final int LOCAL = 1, READ_ONLY = 2, WRITE_ONLY = 4, READ_WRITE = 6, CONSTANT = 8, PTR_ONLY = 16, NO_SIZE = 256;
    public KernelArg(int _flags, UMat _m, int wscale/*=1*/, int iwscale/*=1*/, @Const Pointer _obj/*=0*/, @Cast("size_t") long _sz/*=0*/) { super((Pointer)null); allocate(_flags, _m, wscale, iwscale, _obj, _sz); }
    private native void allocate(int _flags, UMat _m, int wscale/*=1*/, int iwscale/*=1*/, @Const Pointer _obj/*=0*/, @Cast("size_t") long _sz/*=0*/);
    public KernelArg(int _flags, UMat _m) { super((Pointer)null); allocate(_flags, _m); }
    private native void allocate(int _flags, UMat _m);
    public KernelArg() { super((Pointer)null); allocate(); }
    @NoException private native void allocate();

    public static native @ByVal KernelArg Local(@Cast("size_t") long localMemSize);
    public static native @ByVal KernelArg PtrWriteOnly(@Const @ByRef UMat m);
    public static native @ByVal KernelArg PtrReadOnly(@Const @ByRef UMat m);
    public static native @ByVal KernelArg PtrReadWrite(@Const @ByRef UMat m);
    public static native @ByVal KernelArg ReadWrite(@Const @ByRef UMat m, int wscale/*=1*/, int iwscale/*=1*/);
    public static native @ByVal KernelArg ReadWrite(@Const @ByRef UMat m);
    public static native @ByVal KernelArg ReadWriteNoSize(@Const @ByRef UMat m, int wscale/*=1*/, int iwscale/*=1*/);
    public static native @ByVal KernelArg ReadWriteNoSize(@Const @ByRef UMat m);
    public static native @ByVal KernelArg ReadOnly(@Const @ByRef UMat m, int wscale/*=1*/, int iwscale/*=1*/);
    public static native @ByVal KernelArg ReadOnly(@Const @ByRef UMat m);
    public static native @ByVal KernelArg WriteOnly(@Const @ByRef UMat m, int wscale/*=1*/, int iwscale/*=1*/);
    public static native @ByVal KernelArg WriteOnly(@Const @ByRef UMat m);
    public static native @ByVal KernelArg ReadOnlyNoSize(@Const @ByRef UMat m, int wscale/*=1*/, int iwscale/*=1*/);
    public static native @ByVal KernelArg ReadOnlyNoSize(@Const @ByRef UMat m);
    public static native @ByVal KernelArg WriteOnlyNoSize(@Const @ByRef UMat m, int wscale/*=1*/, int iwscale/*=1*/);
    public static native @ByVal KernelArg WriteOnlyNoSize(@Const @ByRef UMat m);
    public static native @ByVal KernelArg Constant(@Const @ByRef Mat m);

    public native int flags(); public native KernelArg flags(int setter);
    public native UMat m(); public native KernelArg m(UMat setter);
    public native @Const Pointer obj(); public native KernelArg obj(Pointer setter);
    public native @Cast("size_t") long sz(); public native KernelArg sz(long setter);
    public native int wscale(); public native KernelArg wscale(int setter);
    public native int iwscale(); public native KernelArg iwscale(int setter);
}
