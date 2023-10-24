// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.global;

import org.bytedeco.cuda.nccl.*;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

public class nccl extends org.bytedeco.cuda.presets.nccl {
    static { Loader.load(); }

// Parsed from nccl.h

/*************************************************************************
 * Copyright (c) 2015-2021, NVIDIA CORPORATION. All rights reserved.
 *
 * See LICENSE.txt for license information
 ************************************************************************/

// #ifndef NCCL_H_
// #define NCCL_H_

// #include <cuda_runtime.h>
// #include <cuda_fp16.h>
// #if CUDART_VERSION >= 11000
// #include <cuda_bf16.h>
// #endif

public static final int NCCL_MAJOR = 2;
public static final int NCCL_MINOR = 18;
public static final int NCCL_PATCH = 5;
public static final String NCCL_SUFFIX = "";

public static final int NCCL_VERSION_CODE = 21805;
// #define NCCL_VERSION(X,Y,Z) (((X) <= 2 && (Y) <= 8) ? (X) * 1000 + (Y) * 100 + (Z) : (X) * 10000 + (Y) * 100 + (Z))

// #ifdef __cplusplus
// #endif

// #include <limits.h>
// Targeting ../nccl/ncclComm.java


// #define NCCL_COMM_NULL NULL

public static final int NCCL_UNIQUE_ID_BYTES = 128;
// Targeting ../nccl/ncclUniqueId.java



/* Error type */
/** enum ncclResult_t */
public static final int ncclSuccess                 = 0,
               ncclUnhandledCudaError      = 1,
               ncclSystemError             = 2,
               ncclInternalError           = 3,
               ncclInvalidArgument         = 4,
               ncclInvalidUsage            = 5,
               ncclRemoteError             = 6,
               ncclInProgress              = 7,
               ncclNumResults              = 8;

// #define NCCL_CONFIG_UNDEF_INT INT_MIN
// #define NCCL_CONFIG_UNDEF_PTR NULL
public static final int NCCL_SPLIT_NOCOLOR = -1;
// Targeting ../nccl/ncclConfig_t.java



/* Config initializer must be assigned to initialize config structure when it is created.
 * Not initialized config will result in NCCL error. */
// #define NCCL_CONFIG_INITIALIZER {
//   sizeof(ncclConfig_t), /* size */
//   0xcafebeef,           /* magic */
//   NCCL_VERSION(NCCL_MAJOR, NCCL_MINOR, NCCL_PATCH), /* version */
//   NCCL_CONFIG_UNDEF_INT,                    /* blocking */
//   NCCL_CONFIG_UNDEF_INT,                    /* cgaClusterSize */
//   NCCL_CONFIG_UNDEF_INT,                    /* minCTAs */
//   NCCL_CONFIG_UNDEF_INT,                    /* maxCTAs */
//   NCCL_CONFIG_UNDEF_PTR,                    /* netName */
//   NCCL_CONFIG_UNDEF_INT                     /* splitShare */
// }

/* Return the NCCL_VERSION_CODE of the NCCL library in the supplied integer.
 * This integer is coded with the MAJOR, MINOR and PATCH level of the
 * NCCL library
 */
public static native @Cast("ncclResult_t") int ncclGetVersion(IntPointer version);
public static native @Cast("ncclResult_t") int ncclGetVersion(IntBuffer version);
public static native @Cast("ncclResult_t") int ncclGetVersion(int[] version);
public static native @Cast("ncclResult_t") int pncclGetVersion(IntPointer version);
public static native @Cast("ncclResult_t") int pncclGetVersion(IntBuffer version);
public static native @Cast("ncclResult_t") int pncclGetVersion(int[] version);

/* Generates an Id to be used in ncclCommInitRank. ncclGetUniqueId should be
 * called once and the Id should be distributed to all ranks in the
 * communicator before calling ncclCommInitRank. */
public static native @Cast("ncclResult_t") int ncclGetUniqueId(ncclUniqueId uniqueId);
public static native @Cast("ncclResult_t") int pncclGetUniqueId(ncclUniqueId uniqueId);

/* Create a new communicator (multi thread/process version) with a configuration
 * set by users. */
public static native @Cast("ncclResult_t") int ncclCommInitRankConfig(@ByPtrPtr ncclComm comm, int nranks, @ByVal ncclUniqueId commId, int rank, ncclConfig_t config);
public static native @Cast("ncclResult_t") int ncclCommInitRankConfig(@Cast("ncclComm**") PointerPointer comm, int nranks, @ByVal ncclUniqueId commId, int rank, ncclConfig_t config);
public static native @Cast("ncclResult_t") int pncclCommInitRankConfig(@ByPtrPtr ncclComm comm, int nranks, @ByVal ncclUniqueId commId, int rank, ncclConfig_t config);
public static native @Cast("ncclResult_t") int pncclCommInitRankConfig(@Cast("ncclComm**") PointerPointer comm, int nranks, @ByVal ncclUniqueId commId, int rank, ncclConfig_t config);

/* Creates a new communicator (multi thread/process version).
 * rank must be between 0 and nranks-1 and unique within a communicator clique.
 * Each rank is associated to a CUDA device, which has to be set before calling
 * ncclCommInitRank.
 * ncclCommInitRank implicitly syncronizes with other ranks, so it must be
 * called by different threads/processes or use ncclGroupStart/ncclGroupEnd. */
public static native @Cast("ncclResult_t") int ncclCommInitRank(@ByPtrPtr ncclComm comm, int nranks, @ByVal ncclUniqueId commId, int rank);
public static native @Cast("ncclResult_t") int ncclCommInitRank(@Cast("ncclComm**") PointerPointer comm, int nranks, @ByVal ncclUniqueId commId, int rank);
public static native @Cast("ncclResult_t") int pncclCommInitRank(@ByPtrPtr ncclComm comm, int nranks, @ByVal ncclUniqueId commId, int rank);
public static native @Cast("ncclResult_t") int pncclCommInitRank(@Cast("ncclComm**") PointerPointer comm, int nranks, @ByVal ncclUniqueId commId, int rank);

/* Creates a clique of communicators (single process version).
 * This is a convenience function to create a single-process communicator clique.
 * Returns an array of ndev newly initialized communicators in comm.
 * comm should be pre-allocated with size at least ndev*sizeof(ncclComm_t).
 * If devlist is NULL, the first ndev CUDA devices are used.
 * Order of devlist defines user-order of processors within the communicator. */
public static native @Cast("ncclResult_t") int ncclCommInitAll(@ByPtrPtr ncclComm comm, int ndev, @Const IntPointer devlist);
public static native @Cast("ncclResult_t") int ncclCommInitAll(@Cast("ncclComm**") PointerPointer comm, int ndev, @Const IntBuffer devlist);
public static native @Cast("ncclResult_t") int ncclCommInitAll(@ByPtrPtr ncclComm comm, int ndev, @Const int[] devlist);
public static native @Cast("ncclResult_t") int ncclCommInitAll(@Cast("ncclComm**") PointerPointer comm, int ndev, @Const IntPointer devlist);
public static native @Cast("ncclResult_t") int ncclCommInitAll(@ByPtrPtr ncclComm comm, int ndev, @Const IntBuffer devlist);
public static native @Cast("ncclResult_t") int ncclCommInitAll(@Cast("ncclComm**") PointerPointer comm, int ndev, @Const int[] devlist);
public static native @Cast("ncclResult_t") int pncclCommInitAll(@ByPtrPtr ncclComm comm, int ndev, @Const IntPointer devlist);
public static native @Cast("ncclResult_t") int pncclCommInitAll(@Cast("ncclComm**") PointerPointer comm, int ndev, @Const IntBuffer devlist);
public static native @Cast("ncclResult_t") int pncclCommInitAll(@ByPtrPtr ncclComm comm, int ndev, @Const int[] devlist);
public static native @Cast("ncclResult_t") int pncclCommInitAll(@Cast("ncclComm**") PointerPointer comm, int ndev, @Const IntPointer devlist);
public static native @Cast("ncclResult_t") int pncclCommInitAll(@ByPtrPtr ncclComm comm, int ndev, @Const IntBuffer devlist);
public static native @Cast("ncclResult_t") int pncclCommInitAll(@Cast("ncclComm**") PointerPointer comm, int ndev, @Const int[] devlist);

/* Finalize a communicator. ncclCommFinalize flushes all issued communications,
 * and marks communicator state as ncclInProgress. The state will change to ncclSuccess
 * when the communicator is globally quiescent and related resources are freed; then,
 * calling ncclCommDestroy can locally free the rest of the resources (e.g. communicator
 * itself) without blocking. */
public static native @Cast("ncclResult_t") int ncclCommFinalize(ncclComm comm);
public static native @Cast("ncclResult_t") int pncclCommFinalize(ncclComm comm);

/* Frees local resources associated with communicator object. */
public static native @Cast("ncclResult_t") int ncclCommDestroy(ncclComm comm);
public static native @Cast("ncclResult_t") int pncclCommDestroy(ncclComm comm);

/* Frees resources associated with communicator object and aborts any operations
 * that might still be running on the device. */
public static native @Cast("ncclResult_t") int ncclCommAbort(ncclComm comm);
public static native @Cast("ncclResult_t") int pncclCommAbort(ncclComm comm);

/* Creates one or more communicators from an existing one.
 * Ranks with the same color will end up in the same communicator.
 * Within the new communicator, key will be used to order ranks.
 * NCCL_SPLIT_NOCOLOR as color will indicate the rank will not be part of any group
 * and will therefore return a NULL communicator.
 * If config is NULL, the new communicator will inherit the original communicator's
 * configuration*/
public static native @Cast("ncclResult_t") int ncclCommSplit(ncclComm comm, int color, int key, @ByPtrPtr ncclComm newcomm, ncclConfig_t config);
public static native @Cast("ncclResult_t") int ncclCommSplit(ncclComm comm, int color, int key, @Cast("ncclComm**") PointerPointer newcomm, ncclConfig_t config);
public static native @Cast("ncclResult_t") int pncclCommSplit(ncclComm comm, int color, int key, @ByPtrPtr ncclComm newcomm, ncclConfig_t config);
public static native @Cast("ncclResult_t") int pncclCommSplit(ncclComm comm, int color, int key, @Cast("ncclComm**") PointerPointer newcomm, ncclConfig_t config);

/* Returns a string for each error code. */
public static native @Cast("const char*") BytePointer ncclGetErrorString(@Cast("ncclResult_t") int result);
public static native @Cast("const char*") BytePointer pncclGetErrorString(@Cast("ncclResult_t") int result);

/* Returns a human-readable message of the last error that occurred.
 * comm is currently unused and can be set to NULL
 */
public static native @Cast("const char*") BytePointer ncclGetLastError(ncclComm comm);
public static native @Cast("const char*") BytePointer pncclGetLastError(ncclComm comm);

/* Checks whether the comm has encountered any asynchronous errors */
public static native @Cast("ncclResult_t") int ncclCommGetAsyncError(ncclComm comm, @Cast("ncclResult_t*") IntPointer asyncError);
public static native @Cast("ncclResult_t") int ncclCommGetAsyncError(ncclComm comm, @Cast("ncclResult_t*") IntBuffer asyncError);
public static native @Cast("ncclResult_t") int ncclCommGetAsyncError(ncclComm comm, @Cast("ncclResult_t*") int[] asyncError);
public static native @Cast("ncclResult_t") int pncclCommGetAsyncError(ncclComm comm, @Cast("ncclResult_t*") IntPointer asyncError);
public static native @Cast("ncclResult_t") int pncclCommGetAsyncError(ncclComm comm, @Cast("ncclResult_t*") IntBuffer asyncError);
public static native @Cast("ncclResult_t") int pncclCommGetAsyncError(ncclComm comm, @Cast("ncclResult_t*") int[] asyncError);

/* Gets the number of ranks in the communicator clique. */
public static native @Cast("ncclResult_t") int ncclCommCount(ncclComm comm, IntPointer count);
public static native @Cast("ncclResult_t") int ncclCommCount(ncclComm comm, IntBuffer count);
public static native @Cast("ncclResult_t") int ncclCommCount(ncclComm comm, int[] count);
public static native @Cast("ncclResult_t") int pncclCommCount(ncclComm comm, IntPointer count);
public static native @Cast("ncclResult_t") int pncclCommCount(ncclComm comm, IntBuffer count);
public static native @Cast("ncclResult_t") int pncclCommCount(ncclComm comm, int[] count);

/* Returns the cuda device number associated with the communicator. */
public static native @Cast("ncclResult_t") int ncclCommCuDevice(ncclComm comm, IntPointer device);
public static native @Cast("ncclResult_t") int ncclCommCuDevice(ncclComm comm, IntBuffer device);
public static native @Cast("ncclResult_t") int ncclCommCuDevice(ncclComm comm, int[] device);
public static native @Cast("ncclResult_t") int pncclCommCuDevice(ncclComm comm, IntPointer device);
public static native @Cast("ncclResult_t") int pncclCommCuDevice(ncclComm comm, IntBuffer device);
public static native @Cast("ncclResult_t") int pncclCommCuDevice(ncclComm comm, int[] device);

/* Returns the user-ordered "rank" associated with the communicator. */
public static native @Cast("ncclResult_t") int ncclCommUserRank(ncclComm comm, IntPointer rank);
public static native @Cast("ncclResult_t") int ncclCommUserRank(ncclComm comm, IntBuffer rank);
public static native @Cast("ncclResult_t") int ncclCommUserRank(ncclComm comm, int[] rank);
public static native @Cast("ncclResult_t") int pncclCommUserRank(ncclComm comm, IntPointer rank);
public static native @Cast("ncclResult_t") int pncclCommUserRank(ncclComm comm, IntBuffer rank);
public static native @Cast("ncclResult_t") int pncclCommUserRank(ncclComm comm, int[] rank);

/* Reduction operation selector */
/** enum ncclRedOp_dummy_t */
public static final int ncclNumOps_dummy = 5;
/** enum ncclRedOp_t */
public static final int ncclSum        = 0,
               ncclProd       = 1,
               ncclMax        = 2,
               ncclMin        = 3,
               ncclAvg        = 4,
               /* ncclNumOps: The number of built-in ncclRedOp_t values. Also
                * serves as the least possible value for dynamic ncclRedOp_t's
                * as constructed by ncclRedOpCreate*** functions. */
               ncclNumOps     = 5;
public static native @MemberGetter int ncclMaxRedOp();
public static final int
               /* ncclMaxRedOp: The largest valid value for ncclRedOp_t.
                * It is defined to be the largest signed value (since compilers
                * are permitted to use signed enums) that won't grow
                * sizeof(ncclRedOp_t) when compared to previous NCCL versions to
                * maintain ABI compatibility. */
               ncclMaxRedOp   = ncclMaxRedOp();

/* Data types */
/** enum ncclDataType_t */
public static final int ncclInt8       = 0, ncclChar       = 0,
               ncclUint8      = 1,
               ncclInt32      = 2, ncclInt        = 2,
               ncclUint32     = 3,
               ncclInt64      = 4,
               ncclUint64     = 5,
               ncclFloat16    = 6, ncclHalf       = 6,
               ncclFloat32    = 7, ncclFloat      = 7,
               ncclFloat64    = 8, ncclDouble     = 8,
// #if defined(__CUDA_BF16_TYPES_EXIST__)
               ncclBfloat16   = 9,
               ncclNumTypes   = 10;
// #else
// #endif

/* ncclScalarResidence_t: Location and dereferencing logic for scalar arguments. */
/** enum ncclScalarResidence_t */
public static final int
  /* ncclScalarDevice: The scalar is in device-visible memory and will be
   * dereferenced while the collective is running. */
  ncclScalarDevice = 0,

