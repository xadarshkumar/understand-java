# misc_04_array



## Array
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Arrays.html

- group of like-typed variables that are referred to by a common name.
- all arrays are dynamically allocated.
- arrays are implemented as objects.
- arrays are of fixed length. After arrays are created, they cannot grow or shrink

### obtain array
Obtaining array is a 2 step process.
```
type[] var-name; // declare a variable of desired array type
var-name = new type[size]; // allocate the memory that will hold the array using **new**, and assign it to array variable
```

Arrays can be initialized when they are declared using **array initializer**.
```
int[] month_days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
```

We can use **var** to declare an array.
```
var myArray = new int[10]; // valid

var[] myArray = new int[10]; // invalid
var myArray[] = new int[10]; // invalid
```
- var can only by used when that variable is initialized. 
- `var counter; // invalid`

### array length
Arrays are implemented as objects. There is a special array attribute i.e, length instance variable.
- `arr.length` is used to get the length of array