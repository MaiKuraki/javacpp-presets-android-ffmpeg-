// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Create a generator that takes in a stream of generators and pulls from each
 *  one in sequence.
 * 
 *  This generator is async-reentrant but will never pull from source reentrantly and
 *  will never pull from any subscription reentrantly.
 * 
 *  This generator may queue 1 instance of T
 * 
 *  TODO: Could potentially make a bespoke implementation instead of MergedGenerator that
 *  forwards async-reentrant requests instead of buffering them (which is what
 *  MergedGenerator does) */

@Name("arrow::Enumerated<std::shared_ptr<arrow::RecordBatch> >") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class RecordBatchEnumerated extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public RecordBatchEnumerated() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RecordBatchEnumerated(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RecordBatchEnumerated(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public RecordBatchEnumerated position(long position) {
        return (RecordBatchEnumerated)super.position(position);
    }
    @Override public RecordBatchEnumerated getPointer(long i) {
        return new RecordBatchEnumerated((Pointer)this).offsetAddress(i);
    }

  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::RecordBatch>"}) RecordBatch value(); public native RecordBatchEnumerated value(RecordBatch setter);
  public native int index(); public native RecordBatchEnumerated index(int setter);
  public native @Cast("bool") boolean last(); public native RecordBatchEnumerated last(boolean setter);
}
