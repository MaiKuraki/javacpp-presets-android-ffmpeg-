// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;


/** <summary>
 *  This class wraps a raw pointer OrtKernelContext* that is being passed
 *  to the custom kernel Compute() method. Use it to safely access context
 *  attributes, input and output parameters with exception safety guarantees.
 *  See usage example in onnxruntime/test/testdata/custom_op_library/custom_op_library.cc
 *  </summary> */
@Namespace("Ort") @NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class KernelContext extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public KernelContext(Pointer p) { super(p); }

  public KernelContext(OrtKernelContext context) { super((Pointer)null); allocate(context); }
  private native void allocate(OrtKernelContext context);
  public native @Cast("size_t") long GetInputCount();
  public native @Cast("size_t") long GetOutputCount();
  // If input is optional and is not present, the method returns en empty ConstValue
  // which can be compared to nullptr.
  public native @ByVal ConstValue GetInput(@Cast("size_t") long index);
  // If outout is optional and is not present, the method returns en empty UnownedValue
  // which can be compared to nullptr.
  public native @ByVal @Cast("Ort::UnownedValue*") ValueImpl GetOutput(@Cast("size_t") long index, @Cast("const int64_t*") LongPointer dim_values, @Cast("size_t") long dim_count);
  public native @ByVal @Cast("Ort::UnownedValue*") ValueImpl GetOutput(@Cast("size_t") long index, @Cast("const int64_t*") LongBuffer dim_values, @Cast("size_t") long dim_count);
  public native @ByVal @Cast("Ort::UnownedValue*") ValueImpl GetOutput(@Cast("size_t") long index, @Cast("const int64_t*") long[] dim_values, @Cast("size_t") long dim_count);
  public native @ByVal @Cast("Ort::UnownedValue*") ValueImpl GetOutput(@Cast("size_t") long index, @Const @ByRef LongVector dims);
  public native Pointer GetGPUComputeStream();
  public native @ByVal Logger GetLogger();
  public native OrtAllocator GetAllocator(@Const @ByRef OrtMemoryInfo memory_info);
  public native OrtKernelContext GetOrtKernelContext();
  public static class Fn_Pointer_long extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Fn_Pointer_long(Pointer p) { super(p); }
      protected Fn_Pointer_long() { allocate(); }
      private native void allocate();
      public native void call(Pointer arg0, @Cast("size_t") long arg1);
  }
  public native void ParallelFor(Fn_Pointer_long fn, @Cast("size_t") long total, @Cast("size_t") long num_batch, Pointer usr_data);
}
