// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;

/** \endcond
 <p>
 *  Tensor concatenation (concat) primitive. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class concat extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public concat(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public concat(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public concat position(long position) {
        return (concat)super.position(position);
    }
    @Override public concat getPointer(long i) {
        return new concat((Pointer)this).offsetAddress(i);
    }

    /** Primitive descriptor for a concat primitive. */
    public static class primitive_desc extends primitive_desc_base {
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
    

        /** Default constructor. Produces an empty object. */

        /** Constructs a primitive descriptor for an out-of-place concatenation
         *  primitive.
         * 
         *  @param aengine Engine to perform the operation on.
         *  @param dst Destination memory descriptor.
         *  @param concat_dimension Source tensors will be concatenated over
         *      dimension with this index. Note that order of dimensions does
         *      not depend on memory format.
         *  @param srcs Vector of source memory descriptors.
         *  @param attr Primitive attributes to use. Attributes are optional
         *      and default to empty attributes. */
        
        ///
        ///
        public primitive_desc(@Const @ByRef engine aengine, @Const @ByRef org.bytedeco.dnnl.memory.desc dst,
                        int concat_dimension, @Cast("const std::vector<dnnl::memory::desc>*") @ByRef memory_desc_vector srcs,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr) { super((Pointer)null); allocate(aengine, dst, concat_dimension, srcs, attr); }
        private native void allocate(@Const @ByRef engine aengine, @Const @ByRef org.bytedeco.dnnl.memory.desc dst,
                        int concat_dimension, @Cast("const std::vector<dnnl::memory::desc>*") @ByRef memory_desc_vector srcs,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr);
        public primitive_desc(@Const @ByRef engine aengine, @Const @ByRef org.bytedeco.dnnl.memory.desc dst,
                        int concat_dimension, @Cast("const std::vector<dnnl::memory::desc>*") @ByRef memory_desc_vector srcs) { super((Pointer)null); allocate(aengine, dst, concat_dimension, srcs); }
        private native void allocate(@Const @ByRef engine aengine, @Const @ByRef org.bytedeco.dnnl.memory.desc dst,
                        int concat_dimension, @Cast("const std::vector<dnnl::memory::desc>*") @ByRef memory_desc_vector srcs);

        /** Constructs a primitive descriptor for an out-of-place concatenation
         *  primitive.
         * 
         *  This version derives the destination memory descriptor
         *  automatically.
         * 
         *  @param aengine Engine to perform the operation on.
         *  @param concat_dimension Source tensors will be concatenated over
         *      dimension with this index. Note that order of dimensions does
         *      not depend on memory format.
         *  @param srcs Vector of source memory descriptors.
         *  @param attr Primitive attributes to use. Attributes are optional
         *      and default to empty attributes. */
        
        ///
        public primitive_desc(@Const @ByRef engine aengine, int concat_dimension,
                        @Cast("const std::vector<dnnl::memory::desc>*") @ByRef memory_desc_vector srcs,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr) { super((Pointer)null); allocate(aengine, concat_dimension, srcs, attr); }
        private native void allocate(@Const @ByRef engine aengine, int concat_dimension,
                        @Cast("const std::vector<dnnl::memory::desc>*") @ByRef memory_desc_vector srcs,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr);
        public primitive_desc(@Const @ByRef engine aengine, int concat_dimension,
                        @Cast("const std::vector<dnnl::memory::desc>*") @ByRef memory_desc_vector srcs) { super((Pointer)null); allocate(aengine, concat_dimension, srcs); }
        private native void allocate(@Const @ByRef engine aengine, int concat_dimension,
                        @Cast("const std::vector<dnnl::memory::desc>*") @ByRef memory_desc_vector srcs);

        /** Constructs a primitive descriptor for concat primitive from a C
         *  API primitive descriptor which must have a matching kind.
         * 
         *  @param pd C API primitive descriptor for concat primitive. */
        

        /** \copydoc dnnl::primitive_desc_base::src_desc(int)const */
        public native @ByVal org.bytedeco.dnnl.memory.desc src_desc(int idx/*=0*/);
        public native @ByVal org.bytedeco.dnnl.memory.desc src_desc();

        /** \copydoc dnnl::primitive_desc_base::dst_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc dst_desc();
    }

    /** Default constructor. Produces an empty object. */
    public concat() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Constructs a concatenation primitive.
     *  @param pd Primitive descriptor for concatenation primitive. */
    public concat(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);

    /** Constructs a concatenation primitive from a cache blob.
     *  @param pd Primitive descriptor for concatenation primitive.
     *  @param cache_blob Cache blob. */
    public concat(@Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector BytePointer cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(@Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector BytePointer cache_blob);
    public concat(@Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector ByteBuffer cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(@Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector ByteBuffer cache_blob);
    public concat(@Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector byte[] cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(@Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector byte[] cache_blob);
}
