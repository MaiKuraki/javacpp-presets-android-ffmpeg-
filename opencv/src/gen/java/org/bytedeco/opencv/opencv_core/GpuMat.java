// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


/** \addtogroup cudacore_struct
 *  \{ */

//===================================================================================
// GpuMat
//===================================================================================

/** \brief Base storage class for GPU memory with reference counting.
<p>
Its interface matches the Mat interface with the following limitations:
<p>
-   no arbitrary dimensions support (only 2D)
-   no functions that return references to their data (because references on GPU are not valid for
    CPU)
-   no expression templates technique support
<p>
Beware that the latter limitation may lead to overloaded matrix operators that cause memory
allocations. The GpuMat class is convertible to cuda::PtrStepSz and cuda::PtrStep so it can be
passed directly to the kernel.
<p>
\note In contrast with Mat, in most cases GpuMat::isContinuous() == false . This means that rows are
aligned to a size depending on the hardware. Single-row GpuMat is always a continuous matrix.
<p>
\note You are not recommended to leave static or global GpuMat variables allocated, that is, to rely
on its destructor. The destruction order of such variables and CUDA context is undefined. GPU memory
release function returns error if the CUDA context has been destroyed before.
<p>
Some member functions are described as a "Blocking Call" while some are described as a
"Non-Blocking Call". Blocking functions are synchronous to host. It is guaranteed that the GPU
operation is finished when the function returns. However, non-blocking functions are asynchronous to
host. Those functions may return even if the GPU operation is not finished.
<p>
Compared to their blocking counterpart, non-blocking functions accept Stream as an additional
argument. If a non-default stream is passed, the GPU operation may overlap with operations in other
streams.
<p>
@see Mat
 */
