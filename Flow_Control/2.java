// Selection Statements
// if-else

if(b)
{
  // Action if b is true
}
else
{
  // Action if b is false
}

// b should be boolean type
// Argument to if should be boolean type
// If we try to provide any other type,
// Then we will get compile time error

// in C++, 0 is false, 1 is true
int x = 0;
if(x)
{
  System.out.println("Hello");
}
else
{
  System.out.println("Hi");
}
// But in Java, 0 is not False and 1 is not true
// Hence we get Compile Time Error, as Incompatible Types Found : int, Required : boolean

int x = 10;
if(x=20) // assignment operator
{
  System.out.println("Hello");
}
else
{
  System.out.println("Hi");
}

// Here again, we assign 20 to x (it's a =, not ==) hence we will get 
// Compile time error as Incompatible types : Found : int, Required : Boolean

boolean b = true;
if(b=false) / assignment operator
{
  System.out.println("Hello");
}
else
{
  System.out.println("Hi");
}

// Note that here we have used an assignment operator
// Output : Hi 

1) if(true)
{
  System.out.println("Hi");
}
// Valid, we get "Hi"

2) if(true) System.out.println("Hi")
// Valid, we get "Hi"

3) if(true)
{
  int x = 10;
}
// Valid

4) if(true) int x = 10;
// Compile time error
// This is a rule that, without curly braces, we can write only 1 statement
// But that statement should not be a declarative statement.

// In Java, there is no dangling else problem
// Every else is mapped to the nearest if statement

if(true)
  if(true)
    System.out.println("Hi");
else
  System.out.println("Hello");

// Note that here the else statement will be mapped to the nearest(second-if) statement

