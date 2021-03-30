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


/** A {@code ModuleHolder} subclass for {@code TripletMarginWithDistanceLossImpl}.
 *  See the documentation for {@code TripletMarginWithDistanceLossImpl} class to learn what methods it
 *  provides, and examples of how to use {@code TripletMarginWithDistanceLoss} with
 *  {@code torch::nn::TripletMarginWithDistanceLossOptions}.
 *  See the documentation for {@code ModuleHolder} to learn about PyTorch's
 *  module storage semantics. */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TripletMarginWithDistanceLoss extends TripletMarginWithDistanceLossImplModuleHolder {
    static { Loader.load(); }

     public TripletMarginWithDistanceLoss(@ByVal @Cast("std::nullptr_t*") PointerPointer arg0) { super((Pointer)null); allocate(arg0); }
    private native void allocate(@ByVal @Cast("std::nullptr_t*") PointerPointer arg0); public TripletMarginWithDistanceLoss(@SharedPtr @Cast({"", "std::shared_ptr<torch::nn::TripletMarginWithDistanceLossImpl>"}) TripletMarginWithDistanceLossImpl module) { super((Pointer)null); allocate(module); }
    private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<torch::nn::TripletMarginWithDistanceLossImpl>"}) TripletMarginWithDistanceLossImpl module);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TripletMarginWithDistanceLoss(Pointer p) { super(p); }

  }
