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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ SoftMarginLoss
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Creates a criterion that optimizes a two-class classification
 *  logistic loss between input tensor :math:{@code x} and target tensor :math:{@code y}
 *  (containing 1 or -1).
 *  See https://pytorch.org/docs/main/nn.html#torch.nn.SoftMarginLoss to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::SoftMarginLossOptions} class to learn
 *  what constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  SoftMarginLoss model(SoftMarginLossOptions(torch::kNone));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SoftMarginLossImpl extends SoftMarginLossImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SoftMarginLossImpl(Pointer p) { super(p); }

  public SoftMarginLossImpl(@ByVal(nullValue = "torch::nn::SoftMarginLossOptions{}") SoftMarginLossOptions options_) { super((Pointer)null); allocate(options_); }
  @SharedPtr @Name("std::make_shared<torch::nn::SoftMarginLossImpl>") private native void allocate(@ByVal(nullValue = "torch::nn::SoftMarginLossOptions{}") SoftMarginLossOptions options_);
  public SoftMarginLossImpl() { super((Pointer)null); allocate(); }
  @SharedPtr @Name("std::make_shared<torch::nn::SoftMarginLossImpl>") private native void allocate();

  /** Pretty prints the {@code SoftMarginLoss} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  public native void reset();

  public native @ByVal Tensor forward(@Const @ByRef Tensor input, @Const @ByRef Tensor target);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef SoftMarginLossOptions options(); public native SoftMarginLossImpl options(SoftMarginLossOptions setter);
}
