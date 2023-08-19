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
 * CXAPISet is an opaque type that represents a data structure containing all
 * the API information for a given translation unit. This can be used for a
 * single symbol symbol graph for a given symbol.
 */
@Name("CXAPISetImpl") @Opaque @Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXAPISet extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CXAPISet() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXAPISet(Pointer p) { super(p); }
}
