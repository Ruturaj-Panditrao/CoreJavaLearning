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