@Namespace("cv::cuda") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class GpuMat extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GpuMat(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public GpuMat(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public GpuMat position(long position) {
        return (GpuMat)super.position(position);
    }
    @Override public GpuMat getPointer(long i) {
        return new GpuMat((Pointer)this).offsetAddress(i);
    }

    public static class Allocator extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Allocator(Pointer p) { super(p); }
    

        // allocator must fill data, step and refcount fields
        public native @Cast("bool") @Name("allocate") boolean _allocate(GpuMat mat, int rows, int cols, @Cast("size_t") long elemSize);
        public native @Name("free") void _free(GpuMat mat);
    }

    /** default allocator */
    public static native Allocator defaultAllocator();
    public static native void setDefaultAllocator(Allocator allocator);

    /** default constructor */
    public GpuMat(Allocator allocator/*=cv::cuda::GpuMat::defaultAllocator()*/) { super((Pointer)null); allocate(allocator); }
    private native void allocate(Allocator allocator/*=cv::cuda::GpuMat::defaultAllocator()*/);
    public GpuMat() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** constructs GpuMat of the specified size and type */
    public GpuMat(int rows, int cols, int type, Allocator allocator/*=cv::cuda::GpuMat::defaultAllocator()*/) { super((Pointer)null); allocate(rows, cols, type, allocator); }
    private native void allocate(int rows, int cols, int type, Allocator allocator/*=cv::cuda::GpuMat::defaultAllocator()*/);
    public GpuMat(int rows, int cols, int type) { super((Pointer)null); allocate(rows, cols, type); }
    private native void allocate(int rows, int cols, int type);
    public GpuMat(@ByVal Size size, int type, Allocator allocator/*=cv::cuda::GpuMat::defaultAllocator()*/) { super((Pointer)null); allocate(size, type, allocator); }
    private native void allocate(@ByVal Size size, int type, Allocator allocator/*=cv::cuda::GpuMat::defaultAllocator()*/);
    public GpuMat(@ByVal Size size, int type) { super((Pointer)null); allocate(size, type); }
    private native void allocate(@ByVal Size size, int type);

    /** constructs GpuMat and fills it with the specified value _s */
    public GpuMat(int rows, int cols, int type, @ByVal Scalar s, Allocator allocator/*=cv::cuda::GpuMat::defaultAllocator()*/) { super((Pointer)null); allocate(rows, cols, type, s, allocator); }
    private native void allocate(int rows, int cols, int type, @ByVal Scalar s, Allocator allocator/*=cv::cuda::GpuMat::defaultAllocator()*/);
    public GpuMat(int rows, int cols, int type, @ByVal Scalar s) { super((Pointer)null); allocate(rows, cols, type, s); }
    private native void allocate(int rows, int cols, int type, @ByVal Scalar s);
    public GpuMat(@ByVal Size size, int type, @ByVal Scalar s, Allocator allocator/*=cv::cuda::GpuMat::defaultAllocator()*/) { super((Pointer)null); allocate(size, type, s, allocator); }
    private native void allocate(@ByVal Size size, int type, @ByVal Scalar s, Allocator allocator/*=cv::cuda::GpuMat::defaultAllocator()*/);
    public GpuMat(@ByVal Size size, int type, @ByVal Scalar s) { super((Pointer)null); allocate(size, type, s); }
    private native void allocate(@ByVal Size size, int type, @ByVal Scalar s);

    /** copy constructor */
    public GpuMat(@Const @ByRef GpuMat m) { super((Pointer)null); allocate(m); }
    private native void allocate(@Const @ByRef GpuMat m);

    /** constructor for GpuMat headers pointing to user-allocated data */
    public GpuMat(int rows, int cols, int type, Pointer data, @Cast("size_t") long step/*=cv::Mat::AUTO_STEP*/) { super((Pointer)null); allocate(rows, cols, type, data, step); }
    private native void allocate(int rows, int cols, int type, Pointer data, @Cast("size_t") long step/*=cv::Mat::AUTO_STEP*/);
    public GpuMat(int rows, int cols, int type, Pointer data) { super((Pointer)null); allocate(rows, cols, type, data); }
    private native void allocate(int rows, int cols, int type, Pointer data);
    public GpuMat(@ByVal Size size, int type, Pointer data, @Cast("size_t") long step/*=cv::Mat::AUTO_STEP*/) { super((Pointer)null); allocate(size, type, data, step); }
    private native void allocate(@ByVal Size size, int type, Pointer data, @Cast("size_t") long step/*=cv::Mat::AUTO_STEP*/);
    public GpuMat(@ByVal Size size, int type, Pointer data) { super((Pointer)null); allocate(size, type, data); }
    private native void allocate(@ByVal Size size, int type, Pointer data);

    /** creates a GpuMat header for a part of the bigger matrix */
    public GpuMat(@Const @ByRef GpuMat m, @ByVal Range rowRange, @ByVal Range colRange) { super((Pointer)null); allocate(m, rowRange, colRange); }
    private native void allocate(@Const @ByRef GpuMat m, @ByVal Range rowRange, @ByVal Range colRange);
    public GpuMat(@Const @ByRef GpuMat m, @ByVal Rect roi) { super((Pointer)null); allocate(m, roi); }
    private native void allocate(@Const @ByRef GpuMat m, @ByVal Rect roi);

    /** builds GpuMat from host memory (Blocking call) */
    public GpuMat(@ByVal Mat arr, Allocator allocator/*=cv::cuda::GpuMat::defaultAllocator()*/) { super((Pointer)null); allocate(arr, allocator); }
    private native void allocate(@ByVal Mat arr, Allocator allocator/*=cv::cuda::GpuMat::defaultAllocator()*/);
    public GpuMat(@ByVal Mat arr) { super((Pointer)null); allocate(arr); }
    private native void allocate(@ByVal Mat arr);
    public GpuMat(@ByVal UMat arr, Allocator allocator/*=cv::cuda::GpuMat::defaultAllocator()*/) { super((Pointer)null); allocate(arr, allocator); }
    private native void allocate(@ByVal UMat arr, Allocator allocator/*=cv::cuda::GpuMat::defaultAllocator()*/);
    public GpuMat(@ByVal UMat arr) { super((Pointer)null); allocate(arr); }
    private native void allocate(@ByVal UMat arr);
    public GpuMat(@ByVal GpuMat arr, Allocator allocator/*=cv::cuda::GpuMat::defaultAllocator()*/) { super((Pointer)null); allocate(arr, allocator); }
    private native void allocate(@ByVal GpuMat arr, Allocator allocator/*=cv::cuda::GpuMat::defaultAllocator()*/);

    /** destructor - calls release() */

    /** assignment operators */
    public native @ByRef @Name("operator =") GpuMat put(@Const @ByRef GpuMat m);

    /** allocates new GpuMat data unless the GpuMat already has specified size and type */
    public native void create(int rows, int cols, int type);
    public native void create(@ByVal Size size, int type);

    /** decreases reference counter, deallocate the data when reference counter reaches 0 */
    public native void release();

    /** swaps with other smart pointer */
    public native void swap(@ByRef GpuMat mat);

    /** \brief Performs data upload to GpuMat (Blocking call)
    <p>
    This function copies data from host memory to device memory. As being a blocking call, it is
    guaranteed that the copy operation is finished when this function returns.
    */
    public native void upload(@ByVal Mat arr);
    public native void upload(@ByVal UMat arr);
    public native void upload(@ByVal GpuMat arr);

    /** \brief Performs data upload to GpuMat (Non-Blocking call)
    <p>
    This function copies data from host memory to device memory. As being a non-blocking call, this
    function may return even if the copy operation is not finished.
    <p>
    The copy operation may be overlapped with operations in other non-default streams if \p stream is
    not the default stream and \p dst is HostMem allocated with HostMem::PAGE_LOCKED option.
    */
    public native void upload(@ByVal Mat arr, @ByRef Stream stream);
    public native void upload(@ByVal UMat arr, @ByRef Stream stream);
    public native void upload(@ByVal GpuMat arr, @ByRef Stream stream);

    /** \brief Performs data download from GpuMat (Blocking call)
    <p>
    This function copies data from device memory to host memory. As being a blocking call, it is
    guaranteed that the copy operation is finished when this function returns.
    */
    public native void download(@ByVal Mat dst);
    public native void download(@ByVal UMat dst);
    public native void download(@ByVal GpuMat dst);

    /** \brief Performs data download from GpuMat (Non-Blocking call)
    <p>
    This function copies data from device memory to host memory. As being a non-blocking call, this
    function may return even if the copy operation is not finished.
    <p>
    The copy operation may be overlapped with operations in other non-default streams if \p stream is
    not the default stream and \p dst is HostMem allocated with HostMem::PAGE_LOCKED option.
    */
    public native void download(@ByVal Mat dst, @ByRef Stream stream);
    public native void download(@ByVal UMat dst, @ByRef Stream stream);
    public native void download(@ByVal GpuMat dst, @ByRef Stream stream);

    /** returns deep copy of the GpuMat, i.e. the data is copied */
    public native @ByVal GpuMat clone();

    /** copies the GpuMat content to device memory (Blocking call) */
    public native void copyTo(@ByVal Mat dst);
    public native void copyTo(@ByVal UMat dst);
    public native void copyTo(@ByVal GpuMat dst);

    /** copies the GpuMat content to device memory (Non-Blocking call) */
    public native void copyTo(@ByVal Mat dst, @ByRef Stream stream);
    public native void copyTo(@ByVal UMat dst, @ByRef Stream stream);
    public native void copyTo(@ByVal GpuMat dst, @ByRef Stream stream);

    /** copies those GpuMat elements to "m" that are marked with non-zero mask elements (Blocking call) */
    public native void copyTo(@ByVal Mat dst, @ByVal Mat mask);
    public native void copyTo(@ByVal UMat dst, @ByVal UMat mask);
    public native void copyTo(@ByVal GpuMat dst, @ByVal GpuMat mask);

    /** copies those GpuMat elements to "m" that are marked with non-zero mask elements (Non-Blocking call) */
    public native void copyTo(@ByVal Mat dst, @ByVal Mat mask, @ByRef Stream stream);
    public native void copyTo(@ByVal UMat dst, @ByVal UMat mask, @ByRef Stream stream);
    public native void copyTo(@ByVal GpuMat dst, @ByVal GpuMat mask, @ByRef Stream stream);

    /** sets some of the GpuMat elements to s (Blocking call) */
    public native @ByRef GpuMat setTo(@ByVal Scalar s);

    /** sets some of the GpuMat elements to s (Non-Blocking call) */
    public native @ByRef GpuMat setTo(@ByVal Scalar s, @ByRef Stream stream);

    /** sets some of the GpuMat elements to s, according to the mask (Blocking call) */
    public native @ByRef GpuMat setTo(@ByVal Scalar s, @ByVal Mat mask);
    public native @ByRef GpuMat setTo(@ByVal Scalar s, @ByVal UMat mask);
    public native @ByRef GpuMat setTo(@ByVal Scalar s, @ByVal GpuMat mask);

    /** sets some of the GpuMat elements to s, according to the mask (Non-Blocking call) */
    public native @ByRef GpuMat setTo(@ByVal Scalar s, @ByVal Mat mask, @ByRef Stream stream);
    public native @ByRef GpuMat setTo(@ByVal Scalar s, @ByVal UMat mask, @ByRef Stream stream);
    public native @ByRef GpuMat setTo(@ByVal Scalar s, @ByVal GpuMat mask, @ByRef Stream stream);

    /** converts GpuMat to another datatype (Blocking call) */
    public native void convertTo(@ByVal Mat dst, int rtype);
    public native void convertTo(@ByVal UMat dst, int rtype);
    public native void convertTo(@ByVal GpuMat dst, int rtype);

    /** converts GpuMat to another datatype (Non-Blocking call) */
    public native void convertTo(@ByVal Mat dst, int rtype, @ByRef Stream stream);
    public native void convertTo(@ByVal UMat dst, int rtype, @ByRef Stream stream);
    public native void convertTo(@ByVal GpuMat dst, int rtype, @ByRef Stream stream);

    /** converts GpuMat to another datatype with scaling (Blocking call) */
    public native void convertTo(@ByVal Mat dst, int rtype, double alpha, double beta/*=0.0*/);
    public native void convertTo(@ByVal Mat dst, int rtype, double alpha);
    public native void convertTo(@ByVal UMat dst, int rtype, double alpha, double beta/*=0.0*/);
    public native void convertTo(@ByVal UMat dst, int rtype, double alpha);
    public native void convertTo(@ByVal GpuMat dst, int rtype, double alpha, double beta/*=0.0*/);
    public native void convertTo(@ByVal GpuMat dst, int rtype, double alpha);

    /** converts GpuMat to another datatype with scaling (Non-Blocking call) */
    public native void convertTo(@ByVal Mat dst, int rtype, double alpha, @ByRef Stream stream);
    public native void convertTo(@ByVal UMat dst, int rtype, double alpha, @ByRef Stream stream);
    public native void convertTo(@ByVal GpuMat dst, int rtype, double alpha, @ByRef Stream stream);

    /** converts GpuMat to another datatype with scaling (Non-Blocking call) */
    public native void convertTo(@ByVal Mat dst, int rtype, double alpha, double beta, @ByRef Stream stream);
    public native void convertTo(@ByVal UMat dst, int rtype, double alpha, double beta, @ByRef Stream stream);
    public native void convertTo(@ByVal GpuMat dst, int rtype, double alpha, double beta, @ByRef Stream stream);

    public native void assignTo(@ByRef GpuMat m, int type/*=-1*/);
    public native void assignTo(@ByRef GpuMat m);

    /** returns pointer to y-th row */
    public native @Cast("uchar*") BytePointer ptr(int y/*=0*/);
    public native @Cast("uchar*") BytePointer ptr();

    /** template version of the above method */

    /** returns a new GpuMat header for the specified row */
    public native @ByVal GpuMat row(int y);

    /** returns a new GpuMat header for the specified column */
    public native @ByVal GpuMat col(int x);

    /** ... for the specified row span */
    public native @ByVal GpuMat rowRange(int startrow, int endrow);
    public native @ByVal GpuMat rowRange(@ByVal Range r);

    /** ... for the specified column span */
    public native @ByVal GpuMat colRange(int startcol, int endcol);
    public native @ByVal GpuMat colRange(@ByVal Range r);

    /** extracts a rectangular sub-GpuMat (this is a generalized form of row, rowRange etc.) */
    public native @ByVal @Name("operator ()") GpuMat apply(@ByVal Range rowRange, @ByVal Range colRange);
    public native @ByVal @Name("operator ()") GpuMat apply(@ByVal Rect roi);

    /** creates alternative GpuMat header for the same data, with different
     *  number of channels and/or different number of rows */
    public native @ByVal GpuMat reshape(int cn, int rows/*=0*/);
    public native @ByVal GpuMat reshape(int cn);

    /** locates GpuMat header within a parent GpuMat */
    public native void locateROI(@ByRef Size wholeSize, @ByRef Point ofs);

    /** moves/resizes the current GpuMat ROI inside the parent GpuMat */
    public native @ByRef GpuMat adjustROI(int dtop, int dbottom, int dleft, int dright);

    /** returns true iff the GpuMat data is continuous
     *  (i.e. when there are no gaps between successive rows) */
    public native @Cast("bool") boolean isContinuous();

    /** returns element size in bytes */
    public native @Cast("size_t") long elemSize();

    /** returns the size of element channel in bytes */
    public native @Cast("size_t") long elemSize1();

    /** returns element type */
    public native int type();

    /** returns element type */
    public native int depth();

    /** returns number of channels */
    public native int channels();

    /** returns step/elemSize1() */
    public native @Cast("size_t") long step1();

    /** returns GpuMat size : width == number of columns, height == number of rows */
    public native @ByVal Size size();

    /** returns true if GpuMat data is NULL */
    public native @Cast("bool") boolean empty();

    // returns pointer to cuda memory
    public native Pointer cudaPtr();

    /** internal use method: updates the continuity flag */
    public native void updateContinuityFlag();

    /** includes several bit-fields:
    - the magic signature
    - continuity flag
    - depth
    - number of channels
    */
    public native int flags(); public native GpuMat flags(int setter);

    /** the number of rows and columns */
    public native int rows(); public native GpuMat rows(int setter);
    public native int cols(); public native GpuMat cols(int setter);

    /** a distance between successive rows in bytes; includes the gap if any */
    public native @Cast("size_t") long step(); public native GpuMat step(long setter);

    /** pointer to the data */
    public native @Cast("uchar*") BytePointer data(); public native GpuMat data(BytePointer setter);

    /** pointer to the reference counter;
     *  when GpuMat points to user-allocated data, the pointer is NULL */
    public native IntPointer refcount(); public native GpuMat refcount(IntPointer setter);

    /** helper fields used in locateROI and adjustROI */
    public native @Cast("uchar*") BytePointer datastart(); public native GpuMat datastart(BytePointer setter);
    public native @Cast("const uchar*") BytePointer dataend(); public native GpuMat dataend(BytePointer setter);

    /** allocator */
    public native Allocator allocator(); public native GpuMat allocator(Allocator setter);
}
