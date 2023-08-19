// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.clang;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.llvm.global.clang.*;


@Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXIdxEntityInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXIdxEntityInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CXIdxEntityInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxEntityInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CXIdxEntityInfo position(long position) {
        return (CXIdxEntityInfo)super.position(position);
    }
    @Override public CXIdxEntityInfo getPointer(long i) {
        return new CXIdxEntityInfo((Pointer)this).offsetAddress(i);
    }

  public native @Cast("CXIdxEntityKind") int kind(); public native CXIdxEntityInfo kind(int setter);
  public native @Cast("CXIdxEntityCXXTemplateKind") int templateKind(); public native CXIdxEntityInfo templateKind(int setter);
  public native @Cast("CXIdxEntityLanguage") int lang(); public native CXIdxEntityInfo lang(int setter);
  public native @Cast("const char*") BytePointer name(); public native CXIdxEntityInfo name(BytePointer setter);
  public native @Cast("const char*") BytePointer USR(); public native CXIdxEntityInfo USR(BytePointer setter);
  public native @ByRef CXCursor cursor(); public native CXIdxEntityInfo cursor(CXCursor setter);
  @MemberGetter public native @Const CXIdxAttrInfo attributes(int i);
  @MemberGetter public native @Cast("const CXIdxAttrInfo*const*") PointerPointer attributes();
  public native @Cast("unsigned") int numAttributes(); public native CXIdxEntityInfo numAttributes(int setter);
}
