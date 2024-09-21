# misc_03_collections_framework

<!-- TOC -->
* [misc_03_collections_framework](#misc_03_collections_framework)
  * [Interface Iterator<E>](#interface-iteratore)
    * [Operations](#operations)
<!-- TOC --> 

## Interface Iterator<E>
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Iterator.html

- package - java.util
- E - the type of elements returned by this iterator
- An iterator over a collection
- Iterators allow the caller to remove elements from the underlying collection during the iteration with well-defined semantics
- Sub-interfaces: 
  -  ListIterator<E>

### Operations
- `boolean hasNext()`
  - Returns true if this iterator has more elements to traverse.
- `E next()`
  - Returns the next element from this iterator.
- `default void remove()`
  - Removes the last element returned by this iterator.
  - This method can be called only once per call to next().
- `default void forEachRemaining(Consumer<? super E> action)`
  - Performs the given action for each remaining element until all elements have been processed or the action throws an exception