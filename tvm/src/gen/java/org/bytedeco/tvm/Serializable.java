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


/** \brief interface for serializable objects */
@Namespace("dmlc") @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class Serializable extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Serializable(Pointer p) { super(p); }

  /** \brief virtual destructor */
  /**
  * \brief load the model from a stream
  * @param fi stream where to load the model from
  */
  public native void Load(Stream fi);
  /**
  * \brief saves the model to a stream
  * @param fo stream where to save the model to
  */
  public native void Save(Stream fo);
}
