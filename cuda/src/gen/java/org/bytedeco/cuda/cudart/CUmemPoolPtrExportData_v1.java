// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Opaque data for exporting a pool allocation
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUmemPoolPtrExportData_v1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUmemPoolPtrExportData_v1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUmemPoolPtrExportData_v1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUmemPoolPtrExportData_v1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUmemPoolPtrExportData_v1 position(long position) {
        return (CUmemPoolPtrExportData_v1)super.position(position);
    }
    @Override public CUmemPoolPtrExportData_v1 getPointer(long i) {
        return new CUmemPoolPtrExportData_v1((Pointer)this).offsetAddress(i);
    }

    public native @Cast("unsigned char") byte reserved(int i); public native CUmemPoolPtrExportData_v1 reserved(int i, byte setter);
    @MemberGetter public native @Cast("unsigned char*") BytePointer reserved();
}
