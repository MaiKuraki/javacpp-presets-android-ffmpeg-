// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \class ICudaEngine
 * 
 *  \brief An engine for executing inference on a built network, with functionally unsafe features.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @NoOffset @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class ICudaEngine extends INoCopy {
    static { Loader.load(); }
    /** Default native constructor. */
    public ICudaEngine() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ICudaEngine(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ICudaEngine(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ICudaEngine position(long position) {
        return (ICudaEngine)super.position(position);
    }
    @Override public ICudaEngine getPointer(long i) {
        return new ICudaEngine((Pointer)this).offsetAddress(i);
    }


    /**
     *  \brief Get shape of an input or output tensor.
     * 
     *  @param tensorName The name of an input or output tensor.
     * 
     *  @return shape of the tensor, with -1 in place of each dynamic runtime dimension,
     *          or Dims{-1, {}} if the provided name does not map to an input or output tensor.
     * 
     *  \warning The string tensorName must be null-terminated, and be at most 4096 bytes including the terminator.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims64 getTensorShape(String tensorName);
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims64 getTensorShape(@Cast("const char*") BytePointer tensorName);

    /**
     *  \brief Determine the required data type for a buffer from its tensor name.
     * 
     *  @param tensorName The name of an input or output tensor.
     * 
     *  @return The type of the data in the buffer, or DataType::kFLOAT if the provided name does not map to an input or
     *  output tensor.
     * 
     *  \warning The string tensorName must be null-terminated, and be at most 4096 bytes including the terminator.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) DataType getTensorDataType(String tensorName);
    public native @NoException(true) @Cast("nvinfer1::DataType") int getTensorDataType(@Cast("const char*") BytePointer tensorName);

    /**
     *  \brief Get the number of layers in the network.
     * 
     *  The number of layers in the network is not necessarily the number in the original network definition, as layers
     *  may be combined or eliminated as the engine is optimized. This value can be useful when building per-layer
     *  tables, such as when aggregating profiling data over a number of executions.
     * 
     *  @return The number of layers in the network.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) int getNbLayers();

    /**
     *  \brief Serialize the network to a stream.
     * 
     *  @return A IHostMemory object that contains the serialized engine.
     * 
     *  The network may be deserialized with IRuntime::deserializeCudaEngine().
     * 
     *  @see IRuntime::deserializeCudaEngine()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) IHostMemory serialize();

    /**
     *  \brief Create an execution context and specify the strategy for allocating internal activation memory.
     * 
     *  The default value for the allocation strategy is ExecutionContextAllocationStrategy::kSTATIC, which means the
     *  context will pre-allocate a block of device memory that is sufficient for all profiles. The newly created
     *  execution context will be assigned optimization profile 0. If an error recorder has been set for the engine, it
     *  will also be passed to the execution context.
     * 
     *  @see IExecutionContext
     *  @see IExecutionContext::setOptimizationProfileAsync()
     *  @see ExecutionContextAllocationStrategy
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) IExecutionContext createExecutionContext(
            ExecutionContextAllocationStrategy strategy/*=nvinfer1::ExecutionContextAllocationStrategy::kSTATIC*/);
    public native @NoException(true) IExecutionContext createExecutionContext();
    public native @NoException(true) IExecutionContext createExecutionContext(
            @Cast("nvinfer1::ExecutionContextAllocationStrategy") int strategy/*=nvinfer1::ExecutionContextAllocationStrategy::kSTATIC*/);

    /**
     *  \brief Get whether an input or output tensor must be on GPU or CPU.
     * 
     *  @param tensorName The name of an input or output tensor.
     * 
     *  @return TensorLocation::kDEVICE if tensorName must be on GPU, or TensorLocation::kHOST if on CPU, or
     *  TensorLocation::kDEVICE if the provided name does not map to an input or output tensor.
     * 
     *  The location is established at build time. E.g. shape tensors inputs are typically required to be on the CPU.
     * 
     *  \warning The string tensorName must be null-terminated, and be at most 4096 bytes including the terminator.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) TensorLocation getTensorLocation(String tensorName);
    public native @NoException(true) @Cast("nvinfer1::TensorLocation") int getTensorLocation(@Cast("const char*") BytePointer tensorName);

    /**
     *  \brief True if tensor is required as input for shape calculations or is output from shape calculations.
     * 
     *  Return true for either of the following conditions:
     * 
     *  * The tensor is a network input, and its value is required for IExecutionContext::getTensorShape()
     *    to return the shape of a network output.
     * 
     *  * The tensor is a network output, and inferShape() will compute its values.
     * 
     *  For example, if a network uses an input tensor "foo" as an addend to an IElementWiseLayer
     *  that computes the "reshape dimensions" for IShuffleLayer, then isShapeInferenceIO("foo") == true.
     *  If the network copies said input tensor "foo" to an output "bar", then
     *  isShapeInferenceIO("bar") == true and IExecutionContext::inferShapes() will write to "bar".
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean isShapeInferenceIO(String tensorName);
    public native @Cast("bool") @NoException(true) boolean isShapeInferenceIO(@Cast("const char*") BytePointer tensorName);

    /**
     *  \brief Determine whether a tensor is an input or output tensor.
     * 
     *  @param tensorName The name of an input or output tensor.
     * 
     *  @return kINPUT if tensorName is an input, kOUTPUT if tensorName is an output, or kNONE if neither.
     * 
     *  \warning The string tensorName must be null-terminated, and be at most 4096 bytes including the terminator.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) TensorIOMode getTensorIOMode(String tensorName);
    public native @NoException(true) @Cast("nvinfer1::TensorIOMode") int getTensorIOMode(@Cast("const char*") BytePointer tensorName);

    /**
     *  \brief create an execution context without any device memory allocated
     * 
     *  The memory for execution of this device context must be supplied by the application.
     * 
     *  @deprecated Deprecated in TensorRT 10.0. Superseded by createExecutionContext() with parameter.
     *  */
    
    
    //!
    //!
    //!
    public native @Deprecated @NoException(true) IExecutionContext createExecutionContextWithoutDeviceMemory();

    /**
     *  \brief Return the maximum device memory required by the context over all profiles.
     * 
     *  @see IExecutionContext::setDeviceMemory()
     *  */
    
    
    //!
    //!
    //!
    public native @Cast("size_t") @NoException(true) long getDeviceMemorySize();

    /**
     *  \brief Return the maximum device memory required by the context for a profile.
     * 
     *  @see IExecutionContext::setDeviceMemory()
     *  */
    
    
    //!
    //!
    //!
    public native @Cast("size_t") @NoException(true) long getDeviceMemorySizeForProfile(int profileIndex);

    /**
     *  \brief Return true if an engine can be refit.
     * 
     *  @see nvinfer1::createInferRefitter()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean isRefittable();

    /**
     *  \brief Return the number of bytes per component of an element, or -1 if the provided name does not map to an
     *  input or output tensor.
     * 
     *  The vector component size is returned if getTensorVectorizedDim() != -1.
     * 
     *  @param tensorName The name of an input or output tensor.
     * 
     *  \warning The string tensorName must be null-terminated, and be at most 4096 bytes including the terminator.
     *  \warning The function can only return the result of profile 0, and issues a warning message when there are
     *  multiple profiles in the engine, use getTensorBytesPerComponent with profileIndex when there are multiple
     *  profiles.
     * 
     *  @see getTensorVectorizedDim()
     *  @see getTensorBytesPerComponent(tensorName, profileIndex)
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) int getTensorBytesPerComponent(String tensorName);
    public native @NoException(true) int getTensorBytesPerComponent(@Cast("const char*") BytePointer tensorName);

    /**
     *  \brief Return the number of bytes per component of an element of given profile, or -1 if the provided name does
     *  not map to an input or output tensor.
     * 
     *  The vector component size is returned if getTensorVectorizedDim(tensorName, profileIndex) != -1.
     * 
     *  @param tensorName The name of an input or output tensor.
     *  @param profileIndex The profile index to query
     * 
     *  \warning The string tensorName must be null-terminated, and be at most 4096 bytes including the terminator.
     * 
     *  @see getTensorVectorizedDim(tensorName, profileIndex)
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) int getTensorBytesPerComponent(String tensorName, int profileIndex);
    public native @NoException(true) int getTensorBytesPerComponent(@Cast("const char*") BytePointer tensorName, int profileIndex);

    /**
     *  \brief Return the number of components included in one element, or -1 if the provided name does not map to an
     *  input or output tensor.
     * 
     *  The number of elements in the vectors is returned if getTensorVectorizedDim() != -1.
     * 
     *  @param tensorName The name of an input or output tensor.
     * 
     *  \warning The string tensorName must be null-terminated, and be at most 4096 bytes including the terminator.
     *  \warning The function can only return the result of profile 0, and issues a warning message when there
     *  are multiple profiles in the engine, use getTensorComponentsPerElement with profileIndex when there are
     *  multiple profiles.
     * 
     *  @see getTensorVectorizedDim()
     *  @see getTensorComponentsPerElement(tensorName, profileIndex)
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) int getTensorComponentsPerElement(String tensorName);
    public native @NoException(true) int getTensorComponentsPerElement(@Cast("const char*") BytePointer tensorName);

    /**
     *  \brief Return the number of components included in one element of given profile, or -1 if the provided name does
     *  not map to an input or output tensor.
     * 
     *  The number of elements in the vectors is returned if getTensorVectorizedDim(tensorName, profileIndex) != -1.
     * 
     *  @param tensorName The name of an input or output tensor.
     *  @param profileIndex The profile index to query
     * 
     *  \warning The string tensorName must be null-terminated, and be at most 4096 bytes including the terminator.
     * 
     *  @see getTensorVectorizedDim(tensorName, profileIndex)
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) int getTensorComponentsPerElement(String tensorName, int profileIndex);
    public native @NoException(true) int getTensorComponentsPerElement(@Cast("const char*") BytePointer tensorName, int profileIndex);

    /**
     *  \brief Return the tensor format, or TensorFormat::kLINEAR if the provided name does not map to an input or
     *  output tensor.
     * 
     *  \warning The string tensorName must be null-terminated, and be at most 4096 bytes including the terminator.
     *  \warning This API can only return the tensor format of profile 0, and issues a warning message when there are
     *  multiple profiles in the engine, use getTensorFormat with profileIndex when there are multiple profiles.
     * 
     *  @see getTensorFormat(tensorName, profileIndex)
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) TensorFormat getTensorFormat(String tensorName);
    public native @NoException(true) @Cast("nvinfer1::TensorFormat") int getTensorFormat(@Cast("const char*") BytePointer tensorName);

    /**
     *  \brief Return the tensor format of given profile, or TensorFormat::kLINEAR if the provided name does not map to
     *  an input or output tensor.
     * 
     *  @param tensorName The name of an input or output tensor.
     *  @param profileIndex The profile index to query the format for.
     * 
     *  \warning The string tensorName must be null-terminated, and be at most 4096 bytes including the terminator.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) TensorFormat getTensorFormat(String tensorName, int profileIndex);
    public native @NoException(true) @Cast("nvinfer1::TensorFormat") int getTensorFormat(@Cast("const char*") BytePointer tensorName, int profileIndex);

    /**
     *  \brief Return the human readable description of the tensor format, or empty string if the provided name does not
     *  map to an input or output tensor.
     * 
     *  The description includes the order, vectorization, data type, and strides.
     *  Examples are shown as follows:
     *    Example 1: kCHW + FP32
     *      "Row-major linear FP32 format"
     *    Example 2: kCHW2 + FP16
     *      "Two-wide channel vectorized row-major FP16 format"
     *    Example 3: kHWC8 + FP16 + Line Stride = 32
     *      "Channel major FP16 format where C % 8 == 0 and H Stride % 32 == 0"
     * 
     *  @param tensorName The name of an input or output tensor.
     * 
     *  \warning The string tensorName must be null-terminated, and be at most 4096 bytes including the terminator.
     *  \warning The function can only return the result of profile 0, and issues a warning message when there are
     *  multiple profiles in the engine, use getTensorFormatDesc with profileIndex when there are multiple profiles.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) String getTensorFormatDesc(String tensorName);
    public native @NoException(true) @Cast("const char*") BytePointer getTensorFormatDesc(@Cast("const char*") BytePointer tensorName);

    /**
     *  \brief Return the human readable description of the tensor format of given profile, or empty string if the
     *  provided name does not map to an input or output tensor.
     * 
     *  The description includes the order, vectorization, data type, and strides.
     *  Examples are shown as follows:
     *    Example 1: kCHW + FP32
     *      "Row-major linear FP32 format"
     *    Example 2: kCHW2 + FP16
     *      "Two-wide channel vectorized row-major FP16 format"
     *    Example 3: kHWC8 + FP16 + Line Stride = 32
     *      "Channel major FP16 format where C % 8 == 0 and H Stride % 32 == 0"
     * 
     *  @param tensorName The name of an input or output tensor.
     *  @param profileIndex The profile index to query the format for.
     * 
     *  \warning The string tensorName must be null-terminated, and be at most 4096 bytes including the terminator.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) String getTensorFormatDesc(String tensorName, int profileIndex);
    public native @NoException(true) @Cast("const char*") BytePointer getTensorFormatDesc(@Cast("const char*") BytePointer tensorName, int profileIndex);

    /**
     *  \brief Return the dimension index that the buffer is vectorized, or -1 if the provided name does not
     *  map to an input or output tensor.
     * 
     *  Specifically -1 is returned if scalars per vector is 1.
     * 
     *  @param tensorName The name of an input or output tensor.
     * 
     *  \warning The string tensorName must be null-terminated, and be at most 4096 bytes including the terminator.
     *  \warning The function can only return the result of profile 0, and issues a warning message when there are
     *   multiple profiles in the engine, use getTensorVectorizedDim with profileIndex when there are multiple profiles.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) int getTensorVectorizedDim(String tensorName);
    public native @NoException(true) int getTensorVectorizedDim(@Cast("const char*") BytePointer tensorName);

    /**
     *  \brief Return the dimension index that the buffer is vectorized of given profile, or -1 if the provided name
     *  does not map to an input or output tensor.
     * 
     *  Specifically -1 is returned if scalars per vector is 1.
     * 
     *  @param tensorName The name of an input.
     *  @param profileIndex The profile index to query the format for.
     * 
     *  \warning The string tensorName must be null-terminated, and be at most 4096 bytes including the terminator.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) int getTensorVectorizedDim(String tensorName, int profileIndex);
    public native @NoException(true) int getTensorVectorizedDim(@Cast("const char*") BytePointer tensorName, int profileIndex);

    /**
     *  \brief Returns the name of the network associated with the engine.
     * 
     *  The name is set during network creation and is retrieved after
     *  building or deserialization.
     * 
     *  @see INetworkDefinition::setName(), INetworkDefinition::getName()
     * 
     *  @return A null-terminated C-style string representing the name of the network.
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) String getName();

    /**
     *  \brief Get the number of optimization profiles defined for this engine.
     * 
     *  @return Number of optimization profiles. It is always at least 1.
     * 
     *  @see IExecutionContext::setOptimizationProfileAsync() */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) int getNbOptimizationProfiles();

    /**
     *  \brief Get the minimum / optimum / maximum dimensions for an input tensor given its name under an optimization
     *  profile.
     * 
     *  @param tensorName The name of an input tensor.
     * 
     *  @param profileIndex The profile index, which must be between 0 and getNbOptimizationProfiles()-1.
     * 
     *  @param select Whether to query the minimum, optimum, or maximum dimensions for this input tensor.
     * 
     *  @return The minimum / optimum / maximum dimensions for an input tensor in this profile.
     *          If the profileIndex is invalid or provided name does not map to an input tensor, return Dims{-1, {}}
     * 
     *  \warning The string tensorName must be null-terminated, and be at most 4096 bytes including the terminator.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims64 getProfileShape(String tensorName, int profileIndex, OptProfileSelector select);
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims64 getProfileShape(@Cast("const char*") BytePointer tensorName, int profileIndex, @Cast("nvinfer1::OptProfileSelector") int select);

    /**
     *  \brief Get the minimum / optimum / maximum values (not dimensions) for an input tensor given
     *  its name under an optimization profile. These correspond to the values set using
     *  IOptimizationProfile::setShapeValues when the engine was built.
     * 
     *  @param tensorName The name of an input tensor.
     * 
     *  @param profileIndex The profile index, which must be between 0 and getNbOptimizationProfiles()-1.
     * 
     *  @param select Whether to query the minimum, optimum, or maximum values for this input tensor.
     * 
     *  @return The minimum / optimum / maximum values for an input tensor in this profile.
     *         If the profileIndex is invalid or the provided name does not map to an input tensor, return nullptr.
     * 
     *  \warning The string tensorName must be null-terminated, and be at most 4096 bytes including the terminator.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Const @NoException(true) IntPointer getProfileTensorValues(String tensorName, int profileIndex, OptProfileSelector select);
    public native @Const @NoException(true) IntBuffer getProfileTensorValues(@Cast("const char*") BytePointer tensorName, int profileIndex, @Cast("nvinfer1::OptProfileSelector") int select);

    /**
     *  \brief Determine what execution capability this engine has.
     * 
     *  If the engine has EngineCapability::kSTANDARD, then all engine functionality is valid.
     *  If the engine has EngineCapability::kSAFETY, then only the functionality in safe engine is valid.
     *  If the engine has EngineCapability::kDLA_STANDALONE, then only serialize, destroy, and const-accessor functions
     *  are valid.
     * 
     *  @return The EngineCapability flag that the engine was built for.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) EngineCapability getEngineCapability();

    /**
     *  \brief Set the ErrorRecorder for this interface
     * 
     *  Assigns the ErrorRecorder to this interface. The ErrorRecorder will track all errors during execution.
     *  This function will call incRefCount of the registered ErrorRecorder at least once. Setting
     *  recorder to nullptr unregisters the recorder with the interface, resulting in a call to decRefCount if
     *  a recorder has been registered.
     * 
     *  If an error recorder is not set, messages will be sent to the global log stream.
     * 
     *  @param recorder The error recorder to register with this interface.
     * 
     *  @see getErrorRecorder()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) void setErrorRecorder(IErrorRecorder recorder);

    /**
     *  \brief Get the ErrorRecorder assigned to this interface.
     * 
     *  Retrieves the assigned error recorder object for the given class. A nullptr will be returned if
     *  an error handler has not been set.
     * 
     *  @return A pointer to the IErrorRecorder object that has been registered.
     * 
     *  @see setErrorRecorder()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) IErrorRecorder getErrorRecorder();

    /**
     *  \brief Query whether the engine was built with an implicit batch dimension.
     * 
     *  @return Always false since TensorRT 10.0 does not support an implicit batch dimension.
     * 
     *  @see createNetworkV2
     * 
     *  @deprecated Deprecated in TensorRT 10.0. Implicit batch is no supported since TensorRT 10.0.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Cast("bool") @Deprecated @NoException(true) boolean hasImplicitBatchDimension();

    /**
     *  \brief return the tactic sources required by this engine.
     * 
     *  The value returned is equal to zero or more tactics sources set
     *  at build time via setTacticSources() in IBuilderConfig. Sources
     *  set by the latter but not returned by \ref ICudaEngine::getTacticSources
     *  do not reduce overall engine execution time, and can be removed from
     *  future builds to reduce build time.
     * 
     *  @see IBuilderConfig::setTacticSources()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Cast("nvinfer1::TacticSources") @NoException(true) int getTacticSources();

    /**
     *  \brief Return the \ref ProfilingVerbosity the builder config was set to when the engine was built.
     * 
     *  @return the profiling verbosity the builder config was set to when the engine was built.
     * 
     *  @see IBuilderConfig::setProfilingVerbosity()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) ProfilingVerbosity getProfilingVerbosity();

    /**
     *  \brief Create a new engine inspector which prints the layer information in an engine or an execution context.
     * 
     *  @see IEngineInspector.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) IEngineInspector createEngineInspector();

    /**
     *  \brief Return number of IO tensors.
     * 
     *  It is the number of input and output tensors for the network from which the engine was built.
     *  The names of the IO tensors can be discovered by calling getIOTensorName(i) for i in 0 to getNbIOTensors()-1.
     * 
     *  @see getIOTensorName()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) int getNbIOTensors();

    /**
     *  \brief Return name of an IO tensor.
     * 
     *  @param index value between 0 and getNbIOTensors()-1
     * 
     *  @see getNbIOTensors()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) String getIOTensorName(int index);

    /**
     *  \brief Return the hardware compatibility level of this engine.
     * 
     *  @return hardwareCompatibilityLevel The level of hardware
     *         compatibility.
     * 
     *  This is only supported for Ampere and newer architectures.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @ByVal @NoException(true) HardwareCompatibilityLevel getHardwareCompatibilityLevel();

    /**
     *  \brief Return the number of auxiliary streams used by this engine.
     * 
     *  This number will be less than or equal to the maximum allowed number of auxiliary streams set by
     *  IBuilderConfig::setMaxAuxStreams() API call when the engine was built.
     * 
     *  @return the number of auxiliary streams used by this engine.
     * 
     *  @see IBuilderConfig::setMaxAuxStreams(), IExecutionContext::setAuxStreams()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) int getNbAuxStreams();

    /**
     *  \brief Create a serialization configuration object.
     * 
     *  @see ISerializationConfig
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) ISerializationConfig createSerializationConfig();

    /**
     *  \brief Serialize the network to a stream with the provided SerializationConfig.
     * 
     *  @return An IHostMemory object that contains the serialized engine.
     * 
     *  The network may be deserialized with IRuntime::deserializeCudaEngine().
     * 
     *  @see IRuntime::deserializeCudaEngine()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) IHostMemory serializeWithConfig(@ByRef ISerializationConfig config);

    /**
     *  \brief Limit the maximum amount of GPU memory usable for network weights
     *  in bytes.
     * 
     *  @param gpuMemoryBudget  This parameter may take on 3 types of values:
     *   -1: Allows TensorRT to choose the budget according to the streamable weights size.
     *       Free CUDA memory will be queried at ::createExecutionContext and accordingly:
     *        * If streamable weights all fit: weight streaming is not required and disabled.
     *        * Otherwise: Budget is set to getMinimumWeightStreamingBudget
     *    0: (default) Disables weight streaming. The execution may fail if the network is too large for GPU memory.
     *   >0: The maximum bytes of GPU memory that weights can occupy. It must be bounded by
     *       [getMinimumWeightStreamingBudget, min(getStreamableWeightsSize - 1, free GPU memory)].
     * 
     *  By setting a weight limit, users can expect a GPU memory usage reduction
     *  of |network weights| - gpuMemoryBudget bytes. Maximum memory savings occur
     *  when gpuMemoryBudget is set to getMinimumWeightStreamingBudget.
     * 
     *  Streaming larger amounts of memory will likely result in lower performance
     *  except in some boundary cases where streaming weights allows the user to
     *  run larger batch sizes. The higher throughput offsets the increased
     *  latency in these cases. Tuning the value of the memory limit is
     *  recommended for best performance.
     * 
     *  \warning If weight streaming is active, then multiple concurrent IExecutionContexts will forced to run serially.
     * 
     *  \warning GPU memory for the weights is allocated upon the first IExecutionContext's creation
     *           and deallocated upon the last one's destruction.
     * 
     *  \warning BuilderFlag::kWEIGHT_STREAMING must be set during engine building.
     * 
     *  @return true if the memory limit is valid and the call was successful
     *          otherwise false.
     * 
     *  @see BuilderFlag::kWEIGHT_STREAMING,
     *       ICudaEngine::getWeightStreamingBudget
     *       ICudaEngine::getMinimumWeightStreamingBudget,
     *       ICudaEngine::getStreamableWeightsSize
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean setWeightStreamingBudget(@Cast("int64_t") long gpuMemoryBudget);

    /**
     *  \brief Returns the current weight streaming device memory budget in bytes.
     * 
     *  \warning BuilderFlag::kWEIGHT_STREAMING must be set during engine building.
     * 
     *  @return The weight streaming budget in bytes. Please see ::setWeightStreamingBudget for the possible
     *           values.
     * 
     *  @see BuilderFlag::kWEIGHT_STREAMING,
     *       ICudaEngine::setWeightStreamingBudget,
     *       ICudaEngine::getMinimumWeightStreamingBudget,
     *       ICudaEngine::getStreamableWeightsSize
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Cast("int64_t") @NoException(true) long getWeightStreamingBudget();

    /**
     *  \brief The minimum number of bytes of GPU memory required by network
     *  weights for successful weight streaming.
     * 
     *  This is a positive integer for engines with streamable weights because a
     *  staging buffer on the GPU is required to temporarily hold the streamed
     *  weights. The size of the staging buffer is determined by TensorRT and must
     *  be at least as large as the size of the largest streamable weight in the
     *  network.
     * 
     *  \warning BuilderFlag::kWEIGHT_STREAMING must be set during engine building.
     * 
     * 
     *  @return The minimum number of bytes of GPU memory required for streaming.
     * 
     *  @see ICudaEngine::setWeightStreamingBudget
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Cast("int64_t") @NoException(true) long getMinimumWeightStreamingBudget();

    /**
     *  \brief Get the total size in bytes of all streamable weights.
     * 
     *  The set of streamable weights is a subset of all network weights. The
     *  total size may exceed free GPU memory.
     * 
     *  Returns 0 if BuilderFlag::kWEIGHT_STREAMING is unset during engine building.
     * 
     * 
     *  @return The total size in bytes of all streamable weights.
     * 
     *  @see ICudaEngine::setWeightStreamingBudget
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @Cast("int64_t") @NoException(true) long getStreamableWeightsSize();

    /**
     *  \brief Check if a tensor is marked as a debug tensor.
     * 
     *  Determine whether the given name corresponds to a debug tensor.
     * 
     *  @return True if tensor is a debug tensor, false otherwise.
     * 
     *  @see INetworkDefinition::markDebug
     *  */
    public native @Cast("bool") @NoException(true) boolean isDebugTensor(String name);
    public native @Cast("bool") @NoException(true) boolean isDebugTensor(@Cast("const char*") BytePointer name);
}
