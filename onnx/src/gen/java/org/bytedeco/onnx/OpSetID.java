// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


// A class with the same properties as OperatorSetIdProto, but without protobuf
// overhead, resulting in a simpler and more readable workflow.
@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class OpSetID extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OpSetID(Pointer p) { super(p); }

  public OpSetID(@Const @ByRef OperatorSetIdProto proto) { super((Pointer)null); allocate(proto); }
  private native void allocate(@Const @ByRef OperatorSetIdProto proto);

  // Default Domain Constructor
  public OpSetID(@Cast("const int64_t") long version) { super((Pointer)null); allocate(version); }
  private native void allocate(@Cast("const int64_t") long version);

  public OpSetID(@StdString BytePointer domain, @Cast("int64_t") long version) { super((Pointer)null); allocate(domain, version); }
  private native void allocate(@StdString BytePointer domain, @Cast("int64_t") long version);
  public OpSetID(@StdString String domain, @Cast("int64_t") long version) { super((Pointer)null); allocate(domain, version); }
  private native void allocate(@StdString String domain, @Cast("int64_t") long version);

  // target must be in the form "<domain>&<version>"
  

  // target must be in the form "<domain>&<version>"
  public static native @ByVal OpSetID fromString(@StdString BytePointer target);
  public static native @ByVal OpSetID fromString(@StdString String target);

  public native @StdString BytePointer domain();

  public native @Cast("int64_t") long version();

  public native void incrementVersion(@Cast("int64_t") long step);

  public native void setVersion(@Cast("int64_t") long newVal);
}
