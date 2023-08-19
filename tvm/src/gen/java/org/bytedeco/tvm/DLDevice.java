// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tvm;

import org.bytedeco.tvm.Module;
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


/**
 * \brief A Device for Tensor and operator.
 */
@Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class DLDevice extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public DLDevice() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DLDevice(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DLDevice(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public DLDevice position(long position) {
        return (DLDevice)super.position(position);
    }
    @Override public DLDevice getPointer(long i) {
        return new DLDevice((Pointer)this).offsetAddress(i);
    }

  /** \brief The device type used in the device. */
  public native @Cast("DLDeviceType") int device_type(); public native DLDevice device_type(int setter);
  /**
   * \brief The device index.
   * For vanilla CPU memory, pinned memory, or managed memory, this is set to 0.
   */
  public native @Cast("int32_t") int device_id(); public native DLDevice device_id(int setter);
}