  /* ncclScalarHostImmediate: The scalar is in host-visible memory and will be
   * dereferenced before the ncclRedOpCreate***() function returns. */
  ncclScalarHostImmediate = 1;

/*
 * ncclRedOpCreatePreMulSum
 *
 * Creates a new reduction operator which pre-multiplies input values by a given
 * scalar locally before reducing them with peer values via summation. For use
 * only with collectives launched against *comm* and *datatype*. The
 * *residence* argument indicates how/when the memory pointed to by *scalar*
 * will be dereferenced. Upon return, the newly created operator's handle
 * is stored in *op*.
 */
public static native @Cast("ncclResult_t") int ncclRedOpCreatePreMulSum(@Cast("ncclRedOp_t*") IntPointer op, Pointer scalar, @Cast("ncclDataType_t") int datatype, @Cast("ncclScalarResidence_t") int residence, ncclComm comm);
public static native @Cast("ncclResult_t") int ncclRedOpCreatePreMulSum(@Cast("ncclRedOp_t*") IntBuffer op, Pointer scalar, @Cast("ncclDataType_t") int datatype, @Cast("ncclScalarResidence_t") int residence, ncclComm comm);
public static native @Cast("ncclResult_t") int ncclRedOpCreatePreMulSum(@Cast("ncclRedOp_t*") int[] op, Pointer scalar, @Cast("ncclDataType_t") int datatype, @Cast("ncclScalarResidence_t") int residence, ncclComm comm);
public static native @Cast("ncclResult_t") int pncclRedOpCreatePreMulSum(@Cast("ncclRedOp_t*") IntPointer op, Pointer scalar, @Cast("ncclDataType_t") int datatype, @Cast("ncclScalarResidence_t") int residence, ncclComm comm);
public static native @Cast("ncclResult_t") int pncclRedOpCreatePreMulSum(@Cast("ncclRedOp_t*") IntBuffer op, Pointer scalar, @Cast("ncclDataType_t") int datatype, @Cast("ncclScalarResidence_t") int residence, ncclComm comm);
public static native @Cast("ncclResult_t") int pncclRedOpCreatePreMulSum(@Cast("ncclRedOp_t*") int[] op, Pointer scalar, @Cast("ncclDataType_t") int datatype, @Cast("ncclScalarResidence_t") int residence, ncclComm comm);

/*
 * ncclRedOpDestroy
 *
 * Destroys the reduction operator *op*. The operator must have been created by
 * ncclRedOpCreatePreMul with the matching communicator *comm*. An operator may be
 * destroyed as soon as the last NCCL function which is given that operator returns.
 */
public static native @Cast("ncclResult_t") int ncclRedOpDestroy(@Cast("ncclRedOp_t") int op, ncclComm comm);
public static native @Cast("ncclResult_t") int pncclRedOpDestroy(@Cast("ncclRedOp_t") int op, ncclComm comm);

/*
 * Collective communication operations
 *
 * Collective communication operations must be called separately for each
 * communicator in a communicator clique.
 *
 * They return when operations have been enqueued on the CUDA stream.
 *
 * Since they may perform inter-CPU synchronization, each call has to be done
 * from a different thread or process, or need to use Group Semantics (see
 * below).
 */

/*
 * Reduce
 *
 * Reduces data arrays of length count in sendbuff into recvbuff using op
 * operation.
 * recvbuff may be NULL on all calls except for root device.
 * root is the rank (not the CUDA device) where data will reside after the
 * operation is complete.
 *
 * In-place operation will happen if sendbuff == recvbuff.
 */
public static native @Cast("ncclResult_t") int ncclReduce(@Const Pointer sendbuff, Pointer recvbuff, @Cast("size_t") long count, @Cast("ncclDataType_t") int datatype,
    @Cast("ncclRedOp_t") int op, int root, ncclComm comm, CUstream_st stream);
public static native @Cast("ncclResult_t") int pncclReduce(@Const Pointer sendbuff, Pointer recvbuff, @Cast("size_t") long count, @Cast("ncclDataType_t") int datatype,
    @Cast("ncclRedOp_t") int op, int root, ncclComm comm, CUstream_st stream);

/*
 * (deprecated) Broadcast (in-place)
 *
 * Copies count values from root to all other devices.
 * root is the rank (not the CUDA device) where data resides before the
 * operation is started.
 *
 * This operation is implicitely in place.
 */
public static native @Cast("ncclResult_t") int ncclBcast(Pointer buff, @Cast("size_t") long count, @Cast("ncclDataType_t") int datatype, int root,
    ncclComm comm, CUstream_st stream);
public static native @Cast("ncclResult_t") int pncclBcast(Pointer buff, @Cast("size_t") long count, @Cast("ncclDataType_t") int datatype, int root,
    ncclComm comm, CUstream_st stream);

/*
 * Broadcast
 *
 * Copies count values from root to all other devices.
 * root is the rank (not the CUDA device) where data resides before the
 * operation is started.
 *
 * In-place operation will happen if sendbuff == recvbuff.
 */
public static native @Cast("ncclResult_t") int ncclBroadcast(@Const Pointer sendbuff, Pointer recvbuff, @Cast("size_t") long count, @Cast("ncclDataType_t") int datatype, int root,
    ncclComm comm, CUstream_st stream);
public static native @Cast("ncclResult_t") int pncclBroadcast(@Const Pointer sendbuff, Pointer recvbuff, @Cast("size_t") long count, @Cast("ncclDataType_t") int datatype, int root,
    ncclComm comm, CUstream_st stream);

/*
 * All-Reduce
 *
 * Reduces data arrays of length count in sendbuff using op operation, and
 * leaves identical copies of result on each recvbuff.
 *
 * In-place operation will happen if sendbuff == recvbuff.
 */
public static native @Cast("ncclResult_t") int ncclAllReduce(@Const Pointer sendbuff, Pointer recvbuff, @Cast("size_t") long count,
    @Cast("ncclDataType_t") int datatype, @Cast("ncclRedOp_t") int op, ncclComm comm, CUstream_st stream);
public static native @Cast("ncclResult_t") int pncclAllReduce(@Const Pointer sendbuff, Pointer recvbuff, @Cast("size_t") long count,
    @Cast("ncclDataType_t") int datatype, @Cast("ncclRedOp_t") int op, ncclComm comm, CUstream_st stream);

/*
 * Reduce-Scatter
 *
 * Reduces data in sendbuff using op operation and leaves reduced result
 * scattered over the devices so that recvbuff on rank i will contain the i-th
 * block of the result.
 * Assumes sendcount is equal to nranks*recvcount, which means that sendbuff
 * should have a size of at least nranks*recvcount elements.
 *
 * In-place operations will happen if recvbuff == sendbuff + rank * recvcount.
 */
public static native @Cast("ncclResult_t") int ncclReduceScatter(@Const Pointer sendbuff, Pointer recvbuff,
    @Cast("size_t") long recvcount, @Cast("ncclDataType_t") int datatype, @Cast("ncclRedOp_t") int op, ncclComm comm,
    CUstream_st stream);
public static native @Cast("ncclResult_t") int pncclReduceScatter(@Const Pointer sendbuff, Pointer recvbuff,
    @Cast("size_t") long recvcount, @Cast("ncclDataType_t") int datatype, @Cast("ncclRedOp_t") int op, ncclComm comm,
    CUstream_st stream);

/*
 * All-Gather
 *
 * Each device gathers sendcount values from other GPUs into recvbuff,
 * receiving data from rank i at offset i*sendcount.
 * Assumes recvcount is equal to nranks*sendcount, which means that recvbuff
 * should have a size of at least nranks*sendcount elements.
 *
 * In-place operations will happen if sendbuff == recvbuff + rank * sendcount.
 */
public static native @Cast("ncclResult_t") int ncclAllGather(@Const Pointer sendbuff, Pointer recvbuff, @Cast("size_t") long sendcount,
    @Cast("ncclDataType_t") int datatype, ncclComm comm, CUstream_st stream);
public static native @Cast("ncclResult_t") int pncclAllGather(@Const Pointer sendbuff, Pointer recvbuff, @Cast("size_t") long sendcount,
    @Cast("ncclDataType_t") int datatype, ncclComm comm, CUstream_st stream);

/*
 * Send
 *
 * Send data from sendbuff to rank peer.
 *
 * Rank peer needs to call ncclRecv with the same datatype and the same count from this
 * rank.
 *
 * This operation is blocking for the GPU. If multiple ncclSend and ncclRecv operations
 * need to progress concurrently to complete, they must be fused within a ncclGroupStart/
 * ncclGroupEnd section.
 */
public static native @Cast("ncclResult_t") int ncclSend(@Const Pointer sendbuff, @Cast("size_t") long count, @Cast("ncclDataType_t") int datatype, int peer,
    ncclComm comm, CUstream_st stream);
public static native @Cast("ncclResult_t") int pncclSend(@Const Pointer sendbuff, @Cast("size_t") long count, @Cast("ncclDataType_t") int datatype, int peer,
    ncclComm comm, CUstream_st stream);

/*
 * Receive
 *
 * Receive data from rank peer into recvbuff.
 *
 * Rank peer needs to call ncclSend with the same datatype and the same count to this
 * rank.
 *
 * This operation is blocking for the GPU. If multiple ncclSend and ncclRecv operations
 * need to progress concurrently to complete, they must be fused within a ncclGroupStart/
 * ncclGroupEnd section.
 */
public static native @Cast("ncclResult_t") int pncclRecv(Pointer recvbuff, @Cast("size_t") long count, @Cast("ncclDataType_t") int datatype, int peer,
    ncclComm comm, CUstream_st stream);
public static native @Cast("ncclResult_t") int ncclRecv(Pointer recvbuff, @Cast("size_t") long count, @Cast("ncclDataType_t") int datatype, int peer,
    ncclComm comm, CUstream_st stream);

/*
 * Group semantics
 *
 * When managing multiple GPUs from a single thread, and since NCCL collective
 * calls may perform inter-CPU synchronization, we need to "group" calls for
 * different ranks/devices into a single call.
 *
 * Grouping NCCL calls as being part of the same collective operation is done
 * using ncclGroupStart and ncclGroupEnd. ncclGroupStart will enqueue all
 * collective calls until the ncclGroupEnd call, which will wait for all calls
 * to be complete. Note that for collective communication, ncclGroupEnd only
 * guarantees that the operations are enqueued on the streams, not that
 * the operation is effectively done.
 *
 * Both collective communication and ncclCommInitRank can be used in conjunction
 * of ncclGroupStart/ncclGroupEnd, but not together.
 *
 * Group semantics also allow to fuse multiple operations on the same device
 * to improve performance (for aggregated collective calls), or to permit
 * concurrent progress of multiple send/receive operations.
 */

/*
 * Group Start
 *
 * Start a group call. All calls to NCCL until ncclGroupEnd will be fused into
 * a single NCCL operation. Nothing will be started on the CUDA stream until
 * ncclGroupEnd.
 */
public static native @Cast("ncclResult_t") int ncclGroupStart();
public static native @Cast("ncclResult_t") int pncclGroupStart();

/*
 * Group End
 *
 * End a group call. Start a fused NCCL operation consisting of all calls since
 * ncclGroupStart. Operations on the CUDA stream depending on the NCCL operations
 * need to be called after ncclGroupEnd.
 */
public static native @Cast("ncclResult_t") int ncclGroupEnd();
public static native @Cast("ncclResult_t") int pncclGroupEnd();

// #ifdef __cplusplus // end extern "C"
// #endif

// #endif // end include guard


}
