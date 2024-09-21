# misc_03_collections_framework

<!-- TOC -->
* [misc_03_collections_framework](#misc_03_collections_framework)
  * [Interface Comparable<T>](#interface-comparablet)
    * [Operations](#operations)
<!-- TOC -->

## Interface Comparable<T>
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Comparable.html

- package - java.lang
- T - the type of objects that this object may be compared to
- This interface imposes a total ordering on the objects of each class that implements it
- This ordering is referred to as the class's natural ordering
- The class's `compareTo` method is referred to as its natural comparison method
- The classes Byte, Short, Integer, Long, Float, Double, Character, BigInteger, BigDecimal, Calendar, String, Calendar and Date all implement the Comparable interface

### Operations
- `int compareTo(T o)`
  - Compares this object with the specified object for order
