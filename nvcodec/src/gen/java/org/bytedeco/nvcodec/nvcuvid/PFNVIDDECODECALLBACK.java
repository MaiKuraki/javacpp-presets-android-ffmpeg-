// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvcuvid;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.nvcodec.global.nvcuvid.*;

@Convention("CUDAAPI") @Properties(inherit = org.bytedeco.nvcodec.presets.nvcuvid.class)
public class PFNVIDDECODECALLBACK extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PFNVIDDECODECALLBACK(Pointer p) { super(p); }
    protected PFNVIDDECODECALLBACK() { allocate(); }
    private native void allocate();
    public native int call(Pointer arg0, CUVIDPICPARAMS arg1);
}
