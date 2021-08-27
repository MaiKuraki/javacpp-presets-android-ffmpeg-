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


@Name("torch::jit::Maybe<torch::jit::Var>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class VarMaybe extends TreeView {
    static { Loader.load(); }

  public VarMaybe(@Cast("const torch::jit::TreeRef*") @ByRef Pointer tree) { super((Pointer)null); allocate(tree); }
  private native void allocate(@Cast("const torch::jit::TreeRef*") @ByRef Pointer tree);
  /* implicit */ public VarMaybe(@Const @ByRef Var tree) { super((Pointer)null); allocate(tree); }
private native void allocate(@Const @ByRef Var tree);
  public native @Cast("bool") boolean present();
  public native @ByVal Var get();
  
  public static native @ByVal VarMaybe create(@Const @ByRef SourceRange range);
  public static native @ByVal VarMaybe create(@Const @ByRef SourceRange range, @Const @ByRef Var value);
}
