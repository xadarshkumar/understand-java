# misc_01_string

<!-- TOC -->
* [misc_01_string](#misc_01_string)
  * [String](#string)
    * [String Constructors](#string-constructors-)
    * [String length [int .length()]](#string-length-int-length)
    * [Special String Operations](#special-string-operations)
      * [string literals ["..."]](#string-literals-)
      * [string concatenation [+]](#string-concatenation-)
    * [character extraction [char .charAt(index), char[] .toCharArray()]](#character-extraction-char-charatindex-char-tochararray)
    * [string comparison [boolean .equals(str)]](#string-comparison-boolean-equalsstr)
    * [searching strings [int .indexOf(pattern)]](#searching-strings-int-indexofpattern)
    * [modifying a string [String .subString(start, end), String .concat(str), String[] .split(delimiter), String .replace(start, end)]](#modifying-a-string-string-substringstart-end-string-concatstr-string-splitdelimiter-string-replacestart-end)
    * [joining strings [String .join(delimiter, str)]](#joining-strings-string-joindelimiter-str)
    * [changing the case of characters [String .toLowerCase(), String .toUpperCase()]](#changing-the-case-of-characters-string-tolowercase-string-touppercase)
    * [convert to Numbers [int .parseInt(str)]](#convert-to-numbers-int-parseintstr-)
    * [convert to Strings [String .toString()]](#convert-to-strings-string-tostring)
    * [data conversion [String .valueOf()]](#data-conversion-string-valueof)
<!-- TOC -->

## String
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html

- It is not a primitive type,
- It is not an array of characters.
- Every string you create is actually an object of type **String**.
- Objects of type **String** are immutable.
  - fixed, immutable strings can be implemented more efficiently than changeable ones.
- Java defines **StringBuffer** and **StringBuilder** classes which allows strings to be altered.
- **String**, **StringBuffer** and **StringBuilder** classes are defined in **java.lang**. Thus available to all programs automatically.
  - All are declared as final, i.e, they can't be subclassed
  - All three implements **CharSequence** interface.

### String Constructors 
- create empty string
```
String s1;
String s2 = new String();
```

- string initialized by an array of characters
```
char[] chars = {'a', 'b', 'c'};
String s = new String(chars);
```
another form - `String(char[] chars, int startindex, int numChars)`

- string from another string
```
String s = new String("Hello")
String sNew = new String(s)
```

- StringBuffer & StringBuilder
``` 
String(StringBuffer strBufObj)

String(StringBuilder strBuildObj)
```

- array of strings
```
String[] str = {"one", "two", "three"};
int len = str.length;
```

### String length [int .length()]
```
String s = "abc"
int len = s.length();
```

### Special String Operations
#### string literals ["..."]
```
String s1 = "abc";
```

#### string concatenation [+]
`+` is used to concatenate two strings
```
int age = 44;
String s = "he is " + age + " years old";
```

### character extraction [char .charAt(index), char[] .toCharArray()]
- `char charAt(int index)` to obtain char at specific index
- `void getChars(int sourceStart, int sourceEnd, char[] target, int targetStart)`
- `byte[] getBytes`
- `char[] toCharArray()`

### string comparison [boolean .equals(str)]
- `boolean equals(String str)`
- `boolean equalsIgnoreCase(String str)`
- `boolean startsWith(String str)`
- `boolean endsWith(String str)`
- `boolean contains(String str)`
- `equals()` vs `==`
  - `equals()` compares the characters inside a String object
  - `==` compares two object references to see whether they refer to the same instance

### searching strings [int .indexOf(pattern)]
- `int indexOf(String pattern)` - searches first occurrence of a character or substring 
- `int lastIndexOf(String pattern)` - searches last occurrence of a character or substring
- returns index if found, else -1

### modifying a string [String .subString(start, end), String .concat(str), String[] .split(delimiter), String .replace(start, end)]
- `String substring(int startindex)`
- `String substring(int startindex, int endIndex)`
- `String concat(String str)`
- `String replace(char original, char replacement)`
- `String replace(CharSequence original, CharSequence replacement)`
- `String[] split(String delimiter)`
- `String trim()` - removes any leading and trailing spaces

### joining strings [String .join(delimiter, str)]
used to concatenate two or more strings, separating each string staring with a delimiter.
- `String join(CharSequence delim, CharSequence ...strs)`

### changing the case of characters [String .toLowerCase(), String .toUpperCase()]
- `String toLowerCase()`
- `String toUpperCase()`

### convert to Numbers [int .parseInt(str)] 
The Integer class provide the **parseInt()** method.
```
int i = Integer.parseint("1");
```
Similar methods exists for Byte, Short, Long, Float and Double classes.

### convert to Strings [String .toString()]
The Integer class provide the **toString()** method to convert whole number into decimal string.

Integer and Long classes also provide the methods `toBinaryString()`, `toHexString()` and `toOctalString()` which converts
a value into binary, hexadecimal or octal respectively.
```
String str = Integer.toString(1);

String s = Integer.toBinaryString(num);
```
Similar methods exists for Byte, Short, Long, Float and Double classes.

### data conversion [String .valueOf()]
It can be called when a string representation of some other type of data is needed.
- `String valueOf(double num)`
- `String valueOf(long num)`
- `String valueOf(Object ob)`
- `String valueOf(char[] chars)`
- `String valueOf(char[] chars, int startIndex, int numChars)`
