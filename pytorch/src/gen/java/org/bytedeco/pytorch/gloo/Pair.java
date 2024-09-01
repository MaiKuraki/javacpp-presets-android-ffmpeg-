// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch.gloo;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;
import org.bytedeco.pytorch.*;
import static org.bytedeco.pytorch.global.torch.*;

import static org.bytedeco.pytorch.global.gloo.*;


@Namespace("gloo::transport") @Properties(inherit = org.bytedeco.pytorch.presets.gloo.class)
public class Pair extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Pair(Pointer p) { super(p); }


  public native @Const @ByRef @Name("address") Address _address();

  public native void connect(@Cast("const std::vector<char>*") @ByRef ByteVector bytes);

  public native @Name("close") void _close();

  public native void setSync(@Cast("bool") boolean enable, @Cast("bool") boolean busyPoll);

  public native @UniquePtr Buffer createSendBuffer(int slot, Pointer ptr, @Cast("size_t") long size);

  public native @UniquePtr Buffer createRecvBuffer(int slot, Pointer ptr, @Cast("size_t") long size);

  // Send from the specified buffer to remote side of pair.
  public native void send(
        UnboundBuffer buf,
        @Cast("uint64_t") long tag,
        @Cast("size_t") long offset/*=0*/,
        @Cast("size_t") long nbytes/*=0*/);
  public native void send(
        UnboundBuffer buf,
        @Cast("uint64_t") long tag);

  // Receive into the specified buffer from the remote side of pair.
  public native void recv(
        UnboundBuffer buf,
        @Cast("uint64_t") long tag,
        @Cast("size_t") long offset/*=0*/,
        @Cast("size_t") long nbytes/*=0*/);
  public native void recv(
        UnboundBuffer buf,
        @Cast("uint64_t") long tag);

  // Sets the local rank of the process to be localRank
  // (See below for description of local rank)
  public native void setLocalRank(int localRank);

  // Returns the local rank of the process
  // (See below for description of local rank)
  public native int getLocalRank();
}
