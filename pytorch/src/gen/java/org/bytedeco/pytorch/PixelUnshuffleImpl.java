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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ PixelUnshuffle ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Reverses the PixelShuffle operation by rearranging elements in a tensor of
 *  shape :math:{@code (*, C, H \times r, W \times r)} to a tensor of shape :math:{@code (*,
 *  C \times r^2, H, W)}, where r is a downscale factor. See
 *  https://pytorch.org/docs/master/nn.html#torch.nn.PixelUnshuffle to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::PixelUnshuffleOptions} class to learn
 *  what constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  PixelUnshuffle model(PixelUnshuffleOptions(5));
 *  }</pre> */
// NOLINTNEXTLINE(bugprone-exception-escape)
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class PixelUnshuffleImpl extends PixelUnshuffleImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PixelUnshuffleImpl(Pointer p) { super(p); }

  public PixelUnshuffleImpl(@Const @ByRef PixelUnshuffleOptions options_) { super((Pointer)null); allocate(options_); }
  @NoDeallocator private native void allocate(@Const @ByRef PixelUnshuffleOptions options_);

  /** Pretty prints the {@code PixelUnshuffle} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  public native void reset();

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef PixelUnshuffleOptions options(); public native PixelUnshuffleImpl options(PixelUnshuffleOptions setter);
}
