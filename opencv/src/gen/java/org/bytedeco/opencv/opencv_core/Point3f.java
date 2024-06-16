// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;

@Name("cv::Point3_<float>") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Point3f extends FloatPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Point3f(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Point3f(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Point3f position(long position) {
        return (Point3f)super.position(position);
    }
    @Override public Point3f getPointer(long i) {
        return new Point3f((Pointer)this).offsetAddress(i);
    }


    /** default constructor */
    public Point3f() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Point3f(float _x, float _y, float _z) { super((Pointer)null); allocate(_x, _y, _z); }
    private native void allocate(float _x, float _y, float _z);
// #if OPENCV_ABI_COMPATIBILITY < 500
    public Point3f(@Const @ByRef Point3f pt) { super((Pointer)null); allocate(pt); }
    private native void allocate(@Const @ByRef Point3f pt);
// #endif
    public Point3f(@Const @ByRef Point2f pt) { super((Pointer)null); allocate(pt); }
    private native void allocate(@Const @ByRef Point2f pt);

// #if OPENCV_ABI_COMPATIBILITY < 500
    public native @ByRef @Name("operator =") Point3f put(@Const @ByRef Point3f pt);
// #endif
    /** conversion to another data type */
    /** conversion to cv::Vec<> */

    /** dot product */
    public native float dot(@Const @ByRef Point3f pt);
    /** dot product computed in double-precision arithmetics */
    public native double ddot(@Const @ByRef Point3f pt);
    /** cross product of the 2 3D points */
    public native @ByVal Point3f cross(@Const @ByRef Point3f pt);
    /** x coordinate of the 3D point */
    public native float x(); public native Point3f x(float setter);
    /** y coordinate of the 3D point */
    public native float y(); public native Point3f y(float setter);
    /** z coordinate of the 3D point */
    public native float z(); public native Point3f z(float setter);
}
