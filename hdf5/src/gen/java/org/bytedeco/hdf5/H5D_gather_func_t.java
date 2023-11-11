// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;

/** <!-- [H5D_scatter_func_t_snip] -->
 <p>
 *  <!-- [H5D_gather_func_t_snip] -->
/**
 * \brief Callback for H5Dgather()
 *
 * @param dst_buf [in] Pointer to the destination buffer which has been filled
 *                    with the next set of elements gathered. This will always
 *                    be identical to the \p dst_buf passed to H5Dgather()
 * @param dst_buf_bytes_used [in]  Pointer to the number of valid bytes in
 *                                \p dst_buf. This number must be a multiple of
 *                                the datatype size.
 * @param op_data [in,out] User-defined pointer to data required by the callback
 *                        function; a pass-through of the \p op_data pointer
 *                        provided with the H5Dgather() function call.
 * @return \herr_t
 *
 * \details The callback function should process, store, or otherwise make use
 *          of the data returned in dst_buf before it returns, because the
 *          buffer will be overwritten unless it is the last call to the
 *          callback. This function will be repeatedly called until all gathered
 *          elements have been passed to the callback in dst_buf. The callback
 *          function should return zero (0) to indicate success, and a negative
 *          value to indicate failure.
 *
 */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5D_gather_func_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    H5D_gather_func_t(Pointer p) { super(p); }
    protected H5D_gather_func_t() { allocate(); }
    private native void allocate();
    public native @Cast("herr_t") int call(@Const Pointer dst_buf, @Cast("size_t") long dst_buf_bytes_used, Pointer op_data);
}
