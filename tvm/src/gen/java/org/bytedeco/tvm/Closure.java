// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tvm;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;
import static org.bytedeco.mkl.global.mkl_rt.*;

import static org.bytedeco.tvm.global.tvm_runtime.*;


/** \brief reference to closure. */
@Namespace("tvm::runtime") @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class Closure extends ObjectRef {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Closure(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Closure(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Closure position(long position) {
        return (Closure)super.position(position);
    }
    @Override public Closure getPointer(long i) {
        return new Closure((Pointer)this).offsetAddress(i);
    }

  public Closure() { super((Pointer)null); allocate(); }
  private native void allocate();
  public Closure(@ByVal ObjectPtr n) { super((Pointer)null); allocate(n); }
  private native void allocate(@ByVal ObjectPtr n);
  public Closure(@Const @ByRef Closure other) { super((Pointer)null); allocate(other); }
  private native void allocate(@Const @ByRef Closure other);
  public native @ByRef @Name("operator =") Closure put(@Const @ByRef Closure other);
  public native @Const @Name("operator ->") ClosureObj access();
  public native @Const ClosureObj get();
}
