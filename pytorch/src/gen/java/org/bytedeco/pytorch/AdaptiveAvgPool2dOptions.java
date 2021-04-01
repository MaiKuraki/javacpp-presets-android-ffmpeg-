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

@Name("torch::nn::AdaptiveAvgPoolOptions<torch::ExpandingArrayWithOptionalElem<2> >") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AdaptiveAvgPool2dOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AdaptiveAvgPool2dOptions(Pointer p) { super(p); }

  public AdaptiveAvgPool2dOptions(@ByVal @Cast("torch::ExpandingArrayWithOptionalElem<2>*") LongPointer output_size) { super((Pointer)null); allocate(output_size); }
  private native void allocate(@ByVal @Cast("torch::ExpandingArrayWithOptionalElem<2>*") LongPointer output_size);
  public native @Cast("torch::ExpandingArrayWithOptionalElem<2>*") @ByRef @NoException LongPointer output_size();
}
