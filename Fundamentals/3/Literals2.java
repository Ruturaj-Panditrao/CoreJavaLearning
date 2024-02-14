char ch = 'a';

char ch = a;
// Cannot find symbol,variable a, location : class Test

char ch = "a";
// Incompatible types, found java.lang.string required char

char ch = 'ab';
// Compile Time Error :  (3 lines in the error)
// Unclosed char literal  // For the first apostrophe, as it expected it to close
// Unclosed char literal  // For the second apostrophe, as it expected it to close
// Not a statement        // Not a valid Java Statement

// char ch = 97;
// System.out.println(ch) -> a 
// We can specify char literal as integral literal which represents unicode value of the character.
// And that integral literal can be specified either in decimal or octal or hexadecimal forms
// But allowed range is 0 to 65535

// char ch = 0xFace // Valid
// char ch = 65536  // Compile time error : found int, required char

// We can also represent char literal in unicode fashion
// char ch = '\u0061'; -> a 
// char ch = '\uxxxx';
// xxxx is 4 digit hexadecimal number

// Every escape character is a valid char literal
// char ch = '\n', '\t',
// if we use ch = '\m' : Illegal Escape character

// Escape characters
// \n  New line
// \t  Horizontal tab
// \r  Carriage return
// \b  Back space
// \f  Form feed
// \'  Single Quote
// \''  Double Quote
// \\  Backspace 

// To actually use \\ Backspace Character use it twice
// For example we need backspace in our file path, then C:\ can make it wrong as C\ is not a valid escape character
// So use 2 backslashes to actually see the backslash appear

// String literals 

// Binary Literals
// For integral datatypes we can also specify in Binary form
int x = 0B111;
// The prefix 0B is used to indicate Binary

int x = 110110110
// Can be written as 
int x = 11_01_10_11_0
// Underscores within the digits are allowed for readability

double d = 123_234_890.879
// This is also Valid for doubles
// But we can use underscore symbol only between digits
// Not around decimal point, at the start or at the end

// int->long->float->double

float f = 10l;
// System.out.println(f) -> 10.0
// 8 Byte long value we can assign to 4 byte float variable
// Because both follow different memory representations internally

// short and char are both 2 bytes 
// But they cannot be assigned to each other,
// Because their ranges are different
// One is a signed datatype(short) and char is unsigned datatype






