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

// This type represents an optional type, for each element type.
// Optional[T] can accept both T and None(nullopt in C++)
// Subtype hierarchy for Optional:
// 1. Optional[T] <: Optional[R] iff T <: R
// 2. T <: Optional[R] if T <: R
// 3. None <: Optional[T] for all T
@Namespace("c10") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class OptionalType extends OptionalSingleElementType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OptionalType(Pointer p) { super(p); }

  public static native @SharedPtr OptionalType create(@SharedPtr @ByVal Type element);

  public native @StdString BytePointer str();

  public native @SharedPtr @ByVal Type createWithContained(
        @ByVal TypeVector contained_types);

  public native @Cast("bool") boolean isSubtypeOfExt(@Const @SharedPtr @ByRef Type rhs, @Cast("std::ostream*") Pointer why_not);
  // common cast Optional[Tensor] for undefined tensor type
  public static native @SharedPtr OptionalType ofTensor();
}
