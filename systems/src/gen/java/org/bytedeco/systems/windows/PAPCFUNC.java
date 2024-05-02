// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;
     
@Convention("NTAPI") @Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PAPCFUNC extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PAPCFUNC(Pointer p) { super(p); }
    protected PAPCFUNC() { allocate(); }
    private native void allocate();
    public native void call(
    @Cast("ULONG_PTR") long Parameter
    );
}
