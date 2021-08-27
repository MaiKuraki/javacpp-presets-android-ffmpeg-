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

@Name("torch::nn::ReplicationPadOptions<2>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ReplicationPad2dOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ReplicationPad2dOptions(Pointer p) { super(p); }

  public ReplicationPad2dOptions(@ByVal @Cast("torch::ExpandingArray<2*2>*") LongPointer padding) { super((Pointer)null); allocate(padding); }
  private native void allocate(@ByVal @Cast("torch::ExpandingArray<2*2>*") LongPointer padding);
  public native @Cast("torch::ExpandingArray<2*2>*") @ByRef @NoException(true) LongPointer padding();
}
