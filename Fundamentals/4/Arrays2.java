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

int[][] x = new int[3][6];
// Here it creates a base array of size 3
// Every element in that base array is of size 6

int[][] p = new int[3][];
// Here it creates a base array of size 3
p[0] = new int[2];
p[1] = new int[3];

// Sometimes we can declare arrays without name
// Such arrays are called Anonymous arrays
// These arrays are for instant use (1 time usage)

// We can create anonymous array as follows
new int[] {10,20,30,40};

// Note that size is not specified,
new int[4] {10,20,30,40};
// Compile Time error

// Why would we need Nameless arrays?
// Suppose we have a method that prints the sum of elements of an array
// We don't need that array anytime after that

public static void summ(int[] x)
  {
  int total = 0;
  for(int x1 : x) total+=x1;
  System.out.println(total);
};

// Here if we don't need the array again, then
// Call the summ method as :
 summ(new int[]{10,20,30,40,50});

// Note that these elements cannot be accessed again then
// In anonymous arrays we cannot specify size
// Else we get compile time error

// We can also create multidimensional anonymous arrays also

new int[][] {{10,20},{10,20,30}};

// Based on our requirement, we can give the name for anonymous array
// Then it is no longer anonymous

int[] x = new int[]{10,20,30};
// Now this array is no longer anonymous

// The chart is as follows

// byte->short->int->long->float->double
//           char|^

// char can also be assigned to int

int[] x = new int[5];
x[0] = 'a';
// char can be assigned to int, hence works

// byte, short, int, long, float can be assigned to float array.

// In the case of Object type arrays,
// As array elements we can assign, either declared type objects or its child class objects

// Example 1:

Object[] a = new Object[5];
a[0] = new Object();
a[1] = new Integer(10);
a[2] = new String("Hello");
// All of the above are valid

// All numerical and decimal types are the children of Number class
// ie short, byte, int, float, double, long 

Number[] n = new Number[10];
n[0] = new Number[1];
n[1] = new Double(0.5);
n[2] = new String("Hello");
// Compile time error because String is not a child class of Number

// For interface type arrays,
// As array elements, its implementation class objects are allowed

Runnable[] r = new Runnable[10];
r[0] = new Thread(); // Valid
r[1] = new String("Hello"); // Invalid

// Since Thread class implements runnable so r[0] is valid

// Array type                   Allowed element types
// Primitive arrays             Any type which can be implicity promoted to declared type
// Object type arrays           Declared type or its child class objects
// Abstract class type arrays   its child class objects
// Interface type arrays        All implementation class objects are allowed
  

