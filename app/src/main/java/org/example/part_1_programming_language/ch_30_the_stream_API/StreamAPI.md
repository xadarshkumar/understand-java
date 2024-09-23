# ch_30_the_stream_API
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/package-summary.html

- The stream API is designed to perform very sophisticated operations like search, filter, map or otherwise manipulate data
- A stream represents a sequence of objects
- A stream operates on an array or a collection

<!-- TOC -->
* [ch_30_the_stream_API](#ch_30_the_stream_api)
  * [Interface BaseStream](#interface-basestream)
    * [BaseStream operations](#basestream-operations)
  * [Interface Stream](#interface-stream)
    * [Stream operations](#stream-operations)
    * [Obtain a stream](#obtain-a-stream)
<!-- TOC -->

## Interface BaseStream
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/BaseStream.html

- BaseStream defines the basic functionality available in all streams
- `Interface BaseStream<T, S extends BaseStream<T,S>>`
    - T is the type of elements in the stream
    - S specifies the type of stream that extends BaseStream
- BaseStream is generic interface 
- BaseStream extends the AutoCloseable interface.

### BaseStream operations
- `void close()`
- `boolean isParallel()`
- `Iterator<T> iterator()` - Terminal Operation
- `S onClose(Runnable handler)` - Intermediate Operation
- `S parallel()` - Intermediate Operation
- `S sequential()` - Intermediate Operation
- `Spliterator<T> spliterator()` - Terminal Operation
- `S unordered()` - Intermediate Operation

## Interface Stream
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html

- Stream is derived from BaseStream
- `Interface Stream<T>`
  - T is the type of elements in the stream
- Stream is a generic interface 

### Stream operations
- `Stream<T> filter(Predicate<? super> pred)` - Intermediate Operation
- `<R> Stream<R> map(Function<? super T, ? extends R> mapFunc)` - Intermediate Operation
- `void forEach(Consumer<? super T> action)` - Terminal Operation
- `T reduce(T identityVal, BinaryOperator<T> accumulator)` - Terminal Operation
- `long count()` - Terminal Operation
- `Optional<T> max(Comparator<? super T> comp)` - Terminal Operation
- `Optional<T> min(Comparator<? super T> comp)` - Terminal Operation
- `<R, A> R collect(Collector<? super T, A, R> collectorFunc)` - Terminal Operation
- `Stream<T> sorted()` - Intermediate Operation
- `Object[] toArray()` - Terminal Operation
- `default List<T> toList()` - Terminal Operation

A terminal operation consumes the stream\
An intermediate stream produce another stream

- Stream operates on object references, it can't operate directly on primitive types.

### Obtain a stream
- `default Stream<E> stream()`
- `default Stream<E> parallelStream()`
- `static <T> Stream<T> stream(T[] array)`
  - from Arrays class, use - `Arrays.stream()`