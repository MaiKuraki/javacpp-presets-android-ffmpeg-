// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tritonserver.tritonserver;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tritonserver.global.tritonserver.*;

// #endif
// #endif

@Opaque @Properties(inherit = org.bytedeco.tritonserver.presets.tritonserver.class)
public class TRITONSERVER_BufferAttributes extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public TRITONSERVER_BufferAttributes() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TRITONSERVER_BufferAttributes(Pointer p) { super(p); }
}
