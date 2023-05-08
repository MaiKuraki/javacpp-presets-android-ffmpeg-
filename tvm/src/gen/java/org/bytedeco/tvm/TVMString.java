// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

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
 * \brief Reference to string objects.
 *
 * <pre>{@code
 *
 * // Example to create runtime String reference object from std::string
 * std::string s = "hello world";
 *
 * // You can create the reference from existing std::string
 * String ref{std::move(s)};
 *
 * // You can rebind the reference to another string.
 * ref = std::string{"hello world2"};
 *
 * // You can use the reference as hash map key
 * std::unordered_map<String, int32_t> m;
 * m[ref] = 1;
 *
 * // You can compare the reference object with other string objects
 * assert(ref == "hello world", true);
 *
 * // You can convert the reference to std::string again
 * string s2 = (string)ref;
 *
 * }</pre>
 */
@Name("tvm::runtime::String") @NoOffset @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class TVMString extends ObjectRef {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TVMString(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TVMString(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TVMString position(long position) {
        return (TVMString)super.position(position);
    }
    @Override public TVMString getPointer(long i) {
        return new TVMString((Pointer)this).offsetAddress(i);
    }

  /**
   * \brief Construct an empty string.
   */
  public TVMString() { super((Pointer)null); allocate(); }
  private native void allocate();
  /**
   * \brief Construct a new String object
   *
   * @param other The moved/copied std::string object
   *
   * \note If user passes const reference, it will trigger copy. If it's rvalue,
   * it will be moved into other.
   */
  public TVMString(@StdString BytePointer other) { super((Pointer)null); allocate(other); }
  private native void allocate(@StdString BytePointer other);
  public TVMString(@StdString String other) { super((Pointer)null); allocate(other); }
  private native void allocate(@StdString String other);  // NOLINT(*)

  /**
   * \brief Construct a new String object
   *
   * @param other a char array.
   */

  /**
   * \brief Construct a new null object
   */

  /**
   * \brief Change the value the reference object points to.
   *
   * @param other The value for the new String
   *
   */
  public native @ByRef @Name("operator =") TVMString put(@StdString BytePointer other);
  public native @ByRef @Name("operator =") TVMString put(@StdString String other);

  /**
   * \brief Change the value the reference object points to.
   *
   * @param other The value for the new String
   */

  /**
   * \brief Compares this String object to other
   *
   * @param other The String to compare with.
   *
   * @return zero if both char sequences compare equal. negative if this appear
   * before other, positive otherwise.
   */
  public native int compare(@Const @ByRef TVMString other);

  /**
   * \brief Compares this String object to other
   *
   * @param other The string to compare with.
   *
   * @return zero if both char sequences compare equal. negative if this appear
   * before other, positive otherwise.
   */
  public native int compare(@StdString BytePointer other);
  public native int compare(@StdString String other);

  /**
   * \brief Compares this to other
   *
   * @param other The character array to compare with.
   *
   * @return zero if both char sequences compare equal. negative if this appear
   * before other, positive otherwise.
   */

  /**
   * \brief Returns a pointer to the char array in the string.
   *
   * @return const char*
   */
  public native @Cast("const char*") BytePointer c_str();

  /**
   * \brief Return the length of the string
   *
   * @return size_t string length
   */
  public native @Cast("size_t") long size();

  /**
   * \brief Return the length of the string
   *
   * @return size_t string length
   */
  public native @Cast("size_t") long length();

  /**
   * \brief Retun if the string is empty
   *
   * @return true if empty, false otherwise.
   */
  public native @Cast("bool") boolean empty();

  /**
   * \brief Read an element.
   * @param pos The position at which to read the character.
   *
   * @return The char at position
   */
  public native @Cast("char") byte at(@Cast("size_t") long pos);

  /**
   * \brief Return the data pointer
   *
   * @return const char* data pointer
   */
  public native @Cast("const char*") BytePointer data();

  /**
   * \brief Convert String to an std::string object
   *
   * @return std::string
   */
  public native @Name("operator std::string") @StdString BytePointer asBytePointer();

  /**
   * \brief Check if a TVMArgValue can be converted to String, i.e. it can be std::string or String
   * @param val The value to be checked
   * @return A boolean indicating if val can be converted to String
   */
  public static native @Cast("bool") boolean CanConvertFrom(@Const @ByRef TVMArgValue val);

  /**
   * \brief Hash the binary bytes
   * @param data The data pointer
   * @param size The size of the bytes.
   * @return the hash value.
   */
  public static native @Cast("uint64_t") long StableHashBytes(@Cast("const char*") BytePointer data, @Cast("size_t") long size);
  public static native @Cast("uint64_t") long StableHashBytes(String data, @Cast("size_t") long size);

  public TVMString(@ByVal ObjectPtr n) { super((Pointer)null); allocate(n); }
  private native void allocate(@ByVal ObjectPtr n);
  public TVMString(@Const @ByRef TVMString other) { super((Pointer)null); allocate(other); }
  private native void allocate(@Const @ByRef TVMString other);
  public native @ByRef @Name("operator =") TVMString put(@Const @ByRef TVMString other);
  public native @Const @Name("operator ->") StringObj access();
  public native @Const StringObj get();
  @MemberGetter public static native @Cast("const bool") boolean _type_is_nullable();
  public static final boolean _type_is_nullable = _type_is_nullable();
}
