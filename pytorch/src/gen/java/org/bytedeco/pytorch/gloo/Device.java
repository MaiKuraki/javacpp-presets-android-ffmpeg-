// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch.gloo;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;
import org.bytedeco.pytorch.*;
import static org.bytedeco.pytorch.global.torch.*;

import static org.bytedeco.pytorch.global.gloo.*;


// The device abstraction can be considered as a factory for all
// communication pairs. A communication pair can be associated with
// send and receive buffers. Send buffers serve as the source for one
// sided writes and receive buffers serve as the target of one sided
// writes. Both ends of the pair can create either type of buffer, as
// long as it is paired with the opposite type on the remote end of
// the pair; every receive buffer must be paired with a corresponding
// send buffer and vice versa. The device abstraction may start a
// background thread to handle I/O multiplexing (not configurable).
@Namespace("gloo::transport") @Properties(inherit = org.bytedeco.pytorch.presets.gloo.class)
public class Device extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Device(Pointer p) { super(p); }


  public native @StdString BytePointer str();

  public native @StdString BytePointer getPCIBusID();

  public native int getInterfaceSpeed();

  public native @Cast("bool") boolean hasGPUDirect();

  // Factory function to create transport context. A single device may
  // service multiple contexts, with no constraints on this process
  // its rank or the context size.
  public native @SharedPtr("gloo::transport::Context") @ByVal TransportContext createContext(int rank, int size);
}
