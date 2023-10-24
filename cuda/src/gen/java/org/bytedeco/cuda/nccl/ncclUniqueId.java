// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nccl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nccl.*;

@Properties(inherit = org.bytedeco.cuda.presets.nccl.class)
public class ncclUniqueId extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ncclUniqueId() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ncclUniqueId(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ncclUniqueId(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ncclUniqueId position(long position) {
        return (ncclUniqueId)super.position(position);
    }
    @Override public ncclUniqueId getPointer(long i) {
        return new ncclUniqueId((Pointer)this).offsetAddress(i);
    }
 public native @Cast("char") byte internal(int i); public native ncclUniqueId internal(int i, byte setter);
@MemberGetter public native @Cast("char*") BytePointer internal(); }
