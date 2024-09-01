// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ KLDivLoss
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** The Kullback-Leibler divergence loss measure
 *  See https://pytorch.org/docs/main/nn.html#torch.nn.KLDivLoss to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::KLDivLossOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  KLDivLoss model(KLDivLossOptions().reduction(torch::kNone));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class KLDivLossImpl extends KLDivLossImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public KLDivLossImpl(Pointer p) { super(p); }

  public KLDivLossImpl(@ByVal(nullValue = "torch::nn::KLDivLossOptions{}") KLDivLossOptions options_) { super((Pointer)null); allocate(options_); }
  @SharedPtr @Name("std::make_shared<torch::nn::KLDivLossImpl>") private native void allocate(@ByVal(nullValue = "torch::nn::KLDivLossOptions{}") KLDivLossOptions options_);
  public KLDivLossImpl() { super((Pointer)null); allocate(); }
  @SharedPtr @Name("std::make_shared<torch::nn::KLDivLossImpl>") private native void allocate();

  public native void reset();

  /** Pretty prints the {@code KLDivLoss} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  public native @ByVal Tensor forward(@Const @ByRef Tensor input, @Const @ByRef Tensor target);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef KLDivLossOptions options(); public native KLDivLossImpl options(KLDivLossOptions setter);
}
