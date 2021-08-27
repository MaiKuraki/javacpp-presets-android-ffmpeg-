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

@Namespace("torch::enumtype") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class kFanIn extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public kFanIn(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public kFanIn(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public kFanIn position(long position) {
        return (kFanIn)super.position(position);
    }
    @Override public kFanIn getPointer(long i) {
        return new kFanIn((Pointer)this).offsetAddress(i);
    }
 public kFanIn() { super((Pointer)null); allocate(); }
private native void allocate(); }
