// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_OPTIONAL_HEADER64 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_OPTIONAL_HEADER64() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_OPTIONAL_HEADER64(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_OPTIONAL_HEADER64(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_OPTIONAL_HEADER64 position(long position) {
        return (IMAGE_OPTIONAL_HEADER64)super.position(position);
    }
    @Override public IMAGE_OPTIONAL_HEADER64 getPointer(long i) {
        return new IMAGE_OPTIONAL_HEADER64((Pointer)this).offsetAddress(i);
    }

    public native @Cast("WORD") short Magic(); public native IMAGE_OPTIONAL_HEADER64 Magic(short setter);
    public native @Cast("BYTE") byte MajorLinkerVersion(); public native IMAGE_OPTIONAL_HEADER64 MajorLinkerVersion(byte setter);
    public native @Cast("BYTE") byte MinorLinkerVersion(); public native IMAGE_OPTIONAL_HEADER64 MinorLinkerVersion(byte setter);
    public native @Cast("DWORD") int SizeOfCode(); public native IMAGE_OPTIONAL_HEADER64 SizeOfCode(int setter);
    public native @Cast("DWORD") int SizeOfInitializedData(); public native IMAGE_OPTIONAL_HEADER64 SizeOfInitializedData(int setter);
    public native @Cast("DWORD") int SizeOfUninitializedData(); public native IMAGE_OPTIONAL_HEADER64 SizeOfUninitializedData(int setter);
    public native @Cast("DWORD") int AddressOfEntryPoint(); public native IMAGE_OPTIONAL_HEADER64 AddressOfEntryPoint(int setter);
    public native @Cast("DWORD") int BaseOfCode(); public native IMAGE_OPTIONAL_HEADER64 BaseOfCode(int setter);
    public native @Cast("ULONGLONG") long ImageBase(); public native IMAGE_OPTIONAL_HEADER64 ImageBase(long setter);
    public native @Cast("DWORD") int SectionAlignment(); public native IMAGE_OPTIONAL_HEADER64 SectionAlignment(int setter);
    public native @Cast("DWORD") int FileAlignment(); public native IMAGE_OPTIONAL_HEADER64 FileAlignment(int setter);
    public native @Cast("WORD") short MajorOperatingSystemVersion(); public native IMAGE_OPTIONAL_HEADER64 MajorOperatingSystemVersion(short setter);
    public native @Cast("WORD") short MinorOperatingSystemVersion(); public native IMAGE_OPTIONAL_HEADER64 MinorOperatingSystemVersion(short setter);
    public native @Cast("WORD") short MajorImageVersion(); public native IMAGE_OPTIONAL_HEADER64 MajorImageVersion(short setter);
    public native @Cast("WORD") short MinorImageVersion(); public native IMAGE_OPTIONAL_HEADER64 MinorImageVersion(short setter);
    public native @Cast("WORD") short MajorSubsystemVersion(); public native IMAGE_OPTIONAL_HEADER64 MajorSubsystemVersion(short setter);
    public native @Cast("WORD") short MinorSubsystemVersion(); public native IMAGE_OPTIONAL_HEADER64 MinorSubsystemVersion(short setter);
    public native @Cast("DWORD") int Win32VersionValue(); public native IMAGE_OPTIONAL_HEADER64 Win32VersionValue(int setter);
    public native @Cast("DWORD") int SizeOfImage(); public native IMAGE_OPTIONAL_HEADER64 SizeOfImage(int setter);
    public native @Cast("DWORD") int SizeOfHeaders(); public native IMAGE_OPTIONAL_HEADER64 SizeOfHeaders(int setter);
    public native @Cast("DWORD") int CheckSum(); public native IMAGE_OPTIONAL_HEADER64 CheckSum(int setter);
    public native @Cast("WORD") short Subsystem(); public native IMAGE_OPTIONAL_HEADER64 Subsystem(short setter);
    public native @Cast("WORD") short DllCharacteristics(); public native IMAGE_OPTIONAL_HEADER64 DllCharacteristics(short setter);
    public native @Cast("ULONGLONG") long SizeOfStackReserve(); public native IMAGE_OPTIONAL_HEADER64 SizeOfStackReserve(long setter);
    public native @Cast("ULONGLONG") long SizeOfStackCommit(); public native IMAGE_OPTIONAL_HEADER64 SizeOfStackCommit(long setter);
    public native @Cast("ULONGLONG") long SizeOfHeapReserve(); public native IMAGE_OPTIONAL_HEADER64 SizeOfHeapReserve(long setter);
    public native @Cast("ULONGLONG") long SizeOfHeapCommit(); public native IMAGE_OPTIONAL_HEADER64 SizeOfHeapCommit(long setter);
    public native @Cast("DWORD") int LoaderFlags(); public native IMAGE_OPTIONAL_HEADER64 LoaderFlags(int setter);
    public native @Cast("DWORD") int NumberOfRvaAndSizes(); public native IMAGE_OPTIONAL_HEADER64 NumberOfRvaAndSizes(int setter);
    public native @ByRef IMAGE_DATA_DIRECTORY DataDirectory(int i); public native IMAGE_OPTIONAL_HEADER64 DataDirectory(int i, IMAGE_DATA_DIRECTORY setter);
    @MemberGetter public native IMAGE_DATA_DIRECTORY DataDirectory();
}
