# misc_01_string

<!-- TOC -->
* [misc_01_string](#misc_01_string)
  * [StringBuilder](#stringbuilder)
  * [Constructor](#constructor)
  * [Methods](#methods)
<!-- TOC -->

## StringBuilder
StringBuffer is similar to StringBuilder with one difference:
- StringBuffer is synchronized - methods are thread-safe
- StringBuilder is not synchronized - methods are not thread-safe - faster than StringBuffer

## Constructor
- `StringBuilder()`
- `StringBuilder(int size)`
- `StringBuilder(String str)`
- `StringBuilder(CharSequence chars)`

## Methods
- `toString()` - converts StringBuilder to String
- `int length()`
- `int capacity()`
- `void ensureCapacity(int minCapacity)`
- `void setLength(int len)`
- `char charAt(int where)`
- `char setCharAt(int where, char ch)`
- `void getChars(int sourceStart, int sou[String.md](String.md)rceEnd, char[] target, int targetStart)`
- `StringBuilder append(String str)`
- `StringBuilder append(int num)`
- `StringBuilder append(Object obj)`
- `StringBuilder insert(int index, String str)`
- `StringBuilder insert(int index, char ch)`
- `StringBuilder insert(int index, Object obj)`
- `StringBuilder reverse()`
- `StringBuilder delete(int startIndex, int endIndex)`
- `StringBuilder deleteCharAt(int index)`
- `StringBuilder replace(int startIndex, int endIndex, String str)`
- `String substring(int startIndex)`
- `String substring(int startIndex, int endIndex)`
