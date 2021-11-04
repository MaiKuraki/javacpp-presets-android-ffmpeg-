// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Control Quantile kernel behavior
 * 
 *  By default, returns the median value. */
@Namespace("arrow::compute") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class QuantileOptions extends FunctionOptions {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QuantileOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public QuantileOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public QuantileOptions position(long position) {
        return (QuantileOptions)super.position(position);
    }
    @Override public QuantileOptions getPointer(long i) {
        return new QuantileOptions((Pointer)this).offsetAddress(i);
    }

  /** Interpolation method to use when quantile lies between two data points */
  public enum Interpolation {
    LINEAR(0),
    LOWER(1),
    HIGHER(2),
    NEAREST(3),
    MIDPOINT(4);

      public final int value;
      private Interpolation(int v) { this.value = v; }
      private Interpolation(Interpolation e) { this.value = e.value; }
      public Interpolation intern() { for (Interpolation e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }

  public QuantileOptions(double q/*=0.5*/, Interpolation interpolation/*=arrow::compute::QuantileOptions::LINEAR*/,
                             @Cast("bool") boolean skip_nulls/*=true*/, @Cast("uint32_t") int min_count/*=0*/) { super((Pointer)null); allocate(q, interpolation, skip_nulls, min_count); }
  private native void allocate(double q/*=0.5*/, Interpolation interpolation/*=arrow::compute::QuantileOptions::LINEAR*/,
                             @Cast("bool") boolean skip_nulls/*=true*/, @Cast("uint32_t") int min_count/*=0*/);
  public QuantileOptions() { super((Pointer)null); allocate(); }
  private native void allocate();
  public QuantileOptions(double q/*=0.5*/, @Cast("arrow::compute::QuantileOptions::Interpolation") int interpolation/*=arrow::compute::QuantileOptions::LINEAR*/,
                             @Cast("bool") boolean skip_nulls/*=true*/, @Cast("uint32_t") int min_count/*=0*/) { super((Pointer)null); allocate(q, interpolation, skip_nulls, min_count); }
  private native void allocate(double q/*=0.5*/, @Cast("arrow::compute::QuantileOptions::Interpolation") int interpolation/*=arrow::compute::QuantileOptions::LINEAR*/,
                             @Cast("bool") boolean skip_nulls/*=true*/, @Cast("uint32_t") int min_count/*=0*/);

  public QuantileOptions(@StdVector DoublePointer q,
                             Interpolation interpolation/*=arrow::compute::QuantileOptions::LINEAR*/,
                             @Cast("bool") boolean skip_nulls/*=true*/, @Cast("uint32_t") int min_count/*=0*/) { super((Pointer)null); allocate(q, interpolation, skip_nulls, min_count); }
  private native void allocate(@StdVector DoublePointer q,
                             Interpolation interpolation/*=arrow::compute::QuantileOptions::LINEAR*/,
                             @Cast("bool") boolean skip_nulls/*=true*/, @Cast("uint32_t") int min_count/*=0*/);
  public QuantileOptions(@StdVector DoublePointer q) { super((Pointer)null); allocate(q); }
  private native void allocate(@StdVector DoublePointer q);
  public QuantileOptions(@StdVector DoubleBuffer q,
                             @Cast("arrow::compute::QuantileOptions::Interpolation") int interpolation/*=arrow::compute::QuantileOptions::LINEAR*/,
                             @Cast("bool") boolean skip_nulls/*=true*/, @Cast("uint32_t") int min_count/*=0*/) { super((Pointer)null); allocate(q, interpolation, skip_nulls, min_count); }
  private native void allocate(@StdVector DoubleBuffer q,
                             @Cast("arrow::compute::QuantileOptions::Interpolation") int interpolation/*=arrow::compute::QuantileOptions::LINEAR*/,
                             @Cast("bool") boolean skip_nulls/*=true*/, @Cast("uint32_t") int min_count/*=0*/);
  public QuantileOptions(@StdVector DoubleBuffer q) { super((Pointer)null); allocate(q); }
  private native void allocate(@StdVector DoubleBuffer q);
  public QuantileOptions(@StdVector double[] q,
                             Interpolation interpolation/*=arrow::compute::QuantileOptions::LINEAR*/,
                             @Cast("bool") boolean skip_nulls/*=true*/, @Cast("uint32_t") int min_count/*=0*/) { super((Pointer)null); allocate(q, interpolation, skip_nulls, min_count); }
  private native void allocate(@StdVector double[] q,
                             Interpolation interpolation/*=arrow::compute::QuantileOptions::LINEAR*/,
                             @Cast("bool") boolean skip_nulls/*=true*/, @Cast("uint32_t") int min_count/*=0*/);
  public QuantileOptions(@StdVector double[] q) { super((Pointer)null); allocate(q); }
  private native void allocate(@StdVector double[] q);
  public QuantileOptions(@StdVector DoublePointer q,
                             @Cast("arrow::compute::QuantileOptions::Interpolation") int interpolation/*=arrow::compute::QuantileOptions::LINEAR*/,
                             @Cast("bool") boolean skip_nulls/*=true*/, @Cast("uint32_t") int min_count/*=0*/) { super((Pointer)null); allocate(q, interpolation, skip_nulls, min_count); }
  private native void allocate(@StdVector DoublePointer q,
                             @Cast("arrow::compute::QuantileOptions::Interpolation") int interpolation/*=arrow::compute::QuantileOptions::LINEAR*/,
                             @Cast("bool") boolean skip_nulls/*=true*/, @Cast("uint32_t") int min_count/*=0*/);
  public QuantileOptions(@StdVector DoubleBuffer q,
                             Interpolation interpolation/*=arrow::compute::QuantileOptions::LINEAR*/,
                             @Cast("bool") boolean skip_nulls/*=true*/, @Cast("uint32_t") int min_count/*=0*/) { super((Pointer)null); allocate(q, interpolation, skip_nulls, min_count); }
  private native void allocate(@StdVector DoubleBuffer q,
                             Interpolation interpolation/*=arrow::compute::QuantileOptions::LINEAR*/,
                             @Cast("bool") boolean skip_nulls/*=true*/, @Cast("uint32_t") int min_count/*=0*/);
  public QuantileOptions(@StdVector double[] q,
                             @Cast("arrow::compute::QuantileOptions::Interpolation") int interpolation/*=arrow::compute::QuantileOptions::LINEAR*/,
                             @Cast("bool") boolean skip_nulls/*=true*/, @Cast("uint32_t") int min_count/*=0*/) { super((Pointer)null); allocate(q, interpolation, skip_nulls, min_count); }
  private native void allocate(@StdVector double[] q,
                             @Cast("arrow::compute::QuantileOptions::Interpolation") int interpolation/*=arrow::compute::QuantileOptions::LINEAR*/,
                             @Cast("bool") boolean skip_nulls/*=true*/, @Cast("uint32_t") int min_count/*=0*/);

  @MemberGetter public static native byte kTypeName(int i);
  @MemberGetter public static native String kTypeName();
  public static native @ByVal QuantileOptions Defaults();

  /** quantile must be between 0 and 1 inclusive */
  public native @StdVector DoublePointer q(); public native QuantileOptions q(DoublePointer setter);
  public native Interpolation interpolation(); public native QuantileOptions interpolation(Interpolation setter);
  /** If true (the default), null values are ignored. Otherwise, if any value is null,
   *  emit null. */
  public native @Cast("bool") boolean skip_nulls(); public native QuantileOptions skip_nulls(boolean setter);
  /** If less than this many non-null values are observed, emit null. */
  public native @Cast("uint32_t") int min_count(); public native QuantileOptions min_count(int setter);
}
