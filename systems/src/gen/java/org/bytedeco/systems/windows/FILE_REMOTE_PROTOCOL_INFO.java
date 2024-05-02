// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


// #if (_WIN32_WINNT >= _WIN32_WINNT_WIN8)
// #endif

// Protocol specific SMB2 share capability flags.

// #if (_WIN32_WINNT >= _WIN32_WINNT_WIN8)
// #endif

// Protocol specific SMB2 server capability flags.

// #if (_WIN32_WINNT >= _WIN32_WINNT_WIN8)
// #endif

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class FILE_REMOTE_PROTOCOL_INFO extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FILE_REMOTE_PROTOCOL_INFO() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FILE_REMOTE_PROTOCOL_INFO(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FILE_REMOTE_PROTOCOL_INFO(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FILE_REMOTE_PROTOCOL_INFO position(long position) {
        return (FILE_REMOTE_PROTOCOL_INFO)super.position(position);
    }
    @Override public FILE_REMOTE_PROTOCOL_INFO getPointer(long i) {
        return new FILE_REMOTE_PROTOCOL_INFO((Pointer)this).offsetAddress(i);
    }

    // Structure Version
    public native @Cast("USHORT") short StructureVersion(); public native FILE_REMOTE_PROTOCOL_INFO StructureVersion(short setter);     // 1
    public native @Cast("USHORT") short StructureSize(); public native FILE_REMOTE_PROTOCOL_INFO StructureSize(short setter);        // sizeof(FILE_REMOTE_PROTOCOL_INFO)

    public native @Cast("ULONG") long Protocol(); public native FILE_REMOTE_PROTOCOL_INFO Protocol(long setter);             // Protocol (WNNC_NET_*) defined in winnetwk.h or ntifs.h.

    // Protocol Version & Type
    public native @Cast("USHORT") short ProtocolMajorVersion(); public native FILE_REMOTE_PROTOCOL_INFO ProtocolMajorVersion(short setter);
    public native @Cast("USHORT") short ProtocolMinorVersion(); public native FILE_REMOTE_PROTOCOL_INFO ProtocolMinorVersion(short setter);
    public native @Cast("USHORT") short ProtocolRevision(); public native FILE_REMOTE_PROTOCOL_INFO ProtocolRevision(short setter);

    public native @Cast("USHORT") short Reserved(); public native FILE_REMOTE_PROTOCOL_INFO Reserved(short setter);

    // Protocol-Generic Information
    public native @Cast("ULONG") long Flags(); public native FILE_REMOTE_PROTOCOL_INFO Flags(long setter);

        @Name("GenericReserved.Reserved") public native @Cast("ULONG") long GenericReserved_Reserved(int i); public native FILE_REMOTE_PROTOCOL_INFO GenericReserved_Reserved(int i, long setter);
        @Name("GenericReserved.Reserved") @MemberGetter public native @Cast("ULONG*") CLongPointer GenericReserved_Reserved();

    // Protocol specific information

// #if (_WIN32_WINNT < _WIN32_WINNT_WIN8)
        @Name("ProtocolSpecificReserved.Reserved") public native @Cast("ULONG") long ProtocolSpecificReserved_Reserved(int i); public native FILE_REMOTE_PROTOCOL_INFO ProtocolSpecificReserved_Reserved(int i, long setter);
        @Name("ProtocolSpecificReserved.Reserved") @MemberGetter public native @Cast("ULONG*") CLongPointer ProtocolSpecificReserved_Reserved();
// #else

// #endif

}
