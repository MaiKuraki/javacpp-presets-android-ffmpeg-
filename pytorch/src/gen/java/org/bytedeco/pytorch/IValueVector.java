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

@Name("std::vector<c10::IValue>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class IValueVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IValueVector(Pointer p) { super(p); }
    public IValueVector(IValue value) { this(1); put(0, value); }
    public IValueVector(IValue ... array) { this(array.length); put(array); }
    public IValueVector()       { allocate();  }
    public IValueVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef IValueVector put(@ByRef IValueVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    public IValue front() { return get(0); }
    public IValue back() { return get(size() - 1); }
    @Index(function = "at") public native @ByRef IValue get(@Cast("size_t") long i);
    public native IValueVector put(@Cast("size_t") long i, IValue value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @ByRef IValue value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @ByRef @Const IValue get();
    }

    public IValue[] get() {
        IValue[] array = new IValue[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public IValue pop_back() {
        long size = size();
        IValue value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public IValueVector push_back(IValue value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public IValueVector put(IValue value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public IValueVector put(IValue ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

