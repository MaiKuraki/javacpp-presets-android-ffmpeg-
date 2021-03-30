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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ConvTranspose1d ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies the ConvTranspose1d function.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.ConvTranspose1d to
 *  learn about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::ConvTranspose1dOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  ConvTranspose1d model(ConvTranspose1dOptions(3, 2, 3).stride(1).bias(false));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ConvTranspose1dImpl extends ConvTranspose1dImplBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConvTranspose1dImpl(Pointer p) { super(p); }

  public ConvTranspose1dImpl(
        @Cast("int64_t") long input_channels,
        @Cast("int64_t") long output_channels,
        @ByVal @Cast("torch::ExpandingArray<1>*") LongPointer kernel_size) { super((Pointer)null); allocate(input_channels, output_channels, kernel_size); }
  @NoDeallocator private native void allocate(
        @Cast("int64_t") long input_channels,
        @Cast("int64_t") long output_channels,
        @ByVal @Cast("torch::ExpandingArray<1>*") LongPointer kernel_size);
  public ConvTranspose1dImpl(@ByVal @Cast("torch::nn::ConvTranspose1dOptions*") Conv1dTransposeOptions options_) { super((Pointer)null); allocate(options_); }
  @NoDeallocator private native void allocate(@ByVal @Cast("torch::nn::ConvTranspose1dOptions*") Conv1dTransposeOptions options_);
  public native @ByVal Tensor forward(@Const @ByRef Tensor input,
                   @Const @ByRef(nullValue = "c10::optional<at::IntArrayRef>(c10::nullopt)") LongArrayRefOptional output_size);
  public native @ByVal Tensor forward(@Const @ByRef Tensor input);
}
