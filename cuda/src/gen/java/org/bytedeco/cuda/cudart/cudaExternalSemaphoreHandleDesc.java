// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * External semaphore handle descriptor
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaExternalSemaphoreHandleDesc extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaExternalSemaphoreHandleDesc() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaExternalSemaphoreHandleDesc(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaExternalSemaphoreHandleDesc(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaExternalSemaphoreHandleDesc position(long position) {
        return (cudaExternalSemaphoreHandleDesc)super.position(position);
    }
    @Override public cudaExternalSemaphoreHandleDesc getPointer(long i) {
        return new cudaExternalSemaphoreHandleDesc((Pointer)this).offsetAddress(i);
    }

    /**
     * Type of the handle
     */
    public native @Cast("cudaExternalSemaphoreHandleType") int type(); public native cudaExternalSemaphoreHandleDesc type(int setter);
        /**
         * File descriptor referencing the semaphore object. Valid when
         * type is one of the following:
         * - ::cudaExternalSemaphoreHandleTypeOpaqueFd
         * - ::cudaExternalSemaphoreHandleTypeTimelineSemaphoreFd
         */
        @Name("handle.fd") public native int handle_fd(); public native cudaExternalSemaphoreHandleDesc handle_fd(int setter);
        /**
         * Win32 handle referencing the semaphore object. Valid when
         * type is one of the following:
         * - ::cudaExternalSemaphoreHandleTypeOpaqueWin32
         * - ::cudaExternalSemaphoreHandleTypeOpaqueWin32Kmt
         * - ::cudaExternalSemaphoreHandleTypeD3D12Fence
         * - ::cudaExternalSemaphoreHandleTypeD3D11Fence
         * - ::cudaExternalSemaphoreHandleTypeKeyedMutex
         * - ::cudaExternalSemaphoreHandleTypeTimelineSemaphoreWin32
         * Exactly one of 'handle' and 'name' must be non-NULL. If
         * type is one of the following:
         * ::cudaExternalSemaphoreHandleTypeOpaqueWin32Kmt
         * ::cudaExternalSemaphoreHandleTypeKeyedMutexKmt
         * then 'name' must be NULL.
         */
            /**
             * Valid NT handle. Must be NULL if 'name' is non-NULL
             */
            @Name("handle.win32.handle") public native Pointer handle_win32_handle(); public native cudaExternalSemaphoreHandleDesc handle_win32_handle(Pointer setter);
            /**
             * Name of a valid synchronization primitive.
             * Must be NULL if 'handle' is non-NULL.
             */
            @Name("handle.win32.name") public native @Const Pointer handle_win32_name(); public native cudaExternalSemaphoreHandleDesc handle_win32_name(Pointer setter);
        /**
         * Valid NvSciSyncObj. Must be non NULL
         */
        @Name("handle.nvSciSyncObj") public native @Const Pointer handle_nvSciSyncObj(); public native cudaExternalSemaphoreHandleDesc handle_nvSciSyncObj(Pointer setter);
    /**
     * Flags reserved for the future. Must be zero.
     */
    public native @Cast("unsigned int") int flags(); public native cudaExternalSemaphoreHandleDesc flags(int setter);
}
