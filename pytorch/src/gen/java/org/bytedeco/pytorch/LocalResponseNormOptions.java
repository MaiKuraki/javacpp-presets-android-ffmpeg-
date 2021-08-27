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
 // namespace functional

// ============================================================================

/** Options for the {@code LocalResponseNorm} module.
 * 
 *  Example:
 *  <pre>{@code
 *  LocalResponseNorm model(LocalResponseNormOptions(2).alpha(0.0002).beta(0.85).k(2.));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class LocalResponseNormOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LocalResponseNormOptions(Pointer p) { super(p); }

  /* implicit */ public LocalResponseNormOptions(@Cast("int64_t") long size) { super((Pointer)null); allocate(size); }
private native void allocate(@Cast("int64_t") long size);
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer size();
  public native @ByRef @NoException(true) DoublePointer alpha();
  public native @ByRef @NoException(true) DoublePointer beta();
  public native @ByRef @NoException(true) DoublePointer k();
}
