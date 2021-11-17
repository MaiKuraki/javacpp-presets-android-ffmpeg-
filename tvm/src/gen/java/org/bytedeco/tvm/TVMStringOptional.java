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


/**
 * \brief Optional container that to represent to a Nullable variant of T.
 * \tparam T The original ObjectRef.
 *
 * <pre>{@code
 *
 *  Optional<String> opt0 = nullptr;
 *  Optional<String> opt1 = String("xyz");
 *  ICHECK(opt0 == nullptr);
 *  ICHECK(opt1 == "xyz");
 *
 * }</pre>
 */
@Name("tvm::runtime::Optional<tvm::runtime::String>") @NoOffset @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class TVMStringOptional extends ObjectRef {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TVMStringOptional(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TVMStringOptional(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TVMStringOptional position(long position) {
        return (TVMStringOptional)super.position(position);
    }
    @Override public TVMStringOptional getPointer(long i) {
        return new TVMStringOptional((Pointer)this).offsetAddress(i);
    }

  // default constructors.
  public TVMStringOptional() { super((Pointer)null); allocate(); }
  private native void allocate();
  public TVMStringOptional(@Const @ByRef TVMStringOptional arg0) { super((Pointer)null); allocate(arg0); }
  private native void allocate(@Const @ByRef TVMStringOptional arg0);
  public native @ByRef @Name("operator =") TVMStringOptional put(@Const @ByRef TVMStringOptional arg0);
  /**
   * \brief Construct from an ObjectPtr
   *        whose type already matches the ContainerType.
   * @param ptr
   */
  public TVMStringOptional(@ByVal ObjectPtr ptr) { super((Pointer)null); allocate(ptr); }
  private native void allocate(@ByVal ObjectPtr ptr);
  /** \brief Nullopt handling */
  public TVMStringOptional(@ByVal NullOptType arg0) { super((Pointer)null); allocate(arg0); }
  private native void allocate(@ByVal NullOptType arg0);  // NOLINT(*)
  // nullptr handling.
  // disallow implicit conversion as 0 can be implicitly converted to nullptr_t
  // normal value handling.
  public TVMStringOptional(@ByVal TVMString other) { super((Pointer)null); allocate(other); }
  private native void allocate(@ByVal TVMString other);
  public native @ByRef @Name("operator =") TVMStringOptional put(@ByVal TVMString other);
  // delete the int constructor
  // since Optional<Integer>(0) is ambiguious
  // 0 can be implicitly casted to nullptr_t
  
  
  /**
   * @return A not-null container value in the optional.
   * \note This function performs not-null checking.
   */
  public native @ByVal TVMString value();
  /**
   * @return The contained value if the Optional is not null
   *         otherwise return the default_value.
   */
  public native @ByVal TVMString value_or(@ByVal TVMString default_value);

  /** @return Whether the container is not nullptr.*/
  public native @Cast("bool") @Name("operator bool") boolean asBoolean();
  // operator overloadings
  @MemberGetter public static native @Cast("const bool") boolean _type_is_nullable();
  public static final boolean _type_is_nullable = _type_is_nullable();
}
