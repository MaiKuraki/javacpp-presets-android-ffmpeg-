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


/** Options for the {@code Dropout} module.
 * 
 *  Example:
 *  <pre>{@code
 *  Dropout model(DropoutOptions().p(0.42).inplace(true));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class DropoutOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DropoutOptions(Pointer p) { super(p); }

  /* implicit */ public DropoutOptions(double p/*=0.5*/) { super((Pointer)null); allocate(p); }
private native void allocate(double p/*=0.5*/);
public DropoutOptions() { super((Pointer)null); allocate(); }
private native void allocate();
  public native @ByRef @NoException(true) DoublePointer p();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer inplace();
}
