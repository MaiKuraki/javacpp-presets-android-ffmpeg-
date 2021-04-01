// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// DebugInfoGuard is used to set debug information,
// ThreadLocalDebugInfo is semantically immutable, the values are set
// through the scope-based guard object.
// Nested DebugInfoGuard adds/overrides existing values in the scope,
// restoring the original values after exiting the scope.
// Users can access the values through the ThreadLocalDebugInfo::get() call;
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class DebugInfoGuard extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DebugInfoGuard(Pointer p) { super(p); }

  public DebugInfoGuard(
        DebugInfoKind kind, @SharedPtr DebugInfoBase info) { super((Pointer)null); allocate(kind, info); }
  private native void allocate(
        DebugInfoKind kind, @SharedPtr DebugInfoBase info);
  public DebugInfoGuard(
        @Cast("c10::DebugInfoKind") byte kind, @SharedPtr DebugInfoBase info) { super((Pointer)null); allocate(kind, info); }
  private native void allocate(
        @Cast("c10::DebugInfoKind") byte kind, @SharedPtr DebugInfoBase info);

  public DebugInfoGuard(
        @SharedPtr ThreadLocalDebugInfo info) { super((Pointer)null); allocate(info); }
  private native void allocate(
        @SharedPtr ThreadLocalDebugInfo info);

  
  
}
