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


/** Represents a particular input of a function. */
@Namespace("torch::autograd") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Edge extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Edge(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Edge(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Edge position(long position) {
        return (Edge)super.position(position);
    }
    @Override public Edge getPointer(long i) {
        return new Edge((Pointer)this).offsetAddress(i);
    }

  public Edge() { super((Pointer)null); allocate(); }
  @NoException(true) private native void allocate();

  public Edge(@SharedPtr Node function_, @Cast("uint32_t") int input_nr_) { super((Pointer)null); allocate(function_, input_nr_); }
  @NoException(true) private native void allocate(@SharedPtr Node function_, @Cast("uint32_t") int input_nr_);

  /** Convenience method to test if an edge is valid. */
  public native @Cast("bool") @NoException(true) boolean is_valid();

  // Required for use in associative containers.
  public native @Cast("bool") @Name("operator ==") @NoException(true) boolean equals(@Const @ByRef Edge other);

  public native @Cast("bool") @Name("operator !=") @NoException(true) boolean notEquals(@Const @ByRef Edge other);

  /** The function this {@code Edge} points to. */
  public native @SharedPtr Node function(); public native Edge function(Node setter);

  /** The identifier of a particular input to the function. */
  public native @Cast("uint32_t") int input_nr(); public native Edge input_nr(int setter);
}
