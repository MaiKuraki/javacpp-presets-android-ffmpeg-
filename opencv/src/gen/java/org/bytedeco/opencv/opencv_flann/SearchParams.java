// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_flann;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;

import static org.bytedeco.opencv.global.opencv_flann.*;


@Namespace("cv::flann") @Properties(inherit = org.bytedeco.opencv.presets.opencv_flann.class)
public class SearchParams extends IndexParams {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SearchParams(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SearchParams(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SearchParams position(long position) {
        return (SearchParams)super.position(position);
    }
    @Override public SearchParams getPointer(long i) {
        return new SearchParams((Pointer)this).offsetAddress(i);
    }

    public SearchParams( int checks, float eps, @Cast("bool") boolean sorted, @Cast("bool") boolean explore_all_trees ) { super((Pointer)null); allocate(checks, eps, sorted, explore_all_trees); }
    private native void allocate( int checks, float eps, @Cast("bool") boolean sorted, @Cast("bool") boolean explore_all_trees );
    public SearchParams( int checks/*=32*/, float eps/*=0*/, @Cast("bool") boolean sorted/*=true*/ ) { super((Pointer)null); allocate(checks, eps, sorted); }
    private native void allocate( int checks/*=32*/, float eps/*=0*/, @Cast("bool") boolean sorted/*=true*/ );
    public SearchParams( ) { super((Pointer)null); allocate(); }
    private native void allocate( );
}
