// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Control count aggregate kernel behavior.
 * 
 *  By default, only non-null values are counted. */
@Namespace("arrow::compute") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class CountOptions extends FunctionOptions {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CountOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CountOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CountOptions position(long position) {
        return (CountOptions)super.position(position);
    }
    @Override public CountOptions getPointer(long i) {
        return new CountOptions((Pointer)this).offsetAddress(i);
    }

  public enum CountMode {
    /** Count only non-null values. */
    ONLY_VALID(0),
    /** Count only null values. */
    ONLY_NULL(1),
    /** Count both non-null and null values. */
    ALL(2);

      public final int value;
      private CountMode(int v) { this.value = v; }
      private CountMode(CountMode e) { this.value = e.value; }
      public CountMode intern() { for (CountMode e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }
  public CountOptions(CountMode mode/*=arrow::compute::CountOptions::CountMode::ONLY_VALID*/) { super((Pointer)null); allocate(mode); }
  private native void allocate(CountMode mode/*=arrow::compute::CountOptions::CountMode::ONLY_VALID*/);
  public CountOptions() { super((Pointer)null); allocate(); }
  private native void allocate();
  public CountOptions(@Cast("arrow::compute::CountOptions::CountMode") int mode/*=arrow::compute::CountOptions::CountMode::ONLY_VALID*/) { super((Pointer)null); allocate(mode); }
  private native void allocate(@Cast("arrow::compute::CountOptions::CountMode") int mode/*=arrow::compute::CountOptions::CountMode::ONLY_VALID*/);
  @MemberGetter public static native byte kTypeName(int i);
  @MemberGetter public static native String kTypeName();
  public static native @ByVal CountOptions Defaults();

  public native CountMode mode(); public native CountOptions mode(CountMode setter);
}
