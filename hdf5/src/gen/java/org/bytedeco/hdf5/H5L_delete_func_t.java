// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/* Callback for when the link is deleted */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5L_delete_func_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    H5L_delete_func_t(Pointer p) { super(p); }
    protected H5L_delete_func_t() { allocate(); }
    private native void allocate();
    public native @Cast("herr_t") int call(@Cast("const char*") BytePointer link_name, @Cast("hid_t") long file,
    @Const Pointer lnkdata, @Cast("size_t") long lnkdata_size);
}
