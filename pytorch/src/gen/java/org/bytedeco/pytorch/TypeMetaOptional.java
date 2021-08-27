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

@NoOffset @Name("c10::optional<caffe2::TypeMeta>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TypeMetaOptional extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TypeMetaOptional(Pointer p) { super(p); }
    public TypeMetaOptional(TypeMeta value) { this(); put(value); }
    public TypeMetaOptional()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef TypeMetaOptional put(@ByRef TypeMetaOptional x);


    @Name("value") public native @ByRef TypeMeta get();
    @ValueSetter public native TypeMetaOptional put(@ByRef TypeMeta value);
}

