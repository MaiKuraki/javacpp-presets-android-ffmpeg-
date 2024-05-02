// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TOKEN_GROUPS_AND_PRIVILEGES extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TOKEN_GROUPS_AND_PRIVILEGES() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TOKEN_GROUPS_AND_PRIVILEGES(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TOKEN_GROUPS_AND_PRIVILEGES(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TOKEN_GROUPS_AND_PRIVILEGES position(long position) {
        return (TOKEN_GROUPS_AND_PRIVILEGES)super.position(position);
    }
    @Override public TOKEN_GROUPS_AND_PRIVILEGES getPointer(long i) {
        return new TOKEN_GROUPS_AND_PRIVILEGES((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int SidCount(); public native TOKEN_GROUPS_AND_PRIVILEGES SidCount(int setter);
    public native @Cast("DWORD") int SidLength(); public native TOKEN_GROUPS_AND_PRIVILEGES SidLength(int setter);
    public native @Cast("PSID_AND_ATTRIBUTES") SID_AND_ATTRIBUTES Sids(); public native TOKEN_GROUPS_AND_PRIVILEGES Sids(SID_AND_ATTRIBUTES setter);
    public native @Cast("DWORD") int RestrictedSidCount(); public native TOKEN_GROUPS_AND_PRIVILEGES RestrictedSidCount(int setter);
    public native @Cast("DWORD") int RestrictedSidLength(); public native TOKEN_GROUPS_AND_PRIVILEGES RestrictedSidLength(int setter);
    public native @Cast("PSID_AND_ATTRIBUTES") SID_AND_ATTRIBUTES RestrictedSids(); public native TOKEN_GROUPS_AND_PRIVILEGES RestrictedSids(SID_AND_ATTRIBUTES setter);
    public native @Cast("DWORD") int PrivilegeCount(); public native TOKEN_GROUPS_AND_PRIVILEGES PrivilegeCount(int setter);
    public native @Cast("DWORD") int PrivilegeLength(); public native TOKEN_GROUPS_AND_PRIVILEGES PrivilegeLength(int setter);
    public native @Cast("PLUID_AND_ATTRIBUTES") LUID_AND_ATTRIBUTES Privileges(); public native TOKEN_GROUPS_AND_PRIVILEGES Privileges(LUID_AND_ATTRIBUTES setter);
    public native @ByRef LUID AuthenticationId(); public native TOKEN_GROUPS_AND_PRIVILEGES AuthenticationId(LUID setter);
}
