// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;

@Namespace("torch::enumtype") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class kGELU extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public kGELU(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public kGELU(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public kGELU position(long position) {
        return (kGELU)super.position(position);
    }
    @Override public kGELU getPointer(long i) {
        return new kGELU((Pointer)this).position(position + i);
    }
 public kGELU() { super((Pointer)null); allocate(); }
private native void allocate(); }
