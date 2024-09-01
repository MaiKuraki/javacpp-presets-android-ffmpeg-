// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;


// NB: dummy argument to suppress "ISO C++11 requires at least one argument
// for the "..." in a variadic macro"
@Namespace("at") @Opaque @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class CUDAHooksArgs extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CUDAHooksArgs() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDAHooksArgs(Pointer p) { super(p); }
}
