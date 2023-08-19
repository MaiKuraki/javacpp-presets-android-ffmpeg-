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
 * \}
 */

/** \defgroup CINDEX_REMAPPING Remapping functions
 *
 * \{
 */

/**
 * A remapping of original source files and their translated files.
 */
@Namespace @Name("void") @Opaque @Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXRemapping extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CXRemapping() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXRemapping(Pointer p) { super(p); }
}
