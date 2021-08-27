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
 // namespace torch

@Namespace("torch::optim") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AdagradOptions extends OptimizerCloneableAdagradOptions {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AdagradOptions(Pointer p) { super(p); }

  public AdagradOptions(double lr/*=1e-2*/) { super((Pointer)null); allocate(lr); }
  private native void allocate(double lr/*=1e-2*/);
  public AdagradOptions() { super((Pointer)null); allocate(); }
  private native void allocate();
  public native @ByRef @NoException(true) DoublePointer lr();
  public native @ByRef @NoException(true) DoublePointer lr_decay();
  public native @ByRef @NoException(true) DoublePointer weight_decay();
  public native @ByRef @NoException(true) DoublePointer initial_accumulator_value();
  public native @ByRef @NoException(true) DoublePointer eps();
  
  
  
  // NOLINTNEXTLINE(modernize-use-override)
  public native double get_lr();
  public native void set_lr(double lr);
}
