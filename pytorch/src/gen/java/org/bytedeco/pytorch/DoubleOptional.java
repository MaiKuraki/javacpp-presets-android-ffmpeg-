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

@NoOffset @Name("c10::optional<double>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class DoubleOptional extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DoubleOptional(Pointer p) { super(p); }
    public DoubleOptional(double value) { this(); put(value); }
    public DoubleOptional()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef DoubleOptional put(@ByRef DoubleOptional x);


    @Name("value") public native double get();
    @ValueSetter public native DoubleOptional put(double value);
}

