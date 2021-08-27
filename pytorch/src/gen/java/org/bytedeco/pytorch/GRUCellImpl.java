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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ GRUCell ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** A gated recurrent unit (GRU) cell.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.GRUCell to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::GRUCellOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  GRUCell model(GRUCellOptions(20, 10).bias(false));
 *  }</pre> */
// NOLINTNEXTLINE(bugprone-exception-escape)
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class GRUCellImpl extends GRUCellImplBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GRUCellImpl(Pointer p) { super(p); }

  public GRUCellImpl(@Cast("int64_t") long input_size, @Cast("int64_t") long hidden_size) { super((Pointer)null); allocate(input_size, hidden_size); }
  @NoDeallocator private native void allocate(@Cast("int64_t") long input_size, @Cast("int64_t") long hidden_size);
  public GRUCellImpl(@Const @ByRef GRUCellOptions options_) { super((Pointer)null); allocate(options_); }
  @NoDeallocator private native void allocate(@Const @ByRef GRUCellOptions options_);

  public native @ByVal Tensor forward(@Const @ByRef Tensor input, @ByVal(nullValue = "at::Tensor{}") Tensor hx);
  public native @ByVal Tensor forward(@Const @ByRef Tensor input);
  public native @ByRef GRUCellOptions options(); public native GRUCellImpl options(GRUCellOptions setter);
}
