// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

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
 // namespace functional

// ============================================================================

/** Options for the {@code PReLU} module.
 * 
 *  Example:
 *  <pre>{@code
 *  PReLU model(PReLUOptions().num_parameters(42));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class PReLUOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PReLUOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PReLUOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PReLUOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PReLUOptions position(long position) {
        return (PReLUOptions)super.position(position);
    }
    @Override public PReLUOptions getPointer(long i) {
        return new PReLUOptions((Pointer)this).position(position + i);
    }

  public native @Cast("int64_t*") @ByRef @NoException LongPointer num_parameters();
  public native @ByRef @NoException DoublePointer init();
}
