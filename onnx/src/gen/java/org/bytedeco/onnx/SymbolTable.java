// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


// Maintains a SymbolTable for symbolic shape inference
@Namespace("onnx") @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class SymbolTable extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SymbolTable(Pointer p) { super(p); }

  // Adds existing symbols from a main graph or subgraph
  public native void addFromGraph(@Const @ByRef GraphProto g);
  // Creates a new symbol which is not duplicate as any existing one
  public native @StdString BytePointer createNew();
  public native @StdString BytePointer createNew(@StdString BytePointer symbol_prefix);
  public native @StdString String createNew(@StdString String symbol_prefix);
}
