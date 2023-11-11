// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


// ===================================================================

@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class OperatorProto extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OperatorProto(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OperatorProto(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public OperatorProto position(long position) {
        return (OperatorProto)super.position(position);
    }
    @Override public OperatorProto getPointer(long i) {
        return new OperatorProto((Pointer)this).offsetAddress(i);
    }

  public OperatorProto() { super((Pointer)null); allocate(); }
  private native void allocate();

  public OperatorProto(@Const @ByRef OperatorProto from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef OperatorProto from);

  public native @ByRef @Name("operator =") OperatorProto put(@Const @ByRef OperatorProto from);

  public native @StdString BytePointer unknown_fields();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_unknown_fields();

  public static native @Const @ByRef OperatorProto default_instance();
  public static native @Const OperatorProto internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  
  public native void Swap(OperatorProto other);
  public native void UnsafeArenaSwap(OperatorProto other);

  // implements Message ----------------------------------------------

  public native OperatorProto New(Arena arena/*=nullptr*/);
  public native OperatorProto New();
  public native void CheckTypeAndMergeFrom(@Const @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef OperatorProto from);
  public native void MergeFrom(@Const @ByRef OperatorProto from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
  public native @Cast("const char*") BytePointer _InternalParse(@Cast("const char*") BytePointer ptr, ParseContext ctx);
  public native String _InternalParse(String ptr, ParseContext ctx);
  public native int GetCachedSize();

  public native @StdString BytePointer GetTypeName();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  /** enum onnx::OperatorProto:: */
  public static final int
    kOpTypeFieldNumber = 1,
    kDocStringFieldNumber = 10,
    kSinceVersionFieldNumber = 2,
    kStatusFieldNumber = 3;
  // optional string op_type = 1;
  public native @Cast("bool") boolean has_op_type();
  public native void clear_op_type();
  public native @StdString BytePointer op_type();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_op_type();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_op_type();
  public native void set_allocated_op_type(@StdString @Cast({"char*", "std::string*"}) BytePointer op_type);

  // optional string doc_string = 10;
  public native @Cast("bool") boolean has_doc_string();
  public native void clear_doc_string();
  public native @StdString BytePointer doc_string();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_doc_string();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_doc_string();
  public native void set_allocated_doc_string(@StdString @Cast({"char*", "std::string*"}) BytePointer doc_string);

  // optional int64 since_version = 2;
  public native @Cast("bool") boolean has_since_version();
  public native void clear_since_version();
  public native @Cast("int64_t") long since_version();
  public native void set_since_version(@Cast("int64_t") long value);

  // optional .onnx.OperatorStatus status = 3;
  public native @Cast("bool") boolean has_status();
  public native void clear_status();
  public native @Cast("onnx::OperatorStatus") int status();
  public native void set_status(@Cast("onnx::OperatorStatus") int value);
}
