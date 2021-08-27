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


/** Options for the {@code Embedding} module.
 * 
 *  Example:
 *  <pre>{@code
 *  Embedding model(EmbeddingOptions(10, 2).padding_idx(3).max_norm(2).norm_type(2.5).scale_grad_by_freq(true).sparse(true));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class EmbeddingOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EmbeddingOptions(Pointer p) { super(p); }

  public EmbeddingOptions(@Cast("int64_t") long num_embeddings, @Cast("int64_t") long embedding_dim) { super((Pointer)null); allocate(num_embeddings, embedding_dim); }
  private native void allocate(@Cast("int64_t") long num_embeddings, @Cast("int64_t") long embedding_dim);
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer num_embeddings();
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer embedding_dim();
  public native @ByRef @NoException(true) LongOptional padding_idx();
  public native @ByRef @NoException(true) DoubleOptional max_norm();
  public native @ByRef @NoException(true) DoublePointer norm_type();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer scale_grad_by_freq();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer sparse();
  public native @ByRef @NoException(true) Tensor _weight();
}
