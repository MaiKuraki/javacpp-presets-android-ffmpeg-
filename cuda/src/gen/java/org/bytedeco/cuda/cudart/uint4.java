// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class uint4 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public uint4() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public uint4(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public uint4(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public uint4 position(long position) {
        return (uint4)super.position(position);
    }
    @Override public uint4 getPointer(long i) {
        return new uint4((Pointer)this).offsetAddress(i);
    }

    public native @Cast("unsigned int") int x(); public native uint4 x(int setter);
    public native @Cast("unsigned int") int y(); public native uint4 y(int setter);
    public native @Cast("unsigned int") int z(); public native uint4 z(int setter);
    public native @Cast("unsigned int") int w(); public native uint4 w(int setter);
}
