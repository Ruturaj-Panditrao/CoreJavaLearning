// var args
// Variable Number of Argument Methods

// Need of var arg methods
sum(10,20);
public static void main(int a, int b)
{
  System.out.println(a+b);
}

// Now for
sum(10,20,300;
// We need to re-write the method completely again

// Again for
sum(10,20,30,40);
// We will need to re-write method completely again

// To handle this, we create var-arg methods
// Where, we can declare a method that can accept variable number of arguments
// Such type methods are called var-arg methods

sum(int... a) // 3 dots

// We can declare var-arg method as follows
m1(int... x)
// We can call this method using any number of values including 0

m1();
m1(10);
m1(10,20,30);
m1(10,20,30,40);

class Test
  {
    public static void m1(int... x)
    {
      System.out.println("Hi");
    }
  }

// The var-arg parameters internally convert to an array
// Hence within the var-arg we can differentiate values using index

// The best application example of var-arg method is 

public static void sum(int... x)
{
    int total = 0;
  for(int x1 : x)
    {
      total+=x1;
    }
  System.out.println(total);
}

// This sum method can be called with
sum();
sum(10);
sum(10,20);
sum(10,20,30);
sum(10,20,30,40);

m1(int x, int... y)
// 1 int value is compulsory
// Then any number of int values

m1(String s, double... y)
// Atleast 1 String parameter
// Then any number of Double arguments

// If we use var-arg parameter with a normal paramer
// Then var-arg parameter should be the last paramter

m1(double... y, int x)
  // Invalid

m1(int... x, double... d)
  // Invalid
  // Inside 1 var-arg method, we can take only 1 var-arg parameter
  // We cannot take more than 1 var-arg parameter

class Test
  {
    public static void m1(int... x)
    {
    }
    public static void m1(int[] x)
    {
    }

    // In class, we cannot have 2 methods with same name and same signature
    // In the first case as well, the var-arg will be converted into array
    // Hence we will face compile time error
  }

// In a class we cannot declare a var-arg method and corresponding 1 dimensional array method simultaneously
// Else we face a compile time error

class Test
  {
    public static void m1(int... x)
    {
    }
    public static void m1(int x)
    {
    }
  }

// Note that var-arg method can be called even with 0 parameters

m1()
  // Hits the var-arg method

m1(10)
  // Now both are applicable,
  // But in this case, general normal methods are always more prefered than var-arg methods
  // var-arg methods have the least priority in Java 

// Equivalence between var-arg method and 1 Dimensional array
// Wherever 1 D array is present, we can replace with var-arg parameter
// m1(int[] x)
// can be replaced with
// m1(int... x)

// Similarly,
// public static void main(String[] args)
// Can be written as
// public static void main(String... args)

// However, the reverse is not true
// Wherever there is a var-arg paramter is present, we cannot replace with 1D array
// Because var-arg can also accept 0 arguments
// Also, methods written with array as parameters will expect array as argument
// Whereas the parameters in var-arg can be numbers also, as they will be internally converted to array

m1(int... x) 
// We can call this method with group of int values and x will become 1 D

m1(int[]... x)
// We can call this method by passing a group of 1 D arrays and x will become 2D int array

public static void main(String[] args)
{
  int[] a = {10,20,30};
  int[] b = {30,40,50};

  m1(a,b);
}

public static void m1(int[]... x)
{
  // x will be converted to 2D array, base size of array is 2
  for(x1 : x)
  {
    System.out.println(x1[0]);
    // 10,30
  }
}
