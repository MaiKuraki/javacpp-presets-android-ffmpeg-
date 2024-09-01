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
 // namespace detail

/** Options to configure a {@code ChunkDataset}. */
@Namespace("torch::data::datasets") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ChunkDatasetOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ChunkDatasetOptions(Pointer p) { super(p); }

  
  public ChunkDatasetOptions(
        @Cast("size_t") long preloader_count,
        @Cast("size_t") long batch_size,
        @Cast("size_t") long cache_size/*=2048*/,
        @Cast("size_t") long cross_chunk_shuffle_count/*=1*/) { super((Pointer)null); allocate(preloader_count, batch_size, cache_size, cross_chunk_shuffle_count); }
  private native void allocate(
        @Cast("size_t") long preloader_count,
        @Cast("size_t") long batch_size,
        @Cast("size_t") long cache_size/*=2048*/,
        @Cast("size_t") long cross_chunk_shuffle_count/*=1*/);
  public ChunkDatasetOptions(
        @Cast("size_t") long preloader_count,
        @Cast("size_t") long batch_size) { super((Pointer)null); allocate(preloader_count, batch_size); }
  private native void allocate(
        @Cast("size_t") long preloader_count,
        @Cast("size_t") long batch_size);
  public native @Cast("size_t*") @ByRef @NoException(true) SizeTPointer preloader_count();
  public native @Cast("size_t*") @ByRef @NoException(true) SizeTPointer batch_size();
  public native @Cast("size_t*") @ByRef @NoException(true) SizeTPointer cache_size();
  public native @Cast("size_t*") @ByRef @NoException(true) SizeTPointer cross_chunk_shuffle_count();
}
