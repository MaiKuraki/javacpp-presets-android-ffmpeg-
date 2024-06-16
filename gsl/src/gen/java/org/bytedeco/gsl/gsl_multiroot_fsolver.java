// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_multiroot_fsolver extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_multiroot_fsolver() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_multiroot_fsolver(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_multiroot_fsolver(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_multiroot_fsolver position(long position) {
        return (gsl_multiroot_fsolver)super.position(position);
    }
    @Override public gsl_multiroot_fsolver getPointer(long i) {
        return new gsl_multiroot_fsolver((Pointer)this).offsetAddress(i);
    }

    public native @Const gsl_multiroot_fsolver_type type(); public native gsl_multiroot_fsolver type(gsl_multiroot_fsolver_type setter);
    public native gsl_multiroot_function function(); public native gsl_multiroot_fsolver function(gsl_multiroot_function setter);
    public native gsl_vector x(); public native gsl_multiroot_fsolver x(gsl_vector setter);
    public native gsl_vector f(); public native gsl_multiroot_fsolver f(gsl_vector setter);
    public native gsl_vector dx(); public native gsl_multiroot_fsolver dx(gsl_vector setter);
    public native Pointer state(); public native gsl_multiroot_fsolver state(Pointer setter);
  }
