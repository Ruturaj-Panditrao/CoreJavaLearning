// For the case

class Test
  {
    static
    {
      System.out.println("Hello");
      System.exit(0);
    }
  }

// In Java 1.6
// The code compiles,
// The output will be 
// Hello 
// And the code will stop

// In Java 1.7 and above
// The code will compile,
// But the code will not execute at all
// It necessarily requires a main method to execute

class Test
  {
    static
    {
      System.out.println("Static Block");
    }
    public static void main(String[] args)
    {
      System.out.println("Main Method");
    }
  }

// In both Java 1.6 and 1.7
// The sequence of output will be 
// Static Block
// Main Method
// It's just an extra check in Java 1.7 that first it checks for main method
// If present, it will execute static block first and then the main method later
// If main method is not available,
// Then it will throw an error without executing the static block itself
// Java 1.7 first searches for main method
// If present, it will execute static blocks and then the main method

// Without writing main method,
// It is not possible to print some statements to the console after Java 1.7 and above
// It is possible using static block from 1.6 version onwards



