// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


/* Bytecode object */
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyCodeObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyCodeObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyCodeObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyCodeObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyCodeObject position(long position) {
        return (PyCodeObject)super.position(position);
    }
    @Override public PyCodeObject getPointer(long i) {
        return new PyCodeObject((Pointer)this).offsetAddress(i);
    }

    public native @ByRef PyObject ob_base(); public native PyCodeObject ob_base(PyObject setter);
    public native int co_argcount(); public native PyCodeObject co_argcount(int setter);            /* #arguments, except *args */
    public native int co_posonlyargcount(); public native PyCodeObject co_posonlyargcount(int setter);     /* #positional only arguments */
    public native int co_kwonlyargcount(); public native PyCodeObject co_kwonlyargcount(int setter);      /* #keyword only arguments */
    public native int co_nlocals(); public native PyCodeObject co_nlocals(int setter);             /* #local variables */
    public native int co_stacksize(); public native PyCodeObject co_stacksize(int setter);           /* #entries needed for evaluation stack */
    public native int co_flags(); public native PyCodeObject co_flags(int setter);               /* CO_..., see below */
    public native int co_firstlineno(); public native PyCodeObject co_firstlineno(int setter);         /* first source line number */
    public native PyObject co_code(); public native PyCodeObject co_code(PyObject setter);          /* instruction opcodes */
    public native PyObject co_consts(); public native PyCodeObject co_consts(PyObject setter);        /* list (constants used) */
    public native PyObject co_names(); public native PyCodeObject co_names(PyObject setter);         /* list of strings (names used) */
    public native PyObject co_varnames(); public native PyCodeObject co_varnames(PyObject setter);      /* tuple of strings (local variable names) */
    public native PyObject co_freevars(); public native PyCodeObject co_freevars(PyObject setter);      /* tuple of strings (free variable names) */
    public native PyObject co_cellvars(); public native PyCodeObject co_cellvars(PyObject setter);      /* tuple of strings (cell variable names) */
    /* The rest aren't used in either hash or comparisons, except for co_name,
       used in both. This is done to preserve the name and line number
       for tracebacks and debuggers; otherwise, constant de-duplication
       would collapse identical functions/lambdas defined on different lines.
    */
    public native @Cast("Py_ssize_t*") SizeTPointer co_cell2arg(); public native PyCodeObject co_cell2arg(SizeTPointer setter);    /* Maps cell vars which are arguments. */
    public native PyObject co_filename(); public native PyCodeObject co_filename(PyObject setter);      /* unicode (where it was loaded from) */
    public native PyObject co_name(); public native PyCodeObject co_name(PyObject setter);          /* unicode (name, for reference) */
    public native PyObject co_linetable(); public native PyCodeObject co_linetable(PyObject setter);     /* string (encoding addr<->lineno mapping) See
                                   Objects/lnotab_notes.txt for details. */
    public native Pointer co_zombieframe(); public native PyCodeObject co_zombieframe(Pointer setter);       /* for optimization only (see frameobject.c) */
    public native PyObject co_weakreflist(); public native PyCodeObject co_weakreflist(PyObject setter);   /* to support weakrefs to code objects */
    /* Scratch space for extra data relating to the code object.
       Type is a void* to keep the format private in codeobject.c to force
       people to go through the proper APIs. */
    public native Pointer co_extra(); public native PyCodeObject co_extra(Pointer setter);

    /* Per opcodes just-in-time cache
     *
     * To reduce cache size, we use indirect mapping from opcode index to
     * cache object:
     *   cache = co_opcache[co_opcache_map[next_instr - first_instr] - 1]
     */

    // co_opcache_map is indexed by (next_instr - first_instr).
    //  * 0 means there is no cache for this opcode.
    //  * n > 0 means there is cache in co_opcache[n-1].
    public native @Cast("unsigned char*") BytePointer co_opcache_map(); public native PyCodeObject co_opcache_map(BytePointer setter);
    public native _PyOpcache co_opcache(); public native PyCodeObject co_opcache(_PyOpcache setter);
    public native int co_opcache_flag(); public native PyCodeObject co_opcache_flag(int setter);  // used to determine when create a cache.
    public native @Cast("unsigned char") byte co_opcache_size(); public native PyCodeObject co_opcache_size(byte setter);  // length of co_opcache.
}
