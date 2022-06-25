// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


@Namespace("onnx::version_conversion") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class Adapter extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Adapter(Pointer p) { super(p); }


  // This will almost always return its own node argument after modifying it in place.
  // The only exception are adapters for deprecated operators: in this case the input
  // node must be destroyed and a new one must be created and returned. See e.g.
  // upsample_9_10.h
  public native Node adapt(@SharedPtr Graph arg0, Node node);

  public native @StdString BytePointer name();

  public native @Const @ByRef OpSetID initial_version();

  public native @Const @ByRef OpSetID target_version();
}
