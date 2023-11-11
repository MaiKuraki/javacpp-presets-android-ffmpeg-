// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/**
 * H5AC_cache_config_t is a public structure intended for use in public APIs.
 * At least in its initial incarnation, it is basically a copy of \c struct
 * \c H5C_auto_size_ctl_t, minus the \c report_fcn field, and plus the
 * \c dirty_bytes_threshold field.
 *
 * The \c report_fcn field is omitted, as including it would require us to make
 * \c H5C_t structure public.
 *
 * The \c dirty_bytes_threshold field does not appear in \c H5C_auto_size_ctl_t,
 * as synchronization between caches on different processes is handled at the \c
 * H5AC level, not at the level of \c H5C.  Note however that there is
 * considerable interaction between this value and the other fields in this
 * structure.
 *
 * Similarly, the \c open_trace_file, \c close_trace_file, and \c
 * trace_file_name fields do not appear in \c H5C_auto_size_ctl_t, as most trace
 * file issues are handled at the \c H5AC level.  The one exception is storage
 * of the pointer to the trace file, which is handled by \c H5C.
 *
 * The structure is in H5ACpublic.h as we may wish to allow different
 * configuration options for metadata and raw data caches.
 */

/** <!-- [H5AC_cache_config_t_snip] --> */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5AC_cache_config_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public H5AC_cache_config_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public H5AC_cache_config_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public H5AC_cache_config_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public H5AC_cache_config_t position(long position) {
        return (H5AC_cache_config_t)super.position(position);
    }
    @Override public H5AC_cache_config_t getPointer(long i) {
        return new H5AC_cache_config_t((Pointer)this).offsetAddress(i);
    }

    /* general configuration fields: */
    /** <!-- [H5AC_cache_config_t_general_snip] --> */
    
    /** Integer field indicating the version of the H5AC_cache_config_t
         * in use. This field should be set to #H5AC__CURR_CACHE_CONFIG_VERSION
         * (defined in H5ACpublic.h). */
    public native int version(); public native H5AC_cache_config_t version(int setter);

    
    /** Boolean flag indicating whether the adaptive cache resize report
         * function is enabled. This field should almost always be set to disabled
         * (0). Since resize algorithm activity is reported via stdout, it MUST be
         * set to disabled (0) on Windows machines.\n
         * The report function is not supported code, and can be expected to change
         * between versions of the library. Use it at your own risk. */
    public native @Cast("hbool_t") boolean rpt_fcn_enabled(); public native H5AC_cache_config_t rpt_fcn_enabled(boolean setter);

    
    /** Boolean field indicating whether the
         * \ref H5AC_cache_config_t.trace_file_name "trace_file_name"
         * field should be used to open a trace file for the cache.\n
         * The trace file is a debugging feature that allows the capture
         * of top level metadata cache requests for purposes of debugging
         * and/or optimization. This field should normally be set to 0, as
         * trace file collection imposes considerable overhead.\n
         * This field should only be set to 1 when the
         * \ref H5AC_cache_config_t.trace_file_name "trace_file_name"
         * contains the full path of the desired trace file, and either
         * there is no open trace file on the cache, or the
         * \ref H5AC_cache_config_t.close_trace_file "close_trace_file"
         * field is also 1.\n
         * The trace file feature is unsupported unless used at the
         * direction of The HDF Group. It is intended to allow The HDF
         * Group to collect a trace of cache activity in cases of occult
         * failures and/or poor performance seen in the field, so as to aid
         * in reproduction in the lab. If you use it absent the direction
         * of The HDF Group, you are on your own. */
    public native @Cast("hbool_t") boolean open_trace_file(); public native H5AC_cache_config_t open_trace_file(boolean setter);

    
    /** Boolean field indicating whether the current trace file
         *(if any) should be closed.\n
         * See the above comments on the \ref H5AC_cache_config_t.open_trace_file
         * "open_trace_file" field. This field should be set to 0 unless there is
         * an open trace file on the cache that you wish to close.\n
         * The trace file feature is unsupported unless used at the direction of
         * The HDF Group. It is intended to allow The HDF Group to collect a trace
         * of cache activity in cases of occult failures and/or poor performance
         * seen in the field, so as to aid in reproduction in the lab. If you use
         * it absent the direction of The HDF Group, you are on your own. */
    public native @Cast("hbool_t") boolean close_trace_file(); public native H5AC_cache_config_t close_trace_file(boolean setter);

    
    /** Full path of the trace file to be opened if the
         * \ref H5AC_cache_config_t.open_trace_file "open_trace_file" field is set
         * to 1.\n
         * In the parallel case, an ascii representation of the MPI rank of the
         * process will be appended to the file name to yield a unique trace file
         * name for each process.\n
         * The length of the path must not exceed #H5AC__MAX_TRACE_FILE_NAME_LEN
         * characters.\n
         * The trace file feature is unsupported unless used at the direction of
         * The HDF Group. It is intended to allow The HDF Group to collect a trace
         * of cache activity in cases of occult failures and/or poor performance
         * seen in the field, so as to aid in reproduction in the lab. If you use
         * it absent the direction of The HDF Group, you are on your own. */
    public native @Cast("char") byte trace_file_name(int i); public native H5AC_cache_config_t trace_file_name(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer trace_file_name();

    
    /** A boolean flag indicating whether evictions from the metadata cache
         * are enabled. This flag is initially set to enabled (1).\n
         * In rare circumstances, the raw data throughput quirements may be so high
         * that the user wishes to postpone metadata writes so as to reserve I/O
         * throughput for raw data. The \p evictions_enabled field exists to allow
         * this. However, this is an extreme step, and you have no business doing
         * it unless you have read the User Guide section on metadata caching, and
         * have considered all other options carefully.\n
         * The \p evictions_enabled field may not be set to disabled (0)
         * unless all adaptive cache resizing code is disabled via the
         * \ref H5AC_cache_config_t.incr_mode "incr_mode",
         * \ref H5AC_cache_config_t.flash_incr_mode "flash_incr_mode",
         * \ref H5AC_cache_config_t.decr_mode "decr_mode" fields.\n
         * When this flag is set to disabled (\c 0), the metadata cache will not
         * attempt to evict entries to make space for new entries, and thus will
         * grow without bound.\n
         * Evictions will be re-enabled when this field is set back to \c 1.
         * This should be done as soon as possible. */
    public native @Cast("hbool_t") boolean evictions_enabled(); public native H5AC_cache_config_t evictions_enabled(boolean setter);

    
    /** Boolean flag indicating whether the cache should be created
         * with a user specified initial size. */
    public native @Cast("hbool_t") boolean set_initial_size(); public native H5AC_cache_config_t set_initial_size(boolean setter);

    
    /** If \ref H5AC_cache_config_t.set_initial_size "set_initial_size"
         * is set to 1, \p initial_size must contain he desired initial size in
         * bytes. This value must lie in the closed interval
         * [ \p min_size, \p max_size ]. (see below) */
    public native @Cast("size_t") long initial_size(); public native H5AC_cache_config_t initial_size(long setter);

    
    /** This field specifies the minimum fraction of the cache
         * that must be kept either clean or empty.\n
         * The value must lie in the interval [0.0, 1.0]. 0.01 is a good place to
         * start in the serial case. In the parallel case, a larger value is needed
         * -- see the overview of the metadata cache in the
         * “Metadata Caching in HDF5” section of the -- <em>\ref UG</em>
         * for details. */
    public native double min_clean_fraction(); public native H5AC_cache_config_t min_clean_fraction(double setter);

    
    /** Upper bound (in bytes) on the range of values that the
         * adaptive cache resize code can select as the maximum cache size. */
    public native @Cast("size_t") long max_size(); public native H5AC_cache_config_t max_size(long setter);

    
    /** Lower bound (in bytes) on the range of values that the
         * adaptive cache resize code can select as the minimum cache * size. */
    public native @Cast("size_t") long min_size(); public native H5AC_cache_config_t min_size(long setter);

    
    /** Number of cache accesses between runs of the adaptive cache resize
         * code. 50,000 is a good starting number. */
    public native long epoch_length(); public native H5AC_cache_config_t epoch_length(long setter);
    /** <!-- [H5AC_cache_config_t_general_snip] --> */

    /* size increase control fields: */
    /** <!-- [H5AC_cache_config_t_incr_snip] --> */
    
    /** Enumerated value indicating the operational mode of the automatic
         * cache size increase code. At present, only two values listed in
         * #H5C_cache_incr_mode are legal. */
    public native @Cast("H5C_cache_incr_mode") int incr_mode(); public native H5AC_cache_config_t incr_mode(int setter);

    
    /** Hit rate threshold used by the hit rate threshold cache size
         * increment algorithm.\n
         * When the hit rate over an epoch is below this threshold and the cache
         * is full, the maximum size of the cache is multiplied by increment
         * (below), and then clipped as necessary to stay within \p max_size, and
         * possibly \p max_increment.\n
         * This field must lie in the interval [0.0, 1.0]. 0.8 or 0.9 is a good
         * place to start. */
    public native double lower_hr_threshold(); public native H5AC_cache_config_t lower_hr_threshold(double setter);

    
    /** Factor by which the hit rate threshold cache size increment
         * algorithm multiplies the current cache max size to obtain a tentative
         * new cache size.\n
         * The actual cache size increase will be clipped to satisfy the \p max_size
         * specified in the general configuration, and possibly max_increment
         * below.\n
         * The parameter must be greater than or equal to 1.0 -- 2.0 is a reasonable
         * value.\n
         * If you set it to 1.0, you will effectively disable cache size increases.
         */
    public native double increment(); public native H5AC_cache_config_t increment(double setter);

    
    /** Boolean flag indicating whether an upper limit should be applied to
         * the size of cache size increases. */
    public native @Cast("hbool_t") boolean apply_max_increment(); public native H5AC_cache_config_t apply_max_increment(boolean setter);

    
    /** Maximum number of bytes by which cache size can be increased in a
         * single step -- if applicable. */
    public native @Cast("size_t") long max_increment(); public native H5AC_cache_config_t max_increment(long setter);

    
    /** Enumerated value indicating the operational mode of the flash cache
         * size increase code. At present, only two listed  values in
         * #H5C_cache_flash_incr_mode are legal.*/
    public native @Cast("H5C_cache_flash_incr_mode") int flash_incr_mode(); public native H5AC_cache_config_t flash_incr_mode(int setter);

    
    /** The factor by which the size of the triggering entry / entry size
         * increase is multiplied to obtain the initial cache size increment. This
         * increment may be reduced to reflect existing free space in the cache and
         * the \p max_size field above.\n
         * The parameter must lie in the interval [0.0, 1.0]. 0.1 or 0.05 is a good
         * place to start.\n
         * At present, this field must lie in the range [0.1, 10.0]. */
    public native double flash_multiple(); public native H5AC_cache_config_t flash_multiple(double setter);

    
    /** The factor by which the current maximum cache size is multiplied to
         * obtain the minimum size entry / entry size increase which may trigger a
         * flash cache size increase. \n
         * At present, this value must lie in the range [0.1, 1.0]. */
    public native double flash_threshold(); public native H5AC_cache_config_t flash_threshold(double setter);
    /** <!-- [H5AC_cache_config_t_incr_snip] --> */

    /* size decrease control fields: */
    /** <!-- [H5AC_cache_config_t_decr_snip] --> */
    
    /** Enumerated value indicating the operational mode of the tomatic
         * cache size decrease code. At present, the values listed in
         * #H5C_cache_decr_mode are legal.*/
    public native @Cast("H5C_cache_decr_mode") int decr_mode(); public native H5AC_cache_config_t decr_mode(int setter);

    
    /** Hit rate threshold for the hit rate threshold and ageout with hit
         * rate threshold cache size decrement algorithms.\n
         * When \p decr_mode is #H5C_decr__threshold, and the hit rate over a given
         * epoch exceeds the supplied threshold, the current maximum cache
         * size is multiplied by decrement to obtain a tentative new (and smaller)
         * maximum cache size.\n
         * When \p decr_mode is #H5C_decr__age_out_with_threshold, there is
         * no attempt to find and evict aged out entries unless the hit rate in
         * the previous epoch exceeded the supplied threshold.\n
         * This field must lie in the interval [0.0, 1.0].\n
         * For #H5C_incr__threshold, .9995 or .99995 is a good place to start.\n
         * For #H5C_decr__age_out_with_threshold, .999 might be more useful.*/
    public native double upper_hr_threshold(); public native H5AC_cache_config_t upper_hr_threshold(double setter);

    
    /** In the hit rate threshold cache size decrease algorithm, this
         * parameter contains the factor by which the current max cache size is
         * multiplied to produce a tentative new cache size.\n
         * The actual cache size decrease will be clipped to satisfy the
         * \ref H5AC_cache_config_t.min_size "min_size" specified in the general
         * configuration, and possibly \ref H5AC_cache_config_t.max_decrement
         * "max_decrement".\n
         * The parameter must be be in the interval [0.0, 1.0].\n
         * If you set it to 1.0, you will effectively
         * disable cache size decreases. 0.9 is a reasonable starting point. */
    public native double decrement(); public native H5AC_cache_config_t decrement(double setter);

    
    /** Boolean flag indicating ether an upper limit should be applied to
         * the size of cache size decreases. */
    public native @Cast("hbool_t") boolean apply_max_decrement(); public native H5AC_cache_config_t apply_max_decrement(boolean setter);

    
    /** Maximum number of bytes by which the maximum cache size can be
         * decreased in any single step -- if applicable.*/
    public native @Cast("size_t") long max_decrement(); public native H5AC_cache_config_t max_decrement(long setter);

    
    /** In the ageout based cache size reduction algorithms, this field
         * contains the minimum number of epochs an entry must remain unaccessed in
         * cache before the cache size reduction algorithm tries to evict it. 3 is a
         * reasonable value. */
    public native int epochs_before_eviction(); public native H5AC_cache_config_t epochs_before_eviction(int setter);

    
    /** Boolean flag indicating whether the ageout based decrement
         * algorithms will maintain a empty reserve when decreasing cache size. */
    public native @Cast("hbool_t") boolean apply_empty_reserve(); public native H5AC_cache_config_t apply_empty_reserve(boolean setter);

    
    /** Empty reserve as a fraction maximum cache size if applicable.\n When
         * so directed, the ageout based algorithms will not decrease the maximum
         * cache size unless the empty reserve can be met.\n The parameter must lie
         * in the interval [0.0, 1.0]. 0.1 or 0.05 is a good place to start. */
    public native double empty_reserve(); public native H5AC_cache_config_t empty_reserve(double setter);
    /** <!-- [H5AC_cache_config_t_decr_snip] --> */

    /* parallel configuration fields: */
    /** <!-- [H5AC_cache_config_t_parallel_snip] --> */
    
    /** Threshold number of bytes of dirty metadata generation for
         * triggering synchronizations of the metadata caches serving the target
         * file in the parallel case.\n Synchronization occurs whenever the number
         * of bytes of dirty metadata created since the last synchronization exceeds
         * this limit.\n This field only applies to the parallel case. While it is
         * ignored elsewhere, it can still draw a value out of bounds error.\n It
         * must be consistent across all caches on any given file.\n By default,
         * this field is set to 256 KB. It shouldn't be more than half the current
         * max cache size times the min clean fraction. */
    public native @Cast("size_t") long dirty_bytes_threshold(); public native H5AC_cache_config_t dirty_bytes_threshold(long setter);

    
    /** Desired metadata write strategy. The valid values for this field
         * are:\n #H5AC_METADATA_WRITE_STRATEGY__PROCESS_0_ONLY: Specifies the only
         * process zero is allowed to write dirty metadata to disk.\n
         * #H5AC_METADATA_WRITE_STRATEGY__DISTRIBUTED: Specifies that process zero
         * still makes the decisions as to what entries should be flushed, but the
         * actual flushes are distributed across the processes in the computation to
         * the extent possible.\n The src/H5ACpublic.h include file in the HDF5
         * library has detailed information on each strategy. */
    public native int metadata_write_strategy(); public native H5AC_cache_config_t metadata_write_strategy(int setter);
    /** <!-- [H5AC_cache_config_t_parallel_snip] --> */
}
