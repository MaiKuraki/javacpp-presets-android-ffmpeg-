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
 * \brief a std::istream class that can can wrap Stream objects,
 *  can use istream with that output to underlying Stream
 *
 * Usage example:
 * <pre>{@code
 *
 *   Stream *fs = Stream::Create("hdfs:///test.txt", "r");
 *   dmlc::istream is(fs);
 *   is >> mydata;
 *   delete fs;
 * }</pre>
 */
@Namespace("dmlc") @NoOffset @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class istream extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public istream(Pointer p) { super(p); }

  /**
   * \brief construct std::ostream type
   * @param stream the Stream output to be used
   * @param buffer_size internal buffer size
   */
  public istream(Stream stream,
                     @Cast("size_t") long buffer_size/*=(1 << 10)*/) { super((Pointer)null); allocate(stream, buffer_size); }
  private native void allocate(Stream stream,
                     @Cast("size_t") long buffer_size/*=(1 << 10)*/);
  public istream(Stream stream) { super((Pointer)null); allocate(stream); }
  private native void allocate(Stream stream);
  /**
   * \brief set internal stream to be stream, reset states
   * @param stream new stream as output
   */
  public native void set_stream(Stream stream);
  /** @return how many bytes we read so far */
  public native @Cast("size_t") long bytes_read();
}
