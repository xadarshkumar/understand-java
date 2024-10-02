<!-- TOC -->
* [Module 3: Nullability, Functional Programming](#module-3-nullability-functional-programming)
  * [Distinguish nullable types and non-nullable types](#distinguish-nullable-types-and-non-nullable-types)
    * [safe access operator](#safe-access-operator)
    * [elvis operator](#elvis-operator)
    * [non-null assertion operator](#non-null-assertion-operator)
  * [Prefer safe operations for nullable values](#prefer-safe-operations-for-nullable-values)
  * [Employ functional programming style for manipulating collections](#employ-functional-programming-style-for-manipulating-collections)
  * [Use function types](#use-function-types)
  * [Member references](#member-references)
  * [Choose the right form of return expression for returning from lambda](#choose-the-right-form-of-return-expression-for-returning-from-lambda)
<!-- TOC -->

# Module 3: Nullability, Functional Programming

## Distinguish nullable types and non-nullable types

- Nullability refers to the ability of a variable to store null references
- Kotlin distinguishes between nullable types and non-nullable types
- Non-nullable types can only store non-null objects, while nullable types can store both null and non-null values
- Use different ways to perform an action only when a value of a nullable type is not null

  ```
  val s1: String = "always not null"
  
  // always safe
  val length1 = s1.length
  
  val s2: String? = "can be null or not null"
  ```

### safe access operator

  ```
  // safe, will return null if s2 is null [safe access operator]
  val length2 = s2?.length 
  ```

### elvis operator

  ```
  // safe with default value, will return 0 if s2 is null [elvis operator]
  val length2 = s2?.length ?: 0
  ```

### non-null assertion operator

  ```
  // unsafe, will throw NPE if s2 is null [non-null assertion operator]
  s2!!.length 
  ```

## Prefer safe operations for nullable values

- It doesn't make sense to put two or more not-null assertion operators in one line as you won't to be able to say which
  one cause the exception
- Under the hood, nullable types are implemented using annotations

## Employ functional programming style for manipulating collections

- Lambdas are anonymous functions that can be used as expressions or passed as arguments to other functions
- `filter`, `map`, `any`, `all`, `none`, `find`, `first/firstOrNull`, `count`, `partition`, `groupBy`, `associateBy`,
  `associate`, `zip`, `zipWithNext`, `flatten`, `flatMap`

## Use function types

- Kotlin allows you to store Lambdas in variables
- The type of the variable in this case is called a function type
- You can call variables of function type just like regular functions, providing all the necessary arguments

  ```
  // example of function type
  val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
  ```

- If you need to call a Lambda right in place, better user `run`

  ```
  run { println("Hello") }
  ```

- There is a difference between a function type that returns a nullable value and a nullable function type

  ```
  val f: () -> Int? = { null } // function type that returns a nullable value
  val f: (() -> Int)? = null // nullable function type
  
  f?.invoke() // to call a nullable function type
  ```

## Member references

- in Kotlin, you can store Lambda in a variable, however, you can't store a function in a variable

  ```
  fun isEven(i: Int): Boolean = i % 2 == 0
  
  val predicate: (Int) -> Boolean = ::isEven
  val predicate: (Int) -> Boolean = { it % 2 == 0 }
  
  // both are same
  ```

## Choose the right form of return expression for returning from lambda

- In Kotlin, the return statement inside a lambda expression returns from the outer function, not just the lambda
  itself.
- To return from a lambda, you can use a label.

  ```
  // retrun completely
  fun foo() {
    val ints = listOf(1, 2, 3, 4, 5)
    ints.forEach {
      if (it == 3) return // returns from foo
      print(it)
    }
    println("This point is unreachable")
  }

  // use label - to retrun from lambda
  fun foo() {
    val ints = listOf(1, 2, 3, 4, 5)
    ints.forEach lit@{
      if (it == 3) return@lit // returns from lambda expression
      print(it)
    }
    print(" done with explicit label")
  }
  ```