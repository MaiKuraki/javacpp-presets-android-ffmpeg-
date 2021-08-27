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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Softmin ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies the Softmin function element-wise.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.Softmin to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::SoftminOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  Softmin model(SoftminOptions(1));
 *  }</pre> */
// NOLINTNEXTLINE(bugprone-exception-escape)
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SoftminImpl extends SoftminImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SoftminImpl(Pointer p) { super(p); }

  public SoftminImpl(@Cast("int64_t") long dim) { super((Pointer)null); allocate(dim); }
  @NoDeallocator private native void allocate(@Cast("int64_t") long dim);
  public SoftminImpl(@Const @ByRef SoftminOptions options_) { super((Pointer)null); allocate(options_); }
  @NoDeallocator private native void allocate(@Const @ByRef SoftminOptions options_);

  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  public native void reset();

  /** Pretty prints the {@code Softmin} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  public native @ByRef SoftminOptions options(); public native SoftminImpl options(SoftminOptions setter);
}
