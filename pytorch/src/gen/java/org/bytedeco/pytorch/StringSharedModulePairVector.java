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

@Name("std::vector<std::pair<std::string,std::shared_ptr<torch::nn::Module> > >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class StringSharedModulePairVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringSharedModulePairVector(Pointer p) { super(p); }
    public StringSharedModulePairVector(BytePointer[] firstValue, @Cast({"", "std::shared_ptr<torch::nn::Module>"}) Module[] secondValue) { this(Math.min(firstValue.length, secondValue.length)); put(firstValue, secondValue); }
    public StringSharedModulePairVector(String[] firstValue, @Cast({"", "std::shared_ptr<torch::nn::Module>"}) Module[] secondValue) { this(Math.min(firstValue.length, secondValue.length)); put(firstValue, secondValue); }
    public StringSharedModulePairVector()       { allocate();  }
    public StringSharedModulePairVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef StringSharedModulePairVector put(@ByRef StringSharedModulePairVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @StdString BytePointer first(@Cast("size_t") long i); public native StringSharedModulePairVector first(@Cast("size_t") long i, BytePointer first);
    @Index(function = "at") public native @SharedPtr @Cast({"", "std::shared_ptr<torch::nn::Module>"}) Module second(@Cast("size_t") long i);  public native StringSharedModulePairVector second(@Cast("size_t") long i, Module second);
    @MemberSetter @Index(function = "at") public native StringSharedModulePairVector first(@Cast("size_t") long i, @StdString String first);

    public StringSharedModulePairVector put(BytePointer[] firstValue, Module[] secondValue) {
        for (int i = 0; i < firstValue.length && i < secondValue.length; i++) {
            first(i, firstValue[i]);
            second(i, secondValue[i]);
        }
        return this;
    }

    public StringSharedModulePairVector put(String[] firstValue, Module[] secondValue) {
        for (int i = 0; i < firstValue.length && i < secondValue.length; i++) {
            first(i, firstValue[i]);
            second(i, secondValue[i]);
        }
        return this;
    }
}

