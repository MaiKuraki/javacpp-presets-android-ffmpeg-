// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_bioinspired;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;

import static org.bytedeco.opencv.global.opencv_bioinspired.*;



/** \brief retina model parameters structure
    <p>
    For better clarity, check explenations on the comments of methods : setupOPLandIPLParvoChannel and setupIPLMagnoChannel
    <p>
    Here is the default configuration file of the retina module. It gives results such as the first
    retina output shown on the top of this page.
    <p>
    <pre>{@code {xml}
    <?xml version="1.0"?>
    <opencv_storage>
    <OPLandIPLparvo>
        <colorMode>1</colorMode>
        <normaliseOutput>1</normaliseOutput>
        <photoreceptorsLocalAdaptationSensitivity>7.5e-01</photoreceptorsLocalAdaptationSensitivity>
        <photoreceptorsTemporalConstant>9.0e-01</photoreceptorsTemporalConstant>
        <photoreceptorsSpatialConstant>5.3e-01</photoreceptorsSpatialConstant>
        <horizontalCellsGain>0.01</horizontalCellsGain>
        <hcellsTemporalConstant>0.5</hcellsTemporalConstant>
        <hcellsSpatialConstant>7.</hcellsSpatialConstant>
        <ganglionCellsSensitivity>7.5e-01</ganglionCellsSensitivity></OPLandIPLparvo>
    <IPLmagno>
        <normaliseOutput>1</normaliseOutput>
        <parasolCells_beta>0.</parasolCells_beta>
        <parasolCells_tau>0.</parasolCells_tau>
        <parasolCells_k>7.</parasolCells_k>
        <amacrinCellsTemporalCutFrequency>2.0e+00</amacrinCellsTemporalCutFrequency>
        <V0CompressionParameter>9.5e-01</V0CompressionParameter>
        <localAdaptintegration_tau>0.</localAdaptintegration_tau>
        <localAdaptintegration_k>7.</localAdaptintegration_k></IPLmagno>
    </opencv_storage>
    }</pre>
    <p>
    Here is the 'realistic" setup used to obtain the second retina output shown on the top of this page.
    <p>
    <pre>{@code {xml}
    <?xml version="1.0"?>
    <opencv_storage>
    <OPLandIPLparvo>
      <colorMode>1</colorMode>
      <normaliseOutput>1</normaliseOutput>
      <photoreceptorsLocalAdaptationSensitivity>8.9e-01</photoreceptorsLocalAdaptationSensitivity>
      <photoreceptorsTemporalConstant>9.0e-01</photoreceptorsTemporalConstant>
      <photoreceptorsSpatialConstant>5.3e-01</photoreceptorsSpatialConstant>
      <horizontalCellsGain>0.3</horizontalCellsGain>
      <hcellsTemporalConstant>0.5</hcellsTemporalConstant>
      <hcellsSpatialConstant>7.</hcellsSpatialConstant>
      <ganglionCellsSensitivity>8.9e-01</ganglionCellsSensitivity></OPLandIPLparvo>
    <IPLmagno>
      <normaliseOutput>1</normaliseOutput>
      <parasolCells_beta>0.</parasolCells_beta>
      <parasolCells_tau>0.</parasolCells_tau>
      <parasolCells_k>7.</parasolCells_k>
      <amacrinCellsTemporalCutFrequency>2.0e+00</amacrinCellsTemporalCutFrequency>
      <V0CompressionParameter>9.5e-01</V0CompressionParameter>
      <localAdaptintegration_tau>0.</localAdaptintegration_tau>
      <localAdaptintegration_k>7.</localAdaptintegration_k></IPLmagno>
    </opencv_storage>
    }</pre>
      */
    @Namespace("cv::bioinspired") @Properties(inherit = org.bytedeco.opencv.presets.opencv_bioinspired.class)
