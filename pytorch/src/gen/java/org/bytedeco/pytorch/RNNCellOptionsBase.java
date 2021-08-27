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


/** Common options for RNNCell, LSTMCell and GRUCell modules */
@Namespace("torch::nn::detail") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class RNNCellOptionsBase extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RNNCellOptionsBase(Pointer p) { super(p); }

  public RNNCellOptionsBase(@Cast("int64_t") long input_size, @Cast("int64_t") long hidden_size, @Cast("bool") boolean bias, @Cast("int64_t") long num_chunks) { super((Pointer)null); allocate(input_size, hidden_size, bias, num_chunks); }
  private native void allocate(@Cast("int64_t") long input_size, @Cast("int64_t") long hidden_size, @Cast("bool") boolean bias, @Cast("int64_t") long num_chunks);
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer input_size();
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer hidden_size();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer bias();
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer num_chunks();
}
