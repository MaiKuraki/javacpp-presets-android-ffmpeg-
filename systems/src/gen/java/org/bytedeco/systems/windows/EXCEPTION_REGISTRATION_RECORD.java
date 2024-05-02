// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;
    

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class EXCEPTION_REGISTRATION_RECORD extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public EXCEPTION_REGISTRATION_RECORD() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public EXCEPTION_REGISTRATION_RECORD(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EXCEPTION_REGISTRATION_RECORD(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public EXCEPTION_REGISTRATION_RECORD position(long position) {
        return (EXCEPTION_REGISTRATION_RECORD)super.position(position);
    }
    @Override public EXCEPTION_REGISTRATION_RECORD getPointer(long i) {
        return new EXCEPTION_REGISTRATION_RECORD((Pointer)this).offsetAddress(i);
    }

    public native EXCEPTION_REGISTRATION_RECORD Next(); public native EXCEPTION_REGISTRATION_RECORD Next(EXCEPTION_REGISTRATION_RECORD setter);
    public native @Cast("PEXCEPTION_ROUTINE") EXCEPTION_ROUTINE Handler(); public native EXCEPTION_REGISTRATION_RECORD Handler(EXCEPTION_ROUTINE setter);
}
