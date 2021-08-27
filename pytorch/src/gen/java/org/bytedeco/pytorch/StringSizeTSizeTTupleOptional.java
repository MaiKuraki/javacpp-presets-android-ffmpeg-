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

@NoOffset @Name("c10::optional<std::tuple<std::string,size_t,size_t> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class StringSizeTSizeTTupleOptional extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringSizeTSizeTTupleOptional(Pointer p) { super(p); }
    public StringSizeTSizeTTupleOptional(StringSizeTSizeTTuple value) { this(); put(value); }
    public StringSizeTSizeTTupleOptional()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef StringSizeTSizeTTupleOptional put(@ByRef StringSizeTSizeTTupleOptional x);


    @Name("value") public native @ByRef StringSizeTSizeTTuple get();
    @ValueSetter public native StringSizeTSizeTTupleOptional put(@ByRef StringSizeTSizeTTuple value);
}

