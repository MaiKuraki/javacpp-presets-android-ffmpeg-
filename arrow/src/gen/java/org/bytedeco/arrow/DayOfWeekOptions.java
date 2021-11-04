// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow::compute") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class DayOfWeekOptions extends FunctionOptions {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DayOfWeekOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DayOfWeekOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public DayOfWeekOptions position(long position) {
        return (DayOfWeekOptions)super.position(position);
    }
    @Override public DayOfWeekOptions getPointer(long i) {
        return new DayOfWeekOptions((Pointer)this).offsetAddress(i);
    }

  public DayOfWeekOptions(@Cast("bool") boolean count_from_zero/*=true*/, @Cast("uint32_t") int week_start/*=1*/) { super((Pointer)null); allocate(count_from_zero, week_start); }
  private native void allocate(@Cast("bool") boolean count_from_zero/*=true*/, @Cast("uint32_t") int week_start/*=1*/);
  public DayOfWeekOptions() { super((Pointer)null); allocate(); }
  private native void allocate();
  @MemberGetter public static native byte kTypeName(int i);
  @MemberGetter public static native String kTypeName();
  public static native @ByVal DayOfWeekOptions Defaults();

  /** Number days from 0 if true and from 1 if false */
  public native @Cast("bool") boolean count_from_zero(); public native DayOfWeekOptions count_from_zero(boolean setter);
  /** What day does the week start with (Monday=1, Sunday=7).
   *  The numbering is unaffected by the count_from_zero parameter. */
  public native @Cast("uint32_t") int week_start(); public native DayOfWeekOptions week_start(int setter);
}
