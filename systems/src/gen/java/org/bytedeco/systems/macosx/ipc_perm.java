// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.macosx.*;


/*
 * Technically, we should force all code references to the new structure
 * definition, not in just the standards conformance case, and leave the
 * legacy interface there for binary compatibility only.  Currently, we
 * are only forcing this for programs requesting standards conformance.
 */
// #if __DARWIN_UNIX03 || defined(KERNEL)
/*
 * [XSI] Information used in determining permission to perform an IPC
 * operation
 */
@Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class ipc_perm extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ipc_perm() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ipc_perm(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ipc_perm(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ipc_perm position(long position) {
        return (ipc_perm)super.position(position);
    }
    @Override public ipc_perm getPointer(long i) {
        return new ipc_perm((Pointer)this).offsetAddress(i);
    }

	public native @Cast("uid_t") int uid(); public native ipc_perm uid(int setter);            /* [XSI] Owner's user ID */
	public native @Cast("gid_t") int gid(); public native ipc_perm gid(int setter);            /* [XSI] Owner's group ID */
	public native @Cast("uid_t") int cuid(); public native ipc_perm cuid(int setter);           /* [XSI] Creator's user ID */
	public native @Cast("gid_t") int cgid(); public native ipc_perm cgid(int setter);           /* [XSI] Creator's group ID */
	public native @Cast("mode_t") short mode(); public native ipc_perm mode(short setter);           /* [XSI] Read/write permission */
	public native @Cast("unsigned short") short _seq(); public native ipc_perm _seq(short setter);           /* Reserved for internal use */
	public native @Cast("key_t") int _key(); public native ipc_perm _key(int setter);           /* Reserved for internal use */
}
