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


@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Value extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Value(Pointer p) { super(p); }

  
  
  public Value(JitNode node_, @Cast("size_t") long offset_) { super((Pointer)null); allocate(node_, offset_); }
  private native void allocate(JitNode node_, @Cast("size_t") long offset_);
  public native Value setType(@SharedPtr @ByVal Type type);
  public native void inferTypeFrom(@Const @ByRef Tensor output);
  public native void inferTypeFrom(
        @Cast("const c10::intrusive_ptr<c10::ivalue::Object>*") @ByRef Pointer output);
  public native @Const @SharedPtr @ByRef Type type();
  public native @Cast("bool") boolean requires_grad();
  public native @Cast("bool") boolean isCompleteTensor();
  public native @Cast("bool") boolean mustBeNone();
  public native @Cast("bool") boolean mustNotBeNone();
  public native @Cast("size_t") long unique();
  public native @Cast("bool") boolean hasDebugName();
  
  public native Value setDebugName(@StdString BytePointer name);
  public native Value setDebugName(@StdString String name);
  public native @StdString BytePointer debugName();
  public native @StdString BytePointer debugNameBase();
  public native JitNode node();
  public native @Cast("size_t") long offset();
  public native void setOffset(@Cast("size_t") long offset);
  public native Graph owningGraph();
  // TODO: make this more const correct
  public native @StdVector Use uses();

  public native @Cast("bool") boolean hasUses();

  public native void replaceFirstUseWith(Value newValue);

  // Replaces all uses of this value with 'newValue'.
  //
  // Given:   %3 = f(%1, %2)
  //          %4 = g(%3)
  //          %5 = h(%3, %3)
  // Execute: %3.replaceAllUsesWith(%6)
  // Result:  %3 = f(%1, %2)
  //          %4 = g(%6)
  //          %5 = h(%6, %6)
  public native void replaceAllUsesWith(Value newValue);

  // Replaces all uses of this value with 'newValue' after 'node'.
  // Given:   %3 = f(%1, %2)
  //          %4 = g(%3)
  //          %5 = inplace_(%3)
  //          %6 = h(%3, %3)
  // Execute: %3.replaceAllUsesAfterNodeWith(%5.node(), %5)
  // Result:  %3 = f(%1, %2)
  //          %4 = g(%3)
  //          %5 = inplace_(%3)
  //          %6 = h(%5, %5)
  public native void replaceAllUsesAfterNodeWith(@Const JitNode node, Value newValue);

  public native Value copyMetadata(Value from);

  public native @SharedPtr ValueWrap wrap();
}
