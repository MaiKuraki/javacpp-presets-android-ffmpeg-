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


@Name("torch::jit::Object") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class JitObject extends Pointer {
    static { Loader.load(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public JitObject(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public JitObject position(long position) {
        return (JitObject)super.position(position);
    }
    @Override public JitObject getPointer(long i) {
        return new JitObject((Pointer)this).offsetAddress(i);
    }

  public JitObject() { super((Pointer)null); allocate(); }
  private native void allocate();
  public JitObject(@ByVal @Cast("torch::jit::ObjectPtr*") Pointer _ivalue) { super((Pointer)null); allocate(_ivalue); }
  private native void allocate(@ByVal @Cast("torch::jit::ObjectPtr*") Pointer _ivalue);
  public JitObject(@SharedPtr CompilationUnit cu, @Const @SharedPtr @ByRef ClassType type) { super((Pointer)null); allocate(cu, type); }
  private native void allocate(@SharedPtr CompilationUnit cu, @Const @SharedPtr @ByRef ClassType type);
  

  public native @ByVal @Cast("torch::jit::ObjectPtr*") Pointer _ivalue();

  public native @SharedPtr @ByVal ClassType type();

  public static class Property extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Property(Pointer p) { super(p); }
  
    public native @StdString BytePointer name(); public native Property name(BytePointer setter);
    public native @ByRef Method getter_func(); public native Property getter_func(Method setter);
    public native @ByRef MethodOptional setter_func(); public native Property setter_func(MethodOptional setter);
  }

  public native void setattr(@StdString BytePointer name, @ByVal IValue v);
  public native void setattr(@StdString String name, @ByVal IValue v);

  public native @ByVal IValue attr(@StdString BytePointer name);
  public native @ByVal IValue attr(@StdString String name);

  public native @ByVal IValue attr(@StdString BytePointer name, @ByVal IValue or_else);
  public native @ByVal IValue attr(@StdString String name, @ByVal IValue or_else);

  public native @Cast("bool") boolean hasattr(@StdString BytePointer name);
  public native @Cast("bool") boolean hasattr(@StdString String name);

  // each object owns its methods. The reference returned here
  // is guaranteed to stay valid until this module has been destroyed
  public native @ByVal Method get_method(@StdString BytePointer name);
  public native @ByVal Method get_method(@StdString String name);

  public native @StdVector Method get_methods();

  public native @Cast("bool") boolean has_property(@StdString BytePointer name);
  public native @Cast("bool") boolean has_property(@StdString String name);

  public native @Const @ByVal Property get_property(@StdString BytePointer name);
  public native @Const @ByVal Property get_property(@StdString String name);

  
  ///
  ///
  ///
  public native @ByVal MethodOptional find_method(@StdString BytePointer basename);
  public native @ByVal MethodOptional find_method(@StdString String basename);

  /** Run a method from this module.
   * 
   *  For example:
   *  <pre>{@code
   *    IValue output = module->run("relu_script", a, b);
   *  }</pre>
   * 
   *  To get a compile a module from a source string, see torch::jit::compile
   * 
   *  @param method_name The name of the method to run
   *  @param args Arguments to be passed to the method
   *  @return An IValue containing the return value (or values if it is a tuple)
   *  from the method */

  // so that C++ users can easily add methods
  public native void define(@StdString BytePointer src, @Const @SharedPtr @ByRef(nullValue = "torch::jit::ResolverPtr(nullptr)") Resolver resolver);
  public native void define(@StdString BytePointer src);
  public native void define(@StdString String src, @Const @SharedPtr @ByRef(nullValue = "torch::jit::ResolverPtr(nullptr)") Resolver resolver);
  public native void define(@StdString String src);

  public native @Cast("size_t") long num_slots();

  // shallow copy the object
  public native @ByVal JitObject copy();

  // Copies all the attributes of the object recursively without creating new
  // `ClassType`, including deepcopy of Tensors
  public native @ByVal JitObject deepcopy();
}
