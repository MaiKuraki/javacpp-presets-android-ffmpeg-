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
 // namespace torch

@Namespace("torch::optim") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SGDOptions extends OptimizerCloneableSGDOptions {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SGDOptions(Pointer p) { super(p); }

  public SGDOptions(double lr) { super((Pointer)null); allocate(lr); }
  private native void allocate(double lr);
  public native @ByRef @NoException DoublePointer lr();
  public native @ByRef @NoException DoublePointer momentum();
  public native @ByRef @NoException DoublePointer dampening();
  public native @ByRef @NoException DoublePointer weight_decay();
  public native @Cast("bool*") @ByRef @NoException BoolPointer nesterov();
  
  
  
}
