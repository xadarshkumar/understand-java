# misc_07_map_interface

<!-- TOC -->
* [misc_07_map_interface](#misc_07_map_interface)
  * [Map Interface](#map-interface)
    * [Map operations](#map-operations)
    * [Map implementation](#map-implementation)
      * [HashMap](#hashmap)
      * [LinkedHashMap](#linkedhashmap)
  * [SortedMap Interface](#sortedmap-interface)
    * [SortedMap operations](#sortedmap-operations)
    * [SortedMap implementation](#sortedmap-implementation)
  * [NavigableMap Interface](#navigablemap-interface)
    * [NavigableMap operations](#navigablemap-operations)
    * [NavigableMap implementation](#navigablemap-implementation)
      * [TreeMap](#treemap)
<!-- TOC -->

## Map Interface

https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Map.html

Map is a structure able to store key-value pairs
- value is any object your application needs to handle
- key is something that can represent this object
- relationship between a key and its bound value follows these two simple rules
  - a key can be bound to only one value
  - a value can be bound to several keys
- consequences for the content of the map due to above 2 rules
  - set of all the keys cannot have any duplicates, so it has the structure of a Set
  - set of all the key/value pairs cannot have duplicates either, so it also has the structure of a Set
  - set of all the values may have duplicates, so it has the structure of a plain Collection

### Map operations
- Putting a key/value pair in the map
  - `put(key, value)`, `putIfAbsent()`
    - if key is not already present, then the key/value pair is simply added
    - if key is present, then the existing value is replaced with the new one
- Getting a value from a key
  - `get(key)`, `getOrDefault()`
- Removing a key from a map, along with its value
  - `remove(key)`, `remove(key, value)`
- Checking for the Presence of a Key or a Value
  - `containsKey(key)`, `containsValue(value)`
- Checking for the Content of a Map
  - `isEmpty()`, `size()`, 
- Clearing the content of a map
  - `clear()`
- Putting all the content of another map in this map
  - `putAll(otherMap)`
    - if some keys are present in both maps, then the values of otherMap will erase those of this map
- Set, containing the keys defined in the map
  - `keySet()`
- Set<Map.Entry>, containing the key/value pairs contained in the map
  - `entrySet()`
- Collection, containing the values present in the map
  - `values()`
- Iterate over the key/value pairs of a map
```
for (Map.Entry<Integer, String> entry : map.entrySet()) {
    System.out.println("entry = " + entry);
}
```

Map defines member interface: `Map.Entry` to model a key-value pair
https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Map.Entry.html

### Map implementation

The Map interface has many implementations.
1. HashMap https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/HashMap.html
2. LinkedHashMap https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/HashMap.html
3. IdentityHashMap https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/IdentityHashMap.html

Choose depending upon specific needs
- HashMap: An object that maps keys to values, cannot contain duplicate keys, permits null values and the null key
- LinkedHashMap: basically a HashMap, while maintaining the insertion order
- IdentityHashMap: It is not a general-purpose Map implementation. Very rarely used. Refer official docs.

#### HashMap
`HashMap()`
  - Constructs an empty HashMap
  - Default initial capacity (16) and the default load factor (0.75)
- `HashMap(int initialCapacity)`
  - Constructs an empty HashMap with the specified initial capacity
  - Default load factor (0.75)
`HashMap(initialCapacity: int,loadFactor: float)`
  - Constructs an empty HashMap with the specified initial capacity and load factor
`HashMap(m: Map<? extends K, ? extends V>)`
  - Constructs a new HashMap with the same mappings as the specified Map

#### LinkedHashMap
`LinkedHashMap()`
  - Constructs an empty insertion-ordered LinkedHashMap instance
  - Default initial capacity (16) and load factor (0.75)
- `LinkedHashMap(int initialCapacity)`
- `LinkedHashMap(int initialCapacity, float loadFactor)`
- `LinkedHashMap(initialCapacity: int, loadFactor: float, accessOrder: boolean)`
  - Constructs an empty LinkedHashMap instance with the specified initial capacity, load factor and ordering mode
`LinkedHashMap(m: Map<? extends K,? extends V>)`
  - Constructs an insertion-ordered LinkedHashMap instance with the same mappings as the specified map

---

---

## SortedMap Interface

https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/SortedMap.html

key/value pairs sorted by key

### SortedMap operations
It adds new operations -

- get lowest and largest key
  - `firstKey()`, `lastKey()`
- SortedMap, whose keys are strictly less than toKey, or greater than or equal to fromKey
  - `headMap(toKey)`, `tailMap(fromKey)`
- SortedMap, whose keys are strictly lesser than toKey, or greater than or equal to fromKey. 
  - `subMap(fromKey, toKey)`

### SortedMap implementation
The SortedMap interface has 1 implementation.

1. TreeMap https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/TreeMap.html
   - The TreeMap class is a red-black tree, a well-known data structure.

---

---

## NavigableMap Interface

https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/NavigableMap.html

### NavigableMap operations
It adds new operations -

Accessing to Specific Keys or Entries
- lowest or greatest key or entry from this map
  - `firstKey()`, `firstEntry()`, `lastEntry()`, and `lastKey()`
- lowest key or entry greater than the provided key
  - `ceilingKey(key)`, `ceilingEntry(key)`, `higherKey(key)`, `higherEntry(key)`
    - ceiling methods may return a key that is equal to the provided key
    - key returned by the higher methods is strictly greater
- greatest key or entry lesser than the provided key
  - `floorKey(key)`, `floorEntry(key)`, `lowerKey(key)`, `lowerEntry(key)`
    - floor methods may return a key that is equal to the provided key
    - key returned by the higher methods is strictly lower

Accessing your Map with Queue-Like Features
- returns and removes the lowest entry
  - `pollFirstEntry()`
- returns and removes the greatest entry
  - `pollLastEntry()`

Getting Submap Views
- sub-map where you can decide to include or not the boundaries
- `subMap(fromKey, fromInclusive, toKey, toInclusive)`
- same for the head map 
  - `headMap(toKey, inclusive)`
- same for the tail map 
  - `tailMap(fromKey, inclusive)`

### NavigableMap implementation
The NavigableMap interface has 1 implementation.

1. TreeMap https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/TreeMap.html
  - The TreeMap class is a red-black tree, a well-known data structure.

Choose depending upon specific needs
- TreeSet: set of keys with a collection of values, keys sorted by their natural order or by an order specified by a Comparator

#### TreeMap
`TreeMap()`
  - Constructs a new, empty tree map, using the natural ordering of its keys
`TreeMap(m: Map<? extends K,? extends V>)`
  - Constructs a new tree map containing the same mappings as the given map, ordered according to the natural ordering of its keys
`TreeMap(c: Comparator<? super K>)`
  - Constructs a new, empty tree map, ordered according to the given comparator
- `TreeMap(SortedMap<K,? extends V> m)`
  - Constructs a new tree map containing the same mappings and using the same ordering as the specified sorted map