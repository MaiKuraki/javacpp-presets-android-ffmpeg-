// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvcuvid;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.nvcodec.global.nvcuvid.*;


/****************************************************************/
/** \ingroup STRUCTS
/** \struct CUVIDAV1SEQHDR
/** AV1 specific sequence header information
/****************************************************************/
@Properties(inherit = org.bytedeco.nvcodec.presets.nvcuvid.class)
public class CUVIDAV1SEQHDR extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUVIDAV1SEQHDR() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUVIDAV1SEQHDR(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUVIDAV1SEQHDR(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUVIDAV1SEQHDR position(long position) {
        return (CUVIDAV1SEQHDR)super.position(position);
    }
    @Override public CUVIDAV1SEQHDR getPointer(long i) {
        return new CUVIDAV1SEQHDR((Pointer)this).offsetAddress(i);
    }

    public native @Cast("unsigned int") int max_width(); public native CUVIDAV1SEQHDR max_width(int setter);
    public native @Cast("unsigned int") int max_height(); public native CUVIDAV1SEQHDR max_height(int setter);
    public native @Cast("unsigned char") byte reserved(int i); public native CUVIDAV1SEQHDR reserved(int i, byte setter);
    @MemberGetter public native @Cast("unsigned char*") BytePointer reserved();
}
