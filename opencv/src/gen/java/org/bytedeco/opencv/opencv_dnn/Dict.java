// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_dnn;

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

import static org.bytedeco.opencv.global.opencv_dnn.*;


/** \brief This class implements name-value dictionary, values are instances of DictValue. */
@Namespace("cv::dnn") @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class Dict extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Dict() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Dict(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Dict(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Dict position(long position) {
        return (Dict)super.position(position);
    }
    @Override public Dict getPointer(long i) {
        return new Dict((Pointer)this).offsetAddress(i);
    }


    /** Checks a presence of the \p key in the dictionary. */
    public native @Cast("bool") boolean has(@Str BytePointer key);
    public native @Cast("bool") boolean has(@Str String key);

    /** If the \p key in the dictionary then returns pointer to its value, else returns NULL. */
    public native DictValue ptr(@Str BytePointer key);
    public native DictValue ptr(@Str String key);

    /** \overload */

    /** If the \p key in the dictionary then returns its value, else an error will be generated. */
    public native @Const @ByRef DictValue get(@Str BytePointer key);
    public native @Const @ByRef DictValue get(@Str String key);

    /** \overload */

    /** If the \p key in the dictionary then returns its value, else returns \p defaultValue. */

    /** Sets new \p value for the \p key, or adds new key-value pair into the dictionary. */

    /** Erase \p key from the dictionary. */
    public native void erase(@Str BytePointer key);
    public native void erase(@Str String key);

    
}
