// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

// -------------------------------------------------------------------

@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class TrainingInfoProto extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TrainingInfoProto(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TrainingInfoProto(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TrainingInfoProto position(long position) {
        return (TrainingInfoProto)super.position(position);
    }
    @Override public TrainingInfoProto getPointer(long i) {
        return new TrainingInfoProto((Pointer)this).offsetAddress(i);
    }

  public TrainingInfoProto() { super((Pointer)null); allocate(); }
  private native void allocate();

  public TrainingInfoProto(@Const @ByRef TrainingInfoProto from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef TrainingInfoProto from);

  public native @ByRef @Name("operator =") TrainingInfoProto put(@Const @ByRef TrainingInfoProto from);

  public native @StdString BytePointer unknown_fields();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_unknown_fields();

  public static native @Const @ByRef TrainingInfoProto default_instance();
  public static native @Const TrainingInfoProto internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  
  public native void Swap(TrainingInfoProto other);
  public native void UnsafeArenaSwap(TrainingInfoProto other);

  // implements Message ----------------------------------------------

  public native TrainingInfoProto New(Arena arena/*=nullptr*/);
  public native TrainingInfoProto New();
  public native void CheckTypeAndMergeFrom(@Const @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef TrainingInfoProto from);
  public native void MergeFrom(@Const @ByRef TrainingInfoProto from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
  public native @Cast("const char*") BytePointer _InternalParse(@Cast("const char*") BytePointer ptr, ParseContext ctx);
  public native String _InternalParse(String ptr, ParseContext ctx);
  public native int GetCachedSize();

  public native @StdString BytePointer GetTypeName();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  /** enum onnx::TrainingInfoProto:: */
  public static final int
    kInitializationBindingFieldNumber = 3,
    kUpdateBindingFieldNumber = 4,
    kInitializationFieldNumber = 1,
    kAlgorithmFieldNumber = 2;
  // repeated .onnx.StringStringEntryProto initialization_binding = 3;
  public native int initialization_binding_size();
  public native void clear_initialization_binding();
  public native StringStringEntryProto mutable_initialization_binding(int index);
  public native @Const @ByRef StringStringEntryProto initialization_binding(int index);
  public native StringStringEntryProto add_initialization_binding();

  // repeated .onnx.StringStringEntryProto update_binding = 4;
  public native int update_binding_size();
  public native void clear_update_binding();
  public native StringStringEntryProto mutable_update_binding(int index);
  public native @Const @ByRef StringStringEntryProto update_binding(int index);
  public native StringStringEntryProto add_update_binding();

  // optional .onnx.GraphProto initialization = 1;
  public native @Cast("bool") boolean has_initialization();
  public native void clear_initialization();
  public native @Const @ByRef GraphProto initialization();
  public native GraphProto release_initialization();
  public native GraphProto mutable_initialization();
  public native void set_allocated_initialization(GraphProto initialization);
  public native void unsafe_arena_set_allocated_initialization(
        GraphProto initialization);
  public native GraphProto unsafe_arena_release_initialization();

  // optional .onnx.GraphProto algorithm = 2;
  public native @Cast("bool") boolean has_algorithm();
  public native void clear_algorithm();
  public native @Const @ByRef GraphProto algorithm();
  public native GraphProto release_algorithm();
  public native GraphProto mutable_algorithm();
  public native void set_allocated_algorithm(GraphProto algorithm);
  public native void unsafe_arena_set_allocated_algorithm(
        GraphProto algorithm);
  public native GraphProto unsafe_arena_release_algorithm();
}
