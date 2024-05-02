// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.linux.*;



// # ifdef __USE_MISC
/* Reentrant versions of the `random' family of functions.
   These functions all use the following data structure to contain
   state, rather than global state variables.  */

@Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class random_data extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public random_data() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public random_data(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public random_data(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public random_data position(long position) {
        return (random_data)super.position(position);
    }
    @Override public random_data getPointer(long i) {
        return new random_data((Pointer)this).offsetAddress(i);
    }

    public native IntPointer fptr(); public native random_data fptr(IntPointer setter);		/* Front pointer.  */
    public native IntPointer rptr(); public native random_data rptr(IntPointer setter);		/* Rear pointer.  */
    public native IntPointer state(); public native random_data state(IntPointer setter);		/* Array of state values.  */
    public native int rand_type(); public native random_data rand_type(int setter);		/* Type of random number generator.  */
    public native int rand_deg(); public native random_data rand_deg(int setter);		/* Degree of random number generator.  */
    public native int rand_sep(); public native random_data rand_sep(int setter);		/* Distance between front and rear.  */
    public native IntPointer end_ptr(); public native random_data end_ptr(IntPointer setter);		/* Pointer behind state table.  */
  }
