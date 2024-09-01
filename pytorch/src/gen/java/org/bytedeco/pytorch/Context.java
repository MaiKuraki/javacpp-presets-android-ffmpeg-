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


@Namespace("at") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Context extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Context(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Context(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Context position(long position) {
        return (Context)super.position(position);
    }
    @Override public Context getPointer(long i) {
        return new Context((Pointer)this).offsetAddress(i);
    }

  public Context() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native @Const @ByRef Generator defaultGenerator(@ByVal Device device);
  public native @Const @ByRef AcceleratorHooksInterface getAcceleratorHooksInterface(
        @ByVal(nullValue = "std::optional<c10::DeviceType>(c10::nullopt)") DeviceTypeOptional opt_device_type);
  public native @Const @ByRef AcceleratorHooksInterface getAcceleratorHooksInterface();
  public native @ByVal Device getDeviceFromPtr(Pointer data, DeviceType device_type);
  public native @ByVal Device getDeviceFromPtr(Pointer data, @Cast("c10::DeviceType") byte device_type);
  public static native @Cast("bool") boolean isPinnedPtr(@Const Pointer data);
  public static native @Cast("bool") boolean hasOpenMP();
  public static native @Cast("bool") boolean hasMKL();
  public static native @Cast("bool") boolean hasLAPACK();
  public static native @Cast("bool") boolean hasMKLDNN();
  public static native @Cast("bool") boolean hasMAGMA();
  public static native @Cast("bool") boolean hasCUDA();
  public static native @Cast("bool") boolean hasMTIA();
  public static native @Cast("bool") boolean hasCUDART();
  public static native long versionCUDART();
  public static native @Cast("bool") boolean hasCuDNN();
  public static native long versionCuDNN();
  public static native @Cast("bool") boolean hasCuSOLVER();
  public static native @Cast("bool") boolean hasCuBLASLt();
  public static native @Cast("bool") boolean hasHIP();
  public static native @Cast("bool") boolean hasMPS();
  public static native @Cast("bool") boolean hasIPU();
  public static native @Cast("bool") boolean hasXLA();
  public static native @Cast("bool") boolean hasXPU();
  public static native @Cast("bool") boolean hasLazy();
  public static native @Cast("bool") boolean hasMAIA();
  // defined in header so that getNonVariableType has ability to inline
  // call_once check. getNonVariableType is called fairly frequently
  public native void lazyInitCUDA();
  public native void lazyInitHIP();
  public native void lazyInitXPU();
  public native void lazyInitMTIA();
  public native void lazyInitPrivateUse1();
  public static native @Cast("const at::cuda::NVRTC*") @ByRef Pointer getNVRTC();

  public static native @Cast("bool") boolean setFlushDenormal(@Cast("bool") boolean on);

  // NB: This method is *purely* whether or not a user requested
  // that CuDNN was enabled, it doesn't actually say anything about
  // whether or not CuDNN is actually usable.  Use cudnn_is_acceptable
  // to test this instead
  public native @Cast("bool") boolean userEnabledCuDNN();
  public native void setUserEnabledCuDNN(@Cast("bool") boolean e);
  public native @Cast("bool") boolean userEnabledMkldnn();
  public native void setUserEnabledMkldnn(@Cast("bool") boolean e);
  public native @Cast("bool") boolean benchmarkCuDNN();
  public native void setBenchmarkCuDNN(@Cast("bool") boolean arg0);
  public native int benchmarkLimitCuDNN();
  public native void setBenchmarkLimitCuDNN(int arg0);
  public native @Cast("bool") boolean deterministicCuDNN();
  public native void setDeterministicCuDNN(@Cast("bool") boolean arg0);
  public native @Cast("bool") boolean userEnabledNNPACK();
  public native void setUserEnabledNNPACK(@Cast("bool") boolean e);

  // Note [Disabling Fused SDP Kernels]
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // Flash and Memory Efficient SDP kernels are enabled by default.
  // However, they can be disabled by setting
  // at::globalContext().setUserEnabledFlashSDP(false) flag.
  // This is useful for debugging purposes. For example, if you want to
  // compare the performance of the flash SDP kernels with the unfused
  // kernel, you can disable the flash SDP kernels. By disabling
  // the math SDP kernel, you can force your code to use flash kernels.
  // The math SDP kernel can be disabled by setting
  // at::globalContext().setUserEnabledMathSDP(false) flag.
  public native void setSDPUseFlash(@Cast("bool") boolean arg0);
  public native @Cast("bool") boolean userEnabledFlashSDP();

  public native void setSDPUseMemEfficient(@Cast("bool") boolean arg0);
  public native @Cast("bool") boolean userEnabledMemEfficientSDP();

  public native void setSDPUseMath(@Cast("bool") boolean arg0);
  public native @Cast("bool") boolean userEnabledMathSDP();

  public native void setSDPUseCuDNN(@Cast("bool") boolean arg0);
  public native @Cast("bool") boolean userEnabledCuDNNSDP();

  public native LinalgBackend linalgPreferredBackend();
  public native void setLinalgPreferredBackend(LinalgBackend arg0);
  public native void setLinalgPreferredBackend(@Cast("at::LinalgBackend") byte arg0);

  public native BlasBackend blasPreferredBackend();
  public native void setBlasPreferredBackend(BlasBackend arg0);
  public native void setBlasPreferredBackend(@Cast("at::BlasBackend") byte arg0);

  // Note [Enabling Deterministic Operations]
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // Operations in PyTorch that normally act nondeterministically, but have an
  // alternate deterministic implementation, should satisfy the following
  // requirements:
  //
  // * Include this comment: "See Note [Enabling Deterministic Operations]"
  //
  // * Check the value of `at::globalContext().deterministicAlgorithms()` to
  // toggle
  //   between nondeterministic and deterministic implementations.
  //
  // * Have an entry in the list of PyTorch operations that toggle between
  // nondeterministic
  //   and deterministic implementations, in the docstring of
  //   `use_deterministic_algorithms()` in torch/__init__.py
  //
  // `example_func()` below shows an example of toggling between
  // nondeterministic and deterministic implementations:
  //
  //    void example_func() {
  //      // See Note [Enabling Deterministic Operations]
  //      if (at::globalContext().deterministicAlgorithms()) {
  //        example_func_deterministic();
  //      } else {
  //        example_func_nondeterministic();
  //      }
  //    }

  public native @Cast("bool") boolean deterministicAlgorithms();
  public native @Cast("bool") boolean deterministicAlgorithmsWarnOnly();
  public native void setDeterministicAlgorithms(@Cast("bool") boolean arg0, @Cast("bool") boolean arg1);
  public native @Cast("bool") boolean deterministicFillUninitializedMemory();
  public native void setDeterministicFillUninitializedMemory(@Cast("bool") boolean arg0);

  // Note [Writing Nondeterministic Operations]
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // Operations in PyTorch that act nondeterministically and do not have an
  // alternate deterministic implementation should satisfy the following
  // requirements:
  //
  // * Include this comment: "See Note [Writing Nondeterministic Operations]"
  //
  // * Include a comment explaining why the operation is nondeterministic.
  //
  // * Throw an error when `Context::deterministicAlgorithms()` is true. Most
  //   of the time, this should be accomplished by calling
  //   `at::globalContext().alertNotDeterminstic()`.  However, if the
  //   nondeterministic behavior is caused by the CuBLAS workspace
  //   configuration in CUDA >= 10.2,
  //   `at::globalContext().alertCuBLASConfigNotDeterministic()` should be
  //   called instead (in this case, a comment explaining why the operation is
  //   nondeterministic is not necessary). See below for details on these
  //   methods.
  //
  // * Have an entry in the list of nondeterministic PyTorch operations in the
  //   docstring of `use_deterministic_algorithms()` in torch/__init__.py
  //
  // * Have a test function in `test/test_torch.py` whose name begins with
  //   `test_nondeterministic_alert_`. Alternatively, if CuBLAS workspace
  //   configuration is the reason for nondeterminism, the operation should be
  //   included in the `test_cublas_config_nondeterministic_alert` test. Any new
  //   tests should ideally follow a pattern similar to the existing ones.
  //
  // `example_func()` below shows an example of the comments and error-throwing
  // code for a nondeterministic operation:
  //
  //    void example_func() {
  //      // See Note [Writing Nondeterministic Operations]
  //      // Nondeterministic because <reason>
  //      at::globalContext().alertNondeterministic("example_func");
  //      ...
  //    }

  // Throws an error if `Context::deterministicAlgorithms()` is true
  public static native void alertNotDeterministic(@StringView BytePointer caller);
  public static native void alertNotDeterministic(@StringView String caller);

  // Throws an error if `Context::deterministicAlgorithms()` is true, CUDA
  // >= 10.2, and CUBLAS_WORKSPACE_CONFIG is not set to either ":16:8" or
  // ":4096:8". For more details:
  // https://docs.nvidia.com/cuda/cublas/index.html#results-reproducibility
  public native void alertCuBLASConfigNotDeterministic();

  public native void setFloat32MatmulPrecision(@StdString BytePointer s);
  public native void setFloat32MatmulPrecision(@StdString String s);
  public native @Cast("bool") boolean allowTF32CuDNN();
  public native void setAllowTF32CuDNN(@Cast("bool") boolean arg0);
  public native @Cast("bool") boolean allowTF32CuBLAS();
  public native void setAllowTF32CuBLAS(@Cast("bool") boolean arg0);
  public native Float32MatmulPrecision float32MatmulPrecision();
  public native void setFloat32MatmulPrecision(Float32MatmulPrecision p);
  public native void setFloat32MatmulPrecision(@Cast("at::Float32MatmulPrecision") int p);
  public native @Cast("bool") boolean allowFP16ReductionCuBLAS();
  public native void setAllowFP16ReductionCuBLAS(@Cast("bool") boolean arg0);
  public native @Cast("bool") boolean allowBF16ReductionCuBLAS();
  public native void setAllowBF16ReductionCuBLAS(@Cast("bool") boolean arg0);
  public native @ByVal QEngine qEngine();
  public native void setQEngine(@ByVal QEngine e);
  public static native @Const @ByRef QEngineVector supportedQEngines();
  public static native @Cast("bool") boolean isXNNPACKAvailable();
  public native void setCheckSparseTensorInvariants(@Cast("bool") boolean e);
  public native @Cast("bool") boolean checkSparseTensorInvariants();
  // This method is used to release the original weight after pre-packing.
  // It should be called once before loading/running the model.
  // NB: By default it is set to true for mobile builds.
  public native void setReleaseWeightsWhenPrepacking(@Cast("bool") boolean e);
  public native @Cast("bool") boolean releaseWeightsWhenPrepacking();

  public native void setDisplayVmapFallbackWarnings(@Cast("bool") boolean enabled);
  public native @Cast("bool") boolean areVmapFallbackWarningsEnabled();

  public native void setDefaultMobileCPUAllocator();
  public native void unsetDefaultMobileCPUAllocator();
  public native @Cast("bool") boolean allowFP16ReductionCPU();
  public native void setAllowFP16ReductionCPU(@Cast("bool") boolean arg0);
}
