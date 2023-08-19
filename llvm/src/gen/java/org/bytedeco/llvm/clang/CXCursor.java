// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.clang;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.llvm.global.clang.*;


/**
 * A cursor representing some element in the abstract syntax tree for
 * a translation unit.
 *
 * The cursor abstraction unifies the different kinds of entities in a
 * program--declaration, statements, expressions, references to declarations,
 * etc.--under a single "cursor" abstraction with a common set of operations.
 * Common operation for a cursor include: getting the physical location in
 * a source file where the cursor points, getting the name associated with a
 * cursor, and retrieving cursors for any child nodes of a particular cursor.
 *
 * Cursors can be produced in two specific ways.
 * clang_getTranslationUnitCursor() produces a cursor for a translation unit,
 * from which one can use clang_visitChildren() to explore the rest of the
 * translation unit. clang_getCursor() maps from a physical source location
 * to the entity that resides at that location, allowing one to map from the
 * source code into the AST.
 */
@Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXCursor extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXCursor() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CXCursor(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXCursor(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CXCursor position(long position) {
        return (CXCursor)super.position(position);
    }
    @Override public CXCursor getPointer(long i) {
        return new CXCursor((Pointer)this).offsetAddress(i);
    }

  public native @Cast("CXCursorKind") int kind(); public native CXCursor kind(int setter);
  public native int xdata(); public native CXCursor xdata(int setter);
  public native @Const Pointer data(int i); public native CXCursor data(int i, Pointer setter);
  @MemberGetter public native @Cast("const void**") PointerPointer data();
}
