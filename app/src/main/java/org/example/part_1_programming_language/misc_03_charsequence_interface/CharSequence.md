# misc_03_charsequence_interface

<!-- TOC -->
* [misc_03_charsequence_interface](#misc_03_charsequence_interface)
  * [CharSequence Interface](#charsequence-interface)
    * [Methods](#methods)
<!-- TOC -->

## CharSequence Interface
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/CharSequence.html

### Methods
- `char chatAt(int index)`
- `static int compare(CharSequence seqA, CharSequence seqB)` 
  - returns 
    - 0 if same
    - -ve if A < B
    - +ve if A > B
- `default IntStream chars()`
- `default IntStream codePoints()`
- `default boolean isEmpty()`
- `int length()`
- `CharSequence subSequence(int startIndex, int stopIndex)`
- `String toString()`