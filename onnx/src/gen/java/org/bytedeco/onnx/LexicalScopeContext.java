// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


@Namespace("onnx::checker") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class LexicalScopeContext extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LexicalScopeContext(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LexicalScopeContext(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public LexicalScopeContext position(long position) {
        return (LexicalScopeContext)super.position(position);
    }
    @Override public LexicalScopeContext getPointer(long i) {
        return new LexicalScopeContext((Pointer)this).offsetAddress(i);
    }

  public LexicalScopeContext() { super((Pointer)null); allocate(); }
  private native void allocate();

  // Construct an instance with the lexical scope from the parent graph to allow
  // lookup of names from that scope via this_or_ancestor_graph_has.
  // The caller must ensure parent_context remains valid for the entire lifetime
  // of the new instance. Alternatively, if that cannot be guaranteed, create an
  // instance with the default constructor and populate output_names with the
  // values from the parent scope so the values are copied instead.
  public LexicalScopeContext(@Const @ByRef LexicalScopeContext parent_context) { super((Pointer)null); allocate(parent_context); }
  private native void allocate(@Const @ByRef LexicalScopeContext parent_context);
  public native @ByRef @Name("operator =") LexicalScopeContext put(@Const @ByRef LexicalScopeContext parent_context);

  public native void add(@StdString BytePointer name);
  public native void add(@StdString String name);

  public native @Cast("bool") boolean this_graph_has(@StdString BytePointer name);
  public native @Cast("bool") boolean this_graph_has(@StdString String name);

  public native @Cast("bool") boolean this_or_ancestor_graph_has(@StdString BytePointer name);
  public native @Cast("bool") boolean this_or_ancestor_graph_has(@StdString String name);

  // public for backwards compatibility. please prefer the public interface of
  // this class over directly changing output_names
  public native @ByRef UnorderedStringSet output_names(); public native LexicalScopeContext output_names(UnorderedStringSet setter);
}
