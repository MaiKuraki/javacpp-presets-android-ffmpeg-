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


@Namespace("torch::optim") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class RMSprop extends Optimizer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RMSprop(Pointer p) { super(p); }

  public RMSprop(@StdVector OptimizerParamGroup param_groups,
        @ByVal(nullValue = "torch::optim::RMSpropOptions{}") RMSpropOptions defaults) { super((Pointer)null); allocate(param_groups, defaults); }
  private native void allocate(@StdVector OptimizerParamGroup param_groups,
        @ByVal(nullValue = "torch::optim::RMSpropOptions{}") RMSpropOptions defaults);
  public RMSprop(@StdVector OptimizerParamGroup param_groups) { super((Pointer)null); allocate(param_groups); }
  private native void allocate(@StdVector OptimizerParamGroup param_groups);

  public RMSprop(@StdMove TensorVector params,
        @ByVal(nullValue = "torch::optim::RMSpropOptions{}") RMSpropOptions defaults) { super((Pointer)null); allocate(params, defaults); }
  private native void allocate(@StdMove TensorVector params,
        @ByVal(nullValue = "torch::optim::RMSpropOptions{}") RMSpropOptions defaults);
  public RMSprop(@StdMove TensorVector params) { super((Pointer)null); allocate(params); }
  private native void allocate(@StdMove TensorVector params);

  public native @ByVal Tensor step(@ByVal(nullValue = "torch::optim::Optimizer::LossClosure(nullptr)") LossClosure closure);
  public native @ByVal Tensor step();
  public native void save(@ByRef OutputArchive archive);
  public native void load(@ByRef InputArchive archive);
}
