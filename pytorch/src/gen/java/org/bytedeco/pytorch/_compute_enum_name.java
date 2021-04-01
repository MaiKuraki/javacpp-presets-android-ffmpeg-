// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

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
public class _compute_enum_name extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public _compute_enum_name() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public _compute_enum_name(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _compute_enum_name(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public _compute_enum_name position(long position) {
        return (_compute_enum_name)super.position(position);
    }
    @Override public _compute_enum_name getPointer(long i) {
        return new _compute_enum_name((Pointer)this).position(position + i);
    }

  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kLinear v);
  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kConv1D v);
  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kConv2D v);
  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kConv3D v);
  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kConvTranspose1D v);
  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kConvTranspose2D v);
  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kConvTranspose3D v);
  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kSigmoid v);
  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kTanh v);
  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kReLU v);
  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kGELU v);
  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kSiLU v);
  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kLeakyReLU v);
  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kFanIn v);
  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kFanOut v);
  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kConstant v);
  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kReflect v);
  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kReplicate v);
  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kCircular v);
  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kNearest v);
  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kBilinear v);
  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kBicubic v);
  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kTrilinear v);
  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kArea v);
  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kSum v);
  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kMean v);
  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kMax v);
  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kNone v);
  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kBatchMean v);
  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kZeros v);
  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kBorder v);
  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kReflection v);
  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kRNN_TANH v);
  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kRNN_RELU v);
  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kLSTM v);
  public native @StdString @Name("operator ()") BytePointer apply(@Const @ByRef kGRU v);
}
