// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


@Namespace("at::tracer::impl") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class NoTracerDispatchMode extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NoTracerDispatchMode() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NoTracerDispatchMode(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NoTracerDispatchMode(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NoTracerDispatchMode position(long position) {
        return (NoTracerDispatchMode)super.position(position);
    }
    @Override public NoTracerDispatchMode getPointer(long i) {
        return new NoTracerDispatchMode((Pointer)this).offsetAddress(i);
    }

}
