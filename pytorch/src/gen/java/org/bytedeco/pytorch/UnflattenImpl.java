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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Unflatten ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** A placeholder for unflatten operator
 *  See https://pytorch.org/docs/master/generated/torch.nn.Unflatten.html to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::UnflattenOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  Unflatten model(UnflattenOptions(0, {2, 2}));
 *  Unflatten model(UnflattenOptions("B", {{"B1", 2}, {"B2", 2}}));
 *  }</pre> */
// NOLINTNEXTLINE(bugprone-exception-escape)
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class UnflattenImpl extends UnflattenImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UnflattenImpl(Pointer p) { super(p); }

  public UnflattenImpl(@Cast("int64_t") long dim, @ByVal @Cast("std::vector<int64_t>*") LongVector sizes) { super((Pointer)null); allocate(dim, sizes); }
  @NoDeallocator private native void allocate(@Cast("int64_t") long dim, @ByVal @Cast("std::vector<int64_t>*") LongVector sizes);
  public UnflattenImpl(@StdString BytePointer dimname, @ByVal @Cast("torch::nn::UnflattenOptions::namedshape_t*") StringLongVector namedshape) { super((Pointer)null); allocate(dimname, namedshape); }
  @NoDeallocator private native void allocate(@StdString BytePointer dimname, @ByVal @Cast("torch::nn::UnflattenOptions::namedshape_t*") StringLongVector namedshape);
  public UnflattenImpl(@StdString String dimname, @ByVal @Cast("torch::nn::UnflattenOptions::namedshape_t*") StringLongVector namedshape) { super((Pointer)null); allocate(dimname, namedshape); }
  @NoDeallocator private native void allocate(@StdString String dimname, @ByVal @Cast("torch::nn::UnflattenOptions::namedshape_t*") StringLongVector namedshape);
  public UnflattenImpl(@ByVal UnflattenOptions options_) { super((Pointer)null); allocate(options_); }
  @NoDeallocator private native void allocate(@ByVal UnflattenOptions options_);

  public native void reset();

  /** Pretty prints the {@code Unflatten} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  /** Applies an unflatten transform on the {@code input}. */
  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  /** The options used to configure this module. */
  public native @ByRef UnflattenOptions options(); public native UnflattenImpl options(UnflattenOptions setter);
}
