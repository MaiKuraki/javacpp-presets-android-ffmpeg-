// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_tracking;

import org.bytedeco.javacpp.annotation.Index;
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
import org.bytedeco.opencv.opencv_plot.*;
import static org.bytedeco.opencv.global.opencv_plot.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;

import static org.bytedeco.opencv.global.opencv_tracking.*;

@Name("std::unordered_map<size_t,cv::detail::tracking::tbm::Track>") @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class SizeTTrackMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SizeTTrackMap(Pointer p) { super(p); }
    public SizeTTrackMap()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef SizeTTrackMap put(@ByRef SizeTTrackMap x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native @ByRef Track get(@Cast("size_t") long i);
    public native SizeTTrackMap put(@Cast("size_t") long i, Track value);

    public native void erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *().first") @MemberGetter @Cast("size_t") long first();
        public native @Name("operator *().second") @MemberGetter @ByRef @Const Track second();
    }
}

