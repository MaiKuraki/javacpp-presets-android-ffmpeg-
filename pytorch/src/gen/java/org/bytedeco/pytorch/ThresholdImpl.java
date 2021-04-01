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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Threshold ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies the Threshold function element-wise.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.Threshold to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::ThresholdOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  Threshold model(ThresholdOptions(42.42, 24.24).inplace(true));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ThresholdImpl extends ThresholdImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ThresholdImpl(Pointer p) { super(p); }

  public ThresholdImpl(double threshold, double value) { super((Pointer)null); allocate(threshold, value); }
  @NoDeallocator private native void allocate(double threshold, double value);
  public ThresholdImpl(@Const @ByRef ThresholdOptions options_) { super((Pointer)null); allocate(options_); }
  @NoDeallocator private native void allocate(@Const @ByRef ThresholdOptions options_);

  public native @ByVal Tensor forward(@ByVal Tensor input);

  public native void reset();

  /** Pretty prints the {@code Threshold} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef ThresholdOptions options(); public native ThresholdImpl options(ThresholdOptions setter);
}
