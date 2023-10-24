// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Memory free node parameters
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaMemFreeNodeParams extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaMemFreeNodeParams() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaMemFreeNodeParams(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaMemFreeNodeParams(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaMemFreeNodeParams position(long position) {
        return (cudaMemFreeNodeParams)super.position(position);
    }
    @Override public cudaMemFreeNodeParams getPointer(long i) {
        return new cudaMemFreeNodeParams((Pointer)this).offsetAddress(i);
    }

    /** in: the pointer to free */
    public native Pointer dptr(); public native cudaMemFreeNodeParams dptr(Pointer setter);
}
