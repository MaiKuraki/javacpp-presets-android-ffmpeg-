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
public class kConvTranspose3D extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public kConvTranspose3D(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public kConvTranspose3D(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public kConvTranspose3D position(long position) {
        return (kConvTranspose3D)super.position(position);
    }
    @Override public kConvTranspose3D getPointer(long i) {
        return new kConvTranspose3D((Pointer)this).position(position + i);
    }
 public kConvTranspose3D() { super((Pointer)null); allocate(); }
private native void allocate(); }
