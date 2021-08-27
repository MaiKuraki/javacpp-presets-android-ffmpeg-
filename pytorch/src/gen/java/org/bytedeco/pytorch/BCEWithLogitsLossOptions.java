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
 // namespace functional

// ============================================================================

/** Options for the {@code BCEWithLogitsLoss} module.
 * 
 *  Example:
 *  <pre>{@code
 *  BCEWithLogitsLoss model(BCEWithLogitsLossOptions().reduction(torch::kNone).weight(weight));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class BCEWithLogitsLossOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public BCEWithLogitsLossOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BCEWithLogitsLossOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BCEWithLogitsLossOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public BCEWithLogitsLossOptions position(long position) {
        return (BCEWithLogitsLossOptions)super.position(position);
    }
    @Override public BCEWithLogitsLossOptions getPointer(long i) {
        return new BCEWithLogitsLossOptions((Pointer)this).offsetAddress(i);
    }

  public native @ByRef @NoException(true) Tensor weight();
  public native @ByRef @NoException(true) loss_reduction_t reduction();
  public native @ByRef @NoException(true) Tensor pos_weight();
}
