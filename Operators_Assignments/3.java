// instanceof operator
// We can use instanceof operator to check whether given object is of particular type or not

// l is a list of objects (we don't know which they are)

Object o = l.get(0);
// Object class can hold any object type hence we use that class

if(o instanceof Student)
{
  Student s = Student(o);
  // Perform student specific functionality
}
if(o instanceof Customer)
{
  Customer c = Customer(o);
  // Perform customer specific functionality
}

// Syntax of instanceof operator
// r instanceof X
// r is object reference
// X is class or interface name

// Thread is child class of Object
// Thread implements Runnable interface

Thread t =  new Thread();
System.out.println(t instanceof Thread); // true
System.out.println(t instanceof Object); // true
System.out.println(t instanceof Runnable); // true

Thread t = new Thread();
System.out.println(t instanceof String);
// Compile time error : Incompatible types
// found : java.lang.thread, required : java.lang.String

// To use instanceof operator, 
// There should be some relation between argument types either child to parent or parent to child or same type
// Otherwise Compile time error : inconvertible types

// null instanceof X;
// For any class or interface X
// It is always false

System.out.println(null instanceof Thread) // false
System.out.println(null instanceof Runnable) // false

// Bitwise Operators
// & AND
// | OR
// ^ XOR // Same same ke liye false, alag alag ke liye true

System.out.println(4 & 5);
// 4
System.out.println(4 | 5);
// 5
System.out.println(4 ^ 5);
// 1

// We get above results after performing bitwise 0/1 operations
// We can apply bitwise operators to numerical types also, like int,byte,short,long

// Bitwise Complement Operator
System.out.println(~true);
// Compile time error
// Bitwise complement operator is usable only on Numerical types, not on Booleans
// We can use the operator only for integral types

System.out.println(~4);
// Flip the bits 
// 100 -> 011 
// 4 will be represented as 000.......010
// Sign MSB bit is 0, it is a positive number
// On flipping/complementing the bits
// We get 111111.....101
// Sign MSB bit is 1, it is a negative number
// Negative numbers are represented in 2s complement form
// To take 2s complement,
// Find 1s complement and then add 1
// We get -5

// We need to perform 32 bit complement, not just 3-4 bit complement

// Note
// The MSB acts as Sign Bit
// 0 means positive number
// Positive numbers are represented directly in memory
// Negative numbers are represented in 2s complement

// Note that for the complement operator,
// We need to perform entire 32 bit operation
// Whereas for &,|,^, even if we consider last bits then its okay, answer remains same

// Boolean complement operator
System.out.println(!4);
// Invalid, compile time error, boolean complement operator cannot be used for integrals

System.out.println(!false);
// true

// We can apply this operator only to boolean types not integral types

// Summary :
// &,|,^ are applicable for both boolean and integral types
// ~ is applicable only for integral, not boolean types
// ! is applicable only for boolean, not integral types
