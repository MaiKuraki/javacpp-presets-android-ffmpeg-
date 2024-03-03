// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvcomp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvcomp.*;


@Namespace("nvcomp") @Properties(inherit = org.bytedeco.cuda.presets.nvcomp.class)
public class LZ4FormatSpecHeader extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public LZ4FormatSpecHeader() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LZ4FormatSpecHeader(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LZ4FormatSpecHeader(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public LZ4FormatSpecHeader position(long position) {
        return (LZ4FormatSpecHeader)super.position(position);
    }
    @Override public LZ4FormatSpecHeader getPointer(long i) {
        return new LZ4FormatSpecHeader((Pointer)this).offsetAddress(i);
    }

  public native @Cast("nvcompType_t") int data_type(); public native LZ4FormatSpecHeader data_type(int setter);
}