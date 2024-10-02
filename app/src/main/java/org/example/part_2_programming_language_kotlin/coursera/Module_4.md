<!-- TOC -->
* [Module 4: OOP, Conventions](#module-4-oop-conventions)
  * [Distinguish between different kinds of properties: without backing field, lazy, lateinit](#distinguish-between-different-kinds-of-properties-without-backing-field-lazy-lateinit)
    * [val/var](#valvar)
    * [Extension Properties](#extension-properties)
    * [Mutable Extension Properties](#mutable-extension-properties)
    * [lazy](#lazy)
    * [lateinit](#lateinit)
  * [Summarize the differences in defining and using classes with Java](#summarize-the-differences-in-defining-and-using-classes-with-java)
  * [Know the different syntax for constructors](#know-the-different-syntax-for-constructors)
    * [Concise primary constructor](#concise-primary-constructor)
    * [Full primary constructor](#full-primary-constructor)
    * [Secondary constructor](#secondary-constructor)
    * [instead of implements](#instead-of-implements)
    * [instead of extends](#instead-of-extends)
  * [Use different kinds of classes for correct situations: enum, data, inner, sealed](#use-different-kinds-of-classes-for-correct-situations-enum-data-inner-sealed)
  * [Explain the difference between object expression and object declaration](#explain-the-difference-between-object-expression-and-object-declaration)
  * [Show the benefits of companion objects over static methods](#show-the-benefits-of-companion-objects-over-static-methods)
  * [Constants](#constants)
  * [Operator Overloading](#operator-overloading)
  * [Give examples of using conventions in the standard library](#give-examples-of-using-conventions-in-the-standard-library)
<!-- TOC -->

# Module 4: OOP, Conventions

## Distinguish between different kinds of properties: without backing field, lazy, lateinit

### val/var

- `val` = attribute + getter
- `var` = attribute + getter + setter

### Extension Properties

  ```
  val String.lastIndex: Int
    get() = length - 1
  
  val String.indices: IntRange
    get() = 0..lastIndex
  
  "abc".lastIndex // 2
  "abc".indices // 0..2
  ```

### Mutable Extension Properties

  ```
  var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) = setCharAt(length - 1, value)
  ```

### lazy

- `lazy` properties are properties whose values are computed only when they are first accessed
- If a lazy property is not accessed at all, the value is not computed

  ```
  val ;azyValue: String by lazy {
    println("Computed!")
    "Hello"
  }
  
  fun main() {
    println(lazyValue)
    println(lazyValue)
  }
  
  // output
  computed!
  Hello
  Hello
  ```

### lateinit

- `lateinit` properties are used when we want to initialise a property not in the constructor, but in a specifically
  designated method
- It allows us to use it as a value of non-nullable type:
  - Constraints:
    - `lateinit` can only be used with `var` properties
    - `lateinit` can only be used with properties that are not primitive types
    - `lateinit` can only be used with properties that are declared inside the body of a class, not in the primary
      constructor
  - We can check whether a lateinit property was initialized or not by calling `isInitialized()` on the property
    reference

## Summarize the differences in defining and using classes with Java

- `final` can't be overridden - used by default
- `open` can be overridden
- `abstract` must be overridden, can't be instantiated
  - `override` mandatory, overrides a member in superclass or interface
- `public` visible everywhere
- `internal` - visible inside the module
- `protected` visible inside the class and its subclasses
- `private` visible inside the class


- any declaration is `public` and `final` by default
- if you want to make it non-final, you explicitly need to mark it as `open`
- there is no package private visibility in Kotlin, for this - `internal`
- if you want to make it non-public, uou need to mark it as `internal` or `private`
- if you want to make it non-public and non-final, uou need to mark it as `internal open`
  - there is also difference with package structure. In Java, every class should be located in its own separate file
    even if the class is very small
  - In Kotlin, it's no longer the case, you can put several classes into one file, especially useful if your classes are
    data classes that is small and simple
  - you can combine several classes connected to each other in one file

## Know the different syntax for constructors

### Concise primary constructor

  ```
  class Person(val name: String, val age: Int)     // Note: there is val/var here
  ```

### Full primary constructor

  ```
  class Person(name: String) {   // Note: these is no val/var here
    val name: String
    init {
      this.name = name
    }
  }
  ```

### Secondary constructor

  ```
  class Rectangle(val width: Int, val height: Int) {
    constructor(side: Int): this(side,side) {...}
  }
  ```

### instead of implements

  ```
  interface Base
  class BaseImpl: Base
  ```

### instead of extends

  ```
  open class Parent(val name: String)                   // Concise primary constructor
  class Child(name: String): Parent(name)               // Full primary constructor
  
  open class Parent(val name: String)                   // Concise primary constructor
  class Child : Parent {                                // Secondary constructor
    constructor(name: String, param: Int): super(name)
  }
  ```

## Use different kinds of classes for correct situations: enum, data, inner, sealed

- enum class - represents enumeration
- data class - generated `equals`, `hashCode`, `toString` and `copy` methods
- sealed modifier - restricts the inheritance hierarchy of a class
  - all subclasses must be located in the same file as the sealed class
  - use case -
  ```
  sealed class Expr
  class Num(val value: Int): Expr()
  class Sum(val left: Expr, val right: Expr): Exper()
  
  fun eval(e: Expr): Int = when(e) {
    is Num -> e.value
    is Sum -> eval(e.left) + eval(e.right)
  }
  
  // here in this example, notice that we didn't use else inside when expression
  // this is possible due to sealed class, as we know - this class an't be inherited so no more function
  ```
- inner class i.e, nested class

## Explain the difference between object expression and object declaration

- object is singleton in Kotlin
  - singleton means a class has only one instance
  - by using `object` keyword, you create a class and it's instance in one place
  - in kotlin,

  ```
  object KSingleton {
    fun foo() {}
  }
  
  KSingleton.foo() // to use
  ```

  - in java,

  ```
  public class JSingleton {
    public final static JSingleton INSTANCE = new JSingleton(); // only one static instance field, instantiate it too
    private JSingleton(); // private constructor
    public void foo();
  }
  
  JSingleton.INSTANCE.foo(); // to use
  ```

- object expression replace Java's anonymous classes
  - why is anonymous class used -
    - you need to implement an interface
    - override a couple of methods in the class
    - that's the only usage of this new class
    - use anonymous class, so you don't create a named class
  - when you need only one single abstract method, we sue lambda
  - when you need to implement several methods, use object expressions
- object expression and object declaration singleton are different concepts

- companion object
  - kotlin supports nested class
  - kotlin supports nested objects
  - companion object is a nested object inside a class
  - members in companion objects can be accessed by class name
  - there is no static methods like in Java, and companion objects might be a replacement for for that
  ```
  class A {
    companion object {
      fun foo() = 1
    }
  }
  
  fun main(args: Array<String>) {
    A.foo()
  }
  ```

## Show the benefits of companion objects over static methods

- why Kotlin has companion objects but not static?
  1. companion objects can implement an interface

  - it would be nice if a static method could override a member of an interface
  - for static, that's not possible
  - possible with companion object
     ```
     interface Factory<T> {
       fun create(): T
     }
     class A {
       private constructor()
    
       conpanion object : Factory<A> {
         override fun create(): A {
           return A()
         }
       }
     }
    
     fun <T> createNewInstance(factory: Factory<T>)
     createNewInstance(A)
     A.create()
     ```

  2. define extension function inside companion object

  - to distinguish an extension to a class from an extension to companion object, use `Companion` suffix
     ```
     class Person(val firstName: String, val lastName: String) {
      companion object {...}
     }
     
     fun Person.Companion.fromJSON(json: String): Person{
      ...
     }
     ```

- no `static` keyword in Kotlin
  - where to define static members?
    - put at top-level inside objects
    - inside companion objects
  - by default, your functions defined in the companion object or in an object won't be compiled to static members.
    - to do so, use `@JvmStatic`

## Constants

- `const val answer = 43` for primitive types and String
- eliminates the accessors. `@JvmField` exposes a Kotlin property as a field in Java
  - static field in object
  - regular field in class
    ```
    @JvmField
    val answer = 43
    ```

## Operator Overloading

- Arithmetic Operations
  - `plus`, `minus`, `times`, `div`, `mod`
- Unary operations
  - `unaryPlus`, `unaryMinus`, `not`, `inc`, `dec`

## Give examples of using conventions in the standard library

- Comparisons
- Equality check
- Accessing elements by index: []
- in
- start..end
- Iterator
- Destructuring
- Iterating over list with index
- Destructuring declarations and data classes
