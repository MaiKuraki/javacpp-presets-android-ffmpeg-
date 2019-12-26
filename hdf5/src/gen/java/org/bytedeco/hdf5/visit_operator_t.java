// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.hdf5.global.hdf5.*;


// Define the operator function pointer for H5Ovisit2().
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class visit_operator_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    visit_operator_t(Pointer p) { super(p); }
    protected visit_operator_t() { allocate(); }
    private native void allocate();
    public native int call(@ByRef H5Object obj,
                                 @Cast({"", "std::string", "std::string&"}) @Adapter("StringAdapter<char>") BytePointer attr_name,
                                 @Const H5O_info_t oinfo,
                                 Pointer operator_data);
}
