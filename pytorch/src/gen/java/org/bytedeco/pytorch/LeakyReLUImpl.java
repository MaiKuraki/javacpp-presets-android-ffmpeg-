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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ LeakyReLU ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies the LeakyReLU function element-wise.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.LeakyReLU to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::LeakyReLUOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  LeakyReLU model(LeakyReLUOptions().negative_slope(0.42).inplace(true));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class LeakyReLUImpl extends LeakyReLUImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LeakyReLUImpl(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LeakyReLUImpl(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public LeakyReLUImpl position(long position) {
        return (LeakyReLUImpl)super.position(position);
    }
    @Override public LeakyReLUImpl getPointer(long i) {
        return new LeakyReLUImpl((Pointer)this).position(position + i);
    }

  public LeakyReLUImpl(@Const @ByRef(nullValue = "torch::nn::LeakyReLUOptions{}") LeakyReLUOptions options_) { super((Pointer)null); allocate(options_); }
  @NoDeallocator private native void allocate(@Const @ByRef(nullValue = "torch::nn::LeakyReLUOptions{}") LeakyReLUOptions options_);
  public LeakyReLUImpl() { super((Pointer)null); allocate(); }
  @NoDeallocator private native void allocate();

  public native @ByVal Tensor forward(@ByVal Tensor input);

  public native void reset();

  /** Pretty prints the {@code LeakyReLU} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef LeakyReLUOptions options(); public native LeakyReLUImpl options(LeakyReLUOptions setter);
}
