// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


/**
 * \brief A registry to hold all the operator schemas.
 */
@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class OpSchemaRegistry extends ISchemaRegistry {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OpSchemaRegistry(Pointer p) { super(p); }

  // A singleton class to store domain to min/max op_set version map, as well as
  // domain to last-release op_set version map.
  @NoOffset public static class DomainToVersionRange extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public DomainToVersionRange(Pointer p) { super(p); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public DomainToVersionRange(long size) { super((Pointer)null); allocateArray(size); }
      private native void allocateArray(long size);
      @Override public DomainToVersionRange position(long position) {
          return (DomainToVersionRange)super.position(position);
      }
      @Override public DomainToVersionRange getPointer(long i) {
          return new DomainToVersionRange((Pointer)this).offsetAddress(i);
      }
  
    public DomainToVersionRange() { super((Pointer)null); allocate(); }
    private native void allocate();

    public native @Const @ByRef StringIntIntPairMap Map();

    public native @Const @ByRef StringIntMap LastReleaseVersionMap();

    // Add customized domain to min/max version.
    // Onnx partners are able to use onnx operator schema api to
    // register customized op in their own domain.
    // Can optionally specify last_release_version (to make it similar to
    // standard ONNX domains as above). Custom-domains are free to interpret
    // this as appropriate (that is, as relative to releases of custom-domain
    // as opposed to ONNX releases).
    public native void AddDomainToVersion(@StdString BytePointer domain, int min_version, int max_version, int last_release_version/*=-1*/);
    public native void AddDomainToVersion(@StdString BytePointer domain, int min_version, int max_version);
    public native void AddDomainToVersion(@StdString String domain, int min_version, int max_version, int last_release_version/*=-1*/);
    public native void AddDomainToVersion(@StdString String domain, int min_version, int max_version);

    public static native @ByRef DomainToVersionRange Instance();
  }

  public static class OpSchemaRegisterOnce extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public OpSchemaRegisterOnce(Pointer p) { super(p); }
  
    public OpSchemaRegisterOnce(@ByRef OpSchema op_schema, int opset_version_to_load/*=0*/, @Cast("bool") boolean fail_duplicate_schema/*=true*/) { super((Pointer)null); allocate(op_schema, opset_version_to_load, fail_duplicate_schema); }
    private native void allocate(@ByRef OpSchema op_schema, int opset_version_to_load/*=0*/, @Cast("bool") boolean fail_duplicate_schema/*=true*/);
    public OpSchemaRegisterOnce(@ByRef OpSchema op_schema) { super((Pointer)null); allocate(op_schema); }
    private native void allocate(@ByRef OpSchema op_schema);
  }

  // Deregister all ONNX opset schemas from domain
  // Domain with default value ONNX_DOMAIN means ONNX.
  public static native void OpSchemaDeregisterAll(@StdString BytePointer domain/*=ONNX_DOMAIN*/);
  public static native void OpSchemaDeregisterAll();
  public static native void OpSchemaDeregisterAll(@StdString String domain/*=ONNX_DOMAIN*/);

  // Return the latest schema for an operator in specified domain.
  // Domain with default value ONNX_DOMAIN means ONNX.
  public static native @Const OpSchema Schema(@StdString BytePointer key, @StdString BytePointer domain/*=ONNX_DOMAIN*/);
  public static native @Const OpSchema Schema(@StdString BytePointer key);
  public static native @Const OpSchema Schema(@StdString String key, @StdString String domain/*=ONNX_DOMAIN*/);
  public static native @Const OpSchema Schema(@StdString String key);

  // Return the schema with biggest version, which is not greater than specified
  // <maxInclusiveVersion> in specified domain. Domain with default value
  // ONNX_DOMAIN means ONNX.
  public static native @Const OpSchema Schema(@StdString BytePointer key, int maxInclusiveVersion, @StdString BytePointer domain/*=ONNX_DOMAIN*/);
  public static native @Const OpSchema Schema(@StdString BytePointer key, int maxInclusiveVersion);
  public static native @Const OpSchema Schema(@StdString String key, int maxInclusiveVersion, @StdString String domain/*=ONNX_DOMAIN*/);
  public static native @Const OpSchema Schema(@StdString String key, int maxInclusiveVersion);

  public static native OpSchemaRegistry Instance();

  public native @Const OpSchema GetSchema(
        @StdString BytePointer key,
        int maxInclusiveVersion,
        @StdString BytePointer domain/*=ONNX_DOMAIN*/);
  public native @Const OpSchema GetSchema(
        @StdString BytePointer key,
        int maxInclusiveVersion);
  public native @Const OpSchema GetSchema(
        @StdString String key,
        int maxInclusiveVersion,
        @StdString String domain/*=ONNX_DOMAIN*/);
  public native @Const OpSchema GetSchema(
        @StdString String key,
        int maxInclusiveVersion);
  public static native void SetLoadedSchemaVersion(int target_version);
  public static native int GetLoadedSchemaVersion();
  public static native @Const @ByVal OpSchemaVector get_all_schemas_with_history();

  public static native @Const @ByVal OpSchemaVector get_all_schemas();
}
