# misc_03_collections_framework

<!-- TOC -->
* [misc_03_collections_framework](#misc_03_collections_framework)
  * [Interface Comparator<T>](#interface-comparatort)
    * [Operations](#operations)
<!-- TOC -->

## Interface Comparator<T>
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Comparator.html

- package - java.util
- T - the type of objects that may be compared by this comparator
- Used to compare the objects of a class that does not implement
Comparable or define a new criteria for comparing objects
- Comparators can be passed to a sort method (such as Collections.sort or Arrays.sort) to allow precise control over the sort order
- Generally a good idea for comparators to implement Serializable so they can be serialized

### Operations
- `int compare(T o1, T o2)`
  - Compares its two arguments for order
    - negative value if a is less than b
    - positive value if a is greater than b
    - zero if they are equal
- `comparing`
- `thenComparing`
- `reversed`