public class RetinaParameters extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public RetinaParameters() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public RetinaParameters(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public RetinaParameters(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public RetinaParameters position(long position) {
            return (RetinaParameters)super.position(position);
        }
        @Override public RetinaParameters getPointer(long i) {
            return new RetinaParameters((Pointer)this).offsetAddress(i);
        }
    
        /** Outer Plexiform Layer (OPL) and Inner Plexiform Layer Parvocellular (IplParvo) parameters */
        @NoOffset public static class OPLandIplParvoParameters extends Pointer {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public OPLandIplParvoParameters(Pointer p) { super(p); }
            /** Native array allocator. Access with {@link Pointer#position(long)}. */
            public OPLandIplParvoParameters(long size) { super((Pointer)null); allocateArray(size); }
            private native void allocateArray(long size);
            @Override public OPLandIplParvoParameters position(long position) {
                return (OPLandIplParvoParameters)super.position(position);
            }
            @Override public OPLandIplParvoParameters getPointer(long i) {
                return new OPLandIplParvoParameters((Pointer)this).offsetAddress(i);
            }
        
               public OPLandIplParvoParameters() { super((Pointer)null); allocate(); }
               private native void allocate(); // default setup
               public native @Cast("bool") boolean colorMode(); public native OPLandIplParvoParameters colorMode(boolean setter);
               public native @Cast("bool") boolean normaliseOutput(); public native OPLandIplParvoParameters normaliseOutput(boolean setter);
               public native float photoreceptorsLocalAdaptationSensitivity(); public native OPLandIplParvoParameters photoreceptorsLocalAdaptationSensitivity(float setter);
               public native float photoreceptorsTemporalConstant(); public native OPLandIplParvoParameters photoreceptorsTemporalConstant(float setter);
               public native float photoreceptorsSpatialConstant(); public native OPLandIplParvoParameters photoreceptorsSpatialConstant(float setter);
               public native float horizontalCellsGain(); public native OPLandIplParvoParameters horizontalCellsGain(float setter);
               public native float hcellsTemporalConstant(); public native OPLandIplParvoParameters hcellsTemporalConstant(float setter);
               public native float hcellsSpatialConstant(); public native OPLandIplParvoParameters hcellsSpatialConstant(float setter);
               public native float ganglionCellsSensitivity(); public native OPLandIplParvoParameters ganglionCellsSensitivity(float setter);
        }
        /** Inner Plexiform Layer Magnocellular channel (IplMagno) */
        @NoOffset public static class IplMagnoParameters extends Pointer {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public IplMagnoParameters(Pointer p) { super(p); }
            /** Native array allocator. Access with {@link Pointer#position(long)}. */
            public IplMagnoParameters(long size) { super((Pointer)null); allocateArray(size); }
            private native void allocateArray(long size);
            @Override public IplMagnoParameters position(long position) {
                return (IplMagnoParameters)super.position(position);
            }
            @Override public IplMagnoParameters getPointer(long i) {
                return new IplMagnoParameters((Pointer)this).offsetAddress(i);
            }
        
            public IplMagnoParameters() { super((Pointer)null); allocate(); }
            private native void allocate(); // default setup
            public native @Cast("bool") boolean normaliseOutput(); public native IplMagnoParameters normaliseOutput(boolean setter);
            public native float parasolCells_beta(); public native IplMagnoParameters parasolCells_beta(float setter);
            public native float parasolCells_tau(); public native IplMagnoParameters parasolCells_tau(float setter);
            public native float parasolCells_k(); public native IplMagnoParameters parasolCells_k(float setter);
            public native float amacrinCellsTemporalCutFrequency(); public native IplMagnoParameters amacrinCellsTemporalCutFrequency(float setter);
            public native float V0CompressionParameter(); public native IplMagnoParameters V0CompressionParameter(float setter);
            public native float localAdaptintegration_tau(); public native IplMagnoParameters localAdaptintegration_tau(float setter);
            public native float localAdaptintegration_k(); public native IplMagnoParameters localAdaptintegration_k(float setter);
        }
        public native @ByRef OPLandIplParvoParameters OPLandIplParvo(); public native RetinaParameters OPLandIplParvo(OPLandIplParvoParameters setter);
        public native @ByRef IplMagnoParameters IplMagno(); public native RetinaParameters IplMagno(IplMagnoParameters setter);
    }
