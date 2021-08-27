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

@Namespace("c10") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ListType extends ListSingleElementType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ListType(Pointer p) { super(p); }

  // It's not exactly a singleton, but there should be exactly one instance of
  // List[T] for every T

  public native @StdString BytePointer str();
  public native @SharedPtr @ByVal Type createWithContained(
        @ByVal TypeVector contained_types);

  public native @Cast("bool") boolean isSubtypeOfExt(@Const @SharedPtr @ByRef Type rhs, @Cast("std::ostream*") Pointer why_not);

  // common cast List[Tensor]
  public static native @SharedPtr ListType ofTensors();
  public static native @SharedPtr ListType ofInts();
  public static native @SharedPtr ListType ofFloats();
  public static native @SharedPtr ListType ofComplexDoubles();
  public static native @SharedPtr ListType ofBools();
  public static native @SharedPtr ListType ofStrings();
}
