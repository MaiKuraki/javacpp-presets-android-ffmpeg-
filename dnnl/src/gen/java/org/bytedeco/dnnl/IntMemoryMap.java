// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;

@Name("std::unordered_map<int,dnnl::memory>") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class IntMemoryMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IntMemoryMap(Pointer p) { super(p); }
    public IntMemoryMap()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef IntMemoryMap put(@ByRef IntMemoryMap x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native @ByRef memory get(int i);
    public native IntMemoryMap put(int i, memory value);

    public native void erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *().first") @MemberGetter int first();
        public native @Name("operator *().second") @MemberGetter @ByRef @Const memory second();
    }
}

