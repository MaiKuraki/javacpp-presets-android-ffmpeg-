// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tritonserver.tritonserver;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tritonserver.global.tritonserver.*;



///
///
///
///
@Name("struct TRITONSERVER_MetricFamily") @Opaque @Properties(inherit = org.bytedeco.tritonserver.presets.tritonserver.class)
public class TRITONSERVER_MetricFamily extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public TRITONSERVER_MetricFamily() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TRITONSERVER_MetricFamily(Pointer p) { super(p); }
}
