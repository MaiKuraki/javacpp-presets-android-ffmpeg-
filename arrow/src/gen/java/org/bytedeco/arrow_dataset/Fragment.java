// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;


/** \brief A granular piece of a Dataset, such as an individual file, which can be
 *  read/scanned separately from other fragments.
 * 
 *  A Fragment yields a collection of RecordBatch, encapsulated in one or more ScanTasks. */
@Namespace("arrow::dataset") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class Fragment extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Fragment(Pointer p) { super(p); }

  /** \brief Scan returns an iterator of ScanTasks, each of which yields
   *  RecordBatches from this Fragment.
   * 
   *  Note that batches yielded using this method will not be filtered and may not align
   *  with the Fragment's schema. In particular, note that columns referenced by the
   *  filter may be present in yielded batches even if they are not projected (so that
   *  they are available when a filter is applied). Additionally, explicitly projected
   *  columns may be absent if they were not present in this fragment.
   * 
   *  To receive a record batch stream which is fully filtered and projected, use Scanner. */
  public native @ByVal ScanTaskIteratorResult Scan(@SharedPtr ScanContext context);

  /** \brief Return true if the fragment can benefit from parallel scanning. */
  public native @Cast("bool") boolean splittable();

  public native @StdString String type_name();

  /** \brief Filtering, schema reconciliation, and partition options to use when
   *  scanning this fragment. */
  public native @SharedPtr ScanOptions scan_options();

  public native @Const @SharedPtr @ByRef Schema schema();

  /** \brief An expression which evaluates to true for all data viewed by this
   *  Fragment. */
  public native @Const @SharedPtr @ByRef Expression partition_expression();
}
