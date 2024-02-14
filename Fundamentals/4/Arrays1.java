// Array is an indexed collection of fixed number of homogeneous elements
// Biggest advantage is we can represent huge number of values using single variable
// So improves readability
// Disadvantage is fixed in size

// Array Declaration

int[] x;  // Recommended
int x[];
int []x;

// int[] x is recommended because the identifier is clearly seperated with the type of array

// At the time of declaration we cannot specify the size of the array

int[6] x; // Invalid
int[] x;  // Valid

// 2 D Array Declaration
int[][] x;

int[] a,b;
// Both are 1 D arrays

int[] a[],b;
// a is 2D array, b is 1D array

int[] a[],b[];
// Both are 2D arrays

int[] []a,b;
// Both are 2D arrays

int[] []a,b[];
// a is a 2D array, b is a 3D array

int[] []a,[]b;
// Invalid
// Dimension before variable name is applicable only for the first variable
// If we want to specify dimension before the variable,
// Facility is applicable only for 1st variable in the declaration
// If we try to apply for remaining variables we get errors.

int[] []a,[]b,[]c;
// Invalid
// Due to above reasons, dimension before b and dimension before c is invalid

// 3 Dimensional Array
int[][][] p;

// Important
// At the time of declaration we cannot specify the array size

// Creation of Array
// Arrays can be created using new operator
// Every array in Java is an object

int[] a = new int[5];

// But if array is an object then where is the corresponding class?
// Note that these corresponding classes are a part of the Java language level 
// And these are not available at the Programmer level
// To get those

System.out.println(a.getClass().getName());
// [I
// For 2D array,
// [[I

// Array       Corresponding Class
// int[]        [I
// int[][]      [[I
// double[]     [D
// short[]      [S
// byte[]       [B
// boolean[]    [Z

// Important
// At the time of Declaration we cannot specify the size
// But at the time of Creation we must specify the size
int[] x = new int[];
// Gives compile time error

int[] x = new int[6];
// Valid

int[] x = new int[0];
// Valid

int[] x = new int[-5];
// Compiler only checks whether the size has been specified or not
// It checks only for integer and hence the size does not matter
// But, JVM will give a Runtime error
// NegativeArraySizeException

int[] x = new int[size];
// Size is expected in integer
// So, in place of integer, we can write char, byte, short, int

int[] x = new int['a'];
// Here a in char is converted to 97
// Size of the array is 97

int[] x = new int[10l];
// Invalid because long is not allowed

// To specify array size, allowed datatypes are int, char, byte, short
// For any other type, we get compile time error

// What is the maximum size array we can declare in Java?
// Since we are allowed to use the biggest datatype as int to mention the size
// The largest array size is also the max value of int which is 32 bit
// Hence largest array size is 2147483647l (int_max)

// If we declare the largest array of the size int_max value,
// It will actually need int_max*4 bytes of memory
// Because each int requires 4 bytes of memory
// This is fine syntactically and to the compiler
// But JVM may give Runtime error because this memory is too much compared to available memory


