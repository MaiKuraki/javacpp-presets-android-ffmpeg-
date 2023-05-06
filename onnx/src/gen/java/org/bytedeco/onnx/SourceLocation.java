// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;
  // namespace io

// NB, all indices are zero-based.
@Namespace("google::protobuf") @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class SourceLocation extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SourceLocation() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SourceLocation(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SourceLocation(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SourceLocation position(long position) {
        return (SourceLocation)super.position(position);
    }
    @Override public SourceLocation getPointer(long i) {
        return new SourceLocation((Pointer)this).offsetAddress(i);
    }

  public native int start_line(); public native SourceLocation start_line(int setter);
  public native int end_line(); public native SourceLocation end_line(int setter);
  public native int start_column(); public native SourceLocation start_column(int setter);
  public native int end_column(); public native SourceLocation end_column(int setter);

  // Doc comments found at the source location.
  // See the comments in SourceCodeInfo.Location (descriptor.proto) for details.
  public native @StdString BytePointer leading_comments(); public native SourceLocation leading_comments(BytePointer setter);
  public native @StdString BytePointer trailing_comments(); public native SourceLocation trailing_comments(BytePointer setter);
  
}
