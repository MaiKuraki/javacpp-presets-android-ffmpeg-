// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.numpy;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.cpython.*;
import static org.bytedeco.cpython.global.python.*;

import static org.bytedeco.numpy.global.numpy.*;


/*
 * Largely opaque struct for DType classes (i.e. metaclass instances).
 * The internal definition is currently in `ndarraytypes.h` (export is a bit
 * more complex because `PyArray_Descr` is a DTypeMeta internally but not
 * externally).
 */
// #if !(defined(NPY_INTERNAL_BUILD) && NPY_INTERNAL_BUILD)

// #ifndef Py_LIMITED_API

    @Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyArray_DTypeMeta extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public PyArray_DTypeMeta() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public PyArray_DTypeMeta(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public PyArray_DTypeMeta(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public PyArray_DTypeMeta position(long position) {
            return (PyArray_DTypeMeta)super.position(position);
        }
        @Override public PyArray_DTypeMeta getPointer(long i) {
            return new PyArray_DTypeMeta((Pointer)this).offsetAddress(i);
        }
    
        public native @ByRef @Name("super") PyHeapTypeObject _super(); public native PyArray_DTypeMeta _super(PyHeapTypeObject setter);

        /*
        * Most DTypes will have a singleton default instance, for the
        * parametric legacy DTypes (bytes, string, void, datetime) this
        * may be a pointer to the *prototype* instance?
        */
        public native PyArray_Descr singleton(); public native PyArray_DTypeMeta singleton(PyArray_Descr setter);
        /* Copy of the legacy DTypes type number, usually invalid. */
        public native int type_num(); public native PyArray_DTypeMeta type_num(int setter);

        /* The type object of the scalar instances (may be NULL?) */
        public native PyTypeObject scalar_type(); public native PyArray_DTypeMeta scalar_type(PyTypeObject setter);
        /*
        * DType flags to signal legacy, parametric, or
        * abstract.  But plenty of space for additional information/flags.
        */
        public native @Cast("npy_uint64") long flags(); public native PyArray_DTypeMeta flags(long setter);

        /*
        * Use indirection in order to allow a fixed size for this struct.
        * A stable ABI size makes creating a static DType less painful
        * while also ensuring flexibility for all opaque API (with one
        * indirection due the pointer lookup).
        */
        public native Pointer dt_slots(); public native PyArray_DTypeMeta dt_slots(Pointer setter);
        /* Allow growing (at the moment also beyond this) */
        public native Pointer reserved(int i); public native PyArray_DTypeMeta reserved(int i, Pointer setter);
        @MemberGetter public native @Cast("void**") PointerPointer reserved();
    }