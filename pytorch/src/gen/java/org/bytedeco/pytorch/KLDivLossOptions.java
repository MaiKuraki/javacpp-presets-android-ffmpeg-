// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;
 // namespace functional

// ============================================================================

/** Options for the {@code KLDivLoss} module.
 * 
 *  Example:
 *  <pre>{@code
 *  KLDivLoss
 *  model(KLDivLossOptions().reduction(torch::kNone).log_target(false));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class KLDivLossOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public KLDivLossOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public KLDivLossOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public KLDivLossOptions position(long position) {
        return (KLDivLossOptions)super.position(position);
    }
    @Override public KLDivLossOptions getPointer(long i) {
        return new KLDivLossOptions((Pointer)this).offsetAddress(i);
    }


  public KLDivLossOptions() { super((Pointer)null); allocate(); }
  private native void allocate();
      
  public KLDivLossOptions(@ByVal kNone reduction) { super((Pointer)null); allocate(reduction); }
  private native void allocate(@ByVal kNone reduction);
      
  public KLDivLossOptions(@ByVal kBatchMean reduction) { super((Pointer)null); allocate(reduction); }
  private native void allocate(@ByVal kBatchMean reduction);
      
  public KLDivLossOptions(@ByVal kSum reduction) { super((Pointer)null); allocate(reduction); }
  private native void allocate(@ByVal kSum reduction);
      
  public KLDivLossOptions(@ByVal kMean reduction) { super((Pointer)null); allocate(reduction); }
  private native void allocate(@ByVal kMean reduction);
  public native @ByRef @NoException(true) KLDivLossReduction reduction();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer log_target();
}
