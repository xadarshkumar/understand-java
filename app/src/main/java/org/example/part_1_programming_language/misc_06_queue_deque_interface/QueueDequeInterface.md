# misc_06_queue_deque_interface

<!-- TOC -->
* [misc_06_queue_deque_interface](#misc_06_queue_deque_interface)
  * [Queue interface, Deque interface](#queue-interface-deque-interface)
    * [Queue operations](#queue-operations)
    * [Deque operations](#deque-operations)
    * [Comparison of Queue and Deque methods](#comparison-of-queue-and-deque-methods)
    * [Comparison of Stack and Deque methods](#comparison-of-stack-and-deque-methods)
    * [Queue and Deque implementation](#queue-and-deque-implementation)
<!-- TOC -->

## Queue interface, Deque interface

https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Queue.html
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Deque.html

`Queue` interface models a queue. `Deque` interface models a double ended queue.
`BlockingQueue`, `BlockingDeque` and `TransferQueue`, are at the intersection of the Collections Framework and concurrent programming in Java,

Stacks - LIFO, Queues - FIFO

It has four main operations - 
- adds an element to the queue, or the stack `push`
- removes an element from the stack, that is, the youngest element added `pop`
- removes an element from the queue, that is, the oldest element added `poll`
- allows you to see the element you will get, but without removing it from the queue of the stack `peek`


- two corner cases to consider
  - A queue may be full and not able to accept more elements
  - A queue may be empty and cannot return an element with a pop, poll, nor the peek operation

### Queue operations

| Method  | Throws exception | Returns special value |
|---------|------------------|-----------------------|
| Insert  | `add(e)`         | `offer(e)`            |
| Remove  | `remove()`       | `poll()`              |
| Examine | `element()`      | `peek()`              |

### Deque operations
- First Element (Head)

| Method  | Throws exception | Returns special value |
|---------|------------------|-----------------------|
| Insert  | `addFirst(e)`    | `offerFirst(e)`       |
| Remove  | `removeFirst()`  | `pollFirst()`         |
| Examine | `getFirst()`     | `peekFirst()`         |

- Last Element (Tail)

| Method  | Throws exception | Returns special value |
|---------|------------------|-----------------------|
| Insert  | `addLast(e)`     | `offerLast(e)`        |
| Remove  | `removeLast()`   | `pollLast()`          |
| Examine | `getLast()`      | `peekLast()`          |

### Comparison of Queue and Deque methods

| Queue Method | Equivalent Deque Method |
|--------------|-------------------------|
| add(e)       | addLast(e)              |
| offer(e)     | offerLast(e)            |
| remove()     | removeFirst()           |
| poll()       | pollFirst()             |
| element()    | getFirst()              |
| peek()       | peekFirst()             |

### Comparison of Stack and Deque methods

| Stack Method | Equivalent Deque Method |
|--------------|-------------------------|
| push(e)      | addFirst(e)             |
| pop()        | removeFirst()           |
| peek()       | getFirst()              |

### Queue and Deque implementation

The Queue and Deque interfaces have 3 implementations.
1. ArrayDeque: 
   - implements both
   - implementation is backed by an array
   - always accepts new elements
   - https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayDeque.html
2. LinkedList: 
   - implements both
   - implementation is backed by a linked list
   - always accept new elements
   - https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/LinkedList.html
3. PriorityQueue: 
   - only implements Queue
   - backed by an array that keeps its elements sorted by their natural order or by an order specified by a Comparator
   - the head of this queue is always the least element of the queue with respect to the specified ordering
   - automatically grows as elements are added
   - https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/PriorityQueue.html
