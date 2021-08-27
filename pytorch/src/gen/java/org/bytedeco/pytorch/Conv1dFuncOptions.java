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


/** Options for a {@code D}-dimensional convolution functional. */
@Name("torch::nn::functional::ConvFuncOptions<1>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Conv1dFuncOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Conv1dFuncOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Conv1dFuncOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Conv1dFuncOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Conv1dFuncOptions position(long position) {
        return (Conv1dFuncOptions)super.position(position);
    }
    @Override public Conv1dFuncOptions getPointer(long i) {
        return new Conv1dFuncOptions((Pointer)this).offsetAddress(i);
    }

  public native @ByRef @NoException(true) Tensor bias();
  public native @Cast("torch::ExpandingArray<1>*") @ByRef @NoException(true) LongPointer stride();
  public native @ByRef @NoException(true) conv_padding_t1 padding();
  public native @Cast("torch::ExpandingArray<1>*") @ByRef @NoException(true) LongPointer dilation();
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer groups();
}
