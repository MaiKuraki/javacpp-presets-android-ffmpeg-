// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;

// #endif  // __cplusplus

// TfLiteRegistrationExternal is an external version of TfLiteRegistration to
// use custom op registration API.
//
// \warning This is an experimental type and subject to change.
@Opaque @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class TfLiteRegistrationExternal extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public TfLiteRegistrationExternal() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TfLiteRegistrationExternal(Pointer p) { super(p); }
}
