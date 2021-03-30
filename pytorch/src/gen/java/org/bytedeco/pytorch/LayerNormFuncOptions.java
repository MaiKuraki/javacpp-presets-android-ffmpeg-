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


/** Options for {@code torch::nn::functional::layer_norm}.
 * 
 *  Example:
 *  <pre>{@code
 *  namespace F = torch::nn::functional;
 *  F::layer_norm(input, F::LayerNormFuncOptions({2, 2}).eps(2e-5));
 *  }</pre> */
@Namespace("torch::nn::functional") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class LayerNormFuncOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LayerNormFuncOptions(Pointer p) { super(p); }

  /* implicit */ public LayerNormFuncOptions(@ByVal @Cast("std::vector<int64_t>*") LongVector normalized_shape) { super((Pointer)null); allocate(normalized_shape); }
private native void allocate(@ByVal @Cast("std::vector<int64_t>*") LongVector normalized_shape);
  public native @Cast("std::vector<int64_t>*") @ByRef @NoException LongVector normalized_shape();
  public native @ByRef @NoException Tensor weight();
  public native @ByRef @NoException Tensor bias();
  public native @ByRef @NoException DoublePointer eps();
}
