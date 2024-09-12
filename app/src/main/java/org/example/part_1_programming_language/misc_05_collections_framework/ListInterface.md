# misc_05_collections_framework

<!-- TOC -->
* [misc_05_collections_framework](#misc_05_collections_framework)
  * [List interface](#list-interface)
    * [List operations](#list-operations)
    * [List implementation](#list-implementation)
<!-- TOC -->

## List interface

https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/List.html

extra features over Collection
- iterate over the elements of a list, fixed by the order in which these elements have been added
- elements of a list have an index

### List operations
It adds new operations -
- Get an element at a specific index, or delete it
  - `get(index)`, `remove(index)`
- Insert an element or replace an element at a specific position
  - `add(index, element)`, `set(index, element)`
- Get a range of elements between two indexes
  - `subList(start, end)`
- Finding the index of an Object
  - `indexOf(element)`, `lastIndexOf(element)`
- Inserting a Collection
  - `addAll(int index, Collection collection)`
- Sorting the Elements of a List
  - `sort()`, `Collections.sort()`
- Iterating over the Elements of a List
  - `listIterator()`, `listIterator(index)`

### List implementation

The List interface has 2 implementations.
1. ArrayList https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html
2. LinkedList https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/LinkedList.html
