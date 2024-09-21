# misc_03_collections_framework

<!-- TOC -->
* [misc_03_collections_framework](#misc_03_collections_framework)
  * [Interface Iterable<T>](#interface-iterablet)
    * [Operations](#operations)
<!-- TOC -->

## Interface Iterable<T>
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Iterable.html

- package - java.lang
- T - the type of elements returned by the iterator
- Implementing this interface allows an object to be the target "for-each loop" statement
- Sub-interfaces: 
  - Collection<E>
  - List<E> 
  - Set<E>, SortedSet<E>, NavigableSet<E>, 
  - Queue<E>, Deque<E>
  - TransferQueue<E>
  - BlockingQueue<E>, BlockingDeque<E>,

### Operations
 - `Iterator<T> iterator()`
   - Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception.
 - `default void forEach(Consumer<? super T> action)`
   - Performs an action for each element in this iterator.
 - `default Spliterator<T> spliterator()`
   - Creates a Spliterator over the elements described by this Iterable.