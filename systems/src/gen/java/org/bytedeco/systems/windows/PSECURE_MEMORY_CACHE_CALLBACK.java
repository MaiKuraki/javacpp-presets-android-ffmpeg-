// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Convention("NTAPI") @Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PSECURE_MEMORY_CACHE_CALLBACK extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PSECURE_MEMORY_CACHE_CALLBACK(Pointer p) { super(p); }
    protected PSECURE_MEMORY_CACHE_CALLBACK() { allocate(); }
    private native void allocate();
    public native @Cast("BOOLEAN") boolean call(
    @Cast("PVOID") Pointer Addr,
    @Cast("SIZE_T") long Range
    );
}
