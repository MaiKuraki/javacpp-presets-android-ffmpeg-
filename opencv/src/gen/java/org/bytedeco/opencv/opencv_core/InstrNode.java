// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


/** \endcond */


// Basic Node class for tree building
@Name("cv::Node<cv::instr::NodeData>") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class InstrNode extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public InstrNode(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public InstrNode(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public InstrNode position(long position) {
        return (InstrNode)super.position(position);
    }
    @Override public InstrNode getPointer(long i) {
        return new InstrNode((Pointer)this).offsetAddress(i);
    }

    public InstrNode() { super((Pointer)null); allocate(); }
    private native void allocate();
    public InstrNode(@ByRef NodeData payload) { super((Pointer)null); allocate(payload); }
    private native void allocate(@ByRef NodeData payload);

    public native InstrNode findChild(@ByRef NodeData payload);

    public native int findChild(InstrNode pNode);

    public native void addChild(InstrNode pNode);

    public native void removeChilds();

    public native int getDepth();
    public native @ByRef NodeData m_payload(); public native InstrNode m_payload(NodeData setter);
    public native InstrNode m_pParent(); public native InstrNode m_pParent(InstrNode setter);
    public native @Cast("cv::Node<cv::instr::NodeData>**") @StdVector PointerPointer m_childs(); public native InstrNode m_childs(PointerPointer setter);
}
