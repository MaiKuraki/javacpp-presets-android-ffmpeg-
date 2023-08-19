// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


// Sets the deallocation callback for the registration.
//
// This callback is called to deallocate the data returned by the init callback.
// The value passed in the `data` parameter is the value that was returned by
// the `init` callback.
// Please refer `free` of `TfLiteRegistration` for the detail.
//
// \warning This is an experimental API and subject to change.
@Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class Free_TfLiteOpaqueContext_Pointer extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Free_TfLiteOpaqueContext_Pointer(Pointer p) { super(p); }
    protected Free_TfLiteOpaqueContext_Pointer() { allocate(); }
    private native void allocate();
    public native void call(TfLiteOpaqueContext context, Pointer data);
}
