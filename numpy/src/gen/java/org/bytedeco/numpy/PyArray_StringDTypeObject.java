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


@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyArray_StringDTypeObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyArray_StringDTypeObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyArray_StringDTypeObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyArray_StringDTypeObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyArray_StringDTypeObject position(long position) {
        return (PyArray_StringDTypeObject)super.position(position);
    }
    @Override public PyArray_StringDTypeObject getPointer(long i) {
        return new PyArray_StringDTypeObject((Pointer)this).offsetAddress(i);
    }

    public native @ByRef PyArray_Descr base(); public native PyArray_StringDTypeObject base(PyArray_Descr setter);
    // The object representing a null value
    public native PyObject na_object(); public native PyArray_StringDTypeObject na_object(PyObject setter);
    // Flag indicating whether or not to coerce arbitrary objects to strings
    public native @Cast("char") byte coerce(); public native PyArray_StringDTypeObject coerce(byte setter);
    // Flag indicating the na object is NaN-like
    public native @Cast("char") byte has_nan_na(); public native PyArray_StringDTypeObject has_nan_na(byte setter);
    // Flag indicating the na object is a string
    public native @Cast("char") byte has_string_na(); public native PyArray_StringDTypeObject has_string_na(byte setter);
    // If nonzero, indicates that this instance is owned by an array already
    public native @Cast("char") byte array_owned(); public native PyArray_StringDTypeObject array_owned(byte setter);
    // The string data to use when a default string is needed
    public native @ByRef npy_static_string default_string(); public native PyArray_StringDTypeObject default_string(npy_static_string setter);
    // The name of the missing data object, if any
    public native @ByRef npy_static_string na_name(); public native PyArray_StringDTypeObject na_name(npy_static_string setter);
    // the allocator should only be directly accessed after
    // acquiring the allocator_lock and the lock should
    // be released immediately after the allocator is
    // no longer needed
    public native npy_string_allocator allocator(); public native PyArray_StringDTypeObject allocator(npy_string_allocator setter);
}