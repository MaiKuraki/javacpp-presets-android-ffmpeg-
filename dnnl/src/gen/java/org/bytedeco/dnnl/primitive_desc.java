// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \} dnnl_api_sum
 <p>
 *  \addtogroup dnnl_api_primitives_common
 *  \{
 <p>
 *  A base class for descriptors of all primitives that support iteration
 *      over multiple implementations. */
@Name("dnnl::primitive_desc") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class primitive_desc extends primitive_desc_base {
    static { Loader.load(); }

    
        
            public primitive_desc() { super((Pointer)null); allocate(); }
            private native void allocate();
            public primitive_desc(@Const @ByRef primitive_desc arg0) { super((Pointer)null); allocate(arg0); }
            private native void allocate(@Const @ByRef primitive_desc arg0);
            
            ///
            public primitive_desc(dnnl_primitive_desc t, @Cast("bool") boolean weak/*=false*/) { super((Pointer)null); allocate(t, weak); }
            private native void allocate(dnnl_primitive_desc t, @Cast("bool") boolean weak/*=false*/);
            public primitive_desc(dnnl_primitive_desc t) { super((Pointer)null); allocate(t); }
            private native void allocate(dnnl_primitive_desc t);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public primitive_desc(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public primitive_desc(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public primitive_desc position(long position) {
        return (primitive_desc)super.position(position);
    }
    @Override public primitive_desc getPointer(long i) {
        return new primitive_desc((Pointer)this).offsetAddress(i);
    }


    /** Changes the primitive descriptor to point to the next available
     *  implementation.
     * 
     *  @return \c true on success and \c false if the last available
     *  implementation has already been reached. In the latter case, the
     *  primitive descriptor itself is kept unchanged. */
    public native @Cast("bool") boolean next_impl();
}
