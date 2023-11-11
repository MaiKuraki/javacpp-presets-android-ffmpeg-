// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


@Namespace("onnx::Common") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class Status extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Status(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Status(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Status position(long position) {
        return (Status)super.position(position);
    }
    @Override public Status getPointer(long i) {
        return new Status((Pointer)this).offsetAddress(i);
    }

  public Status() { super((Pointer)null); allocate(); }
  @NoException(true) private native void allocate();

  public Status(@Cast("onnx::Common::StatusCategory") int category, int code, @StdString BytePointer msg) { super((Pointer)null); allocate(category, code, msg); }
  private native void allocate(@Cast("onnx::Common::StatusCategory") int category, int code, @StdString BytePointer msg);
  public Status(@Cast("onnx::Common::StatusCategory") int category, int code, @StdString String msg) { super((Pointer)null); allocate(category, code, msg); }
  private native void allocate(@Cast("onnx::Common::StatusCategory") int category, int code, @StdString String msg);

  public Status(@Cast("onnx::Common::StatusCategory") int category, int code) { super((Pointer)null); allocate(category, code); }
  private native void allocate(@Cast("onnx::Common::StatusCategory") int category, int code);

  public Status(@Const @ByRef Status other) { super((Pointer)null); allocate(other); }
  private native void allocate(@Const @ByRef Status other);

  public native @Name("operator =") void put(@Const @ByRef Status other);

  public native @Cast("bool") @NoException(true) boolean IsOK();

  public native @NoException(true) int Code();

  public native @Cast("onnx::Common::StatusCategory") @NoException(true) int Category();

  public native @StdString BytePointer ErrorMessage();

  public native @StdString BytePointer ToString();

  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef Status other);

  public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef Status other);

  public static native @Const @ByRef @NoException(true) Status OK();
}
