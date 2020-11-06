// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

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
 *  \class IConvolutionLayer
 * 
 *  \brief A convolution layer in a network definition.
 * 
 *  This layer performs a correlation operation between 3-dimensional filter with a 4-dimensional tensor to produce
 *  another 4-dimensional tensor.
 * 
 *  An optional bias argument is supported, which adds a per-channel constant to each value in the output.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IConvolutionLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IConvolutionLayer(Pointer p) { super(p); }

    /**
     *  \brief Set the HW kernel size of the convolution.
     * 
     *  If executing this layer on DLA, both height and width of kernel size must be in the range [1,32].
     * 
     *  @see getKernelSize()
     * 
     *  @deprecated Superseded by setKernelSizeNd and will be removed in TensorRT 9.0.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Deprecated void setKernelSize(@ByVal DimsHW kernelSize);

    /**
     *  \brief Get the HW kernel size of the convolution.
     * 
     *  @see setKernelSize()
     * 
     *  @deprecated Superseded by getKernelSizeNd and will be removed in TensorRT 9.0.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Deprecated @ByVal DimsHW getKernelSize();

    /**
     *  \brief Set the number of output maps for the convolution.
     * 
     *  If executing this layer on DLA, the number of output maps must be in the range [1,8192].
     * 
     *  @see getNbOutputMaps()
     *  */
    
    
    //!
    //!
    //!
    public native void setNbOutputMaps(int nbOutputMaps);

    /**
     *  \brief Get the number of output maps for the convolution.
     * 
     *  @see setNbOutputMaps()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native int getNbOutputMaps();

    /**
     *  \brief Get the stride of the convolution.
     * 
     *  Default: (1,1)
     * 
     *  If executing this layer on DLA, both height and width of stride must be in the range [1,8].
     * 
     *  @see getStride()
     * 
     *  @deprecated Superseded by setStrideNd and will be removed in TensorRT 9.0.
     *  */
    
    
    //!
    //!
    //!
    public native @Deprecated void setStride(@ByVal DimsHW stride);

    /**
     *  \brief Get the stride of the convolution.
     * 
     *  @deprecated Superseded by getStrideNd and will be removed in TensorRT 9.0.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Deprecated @ByVal DimsHW getStride();

    /**
     *  \brief Set the padding of the convolution.
     * 
     *  The input will be zero-padded by this number of elements in the height and width directions.
     *  Padding is symmetric.
     * 
     *  Default: (0,0)
     * 
     *  If executing this layer on DLA, both height and width of padding must be in the range [0,31],
     *  and the padding size must be less than the kernel size.
     * 
     *  @see getPadding()
     * 
     *  @deprecated Superseded by setPaddingNd and will be removed in TensorRT 9.0.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Deprecated void setPadding(@ByVal DimsHW padding);

    /**
     *  \brief Get the padding of the convolution. If the padding is asymmetric, the pre-padding is returned.
     * 
     *  @see setPadding()
     * 
     *  @deprecated Superseded by getPaddingNd and will be removed in TensorRT 9.0.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Deprecated @ByVal DimsHW getPadding();

    /**
     *  \brief Set the number of groups for a convolution.
     * 
     *  The input tensor channels are  divided into \p nbGroups groups, and a convolution is executed for each group,
     *  using a filter per group. The results of the group convolutions are concatenated to form the output.
     * 
     *  \note When using groups in int8 mode, the size of the groups (i.e. the channel count divided by the group
     *  count) must be a multiple of 4 for both input and output.
     * 
     *  Default: 1
     * 
     *  If executing this layer on DLA, the max number of groups is 8192.
     * 
     *  @see getNbGroups()
     *  */
    
    
    //!
    //!
    //!
    public native void setNbGroups(int nbGroups);

    /**
     *  \brief Get the number of groups of the convolution.
     * 
     *  @see setNbGroups()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native int getNbGroups();

    /**
     *  \brief Set the kernel weights for the convolution.
     * 
     *  The weights are specified as a contiguous array in \p GKCRS order, where \p G is the number of groups, \p K
     *  the number of output feature maps, \p C the number of input channels, and \p R and \p S are the height and
     *  width of the filter.
     * 
     *  @see getKernelWeights()
     *  */
    
    
    //!
    //!
    //!
    public native void setKernelWeights(@ByVal Weights weights);

    /**
     *  \brief Get the kernel weights of the convolution.
     * 
     *  @see setKernelWeights()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @ByVal Weights getKernelWeights();

    /**
     *  \brief Set the bias weights for the convolution.
     * 
     *  Bias is optional. To omit bias, set the count value of the weights structure to zero.
     * 
     *  The bias is applied per-channel, so the number of weights (if non-zero) must be equal to the number of output
     *  feature maps.
     * 
     *  @see getBiasWeights()
     *  */
    
    
    //!
    //!
    //!
    public native void setBiasWeights(@ByVal Weights weights);

    /**
     *  \brief Get the bias weights for the convolution.
     * 
     *  @see setBiasWeights()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @ByVal Weights getBiasWeights();

    /**
     *  \brief Set the dilation for a convolution.
     * 
     *  Default: (1,1)
     * 
     *  If executing this layer on DLA, both height and width must be in the range [1,32].
     * 
     *  @see getDilation()
     * 
     *  @deprecated Superseded by setDilationNd and will be removed in TensorRT 9.0.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Deprecated void setDilation(@ByVal DimsHW dilation);

    /**
     *  \brief Get the dilation for a convolution.
     * 
     *  @see setDilation()
     * 
     *  @deprecated Superseded by getDilationNd and will be removed in TensorRT 9.0.
     *  */
    public native @Deprecated @ByVal DimsHW getDilation();
    /**
     *  \brief Set the multi-dimension pre-padding of the convolution.
     * 
     *  The start of the input will be zero-padded by this number of elements in each dimension.
     * 
     *  Default: (0, 0, ..., 0)
     * 
     *  If executing this layer on DLA, only support 2D padding, both height and width of padding must be in the range
     *  [0,31], and the padding must be less than the kernel size.
     * 
     *  @see getPrePadding()
     *  */
    
    
    //!
    //!
    //!
    public native void setPrePadding(@ByVal Dims padding);

    /**
     *  \brief Get the pre-padding.
     * 
     *  @see setPrePadding()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @ByVal Dims getPrePadding();

    /**
     *  \brief Set the multi-dimension post-padding of the convolution.
     * 
     *  The end of the input will be zero-padded by this number of elements in each dimension.
     * 
     *  Default: (0, 0, ..., 0)
     * 
     *  If executing this layer on DLA, only support 2D padding, both height and width of padding must be in the range
     *  [0,31], and the padding must be less than the kernel size.
     * 
     *  @see getPostPadding()
     *  */
    
    
    //!
    //!
    //!
    public native void setPostPadding(@ByVal Dims padding);

    /**
     *  \brief Get the post-padding.
     * 
     *  @see setPostPadding()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @ByVal Dims getPostPadding();

    /**
     *  \brief Set the padding mode.
     * 
     *  Padding mode takes precedence if both setPaddingMode and setPre/PostPadding are used.
     * 
     *  Default: kEXPLICIT_ROUND_DOWN
     * 
     *  @see getPaddingMode()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native void setPaddingMode(PaddingMode paddingMode);
    public native void setPaddingMode(@Cast("nvinfer1::PaddingMode") int paddingMode);

    /**
     *  \brief Get the padding mode.
     * 
     *  Default: kEXPLICIT_ROUND_DOWN
     * 
     *  @see setPaddingMode()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native PaddingMode getPaddingMode();

    /**
     *  \brief Set the multi-dimension kernel size of the convolution.
     * 
     *  If executing this layer on DLA, only support 2D kernel size, both height and width of kernel size must be in the
     *  range [1,32].
     * 
     *  @see getKernelSizeNd()
     *  */
    
    
    //!
    //!
    //!
    public native void setKernelSizeNd(@ByVal Dims kernelSize);

    /**
     *  \brief Get the multi-dimension kernel size of the convolution.
     * 
     *  @see setKernelSizeNd()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @ByVal Dims getKernelSizeNd();

    /**
     *  \brief Set the multi-dimension stride of the convolution.
     * 
     *  Default: (1, 1, ..., 1)
     * 
     *  If executing this layer on DLA, only support 2D stride, both height and width of stride must be in the range [1,8].
     * 
     *  @see getStrideNd() setStride() getStride()
     *  */
    
    
    //!
    //!
    //!
    public native void setStrideNd(@ByVal Dims stride);

    /**
     *  \brief Get the multi-dimension stride of the convolution.
     * 
     *  @see setStrideNd()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @ByVal Dims getStrideNd();

    /**
     *  \brief Set the multi-dimension padding of the convolution.
     * 
     *  The input will be zero-padded by this number of elements in each dimension.
     *  Padding is symmetric.
     * 
     *  Default: (0, 0, ..., 0)
     * 
     *  If executing this layer on DLA, only support 2D padding, both height and width of padding must be in the range
     *  [0,31], and the padding must be less than the kernel size.
     * 
     *  @see getPaddingNd() setPadding() getPadding()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native void setPaddingNd(@ByVal Dims padding);

    /**
     *  \brief Get the multi-dimension padding of the convolution.
     * 
     *  If the padding is asymmetric, the pre-padding is returned.
     * 
     *  @see setPaddingNd()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @ByVal Dims getPaddingNd();

    /**
     *  \brief Set the multi-dimension dilation of the convolution.
     * 
     *  Default: (1, 1, ..., 1)
     * 
     *  If executing this layer on DLA, only support 2D padding, both height and width must be in the range [1,32].
     * 
     *  @see getDilation()
     *  */
    
    
    //!
    //!
    //!
    public native void setDilationNd(@ByVal Dims dilation);

    /**
     *  \brief Get the multi-dimension dilation of the convolution.
     * 
     *  @see setDilation()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @ByVal Dims getDilationNd();

    /**
     *  \brief Append or replace an input of this layer with a specific tensor
     * 
     *  @param index the index of the input to modify.
     *  @param tensor the new input tensor
     * 
     *  For a IConvolutionLayer, only index 0 is valid unless explicit precision mode is enabled.
     *  With explicit precision mode, values 0-1 are valid where value 1 overrides kernel weights.
     *  Kernel weights tensor (computed at build-time) must be an output of dequantize scale layer (i.e. a scale layer
     *  with int8 input and float output) in explicit precision network. Conversely, this input tensor can be overridden
     *  via appropriate set call.
     * 
     *  The indices are as follows:
     * 
     *  - 0: The input activation tensor.
     *  - 1: The kernel weights tensor (a constant tensor).
     * 
     *  If this function is called with a value greater than 0, then the function getNbInputs() changes */
    public native void setInput(int index, @ByRef ITensor tensor);
}
