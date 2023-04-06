// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

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
 *  \class ITopKLayer
 * 
 *  \brief Layer that represents a TopK reduction.
 * 
 *  This layer can accept both static and dynamic k. Static k can be set through the addTopK() API function,
 *  or accessed using the getK() and setK() functions after layer creation. For dynamic k, use the setInput()
 *  method to pass in k as a tensor with index 1, which overrides the static k value in calculations.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @NoOffset @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class ITopKLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ITopKLayer(Pointer p) { super(p); }

    /**
     *  \brief Set the operation for the layer.
     * 
     *  @see getOperation(), TopKOperation
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setOperation(TopKOperation op);
    public native @NoException(true) void setOperation(@Cast("nvinfer1::TopKOperation") int op);

    /**
     *  \brief Get the operation for the layer.
     * 
     *  @see setOperation(), TopKOperation
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) TopKOperation getOperation();

    /**
     *  \brief Set the static k value for the layer.
     * 
     *  Currently only values up to 3840 are supported.
     * 
     *  If a second input to this layer has been set, it will be reset to null by this method.
     * 
     *  @see getK()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) void setK(int k);

    /**
     *  \brief Get the k value for the layer.
     * 
     *  This function will return the static k value passed into addTopK(), or the value passed into setK().
     * 
     *  If a second layer input is present and non-null, this function returns -1.
     * 
     *  @see setK()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) int getK();

    /**
     *  \brief Set which axes to reduce for the layer.
     * 
     *  @see getReduceAxes()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setReduceAxes(@Cast("uint32_t") int reduceAxes);

    /**
     *  \brief Get the axes to reduce for the layer.
     * 
     *  @see setReduceAxes()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @Cast("uint32_t") @NoException(true) int getReduceAxes();

    /**
     *  \brief Append or replace an input of this layer with a specific tensor
     * 
     *  @param index The index of the input to modify.
     *  @param tensor The new input tensor.
     * 
     *  For a TopK layer, the values 0-1 are valid.
     *  The indices are as follows:
     * 
     *  - 0: Input data tensor.
     *  - 1: A scalar Int32 tensor containing a positive value corresponding to the number of top
     *       elements to retrieve. Values larger than 3840 will result in a runtime error. If provided,
     *       this will override the static k value in calculations.
     *  */
}
