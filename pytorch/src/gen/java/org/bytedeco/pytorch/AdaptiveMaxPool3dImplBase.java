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

@Name("torch::nn::AdaptiveMaxPoolImpl<3,torch::ExpandingArrayWithOptionalElem<3>,torch::nn::AdaptiveMaxPool3dImpl>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AdaptiveMaxPool3dImplBase extends AdaptiveMaxPool3dImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AdaptiveMaxPool3dImplBase(Pointer p) { super(p); }

  public AdaptiveMaxPool3dImplBase(@ByVal @Cast("torch::ExpandingArrayWithOptionalElem<3>*") LongPointer output_size) { super((Pointer)null); allocate(output_size); }
  private native void allocate(@ByVal @Cast("torch::ExpandingArrayWithOptionalElem<3>*") LongPointer output_size);
  public AdaptiveMaxPool3dImplBase(
      @Const @ByRef AdaptiveMaxPool3dOptions options_) { super((Pointer)null); allocate(options_); }
  private native void allocate(
      @Const @ByRef AdaptiveMaxPool3dOptions options_);

  public native void reset();

  /** Pretty prints the {@code AdaptiveMaxPool{1,2,3}d} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef AdaptiveMaxPool3dOptions options(); public native AdaptiveMaxPool3dImplBase options(AdaptiveMaxPool3dOptions setter);
}
