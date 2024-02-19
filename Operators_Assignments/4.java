// Short Circuit Operators
// && and ||

// Consider a case
if(....b1.... & ....b2....)
{
  // Some task
}
else
{
  // Some task
}

// For example, say it needs 10 mins to execute statement b1
// And another 10 mins to execute statement b2
// But, say b1 evaluates to false
// Then there is actually no need to evaluate b2
// Hence, we can actually use && short circuit operators to achieve this
// In the case of & operator, both the statements are evaluated even if the first one is false

//         &,|                            &&,||
// Both arguments are evaluated         Secondary arguments are optional
// Relative performance is low          Relative performance is high
// Applicable for both,                 Applicable only for Boolean types
// Boolean and integral types

// x && y
// If x is false, y will not be evaluated
// If x is true, y will be evaluated

// x || y
// If x is true, y will not be evaluated
// If x is false, y will not be evaluated

// Note that &&,|| are only applicable for Boolean types and not for integrals

int x = 10, y = 15;
if(++x < 10 & ++y > 15)
{
  x++;
}
else
{
  y++;
}

// Operator used     x     y
// &                11     17
// &&               11     16
// |                12     16
// ||               12     16

// Note the difference when normal and short circuit operators are used

int x = 10;
if(++x < 10 && (x/0 > 10))
{
  System.out.println("Hello");
}
else
{
  System.out.println("Hi");
}

// Note that we have used short circuit operator
// Since first condition is itself false
// The second statement will not be executed at all
// Hence we get the output as Hi
// If we had used & normally, we would have faced a Runtime Error, Arithmetic Exception

// TypeCast Operator
// 1) Implicit Typecasting
// 2) Explicit Typecasting

// Implicit Typecasting
int x = 'a';
System.out.println(x); -> 97

double d = 10;
System.out.println(d); -> 10.0

// Whenever we assign smaller type datatype to bigger type datatype
// Implicit typecasting occurs
// Smaller to bigger type
// Compiler does this
// Keeping small value inside a big value is known as widening or upcasting.
// Here there is no loss of information

// byte->short->int->long->float->double
                 |
//              char

// These are the possible conversions where implicit type conversion will occur

// Explicit Typecasting
int x = 130;
byte b = x;
// Compile time error : Possible loss of precision : found int, required byte
byte b = (byte) x;
// Here also, 130 exceeds the range 128 of byte
// But still, the code compiles since we are explicitly performing conversion
// We will have possible loss of precision, but since we do it explicitly, compiler is like okay fine
System.out.println(b);
// Output -126

// In explicit typecasting, there is always a possibility of loss of information
// Done by programmer
// Bigger datatype -> Smaller datatype
// Also called narrowing or downcasting
// Whenever we assign bigger datatype value to smaller datatype variable,
// Explicit typecasting will be required
// There is a chance of loss of information in this typecasting

// Whenever we assign bigger datatype value to smaller datatype variable
// By explicit typecasting,
// The most significant bits will be lost
// We have to consider only Least Significant bits

int x = 130;
byte b = (byte)x;
// Here the first few bits will be lost and only LSBs will be considered
// Hence the number obtained has possible loss of precision

int x = 150;
short s = (byte)x;
// Here the last 16 bits will only be considered for the short datatype
// But 150 gets covered up in those digits, hence no loss of precision

byte b = (byte)x;
// Here take only last 8 bits of 150
// Which are 1 0 0 1 0 1 1 0
// Since the MSB is 1, the number is negative
// Then take 2s complement of the number
// 0 0 1 0 1 1 0
// Take 2s complement -> 106
// Hence the number stored is -106

double d = 130.456;
int x = (int) d;
// x = 130
// If we assign floating point values to integral types
// By explicit typecasting, digits after decimal point will be lost

byte b = (byte) d;
// b = -126


