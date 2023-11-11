// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


@Name("onnx::Dimension") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class DimensionIR extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DimensionIR(Pointer p) { super(p); }

  public DimensionIR() { super((Pointer)null); allocate(); }
  private native void allocate();
  public DimensionIR(@StdString BytePointer param) { super((Pointer)null); allocate(param); }
  private native void allocate(@StdString BytePointer param);
  public DimensionIR(@StdString String param) { super((Pointer)null); allocate(param); }
  private native void allocate(@StdString String param); // NOLINT
  public DimensionIR(@Cast("int64_t") long dim) { super((Pointer)null); allocate(dim); }
  private native void allocate(@Cast("int64_t") long dim); // NOLINT

  public native @Cast("bool") boolean is_unknown(); public native DimensionIR is_unknown(boolean setter);
  public native @Cast("bool") boolean is_int(); public native DimensionIR is_int(boolean setter);
  public native @Cast("int64_t") long dim(); public native DimensionIR dim(long setter);
  public native @StdString BytePointer param(); public native DimensionIR param(BytePointer setter);
}
