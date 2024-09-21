# misc_04_list_interface

<!-- TOC -->
* [misc_04_list_interface](#misc_04_list_interface)
  * [Interface ListIterator<E>](#interface-listiteratore)
    * [Operations](#operations)
<!-- TOC -->

## Interface ListIterator<E>
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ListIterator.html

- package - java.util
- An iterator for lists that allows 
  - to traverse in either direction
  - modify the list during iteration
  - obtain the iterator's current position in the list
- A ListIterator has no current element
  - its cursor position always lies between the element by a call to previous() and the element by a call to next().
- An iterator for a list of length n has n+1 possible cursor positions

### Operations
- `boolean hasNext()`
  - Returns true if this list iterator has more elements when traversing the list in the forward direction
- `E next()`
  - Returns the index of the element that would be returned by a subsequent call to next()
- `boolean hasPrevious()`
  - Returns true if this list iterator has more elements when traversing the list in the reverse direction
- `E previous()`
  - Returns the previous element in the list and moves the cursor position backwards
- `int nextIndex()`
  - Returns the index of the element that would be returned by a subsequent call to next()
- `int previousIndex()`
  - Returns the index of the element that would be returned by a subsequent call to previous()
- `void remove()`
  - Removes from the list the last element that was returned by next() or previous()
- `void set(E e)`
  - Replaces the last element returned by next() or previous() with the specified element
- `add(o: E): void`
  - Inserts the specified element into the list
  - The element is inserted immediately before the element that would be returned by next(), if any
  - The element is inserted immediately after the element that would be returned by previous(), if any
