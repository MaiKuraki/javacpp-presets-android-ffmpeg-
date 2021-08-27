// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

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


@Name("torch::jit::String") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class JitString extends Tree {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public JitString(Pointer p) { super(p); }

  public JitString(@StdString BytePointer value) { super((Pointer)null); allocate(value); }
  private native void allocate(@StdString BytePointer value);
  public JitString(@StdString String value) { super((Pointer)null); allocate(value); }
  private native void allocate(@StdString String value);
  public native @StdString BytePointer stringValue();
}
