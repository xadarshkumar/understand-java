<!-- TOC -->
* [Module 2: Starting up with Kotlin](#module-2-starting-up-with-kotlin)
  * [Convert Java code to Kotlin automatically](#convert-java-code-to-kotlin-automatically)
  * [Define variables and functions](#define-variables-and-functions)
  * [Use control structures](#use-control-structures)
    * [if operator](#if-operator)
    * [when expression](#when-expression)
    * [for loop](#for-loop)
    * [while loop](#while-loop)
    * [do-while loop](#do-while-loop)
  * [Employ ranges](#employ-ranges)
  * [Define and use extensions](#define-and-use-extensions)
  * [Explain what is an extension function in Kotlin](#explain-what-is-an-extension-function-in-kotlin)
<!-- TOC -->

# Module 2: Starting up with Kotlin

## Convert Java code to Kotlin automatically

- Intellij Idea does it automatically.
- There are other options also.

## Define variables and functions

- `val` and `var`
- `var` denotes a mutable variable that can be modified
- `val` denotes a read-only or assigned-once variable
- `val` does not put any additional constraints on the stored object, and you can easily modify an object stored
- it is recommended to declare new variables with `val` to promote immutability and functional programming style
- In Kotlin, we have a distinction between mutable and read-only lists
- Understand when to specify function return types explicitly and when it is safe to omit them
- In Kotlin, you use the default arguments feature directly. You no longer need to provide several overloads.

## Use control structures

- Kotlin does not have a ternary operator

### if operator

  ```
  val max = if (a > b) a else b
  ```

### when expression

- when expression is especially useful for more than two branches

  ```
  when(x) {
    1 -> print("x == 1")
    2 -> print("x == 2")
    else -> {
      print("x is neither x nor 2")
    }
  }
  ```

  ```
  enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET 
  }
  fun getWarmth(color: Color) = when(color) {
    Color.RED, Color.YELLOW, Color.ORANGE -> "warm"
    Color.GREEN -> "netral"
    Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold"
  }
  ```

  ```
  val x = 1
  when {
    x.isOdd() -> print("x is odd")
    x.isEven() -> print("x is even")
    else -> print("x is funny")
  }
  ```

### for loop

  ```
  for (item in collection) print(item)
  
  // iterating over range
  for (i in 1..3) { // including 3
    println(i)
  }
  
  for (i in 1 until 3) { // excluding 3
    println(i)
  }
  
  // iterating with a step
  for (i in 6 downTo 0 step 2) {
    println(i)
  }
  
  // element type
  val array = arrayOf("a", "b", "c")
  for (s: String in array) {
    println(s)
  }

  // iterating over a map
  for ((key, value) in map) {
    println("$key -> $value")
  }

  // iterating with index
  for ((index, value) in array.withIndex()) {
    println("the element at $index is $value")
  }
  ```

### while loop

  ```
  val x = 5
  while (x > 0) {
    x--
  }
  ```

### do-while loop

  ```
  do {
    val y = retrieveData()
  } while (y != null) // y is visible here!
  ```

## Employ ranges

- `in`
  - can be used to check if a value is in a range
    ```
    c in 'a'..'z'
    ```
  - can be used to iterate over a range
    ```
    for (i in 'a'..'z') { ... }
    ```

## Define and use extensions

- Kotlin doesn't differentiate between checked and unchecked exceptions like Java
- `throw` is an expression in Kotlin
- `try` is an expression in Kotlin

## Explain what is an extension function in Kotlin

- Extension functions are utility functions that extend a class and can be called as regular member functions
- They are defined outside the class but can be easily discovered and used

  ```
    fun String.lastChar() {
        return this.get(this.length - 1)
    }
  ```

- The receiver of an extension function is the class that it extends, and it can be accessed using the "this"
  reference
- Extension functions need to be imported explicitly and are not accessible in the whole project by default
- from Java, it is treated as a regular static function
- If an extension has the same signature as a member function, the member function will always be chosen
- Overloading members with extensions: It is possible to overload a member function with an extension by providing a
  different signature, such as different parameter types or a different number of parameters
- Extensions cannot be overridden: Since extensions are resolved as static functions, they cannot be overridden in
  Kotlin
