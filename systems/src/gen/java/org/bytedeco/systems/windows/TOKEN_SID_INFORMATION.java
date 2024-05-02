// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TOKEN_SID_INFORMATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TOKEN_SID_INFORMATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TOKEN_SID_INFORMATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TOKEN_SID_INFORMATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TOKEN_SID_INFORMATION position(long position) {
        return (TOKEN_SID_INFORMATION)super.position(position);
    }
    @Override public TOKEN_SID_INFORMATION getPointer(long i) {
        return new TOKEN_SID_INFORMATION((Pointer)this).offsetAddress(i);
    }

    public native @Cast("PSID") Pointer Sid(); public native TOKEN_SID_INFORMATION Sid(Pointer setter);
}
