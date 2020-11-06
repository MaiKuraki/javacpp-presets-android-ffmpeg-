// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
* Memory access descriptor
*/
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUmemAccessDesc extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUmemAccessDesc() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUmemAccessDesc(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUmemAccessDesc(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUmemAccessDesc position(long position) {
        return (CUmemAccessDesc)super.position(position);
    }
    @Override public CUmemAccessDesc getPointer(long i) {
        return new CUmemAccessDesc(this).position(position + i);
    }

    /** Location on which the request is to change it's accessibility */
    public native @ByRef CUmemLocation location(); public native CUmemAccessDesc location(CUmemLocation setter);
    /** ::CUmemProt accessibility flags to set on the request */
    public native @Cast("CUmemAccess_flags") int flags(); public native CUmemAccessDesc flags(int setter);
}
