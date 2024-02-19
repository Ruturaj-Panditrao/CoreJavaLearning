// Assignment Operators
// Simple assignment
int x = 10;

// Chained Assignment
int a,b,c,d;
a = b = c = 20;
// Before using chained assignment, make sure that all the variables are already declared.

// Compound Assignment
a+=20;
+=,-=,*=,/=,%=,Q= etc

// Signed Right Shift >>
// eg 10101110 last 2 bits are gone -> _ _ 101011
// If the first 2 bits are again filled with sign bits
// ie the First bit is again sign bit then it is Signed Right Shift
  
// Unsigned Right Shift >>>
// if after shifting, the remaining bits are always by default filled with 0,
// Then it is unsigned right shift
// ie in above example, fill the remaining places with 0s directly

// Signed Left Shift <<

// There is no Unsigned Left Shift operator in Java

byte b = 10;
b = b+1;
// Invalid : Compile time error : Possible loss of precision
// Found int required byte

byte b = 10;
b++;
// Valid
// Increment operator in itself is b = (byte) (b+1);

byte b = 10;
b+=1;
// Incase of compound assignment operators
// Automatically internal conversion is done
// It is same as b = (byte) (b+1);

byte b = 127;
b+=3;
System.out.println(b); //-126

// In the case of compound assignment operators,
// Internal typecasting will be performed automatically

int a,b,c,d;
a = b = c = d;
a += b -= c*= d/= 2;
System.out.println(a+" "+b+" "+c+" "+d);
// Assignment operators are always handled from right to left
// Hence d = 10;
// c = 200
// b = -180
// a = -160

// ++a, a++ unary operators
// a+b, b+c binary operators
// Conditional operators are ternary operators


// Conditional Operator (?:)
int x = (10<20)? 30 : 40;
// The value before colon is if the expression is true
// The value after the colon is assigned to x if the expression is false
// Here x will be assigned 30

int x = (10>20)? 30:((40>50) ? 60:70)
// The value assigned to x will be 70
// Hence Nesting of Conditional Operators is allowed

// new operator
Test t = new Test();
// The purpose of new operator is to create a new object in Java
// Then the purpose of constructor Test() is to initialize the object
// Note that constructor does not create the object, it initializes it
// After creating an object,constructor will be executed to perform initialization of object
// Hence constructor is not creation of object, it is for initialization of object
// In Java we have only new keyword and not delete keyword
// Because destruction of objects is the responsibility of Garbage Collector

// [ ] operator
// used to declare and create arrays
int[] x =  new int[10];

