// 2D array declaration

// In Java, 2D arrays are not represented using the Matrix approach
// Since matrix approach can lead to wastage of space
// Some people use the Array of Arrays approach
// For multidimensional array creation

// 0 -> 20 30 40 
// 1 -> 2 37
// 2 -> 4 90 12 23 45 67
// Array of Arrays

// Memory utilization is improved

int[][] x = new int[2][];
// Base array of size 2
// Only the Base size is mandatory to be specified
x[0] = new int[2];
x[1] = new int[3];

// Array of Array of Arrays
// 2 base size branches to 3 and 2 sized arrays
// The 3 sized array branches out to 3 arrays of size 1,2,3
// The 2 sized array from the base size branches out to 2, 2 sized arrays

int[][][] x = new int[2][][];
x[0] = new int[3][];
x[0][0] = new int[1];
x[0][1] = new int[2];
x[0][2] = new int[3];
x[1] = new int[2][2];
x[1][0] = new int[2];
x[1][1] = new int[2];

// Some examples

int[][] x = new int [][];
// Invalid because we must specify atleast the base size
int[][] x = new int [][3];
// Invalid because we cannot specify the next size without specifying the base size

int[][][] x =  new int [3][4][];
// Valid

int[][][] x = new int [3][][5];
// Invalid because we cannot specify the next size without specifying the previous base size

int[][][] x = new int [][4][5];
// Invalid because of above mentioned rule

// In Java, Arrays are Initialized to 0 by default
// Whenever we try to print any reference variable, internally 2 string method will be called that will return the string,
// In classname@hashcode_in_hexadecimal_form

int[] x = new int[3];
System.out.println(x[0]) -> 0

int[][] x = new int[2][2];
System.out.println(x) -> [[I@3ae25 (2D Array)
System.out.println(x[0]) -> [I@3ae25  (1D Array)
System.out.println(x[0][0]) -> 0 (Actual Element)

int[][] x = new int[2][];
System.out.println(x) -> [[I@3ae25 (2D Array)
System.out.println(x[0]) -> null (Since only base array is initialized and the ones inside base array are not initialized yet)
System.out.println(x[0][0]) -> Null Pointer Exception
// Since we tried to access null values in the above case

// After creating an array, every array element is initialized by default values as 0

// ArrayIndexOutOfBoundsException

// For array of size 6
// If we try to access the 7th element
// x[6] -> The compiler checks whether the number is an integer -> it is  
// So no compile time error
// However, it will throw a runtime error
// x[-6]
// Here again, no compile time error, but a runtime error

// x[2.5]
// Here immediately compiler sees that the number is a double
// Compile time error : found double, required int

int x[] = {10,20,30};
// Declaration, creation and initialization in one line

char x[] = {'a','b','c','d'};

// Also applicable for multidimensional arrays

int[][] x = {{10,20},{50,60,70}};

// But such thing should be done in one line only, else we will get compile time error

int[] x;
x = {10,20,30};
// Compile Time Error : Illegal Start of Expression

// length vs length()

int[] x = new int[5];
System.out.println( x.length() ) -> Compile Time Error
// For arrays, x.length() does not work, since .length() is a method

System.out.println( x.length ) -> 5
// For arrays, x.length gives 5
// For arrays, length is a default variable not a method

// length is a final variable applicable for arrays
// it represents the size of the array

// length() method is for Strings, length is variable for Arrays

String s = "abc";
System.out.println(s.length) -> Compile Time Error
System.out.println(s.length()) -> 3
// note here length() method is a final method because it has been defined in String class
// And it cannot be overwritten

// length() method is a final method applicable for String objects

// length variable is applicable for Arrays but not String objects
// length() method is applicable for String objects not Arrays

String s = {"A","AA","AAA"};
System.out.println(s.length) -> 3
System.out.println(s.length()) -> Compile Time Error
System.out.println(s[0].length()) -> 1
System.out.println(s[0].length) -> Compile Time Error

int[][] x = new int[6][3];
x.length -> 6
// length variable gives the length of base array in the case of multidimensional array
x[0].length -> 3

// Since in case of multidimensional arrays, it is basically an array of arrays
// And every array within the base array can have different size
// Hence it returns the size of base array by default


