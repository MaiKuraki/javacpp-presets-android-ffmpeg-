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


/** Like {@code DataLoaderOptions}, but without any unconfigured state.
 *  {@code DataLoaderOptions} has some options that depend on other options
 *  ({@code max_jobs} => {@code 2 * workers}). In the spirit of properly using the C++ type
 *  system, {@code DataLoaderOptions} allows only setting values. To access values,
 *  you must create a {@code FullDataLoaderOptions} from a {@code DataLoaderOptions}
 *  instance, which will do any necessary coalescing. */
@Namespace("torch::data") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class FullDataLoaderOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FullDataLoaderOptions(Pointer p) { super(p); }

  public FullDataLoaderOptions(@ByVal DataLoaderOptions options) { super((Pointer)null); allocate(options); }
  private native void allocate(@ByVal DataLoaderOptions options);

  public native @Cast("size_t") long batch_size(); public native FullDataLoaderOptions batch_size(long setter);
  public native @Cast("size_t") long workers(); public native FullDataLoaderOptions workers(long setter);
  public native @Cast("size_t") long max_jobs(); public native FullDataLoaderOptions max_jobs(long setter);
  public native @Optional Milliseconds timeout(); public native FullDataLoaderOptions timeout(Milliseconds setter);
  public native @Cast("bool") boolean enforce_ordering(); public native FullDataLoaderOptions enforce_ordering(boolean setter);
  public native @Cast("bool") boolean drop_last(); public native FullDataLoaderOptions drop_last(boolean setter);
}
