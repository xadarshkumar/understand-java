# misc_05_set_interface

<!-- TOC -->
* [misc_05_set_interface](#misc_05_set_interface)
  * [Set interface](#set-interface)
    * [Set implementation](#set-implementation)
      * [HashSet](#hashset)
      * [LinkedHashSet](#linkedhashset)
  * [SortedSet interface](#sortedset-interface)
    * [SortedSet operations](#sortedset-operations)
    * [SortedSet implementation](#sortedset-implementation)
  * [NavigableSet interface](#navigableset-interface)
    * [NavigableSet operations](#navigableset-operations)
    * [NavigableSet implementation](#navigableset-implementation)
      * [TreeSet](#treeset)
<!-- TOC -->

## Set interface

https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Set.html

extra features over Collection
- cannot have duplicates
- adding an element may fail

difference in behavior does not bring any new operations in the Set interface

### Set implementation

The Set interface has 1 implementation.
1. HashSet https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/HashSet.html
2. LinkedHashSet https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/LinkedHashSet.html

Choose depending upon specific needs
- HashSet: Store unique objects
- LinkedHashSet: Store unique objects, while maintaining the insertion order

#### HashSet
- `HashSet()`
  - Constructs a new, empty set
  - Default initial capacity (16) and load factor (0.75)
- `HashSet(initialCapacity: int)`
  - Constructs a new, empty set with specified initial capacity
  - Default load factor (0.75)
- `HashSet(initialCapacity: int, loadFactor: float)`
  - Constructs a new, empty set with specified initial capacity and load factor
- `HashSet(c: Collection<? extends E>)`
  - Constructs a new set containing the elements in the specified collection

#### LinkedHashSet
- `LinkedHashSet()`
  - Constructs a new, empty linked hash set
  - Default initial capacity (16) and load factor (0.75)
- `LinkedHashSet(initialCapacity: int)`
  - Constructs a new, empty linked hash set with the specified initial capacity
  - Default load factor (0.75)
- `LinkedHashSet(initialCapacity: int, loadFactor: float)`
  - Constructs a new, empty linked hash set with the specified initial capacity and load factor
- `LinkedHashSet(c: Collection<? extends E>)`
  - Constructs a new linked hash set with the same elements as the specified collection.

---

---

## SortedSet interface

https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/SortedSet.html

extra features over Set
- keeps its elements sorted according to a certain comparison logic

### SortedSet operations
It adds new operations -
- get lowest and largest elements
  - `first()`, `last()` 
- subsets containing the elements lower than `toElement` or greater than `fromElement`
  - `headSet(toElement)`, `tailSet(fromElement)` 
- subset of the element between `fromElement` and `toElement`
  - `subSet(fromElement, toElement)`

### SortedSet implementation

The SortedSet interface has 1 implementation.
1. TreeSet https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/TreeSet.html

---

---

## NavigableSet interface

https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/NavigableSet.html

extra features over SortedSet
- supports retrieval of elements based on the closest given match to a given value or values

### NavigableSet operations

It adds new operations -
- methods are overloaded
  - `headSet(toElement, incl)`, `tailSet(fromElement, incl)`, `subSet(fromElement, lowIncl, toElement, highIncl)`
- return the greatest element lesser or equal than, or the lowest element greater or equal than the provided element
  - `ceiling(element)`, `floor(element)`
- return the greater element lesser than, or the lowest element greater than the provided element
  - `lower(element)`, `higher(element)`
- return and removes the lowest or the greatest element of the set
  - `pollFirst()`, `pollLast()`
- iterate over its elements in descending order
  - `descendingIterator()`, `descendingSet()`

### NavigableSet implementation

The SortedSet interface has 1 implementation.
1. TreeSet https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/TreeSet.html
   - TreeSet class was retrofitted to implement NavigableSet.

Choose depending upon specific needs
- TreeSet: Store unique objects, elements sorted by their natural order or by an order specified by a Comparator

#### TreeSet
- `TreeSet()`
  - Constructs a new, empty tree set
  - Sorted by their natural order of its elements
- `TreeSet(c: Collection<? extends E>)`
  - Constructs a new tree set containing the elements in the specified collection
  - Sorted by their natural order of its elements
- `TreeSet(comparator: Comparator<? super E>)`
  - Constructs a new, empty tree set
  - Sorted according to the specified comparator
- `TreeSet(s: SortedSet<E>)`
  - Constructs a new tree set containing the same elements and using the same ordering as the specified sorted set