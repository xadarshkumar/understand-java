# misc_04_list_interface

<!-- TOC -->
* [misc_04_list_interface](#misc_04_list_interface)
  * [List interface](#list-interface)
    * [List operations](#list-operations)
    * [List implementation](#list-implementation)
      * [ArrayList](#arraylist)
      * [LinkedList](#linkedlist)
<!-- TOC -->

## List interface

https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/List.html

extra features over Collection
- iterate over the elements of a list, fixed by the order in which these elements have been added
- elements of a list have an index

### List operations
It adds new operations -
- `int size()`, `boolean isEmpty()`
  - Get the number of elements in this list, list contains no elements
- `void clear()`
  - Removes all the elements from this list
- `boolean add(E e)`
  - Appends the specified element to the end of this list
- `boolean remove(Object o)`
  - Removes the first occurrence of the specified element from this list, if it is present
  - Returns true if this list contained the specified element
- `E get(int index)`
  - Returns the element at the specified position in this list
- `E set(int index, E element)`
  - Replaces the element at the specified position in this list with the specified element
- `void add(int index, E element)`
  - Inserts the specified element at the specified position in this list
  - Shifts the element currently at that position (if any) and any subsequent elements to the right
- `E remove(int index)`
  - Removes the element at the specified position in this list
  - Shifts any subsequent elements to the left
- `boolean addAll(Collection<? extends E> c)`
  - Appends all the elements in the specified collection to the end of this list
  - Returns true if this list changed as a result of the call
- `boolean addAll(int index, Collection<? extends E> c)`
  - Inserts all the elements in the specified collection into this list at the specified position
  - Shifts the element currently at that position (if any) and any subsequent elements to the right
  - Returns true if this list changed as a result of the call
- `boolean removeAll(Collection<?> c)`
  - Removes from this list all of its elements that are contained in the specified collection
  - Returns true if this list changed as a result of the call
- `boolean retainAll(Collection<?> c)`
  - Retains only the elements in this list that are contained in the specified collection
  - Returns true if this list changed as a result of the call
- `default void replaceAll(UnaryOperator<E> operator)`
  - Replaces each element of this list with the result of applying the operator to that element
- `List<E> subList(int fromIndex, int toIndex)`
  - Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive
  - If fromIndex and toIndex are equal, the returned list is empty
- `int indexOf(Object o)`
  - Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element
- `int lastIndexOf(Object o)`
  - Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element
- `boolean contains(Object o)`
  - Contains the specified element
- `boolean containsAll(Collection<?> c)`
  - Returns true if this list contains all the elements of the specified collection
- `Iterator<E> iterator()`
  - Iterator over the elements in this list in proper sequence
- `Object[] toArray()`
  - Array containing all the elements in this list in proper sequence
  - method acts as bridge between array-based and collection-based APIs
- `<T> T[] toArray(T[] a)`
  - Array containing all the elements in this list in proper sequence
  - the runtime type of the returned array is that of the specified array
- `default void sort(Comparator<? super E> c)`
  - Sorts this list according to the order induced by the specified Comparator `Collections.sort()`
  - This list must be modifiable, but need not be resizable
- `boolean equals(Object o)`
  - Compares the specified object with this list for equality
  - equal if they contain the same elements in the same order
- `int hashCode()`
  - Returns the hash code value for this list
- ListIterator<E> listIterator()
  - Returns a list iterator over the elements in this list 
- ListIterator<E> listIterator(int index)
  - Returns a list iterator over the elements in this list, starting at the specified position in the list
- `default Spliterator<E> spliterator()`
  - Creates a Spliterator over the elements in this list
- Methods declared in interface java.util.Collection
  - `stream`,`parallelStream`, `removeIf`, `toArray`
- Methods declared in interface java.lang.Iterable
  - `forEach`

### List implementation

The List interface has 2 implementations.
1. ArrayList https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html
2. LinkedList https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/LinkedList.html

Choose depending upon specific needs
- Array: Fixed size. If insertion or deletion is not required, array is the most efficient data structure
- ArrayList : Random access through an index without inserting or removing elements at the beginning
- LinkedList: Requires the insertion or deletion of elements at the beginning of the list

#### ArrayList
- `ArrayList()`
  - Creates an empty list with the default initial capacity(10)
- `ArrayList(initialCapacity: int)`
  - Creates an empty list with the specified initial capacity
- `ArrayList(c: Collection<? extends E>)`
  - Creates an array list from an existing collection
  - In the order they are returned by the collection's iterator.
- `trimToSize(): void`
  - Trims the capacity of this ArrayList instance to be the list’s current size

#### LinkedList
- `LinkedList()`
  - Creates a default empty linked list
- `LinkedList(c: Collection<? extends E>)`
  - Creates a linked list from an existing collection
- `void addFirst(element: E)`
  - Adds the element to the head of this list
- `void addLast(element: E)`
  - Adds the element to the tail of this list
- `E getFirst()`
  - Returns the first element from this list
- `E getLast()`
  - Returns the last element from this list
- `E removeFirst()`
  - Returns and removes the first element from this list
- `E removeLast()`
  - Returns and removes the last element from this list

Note:
- The get(i) method is available for a linked list, but it is a time-consuming operation.

very inefficient 
```
for (int i = 0; i < list.size(); i++) 
  process list.get(i);
}
```

efficient
```
for (listElementType e: list) { 
  process e;
}
```
```
list.forEach(e −>
  process e
)
```

