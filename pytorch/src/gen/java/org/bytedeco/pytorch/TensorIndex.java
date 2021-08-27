// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// `at::indexing::TensorIndex` is used for converting C++ tensor indices such as
// `{None, "...", Ellipsis, 0, true, Slice(1, None, 2), torch::tensor({1, 2})}`
// into its equivalent `std::vector<TensorIndex>`, so that further tensor indexing
// operations can be performed using the supplied indices.
//
// There is one-to-one correspondence between Python and C++ tensor index types:
// Python                  | C++
// -----------------------------------------------------
// `None`                  | `at::indexing::None`
// `Ellipsis`              | `at::indexing::Ellipsis`
// `...`                   | `"..."`
// `123`                   | `123`
// `True` / `False`        | `true` / `false`
// `:`                     | `Slice()` / `Slice(None, None)`
// `::`                    | `Slice()` / `Slice(None, None, None)`
// `1:`                    | `Slice(1, None)`
// `1::`                   | `Slice(1, None, None)`
// `:3`                    | `Slice(None, 3)`
// `:3:`                   | `Slice(None, 3, None)`
// `::2`                   | `Slice(None, None, 2)`
// `1:3`                   | `Slice(1, 3)`
// `1::2`                  | `Slice(1, None, 2)`
// `:3:2`                  | `Slice(None, 3, 2)`
// `1:3:2`                 | `Slice(1, 3, 2)`
// `torch.tensor([1, 2])`) | `torch::tensor({1, 2})`
@Namespace("at::indexing") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TensorIndex extends Pointer {
    static { Loader.load(); }

  // Case 1: `at::indexing::None`
  // NOLINTNEXTLINE(clang-analyzer-optin.cplusplus.UninitializedObject)
  public TensorIndex() { super((Pointer)null); allocate(); }
  private native void allocate();

  public TensorIndex(@ByVal @Cast("c10::nullopt_t*") Pointer arg0) { super((Pointer)null); allocate(arg0); }
  private native void allocate(@ByVal @Cast("c10::nullopt_t*") Pointer arg0);

  // Case 2: "..." / `at::indexing::Ellipsis`
  // NOLINTNEXTLINE(clang-analyzer-optin.cplusplus.UninitializedObject)
  public TensorIndex(@ByVal EllipsisIndexType arg0) { super((Pointer)null); allocate(arg0); }
  private native void allocate(@ByVal EllipsisIndexType arg0);
  public TensorIndex(@Cast("const char*") BytePointer str) { super((Pointer)null); allocate(str); }
  private native void allocate(@Cast("const char*") BytePointer str);
  public TensorIndex(String str) { super((Pointer)null); allocate(str); }
  private native void allocate(String str);

  // Case 3: Integer value
  // NOLINTNEXTLINE(clang-analyzer-optin.cplusplus.UninitializedObject)
  public TensorIndex(@Cast("int64_t") long integer) { super((Pointer)null); allocate(integer); }
  private native void allocate(@Cast("int64_t") long integer);
  // NOLINTNEXTLINE(clang-analyzer-optin.cplusplus.UninitializedObject)
  public TensorIndex(int integer) { super((Pointer)null); allocate(integer); }
  private native void allocate(int integer);

  // Case 4: Boolean value

  // Case 5: Slice represented in `at::indexing::Slice` form
  // NOLINTNEXTLINE(clang-analyzer-optin.cplusplus.UninitializedObject)
  public TensorIndex(@ByVal Slice slice) { super((Pointer)null); allocate(slice); }
  private native void allocate(@ByVal Slice slice);

  // Case 6: Tensor value
  // NOLINTNEXTLINE(clang-analyzer-optin.cplusplus.UninitializedObject)
  public TensorIndex(@ByVal Tensor tensor) { super((Pointer)null); allocate(tensor); }
  private native void allocate(@ByVal Tensor tensor);

  public native @Cast("bool") boolean is_none();

  public native @Cast("bool") boolean is_ellipsis();

  public native @Cast("bool") boolean is_integer();

  public native @Cast("int64_t") long integer();

  public native @Cast("bool") boolean is_boolean();

  public native @Cast("bool") @Name("boolean") boolean _boolean();

  public native @Cast("bool") boolean is_slice();

  public native @Const @ByRef Slice slice();

  public native @Cast("bool") boolean is_tensor();

  public native @Const @ByRef Tensor tensor();
}
