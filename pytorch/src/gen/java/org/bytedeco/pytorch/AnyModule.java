// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


/** Stores a type erased {@code Module}.
 * 
 *  The PyTorch C++ API does not impose an interface on the signature of
 *  {@code forward()} in {@code Module} subclasses. This gives you complete freedom to
 *  design your {@code forward()} methods to your liking. However, this also means
 *  there is no unified base type you could store in order to call {@code forward()}
 *  polymorphically for any module. This is where the {@code AnyModule} comes in.
 *  Instead of inheritance, it relies on type erasure for polymorphism.
 * 
 *  An {@code AnyModule} can store any {@code nn::Module} subclass that provides a
 *  {@code forward()} method. This {@code forward()} may accept any types and return any
 *  type. Once stored in an {@code AnyModule}, you can invoke the underlying module's
 *  {@code forward()} by calling {@code AnyModule::forward()} with the arguments you would
 *  supply to the stored module (though see one important limitation below).
 *  Example:
 * 
 *  \rst
 *  .. code-block:: cpp
 * 
 *    struct GenericTrainer {
 *      torch::nn::AnyModule module;
 * 
 *      void train(torch::Tensor input) {
 *        module.forward(input);
 *      }
 *    };
 * 
 *    GenericTrainer trainer1{torch::nn::Linear(3, 4)};
 *    GenericTrainer trainer2{torch::nn::Conv2d(3, 4, 2)};
 *  \endrst
 * 
 *  As {@code AnyModule} erases the static type of the stored module (and its
 *  {@code forward()} method) to achieve polymorphism, type checking of arguments is
 *  moved to runtime. That is, passing an argument with an incorrect type to an
 *  {@code AnyModule} will compile, but throw an exception at runtime:
 * 
 *  \rst
 *  .. code-block:: cpp
 * 
 *    torch::nn::AnyModule module(torch::nn::Linear(3, 4));
 *    // Linear takes a tensor as input, but we are passing an integer.
 *    // This will compile, but throw a {@code torch::Error} exception at runtime.
 *    module.forward(123);
 *  \endrst
 * 
 *  \rst
 *  .. attention::
 *    One noteworthy limitation of {@code AnyModule} is that its {@code forward()} method
 *    does not support implicit conversion of argument types. For example, if
 *    the stored module's {@code forward()} method accepts a {@code float} and you call
 *    {@code any_module.forward(3.4)} (where {@code 3.4} is a {@code double}), this will throw
 *    an exception.
 *  \endrst
 * 
 *  The return type of the {@code AnyModule}'s {@code forward()} method is controlled via
 *  the first template argument to {@code AnyModule::forward()}. It defaults to
 *  {@code torch::Tensor}. To change it, you can write {@code any_module.forward<int>()},
 *  for example.
 * 
 *  \rst
 *  .. code-block:: cpp
 * 
 *    torch::nn::AnyModule module(torch::nn::Linear(3, 4));
 *    auto output = module.forward(torch::ones({2, 3}));
 * 
 *    struct IntModule {
 *      int forward(int x) { return x; }
 *    };
 *    torch::nn::AnyModule module(IntModule{});
 *    int output = module.forward<int>(5);
 *  \endrst
 * 
 *  The only other method an {@code AnyModule} provides access to on the stored
 *  module is {@code clone()}. However, you may acquire a handle on the module via
 *  {@code .ptr()}, which returns a {@code shared_ptr<nn::Module>}. Further, if you know
 *  the concrete type of the stored module, you can get a concrete handle to it
 *  using {@code .get<T>()} where {@code T} is the concrete module type.
 * 
 *  \rst
 *  .. code-block:: cpp
 * 
 *    torch::nn::AnyModule module(torch::nn::Linear(3, 4));
 *    std::shared_ptr<nn::Module> ptr = module.ptr();
 *    torch::nn::Linear linear(module.get<torch::nn::Linear>());
 *  \endrst */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AnyModule extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AnyModule(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AnyModule(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public AnyModule position(long position) {
        return (AnyModule)super.position(position);
    }
    @Override public AnyModule getPointer(long i) {
        return new AnyModule((Pointer)this).position(position + i);
    }

  /** A default-constructed {@code AnyModule} is in an empty state. */
  public AnyModule() { super((Pointer)null); allocate(); }
  private native void allocate();

  /** Constructs an {@code AnyModule} from a {@code shared_ptr} to concrete module object. */

  /** Constructs an {@code AnyModule} from a concrete module object. */

  /** Constructs an {@code AnyModule} from a module holder. */

  /** Move construction and assignment is allowed, and follows the default
   *  behavior of move for {@code std::unique_ptr}. */
  public AnyModule(@ByVal AnyModule arg0) { super((Pointer)null); allocate(arg0); }
  private native void allocate(@ByVal AnyModule arg0);
  public native @ByRef @Name("operator =") AnyModule put(@ByVal AnyModule arg0);

  /** Creates a shallow copy of an {@code AnyModule}. */

  /** Creates a deep copy of an {@code AnyModule} if it contains a module, else an
   *  empty {@code AnyModule} if it is empty. */
  public native @ByVal AnyModule clone(@ByVal(nullValue = "c10::optional<c10::Device>(c10::nullopt)") DeviceOptional device);
  public native @ByVal AnyModule clone();

  /** Assigns a module to the {@code AnyModule} (to circumvent the explicit
   *  constructor). */

  /** Invokes {@code forward()} on the contained module with the given arguments, and
   *  returns the return value as an {@code AnyValue}. Use this method when chaining
   *  {@code AnyModule}s in a loop. */

  /** Invokes {@code forward()} on the contained module with the given arguments, and
   *  casts the returned {@code AnyValue} to the supplied {@code ReturnType} (which defaults to
   *  {@code torch::Tensor}). */

  /** Attempts to cast the underlying module to the given module type. Throws an
   *  exception if the types do not match. */

  /** Attempts to cast the underlying module to the given module type. Throws an
   *  exception if the types do not match. */

  /** Returns the contained module in a {@code nn::ModuleHolder} subclass if possible
   *  (i.e. if {@code T} has a constructor for the underlying module type). */

  /** Returns a {@code std::shared_ptr} whose dynamic type is that of the underlying
   *  module. */
  public native @SharedPtr @Cast({"", "std::shared_ptr<torch::nn::Module>"}) Module ptr();

  /** Like {@code ptr()}, but casts the pointer to the given type. */

  /** Returns the {@code type_info} object of the contained value. */
  public native @Cast("const std::type_info*") @ByRef Pointer type_info();

  /** Returns true if the {@code AnyModule} does not contain a module. */
  public native @Cast("bool") @NoException boolean is_empty();
}
