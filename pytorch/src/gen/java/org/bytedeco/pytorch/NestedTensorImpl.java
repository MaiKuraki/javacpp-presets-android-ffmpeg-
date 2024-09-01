// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;


@Namespace("at::native") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class NestedTensorImpl extends TensorImpl {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NestedTensorImpl(Pointer p) { super(p); }

  public NestedTensorImpl(
        @ByVal Storage storage,
        @ByVal DispatchKeySet key_set,
        @Const @ByVal TypeMeta data_type,
        @ByVal Tensor nested_sizes,
        @ByVal Tensor nested_strides,
        @ByVal Tensor storage_offsets) { super((Pointer)null); allocate(storage, key_set, data_type, nested_sizes, nested_strides, storage_offsets); }
  private native void allocate(
        @ByVal Storage storage,
        @ByVal DispatchKeySet key_set,
        @Const @ByVal TypeMeta data_type,
        @ByVal Tensor nested_sizes,
        @ByVal Tensor nested_strides,
        @ByVal Tensor storage_offsets);

  public NestedTensorImpl(
        @Const @ByRef Tensor buffer,
        @ByVal Tensor nested_sizes,
        @ByVal Tensor nested_strides,
        @ByVal Tensor storage_offsets) { super((Pointer)null); allocate(buffer, nested_sizes, nested_strides, storage_offsets); }
  private native void allocate(
        @Const @ByRef Tensor buffer,
        @ByVal Tensor nested_sizes,
        @ByVal Tensor nested_strides,
        @ByVal Tensor storage_offsets);
  // assume contiguous, `nested_strides` and `offsets`
  // can be infered from `nested_sizes`
  public NestedTensorImpl(
        @Const @ByRef Tensor buffer,
        @Const @ByRef Tensor nested_sizes) { super((Pointer)null); allocate(buffer, nested_sizes); }
  private native void allocate(
        @Const @ByRef Tensor buffer,
        @Const @ByRef Tensor nested_sizes);

  // This constructor is used creating view tensors from nested tensors
  public NestedTensorImpl(
        TensorImpl.ImplType impl_type,
        @Const @ByRef Tensor base_tensor,
        @ByVal Tensor nested_sizes,
        @ByVal Tensor nested_strides,
        @ByVal Tensor storage_offsets) { super((Pointer)null); allocate(impl_type, base_tensor, nested_sizes, nested_strides, storage_offsets); }
  private native void allocate(
        TensorImpl.ImplType impl_type,
        @Const @ByRef Tensor base_tensor,
        @ByVal Tensor nested_sizes,
        @ByVal Tensor nested_strides,
        @ByVal Tensor storage_offsets);
  public NestedTensorImpl(
        @Cast("c10::TensorImpl::ImplType") int impl_type,
        @Const @ByRef Tensor base_tensor,
        @ByVal Tensor nested_sizes,
        @ByVal Tensor nested_strides,
        @ByVal Tensor storage_offsets) { super((Pointer)null); allocate(impl_type, base_tensor, nested_sizes, nested_strides, storage_offsets); }
  private native void allocate(
        @Cast("c10::TensorImpl::ImplType") int impl_type,
        @Const @ByRef Tensor base_tensor,
        @ByVal Tensor nested_sizes,
        @ByVal Tensor nested_strides,
        @ByVal Tensor storage_offsets);

  // TODO: don't expose private implementation details like this; in
  // particular, resizing this tensor will mess up our dim() and
  // callers cannot fix it.
  public native @Const @ByRef Tensor get_nested_sizes();
  // TODO: don't expose private implementation details like this
  public native @Const @ByRef Tensor get_nested_strides();
  public native @Const @ByRef Tensor get_storage_offsets();
  // Returns nullopt if the ith dimension is irregular. The ith dimension
  // of a NestedTensor is regular if the unbound tensors match in
  // size at the (i-1)th dimension.
  public native @ByVal LongOptional opt_size(@Cast("int64_t") long d);

  public native @Cast("int64_t") long size(@Cast("int64_t") long d);
  /**
   * Return a view of the nested tensor as a 1 dimensional contiguous tensor.
   *
   * The buffer tensor created by this function shares the same storage_impl as
   * the original nested tensor, and therefore can be seen as a view.
   *
   * @return A newly constructed view tensor
   */
  public native @ByVal Tensor get_buffer();
  /**
   * If possible use get_buffer() instead. This function returns the storage
   * as a tensor directly, which is not safe to use in general. If using this
   * function, The caller must ensure to account for nested_sizes,
   * nested_strides and storage_offsets.
   *
   * @return A newly constructed view tensor
   */
  public native @ByVal Tensor get_unsafe_storage_as_tensor();

  public native @Cast("size_t") long get_buffer_size();
}
