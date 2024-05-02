// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.macosx.*;


/*
 * [XSI] Message header for recvmsg and sendmsg calls.
 * Used value-result for recvmsg, value only for sendmsg.
 */
@Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class msghdr extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public msghdr() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public msghdr(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public msghdr(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public msghdr position(long position) {
        return (msghdr)super.position(position);
    }
    @Override public msghdr getPointer(long i) {
        return new msghdr((Pointer)this).offsetAddress(i);
    }

	public native Pointer msg_name(); public native msghdr msg_name(Pointer setter);      /* [XSI] optional address */
	public native @Cast("socklen_t") int msg_namelen(); public native msghdr msg_namelen(int setter);    /* [XSI] size of address */
	public native iovec msg_iov(); public native msghdr msg_iov(iovec setter); /* [XSI] scatter/gather array */
	public native int msg_iovlen(); public native msghdr msg_iovlen(int setter);     /* [XSI] # elements in msg_iov */
	public native Pointer msg_control(); public native msghdr msg_control(Pointer setter);   /* [XSI] ancillary data, see below */
	public native @Cast("socklen_t") int msg_controllen(); public native msghdr msg_controllen(int setter); /* [XSI] ancillary data buffer len */
	public native int msg_flags(); public native msghdr msg_flags(int setter);      /* [XSI] flags on received message */
}
