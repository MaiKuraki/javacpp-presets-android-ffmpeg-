// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvcuvid;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.nvcodec.global.nvcuvid.*;


/************************************************************************/
/** \ingroup STRUCTS
/** \struct TIMECODE
/** Used to extract Time code in H264 and HEVC codecs
/************************************************************************/
@Properties(inherit = org.bytedeco.nvcodec.presets.nvcuvid.class)
public class TIMECODE extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TIMECODE() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TIMECODE(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TIMECODE(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TIMECODE position(long position) {
        return (TIMECODE)super.position(position);
    }
    @Override public TIMECODE getPointer(long i) {
        return new TIMECODE((Pointer)this).offsetAddress(i);
    }

    public native @ByRef TIMECODESET time_code_set(int i); public native TIMECODE time_code_set(int i, TIMECODESET setter);
    @MemberGetter public native TIMECODESET time_code_set();
    public native @Cast("unsigned char") byte num_clock_ts(); public native TIMECODE num_clock_ts(byte setter);
}