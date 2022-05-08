// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_features2d;

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
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;

import static org.bytedeco.opencv.global.opencv_features2d.*;


// #if defined(HAVE_OPENCV_FLANN) || defined(CV_DOXYGEN)

/** \brief Flann-based descriptor matcher.
<p>
This matcher trains cv::flann::Index on a train descriptor collection and calls its nearest search
methods to find the best matches. So, this matcher may be faster when matching a large train
collection than the brute force matcher. FlannBasedMatcher does not support masking permissible
matches of descriptor sets because flann::Index does not support this. :
 */
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_features2d.class)
public class FlannBasedMatcher extends DescriptorMatcher {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FlannBasedMatcher(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FlannBasedMatcher(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public FlannBasedMatcher position(long position) {
        return (FlannBasedMatcher)super.position(position);
    }
    @Override public FlannBasedMatcher getPointer(long i) {
        return new FlannBasedMatcher((Pointer)this).offsetAddress(i);
    }

    public FlannBasedMatcher( @Ptr IndexParams indexParams/*=makePtr<flann::KDTreeIndexParams>()*/,
                           @Ptr SearchParams searchParams/*=makePtr<flann::SearchParams>()*/ ) { super((Pointer)null); allocate(indexParams, searchParams); }
    private native void allocate( @Ptr IndexParams indexParams/*=makePtr<flann::KDTreeIndexParams>()*/,
                           @Ptr SearchParams searchParams/*=makePtr<flann::SearchParams>()*/ );
    public FlannBasedMatcher( ) { super((Pointer)null); allocate(); }
    private native void allocate( );

    public native @Override void add( @ByVal MatVector descriptors );
    public native @Override void add( @ByVal UMatVector descriptors );
    public native @Override void add( @ByVal GpuMatVector descriptors );
    public native @Override void clear();

    // Reads matcher object from a file node
    public native @Override void read( @Const @ByRef FileNode arg0 );
    // Writes matcher object to a file storage
    public native @Override void write( @ByRef FileStorage arg0 );

    public native @Override void train();
    public native @Cast("bool") @Override boolean isMaskSupported();

    public static native @Ptr FlannBasedMatcher create();

    /* nothing by default */ public native @Ptr @Override DescriptorMatcher clone( @Cast("bool") boolean emptyTrainData/*=false*/ );
public native @Ptr DescriptorMatcher clone( );
}
