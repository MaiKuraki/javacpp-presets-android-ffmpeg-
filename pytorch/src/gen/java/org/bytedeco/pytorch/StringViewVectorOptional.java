// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;

@NoOffset @Name("c10::optional<std::vector<c10::string_view> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class StringViewVectorOptional extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringViewVectorOptional(Pointer p) { super(p); }
    public StringViewVectorOptional(StringViewVector value) { this(); put(value); }
    public StringViewVectorOptional()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef StringViewVectorOptional put(@ByRef StringViewVectorOptional x);

    public native boolean has_value();
    public native void reset();
    public native @Name("value") @ByRef StringViewVector get();
    @ValueSetter public native StringViewVectorOptional put(@ByRef StringViewVector value);
}
