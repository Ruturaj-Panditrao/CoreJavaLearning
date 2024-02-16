// Do after the Fundamentals Section

// Increment Operators
// int y = ++x;
// pre-increment

// post-increment
// int y = x++;

// Decrement Operators
// int y = --x;
// pre-decrement

// post-decrement
// int y = x--;

// Expression      Initial Value of x       Value of y    Final value of x
// y = ++x               10                     11               11
// y = x++               10                     10               11
// y = --x               10                     09               09
// y = x--               10                     10               09

int x = 10;
int y = ++x;
System.out.println(y); // 11
int y = ++10;
// Invalid 
// Compile Time error : Found : value, required : variable
// We can use increment and decrement operators only for variables but not for constant values, else we face a compile time error

int x = 10;
int y = ++ (++x);
// Compile time error like above
// Invalid
// Nesting of increment and decrement operators is not allowed

final int x = 10;
x = 11;
// Invalid
// Re-assignment is not allowed for final variables
// Compile time error : Cannot assign a value to final variable x

final int x = 10;
x++;
// Invalid
// Compile Time Error : Cannot assign a value to final variable x

// For final variables we cannot apply increment and decrement operators

// Increment and Decrement operators cannot be applied to Booleans 

// Increment and Decrement operators can be applied to char, double, float, int, all, except just Boolean
// ie Every primitive type except booleans

// Difference between b++ and b = b+1

byte b = 10;
b = b+1;
System.out.println(b);
// Compile Time Error

byte b = 10;
b++;
System.out.println(b);
// Output : 11

byte a = 10;
byte b = 20;
byte c = a + b;
// Compile Time Error
// If we apply any arithmetic operator between 2 variables a and b,
// The result type is always max(int, type of a, type of b)
// So here, the result type will be 
// max(int, byte, byte)
// Hence the result type is int
// And int cannot be accomodated in byte

// Same is the reason for b = b+1 example

// How to handle this compile time error?
// We can do typecasting as 

byte a = 10;
byte b = 10;
byte c = (byte)(a+b);
// Typecasting

// Incase of increment and decrement operators,
// Typecasting is done internally
// Hence,
byte b = 10;
b++;
// b++ is same as b=(byte)(b+1)

// In general,
// a++ is same as a = (type of a)(a+1)

// Arithmetic Operators (+,-,*,/,%)

// If we apply any arithmetic operation between 2 variables a and b
// The result type is always max(int, type of a , type of b)

// byte + byte = int
// byte + short = int
// short + short = int
// byte + long = long
// long + double = double
// float + long = float
// char + char = int

System.out.println('a' + 'b') -> 97+98 = 195
System.out.println('a' + 0.89) -> 97+0.89 = 97.89

System.out.println(10/0);
// ArithmeticException
// There is no way to represent infinity in integral datatypes like byte,short,int,long

System.out.println(10/0.0);
// int/double
// Infinity

// In integral arithmetic like byte/short/int/long, there is no way to represent infinity
// Hence we get ArithmeticException

// But in floating point arithmetic float and double
// There is a way to represent infinity

// For Float and Double we have
// POSITIVE_INFINITY
// NEGATIVE_INFINITY

// Hence in floating time arithmetic we don't get any Arithmetic Exception

System.out.println(-10/0.0) -> -ve Infinity

System.out.println(0/0);
// ArithmeticException
// This is because there is no way to represent undefined in integral numbers
// In integral arithmetic (byte/short/int/long) there is no way to define or represent undefined results
// Hence if result is undefined we will get runtime exception saying arithmetic expression

System.out.println(0/0.0);
// NaN 
// Incase of floating type arithmetic, we have NaN to represent the undefined
// In floating point arithmetic(float/double) there is a way to represent undefined results
// For this, float and double classes contain NaN constant
// Hence if the result is undefined,
// We don't get any ArithmeticException in this case

System.out.println(0/0.0) -> NaN
System.out.println(-0/0.0) -> NaN

// For any x value including NaN
// The following expressions returns false
// x<NaN
// x<=NaN
// x>NaN
// x>=NaN
// x==NaN
// ie even NaN == Nan returns false
System.out.println(Float.NaN == Float.Nan) returns false

// For any value of x including NaN
// Following expression returns true
// System.out.println(x!=NaN)
ie System.out.println(10!=NaN) returns true

// ArithmeticException
// It is a Runtime Exception
// It is a Runtime Problem but not a Compile Time Error
// It is possible only in integral arithmetic but not in floating point arithmetic
// The only operators which cause arithmetic exception are division and modulo / and %

