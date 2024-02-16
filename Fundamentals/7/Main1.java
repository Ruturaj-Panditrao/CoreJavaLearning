class Test
  {
  }
// This code compiles without main method, no compile time error
// Whether class contains main method or not, and whether main method is declared according to requirement or not,
// These things are not checked by compiler
// At the runtime, JVM is responsible to check these.
// If JVM is unable to find this method, we will get a runtime exception,
// Runtime exception : NoSuchMethodError : main

// At runtime, JVM always searches for
// public static void main(String[] args)
// JVM software is configured that way
// It is possible to change the name of main, but we need to configure JVM

// Why public?
// So that JVM can call from anywhere

// Why static?
// So that without existing object also JVM can call this method

// Why void?
// Because main method won't return anything to JVM

// Why main?
// Because it is the name configured inside JVM

// String[] args
// Command Line arguments

// the entire prototype of
// public static void main(String[] args)
// is fixed strictly, any changes are made then,
// We will face runtime error 
// Though no compile time error

// In Java, the order of modifiers is not important
// static public
// Valid

// We can also write
// main(String[] rutu)
// args array can be renamed as well

// main(String... args)
// Is also valid
// We can replace String array with var arg methods

// We can declare the main method with following modifiers
// final, synchronized, strictfp

class Test
  {
    static final synchronized strictfp public void(String... penguin)
    {
      System.out.println("Valid main");
    }
  }

// Above is completely valid in compile time as well as runtime

// Note that you can add extra modifiers,
// But, the 3 mandatory ones are public,static,void

// Overloading of main method is possible
// But JVM will always call String[] arg main method only
// The other overloaded method we have to call explicitly, like other method calls

class Test
  {
    public static void main(String[] args)
    {
      // JVM calls this
    }
    public static int main(String[] args)
    {
      
    }
  }

// Inheritance concept is applicable for main method
// Hence will executing child class
// If child class doesn't contain main method
// Parent class main method will be executed

class P
  {
    public static void main(String[] args)
    {
      System.out.println("Parent main");
    }
  }

class C extends P
  {
    // Child class does not contain main
  }

// If the file is saved as P.java,
// 2 classs files will be generated : P.class and C.class
// The output for the program will be

Java P
// Parent main // P's main

Java C
// Parent main // Due to inheritance, parent's main will be called since child does not have its own main method

class P
  {
    public static void main(String[] args)
    {
      System.out.println("Parent's main");
    }
  }

class C
  {
    public static void main(String[] args)
    {
      System.out.println("Child's main");
    }
  }

// This is known as method hiding not overriding
// Save above file as P.java
Javac P.java
// 2 class files P.class and C.class
Java P
// Output : Parent's main
Java C
// Output : Child's main

// It seems like overriding concept is applicable for main method
// But it is not overriding, it is known as method hiding

// For main method
// Inheritance and overloading concepts are applicable
// But overriding concept is not applicable
// Instead of overriding, method hiding is applicable

class Test
  {
    static
    {
      System.out.println("Hey");
    }
  }

// Above class does not contain main method 
// In Java 1.6 and before
// It compiles 
// On running, it first executes the static block, "Hey" is printed
// After that, it throws the error that main method is not found

// However,
// From Java 1.7 and above,
// It compiles
// But while running, it first searches for main method
// It throws an error and also does not execute the static block
