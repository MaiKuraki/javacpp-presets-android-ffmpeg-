// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \} dnnl_api_rnn
 <p>
 *  \addtogroup dnnl_api_shuffle Shuffle
 * 
 *  A primitive to shuffle tensor data along an axis.
 * 
 *  @see \ref dev_guide_shuffle in developer guide
 * 
 *  \{
 <p>
 *  Shuffle forward propagation primitive. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class shuffle_forward extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public shuffle_forward(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public shuffle_forward(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public shuffle_forward position(long position) {
        return (shuffle_forward)super.position(position);
    }
    @Override public shuffle_forward getPointer(long i) {
        return new shuffle_forward((Pointer)this).offsetAddress(i);
    }

    /** Primitive descriptor for a shuffle forward propagation primitive. */
    public static class primitive_desc extends org.bytedeco.dnnl.primitive_desc {
        static { Loader.load(); }
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
        
        ///
        public primitive_desc() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Constructs a primitive descriptor for a shuffle forward propagation
         *  primitive.
         * 
         *  @param aengine Engine to use.
         *  @param aprop_kind Propagation kind. Possible values are
         *      #dnnl::prop_kind::forward_training, and
         *      #dnnl::prop_kind::forward_inference.
         *  @param src_desc Source memory descriptor.
         *  @param dst_desc Destination memory descriptor.
         *  @param axis The axis along which the data is shuffled.
         *  @param group_size Shuffle group size.
         *  @param attr Primitive attributes to use. Attributes are optional
         *      and default to empty attributes.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef engine aengine, prop_kind aprop_kind,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc dst_desc,
                        int axis, int group_size,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(aengine, aprop_kind, src_desc, dst_desc, axis, group_size, attr, allow_empty); }
        private native void allocate(@Const @ByRef engine aengine, prop_kind aprop_kind,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc dst_desc,
                        int axis, int group_size,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef engine aengine, prop_kind aprop_kind,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc dst_desc,
                        int axis, int group_size) { super((Pointer)null); allocate(aengine, aprop_kind, src_desc, dst_desc, axis, group_size); }
        private native void allocate(@Const @ByRef engine aengine, prop_kind aprop_kind,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc dst_desc,
                        int axis, int group_size);
        public primitive_desc(@Const @ByRef engine aengine, @Cast("dnnl::prop_kind") int aprop_kind,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc dst_desc,
                        int axis, int group_size,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(aengine, aprop_kind, src_desc, dst_desc, axis, group_size, attr, allow_empty); }
        private native void allocate(@Const @ByRef engine aengine, @Cast("dnnl::prop_kind") int aprop_kind,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc dst_desc,
                        int axis, int group_size,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef engine aengine, @Cast("dnnl::prop_kind") int aprop_kind,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc dst_desc,
                        int axis, int group_size) { super((Pointer)null); allocate(aengine, aprop_kind, src_desc, dst_desc, axis, group_size); }
        private native void allocate(@Const @ByRef engine aengine, @Cast("dnnl::prop_kind") int aprop_kind,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc dst_desc,
                        int axis, int group_size);

        /** Constructs a primitive descriptor for a shuffle forward propagation
         *  primitive from a C API primitive descriptor that must have a
         *  matching kind.
         * 
         *  @param pd C API primitive descriptor for a shuffle forward
         *      propagation primitive. */
        public primitive_desc(dnnl_primitive_desc pd) { super((Pointer)null); allocate(pd); }
        private native void allocate(dnnl_primitive_desc pd);

        /** \copydoc dnnl::primitive_desc_base::src_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc src_desc();

        /** \copydoc dnnl::primitive_desc_base::dst_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc dst_desc();

        /** \copydoc dnnl::primitive_desc_base::get_prop_kind()const */
        public native prop_kind get_prop_kind();

        /** \copydoc dnnl::primitive_desc_base::get_axis()const */
        public native int get_axis();

        /** \copydoc dnnl::primitive_desc_base::get_group_size()const */
        public native @Cast("dnnl::memory::dim") long get_group_size();
    }

    /** Default constructor. Produces an empty object. */
    public shuffle_forward() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Constructs a shuffle forward propagation primitive.
     *  @param pd Primitive descriptor for a shuffle forward propagation
     *      primitive. */
    public shuffle_forward(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);

    /** Constructs a shuffle forward propagation primitive from a cache blob.
     *  @param pd Primitive descriptor for a shuffle forward propagation
     *      primitive.
     *  @param cache_blob Cache blob. */
    public shuffle_forward(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector BytePointer cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector BytePointer cache_blob);
    public shuffle_forward(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector ByteBuffer cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector ByteBuffer cache_blob);
    public shuffle_forward(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector byte[] cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector byte[] cache_blob);
}
