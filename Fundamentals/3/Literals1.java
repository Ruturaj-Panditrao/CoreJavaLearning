int x =  10;
// 10 is the constant value or Literal
// Any constant value which can be assigned to the variable is known as literal
// By default JVM takes the literals by decimal base (base 10)

int x =  10; // Decimal
// Allowed Digits are 0 to 9
// Here literal will be taken as decimal, ie base 10 by default

// If we want to specify the literal in base 8 or octal
// Add a 0 prefix to the literal
int x = 010; // Octal
// Allowed Digits are 0 to 7

// If we want on hexadecimal scale (base 16)
// We add a prefix of 0x
int x = 0x10; // Hexadecimal
int x = 0X10; // Hexadecimal
// Allowed Digits are 0 to 9 and a to f or A to F
// For extra digits (a to f) or (A to F)
// Both uppercase and lowercase alphabets can be used
// This is one of the very few cases where Java is case insensitive
// Here, the literal will be treated in Hexadecimal

int x = 0786;
// prefix 0 means octal, then how can 8 be used in an octal number
// Invalid
// Get error as Integer Number too Large

int x = 0xFace;
// Valid Hexadecimal

int x = 0xBeer;
// r is not allowed in Hexadecimal (only a-f) or (A-F)

int x = 0777;
// Valid Octal Number
// System.out.println(x)
// printing it gives 511
// Because by default the representation is decimal

// We have the choice to represent the number on various base like decimal, octal, hexadecimal
// But by default, JVM will always prints in the Decimal form

// By default every integral literal is of int type
// To explicitly specify long type, add an 'l' or 'L' suffix

int x = 10; 
// Valid, int in int

long l = 10L;
// Valid, long in long

int x = 10L;
// Invalid, long in int
// Possible loss of Precision

long l = 10;
// Valid, int in long

// There is no such 'b' or 's' suffix for the byte or the short datatype
// There is no direct way to specify byte and short literals explicitly
// To use those, simply use
byte x = 10;
short p = 100;
// Although make sure that the literal is present in the proper range of datatype
// Whenever we are assigning integral literal to byte variable,
// And value is within range of byte,
// Compiler automatically treats it as a byte literal
// Similar for short 

byte b = 128;
// Possible Loss of Precision
// found int, required byte 
// Same for short datatype as well

float f = 123.456; // Invalid
// By default every decimal integral is double
// Here double literal is being stored in float
// Possible loss of Precision
// Found double, required float

// By default every floating point literal is of double type
// Hence we can't assign directly to the float variable
// But we can specify floating point literal as float type,
// By using suffix of 'f' or 'F'

float f = 123.456f;
float f = 123.456F;
double d = 123.456;

// Although default itself is double, 
// We can also specify double literal with suffix of 'd' or 'D'

float f = 123.456D;

double d = 123.456;  // Decimal 
double d = 0123.456; // It is treated as Decimal not octal
double d = 0X123.456; // Invalid : Malformed floating point literal
// Because above is not a valid decimal.

// We can specify floating point literals only in decimal form
// We cannot specify floating point literals in octal and hexadecimal forms

double d = 0786; // Invalid
// This is invalid because since the literal does not contain any point 
// It is integer by default
// And integer starting with 0 is octal by default
// The range of octal is from 0 to 7 but here 8 was used
// So there is no valid conversion of this octal to an integer
// Error as integer number too large

double d = 0XFace; // Valid;
// Hexadecimal is actually decimal
// Which can be assigned to double

double d = 0786.0; // Valid
double d = 0xFace.0; // Invalid

// We can assign integral literal directly to floating point variables
// And that integral literal can be specified either in decimal or octal or hexadecimal

double d = 0777; // Valid
// Because the Octal can be converted to Integer which can be assigned to the double variable

double d = 10; // Valid
int x = 10.0;  // Invalid

// We cannot assign floating point literals to integral types

double d = 1.2e3; // Valid
float f = 1.2e3;  // Invalid
// Every floating literal is double by default
// And double cannot be assigned to a Float
// Possible loss of precsions, found double required float

float f = 1.2e3f;
// We can specify floating point literal even in exponential form (scientfic notations)

// The only allowed literals for boolean are true and false.
