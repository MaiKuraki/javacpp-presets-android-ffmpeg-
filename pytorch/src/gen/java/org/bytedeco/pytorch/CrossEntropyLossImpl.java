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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ CrossEntropyLoss ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Creates a criterion that combines :func:{@code nn.LogSoftmax} and
 *  :func:{@code nn.NLLLoss} in one single class.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.CrossEntropyLoss to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::CrossEntropyLossOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  CrossEntropyLoss model(CrossEntropyLossOptions().ignore_index(-100).reduction(torch::kMean));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class CrossEntropyLossImpl extends CrossEntropyLossImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CrossEntropyLossImpl(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CrossEntropyLossImpl(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CrossEntropyLossImpl position(long position) {
        return (CrossEntropyLossImpl)super.position(position);
    }
    @Override public CrossEntropyLossImpl getPointer(long i) {
        return new CrossEntropyLossImpl((Pointer)this).position(position + i);
    }

  public CrossEntropyLossImpl(
        @Const @ByRef(nullValue = "torch::nn::CrossEntropyLossOptions{}") CrossEntropyLossOptions options_) { super((Pointer)null); allocate(options_); }
  @NoDeallocator private native void allocate(
        @Const @ByRef(nullValue = "torch::nn::CrossEntropyLossOptions{}") CrossEntropyLossOptions options_);
  public CrossEntropyLossImpl() { super((Pointer)null); allocate(); }
  @NoDeallocator private native void allocate();

  public native void reset();

  /** Pretty prints the {@code CrossEntropyLoss} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  public native @ByVal Tensor forward(
        @Const @ByRef Tensor input,
        @Const @ByRef Tensor target);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef CrossEntropyLossOptions options(); public native CrossEntropyLossImpl options(CrossEntropyLossOptions setter);

  /** A manual rescaling weight given to to each class. */
  public native @ByRef Tensor weight(); public native CrossEntropyLossImpl weight(Tensor setter);
}
