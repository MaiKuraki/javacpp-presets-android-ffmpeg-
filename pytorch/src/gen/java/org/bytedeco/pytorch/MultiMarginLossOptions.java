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
 // namespace functional

// ============================================================================

/** Options for the {@code MultiMarginLoss} module.
 * 
 *  Example:
 *  <pre>{@code
 *  MultiMarginLoss model(MultiMarginLossOptions().margin(2).weight(weight));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class MultiMarginLossOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public MultiMarginLossOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MultiMarginLossOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MultiMarginLossOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public MultiMarginLossOptions position(long position) {
        return (MultiMarginLossOptions)super.position(position);
    }
    @Override public MultiMarginLossOptions getPointer(long i) {
        return new MultiMarginLossOptions((Pointer)this).position(position + i);
    }

  public native @Cast("int64_t*") @ByRef @NoException LongPointer p();
  public native @ByRef @NoException DoublePointer margin();
  public native @ByRef @NoException Tensor weight();
  public native @Cast("torch::nn::MultiMarginLossOptions::reduction_t*") @ByRef @NoException Pointer reduction();
}
