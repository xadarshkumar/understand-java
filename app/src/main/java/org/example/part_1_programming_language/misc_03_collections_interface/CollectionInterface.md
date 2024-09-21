# misc_03_collections_framework
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/doc-files/coll-index.html \
https://docs.oracle.com/javase/tutorial/collections/index.html
- architecture for representing and manipulating collections
- Java provides data structures that can be used to organize and manipulate data efficiently.

<!-- TOC -->
* [misc_03_collections_framework](#misc_03_collections_framework)
  * [Collection Interface](#collection-interface)
    * [Collection operations](#collection-operations)
  * [Collections Factory Methods](#collections-factory-methods)
    * [Creating Immutable Collections](#creating-immutable-collections)
      * [Creating List and Set](#creating-list-and-set)
      * [Creating Map](#creating-map)
    * [Getting an Immutable Copy of a Collection](#getting-an-immutable-copy-of-a-collection)
    * [Wrapping an Array in a List](#wrapping-an-array-in-a-list)
    * [Using the Collections Factory Class to Process a Collection](#using-the-collections-factory-class-to-process-a-collection)
<!-- TOC -->

## Collection Interface
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Collection.html

Collection interface contains the methods for manipulating the elements in a collection.

The Collection interface define the common operations like 
- for adding and removing elements
- query operations
- union, intersection, complement
- ...

### Collection operations
It models several operations on containers of elements.
- add or remove elements
  - `add(element)`, `remove(element)`
- test for the presence of a given element
  - `contains()`
- ask for the number of elements contained, or if this collection is empty
  - `size()`, `isEmpty()`
- testing for the inclusion of a set in another set
  - `containsAll()`
- clear this content
  - `clear()`
- union
  - `addAll()`
- intersection
  - `retainAll()`
- complement
  - `removeAll()`
- filter out elements of a collection with a predicate
  - `removeIf()`
- you can iterate over the elements of a collection, through the use of an iterator
  - `iterator()`, `spliterator()`
- you can create a stream on these elements, that can be parallel
  - `stream()`, `parallelStream()`
- get the elements of a collection in an array
  - `toArray()`, `toArray(T[])`

The Collections Framework does not provide a direct implementation of the Collection interface.


## Collections Factory Methods

### Creating Immutable Collections

#### Creating List and Set
- both the list and the set you get are immutable structures
- none of them is ArrayList or HashSet
- these structures do not accept null values
- These `of()` methods are commonly referred to as convenience factory methods for collections

```
List<String> stringList = List.of("one", "two", "three");
Set<String> stringSet = Set.of("one", "two", "three");
```

#### Creating Map
- immutable maps and immutable entries
- Null entries, null keys, and null values are not allowed
```
Map<Integer, String> map = 
    Map.of(
        1, "one", 
        2, "two",
        3, "three"
    );
```

- **use this pattern it if you have no more than 10 key-value pairs**.
- If you have more, use this -
```
Map.Entry<Integer, String> e1 = Map.entry(1, "one");
Map.Entry<Integer, String> e2 = Map.entry(2, "two");
Map.Entry<Integer, String> e3 = Map.entry(3, "three");

Map<Integer, String> map = Map.ofEntries(e1, e2, e3);
```

```
Map<Integer, String> map3 = 
    Map.ofEntries(
        entry(1, "one"),
        entry(2, "two"),
        entry(3, "three")
    );
```


### Getting an Immutable Copy of a Collection
- the collection you need to copy should not be null
- what you get in return is an immutable copy of the collection passed as an argument

```
Collection<String> strings = Arrays.asList("one", "two", "three");

List<String> list = List.copyOf(strings);
Set<String> set = Set.copyOf(strings);

```

### Wrapping an Array in a List
- `Arrays.asList()`
  - This method takes a vararg as an argument and returns a List of the elements you passed, preserving their order
  - cannot add or remove an element
  - can replace an existing element with another one
    - This method is not part of the convenience factory methods for collections but is still very useful

### Using the Collections Factory Class to Process a Collection
Collections Framework comes with another factory class: Collections, with a set of method to manipulate collections and their content.
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Collections.html

- Extracting the Minimum or the Maximum from a Collection
  - `min()`, `max()`
- Finding a Sublist in a List
  - `indexOfSublist(List<?> source, List<?> target)`, `lastIndexOfSublist(List<?> source, List<?> target)`
- Changing the Order of the Elements of a List
  - `sort()`, `shuffle()`, `rotate()`, `reverse()`, `swap()`
- Wrapping a Collection in an Immutable Collection
  - `unmodifiable...()` e.g - `unmodifiableList()`

