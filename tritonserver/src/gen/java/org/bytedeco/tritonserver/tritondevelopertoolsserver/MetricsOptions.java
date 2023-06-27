// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tritonserver.tritondevelopertoolsserver;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tritonserver.global.tritondevelopertoolsserver.*;


//==============================================================================
/** Structure to hold metrics options for setting 'ServerOptions'.
 *  See here for more information:
 *  https://github.com/triton-inference-server/server/blob/main/docs/user_guide/metrics.md. */
@Namespace("triton::developer_tools::server") @NoOffset @Properties(inherit = org.bytedeco.tritonserver.presets.tritondevelopertoolsserver.class)
public class MetricsOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MetricsOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MetricsOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public MetricsOptions position(long position) {
        return (MetricsOptions)super.position(position);
    }
    @Override public MetricsOptions getPointer(long i) {
        return new MetricsOptions((Pointer)this).offsetAddress(i);
    }

  public MetricsOptions() { super((Pointer)null); allocate(); }
  private native void allocate();

  public MetricsOptions(
        @Cast("const bool") boolean allow_metrics, @Cast("const bool") boolean allow_gpu_metrics,
        @Cast("const bool") boolean allow_cpu_metrics, @Cast("const uint64_t") long metrics_interval_ms) { super((Pointer)null); allocate(allow_metrics, allow_gpu_metrics, allow_cpu_metrics, metrics_interval_ms); }
  private native void allocate(
        @Cast("const bool") boolean allow_metrics, @Cast("const bool") boolean allow_gpu_metrics,
        @Cast("const bool") boolean allow_cpu_metrics, @Cast("const uint64_t") long metrics_interval_ms);

  // Enable or disable metrics. Default is true.
  public native @Cast("bool") boolean allow_metrics_(); public native MetricsOptions allow_metrics_(boolean setter);
  // Enable or disable GPU metrics. Default is true.
  public native @Cast("bool") boolean allow_gpu_metrics_(); public native MetricsOptions allow_gpu_metrics_(boolean setter);
  // Enable or disable CPU metrics. Default is true.
  public native @Cast("bool") boolean allow_cpu_metrics_(); public native MetricsOptions allow_cpu_metrics_(boolean setter);
  // The interval for metrics collection. Default is 2000.
  public native @Cast("uint64_t") long metrics_interval_ms_(); public native MetricsOptions metrics_interval_ms_(long setter);
}
