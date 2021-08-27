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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Flatten ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** A placeholder for Flatten operator
 *  See https://pytorch.org/docs/master/generated/torch.nn.Flatten.html to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::FlattenOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  Flatten model(FlattenOptions().start_dim(2).end_dim(4));
 *  }</pre> */
// NOLINTNEXTLINE(bugprone-exception-escape)
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class FlattenImpl extends FlattenImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FlattenImpl(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FlattenImpl(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public FlattenImpl position(long position) {
        return (FlattenImpl)super.position(position);
    }
    @Override public FlattenImpl getPointer(long i) {
        return new FlattenImpl((Pointer)this).offsetAddress(i);
    }

  public FlattenImpl(@Const @ByRef(nullValue = "torch::nn::FlattenOptions{}") FlattenOptions options_) { super((Pointer)null); allocate(options_); }
  @NoDeallocator private native void allocate(@Const @ByRef(nullValue = "torch::nn::FlattenOptions{}") FlattenOptions options_);
  public FlattenImpl() { super((Pointer)null); allocate(); }
  @NoDeallocator private native void allocate();

  public native void reset();

  /** Pretty prints the {@code Flatten} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  /** Applies a flatten transform on the {@code input}. */
  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  /** The options used to configure this module. */
  public native @ByRef FlattenOptions options(); public native FlattenImpl options(FlattenOptions setter);
}
