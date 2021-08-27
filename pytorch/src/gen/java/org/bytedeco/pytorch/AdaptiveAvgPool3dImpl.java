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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~ AdaptiveAvgPool3d ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies adaptive avgpool over a 3-D input.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.AdaptiveAvgPool3d to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::AdaptiveAvgPool3dOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  AdaptiveAvgPool3d model(AdaptiveAvgPool3dOptions(3));
 *  }</pre> */
// NOLINTNEXTLINE(bugprone-exception-escape)
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AdaptiveAvgPool3dImpl extends AdaptiveAvgPool3dImplBase {
    static { Loader.load(); }

  
    public AdaptiveAvgPool3dImpl(@ByVal @Cast("torch::ExpandingArrayWithOptionalElem<3>*") LongPointer output_size) { super((Pointer)null); allocate(output_size); }
    private native void allocate(@ByVal @Cast("torch::ExpandingArrayWithOptionalElem<3>*") LongPointer output_size);
    public AdaptiveAvgPool3dImpl(
        @Const @ByRef AdaptiveAvgPool3dOptions options_) { super((Pointer)null); allocate(options_); }
    private native void allocate(
        @Const @ByRef AdaptiveAvgPool3dOptions options_);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AdaptiveAvgPool3dImpl(Pointer p) { super(p); }


  public native @ByVal Tensor forward(@Const @ByRef Tensor input);
}
