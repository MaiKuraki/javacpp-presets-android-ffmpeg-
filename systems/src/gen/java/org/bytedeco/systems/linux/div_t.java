// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.linux.*;


/* Returned by `div'.  */
@Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class div_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public div_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public div_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public div_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public div_t position(long position) {
        return (div_t)super.position(position);
    }
    @Override public div_t getPointer(long i) {
        return new div_t((Pointer)this).offsetAddress(i);
    }

    public native int quot(); public native div_t quot(int setter);			/* Quotient.  */
    public native int rem(); public native div_t rem(int setter);			/* Remainder.  */
  }
