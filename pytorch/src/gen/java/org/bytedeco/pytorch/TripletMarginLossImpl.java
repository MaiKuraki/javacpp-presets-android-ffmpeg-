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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ TripletMarginLoss ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Creates a criterion that measures the triplet loss given an input
 *  tensors :math:{@code x1}, :math:{@code x2}, :math:{@code x3} and a margin with a value greater
 *  than :math:{@code 0}. This is used for measuring a relative similarity between
 *  samples. A triplet is composed by {@code a}, {@code p} and {@code n} (i.e., {@code anchor},
 *  {@code positive examples} and {@code negative examples} respectively). The
 *  shapes of all input tensors should be :math:{@code (N, D)}.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.TripletMarginLoss to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::TripletMarginLossOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  TripletMarginLoss model(TripletMarginLossOptions().margin(3).p(2).eps(1e-06).swap(false));
 *  }</pre> */
// NOLINTNEXTLINE(bugprone-exception-escape)
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TripletMarginLossImpl extends TripletMarginLossImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TripletMarginLossImpl(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TripletMarginLossImpl(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TripletMarginLossImpl position(long position) {
        return (TripletMarginLossImpl)super.position(position);
    }
    @Override public TripletMarginLossImpl getPointer(long i) {
        return new TripletMarginLossImpl((Pointer)this).offsetAddress(i);
    }

  public TripletMarginLossImpl(
        @Const @ByRef(nullValue = "torch::nn::TripletMarginLossOptions{}") TripletMarginLossOptions options_) { super((Pointer)null); allocate(options_); }
  @NoDeallocator private native void allocate(
        @Const @ByRef(nullValue = "torch::nn::TripletMarginLossOptions{}") TripletMarginLossOptions options_);
  public TripletMarginLossImpl() { super((Pointer)null); allocate(); }
  @NoDeallocator private native void allocate();

  public native void reset();

  /** Pretty prints the {@code TripletMarginLoss} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  public native @ByVal Tensor forward(
        @Const @ByRef Tensor anchor,
        @Const @ByRef Tensor positive,
        @Const @ByRef Tensor negative);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef TripletMarginLossOptions options(); public native TripletMarginLossImpl options(TripletMarginLossOptions setter);
}
