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


@Name("c10::VaryingShape<c10::Stride>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class StrideVaryingShape extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StrideVaryingShape(Pointer p) { super(p); }

  public StrideVaryingShape(@Const @ByRef StrideVector vec) { super((Pointer)null); allocate(vec); }
  private native void allocate(@Const @ByRef StrideVector vec);

  public StrideVaryingShape(@ByVal StrideArrayRef vec) { super((Pointer)null); allocate(vec); }
  private native void allocate(@ByVal StrideArrayRef vec);

  public StrideVaryingShape(@ByVal(nullValue = "c10::optional<size_t>(c10::nullopt)") SizeTOptional size) { super((Pointer)null); allocate(size); }
  private native void allocate(@ByVal(nullValue = "c10::optional<size_t>(c10::nullopt)") SizeTOptional size);
  public StrideVaryingShape() { super((Pointer)null); allocate(); }
  private native void allocate();

  public StrideVaryingShape(@StdVector StrideOptional dims) { super((Pointer)null); allocate(dims); }
  private native void allocate(@StdVector StrideOptional dims);

  public StrideVaryingShape(@Cast("size_t") long size) { super((Pointer)null); allocate(size); }
  private native void allocate(@Cast("size_t") long size);

  

  public native @Const @ByRef @Name("operator []") StrideOptional get(@Cast("size_t") long i);

  public native @ByVal SizeTOptional size();

  public native @Cast("const c10::optional<c10::VaryingShape<c10::Stride>::ListOfOptionalElements>*") @ByRef Pointer sizes();

  public native @ByVal StrideVaryingShape merge(@Const @ByRef StrideVaryingShape other);

  public native @ByVal StrideVectorOptional concrete_sizes();

  public native @Cast("bool") boolean isComplete();
}
