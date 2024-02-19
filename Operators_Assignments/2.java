// String Concatenation Operator

// At operator level, Java Does not support Operator Overloading
// The only overloaded operator in Java is '+' operator
// It acts as automatic addition operator and string concatenation operator

String a = "rutu";
int b = 10;
int c = 20;
int d = 30;

System.out.println(a+b+c+d);
// Multiple operators but all are same
// So evaluation takes place from left to right
// "rutu10" -> "rutu1020" -> finally becomes "rutu102030";

// '+' Operator acts as concatenation operator if atleast 1 of the arguments is String
// If both are numerical then it acts as an automatic addition operator

System.out.println(b+c+d+a);
// 60rutu
// Above answer comes by left to right evaluation

System.out.println(b+c+a+d);
// 30rutu30

System.out.println(b+a+c+d);
// 10rutu2030

// For the same above variables,
a =  b+c+d;
// Invalid, since we have no string on the right, int cannot be assigned to String
// Compile time error : Incompatible types, found : int, required string

a = a+b+c;
// It is valid because String can be assigned to String

b = a+c+d;
// Invalid, LHS is int, RHS will be String // Compile Time Error

b = b+c+d;
// Valid, int on both sides

// Relational Operators
<,>,<=,>=
System.out.println('a'<10) // False
System.out.println('a'<97.6) // 97<97.6 True
System.out.println(true>false) // Compile TIME Error

// We can apply relational operators to every primitive datatype except boolean.

System.out.println("Rutu123">"Rutu");
// Invalid
// We cannot apply relational operators for Object Types

System.out.println(10<20<30);
// See from left to right
// true<30 
// Invalid

// Nesting of relational operators is not allowed
// Else we get a compile time error

// Equality Operators

System.out.println('a'==97.0);
// Smaller type will be converted to bigger double type
// True 

// We can apply equality operators including boolean type also

// Equality operators are also applicable for Object Types
// For object references r1==r2 returns true
// If and only if, both references point to the same object
// Reference comparison is address comparison

Thread t1 = new Thread();
Thread t2 = new Thread();
Thread t3 = t1;
// Here we have 2 objects and 3 reference variables

System.out.println(t1==t2) // false

Thread t = new Thread();
Object o = new Object();
String s = new String();

System.out.println(t==o); // false 
System.out.println(o==s); // false;
System.out.println(t==s); // Compile Time Error

// If we apply equality operators for object types,
// There should be some relation between argument types,
// Either parent to child, child to parent or same type
// Otherwise we will get compile time error saying incomparable types
System.out.println(t1==t3) // true

// Thread is parent of Object
// Object is parent of String
// But no relation between Thread and Object types

// What is the relation between == operator and .equals() method?
// == operator is for reference comparison
// .equals() is for content comparison

String s1 = new String("rutu");
String s2 = new String("rutu");

System.out.println(s1==s2);
// false;

System.out.println(s1.equals(s2));
// true

// For any object reference r,
// r == null // Is always false
// But null == null is always true

String s = new String("rutu");
System.out.println(s==null); 
// false

String s = null;
System.out.println(s==null);
// true

System.out.println(null==null);
// true
