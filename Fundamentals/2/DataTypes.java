// Java is a strongly typed programming language
// Type checking is very strongly done
// In Java every variable and expression has some datatype
// Each and every assignment is checked by compiler for type compatilbilty
// int x = 10.5 Not allowed
// boolean p = true Not allowed

// Is Java a purely object oriented language?

// Yes and No
// A scored 2 marks more than B in the test
// A is more intelligent than B.
// But B's score is 0
// So A is now not intelligent !!
// Similiarly, compared to older programming languages like C, C++,
// Java is more object oriented
// However, Java in itself is not fully or purely object oriented
// Because it does not have all the OOP features like Operator Overloading,
// Also, in Purely Object Oriented Language, everything should be in the form of Objects
// But we write int x = 10, here int is not a class and x is not an object, it is a primitive
// Since this is allowed, we cannot say Java is a pure object oriented programming language.

// Hence, Java is not a purely object oriented language
// Because several OOP features are not supported in Java
// Like : Operator Overloading, Multiple Inheritance
// Moreover we depend upon primitive datatypes which are non objects.

// Hence in Interviews, prefer saying Java is NOT a Purely Object Oriented Programming Language

// 8 Primitive Datatypes in Java 

// 1> byte

// byte : 8 bits, 1 MSB bit for minus sign, 0 is positive, 1 is negative, Range : Max is 127 (1 bit for sign)
// Positive numbers are represented directy
// For negative numbers, they are represented in 2s complement form
// 7 bits are enough to represent -128
// Hence range is -128 to +127

// byte b = 128 
// Compile Time Error : Possible Loss of Precision
// Found int, required byte
// Note that here it is compatible (integer stored in integer type), but there is Possible Loss of Precision

// byte b = 10.5
// Compile Time Error : Possible Loss of Prediction
// Found double, required byte

// byte b = true
// Compile Time Error : Incompatible Type
// Found boolean, required byte

// To handle data in the form of streams or in the files,
// To write data to file or handle data in streams to files and networks,
// Best datatype is Byte
// File supported and Network supported datatype is Byte
// FileOutputStream is used to write Binary Data to the File
// It takes arguments as FileOutputStream(byte[] b)

// Byte is the best choice to handle data in terms of streams
// Either from the file or from the network
// File supported form or Network supported form is byte

// 2> short

// 2 bytes : 16 bits
// Range -2^15 to 2^15-1

// short s = 6000000;
// Compile Time Error : Possible loss of precision
// found : int, required : short

// short s = 10.5
// Compile Time Error : Possible Loss of Precision
// found : double. required : int

// short s = true
// Compile Time Error : Incompatible Types
// Found boolean, Required short

// short datatype is best suited for 16 bit processors like 8085,8086
// But these processors are completely outdated,
// Hence corresponding short datatypes are also outdated

// 3> int 

// Size : 4 bytes : 32 bits
// Range : -2^31 to 2^31-1

// int x =  2^34 
// Compile time error : Integer too long

// By default every integral number is treated as an Integer
// int x = 1344785698900l;
// Only with l suffix, in which the integral number is treated as long exclusively
// But here also, compile time error
// Possible loss of precision 
// Found : long, required :  int

// int x = true
// Compile Time Error : Incompatible Datatype

// So if we write int x = 2^32
// We will get error as integer too long
// But if we write as int x = 2^32L
// Then we get the compile time error as found long, required int.

// long
// float
// double
// char
// boolean

// In boolean and char, minus sign does not have a meaning.
// Hence, except Boolean and Char, remaining datatypes are considered as Signed datatypes
// Because we can have both positive and negative types
































































