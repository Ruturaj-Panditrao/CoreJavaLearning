// Java Test A B C D 
// A B C D are command line arguments

// Command line arguments
// Arguments which are passed from command line
// Are called command line arguments
// JVM converts these command line arguments into an array
// And JVM is responsible for passing this array as an argument to the main method
// And then call main method with those arguments

// In above case
// args[0] = A
// args[1] = B
// args[2] = C
// args[3] = D
// args.length = 4

// The main objective of command line arguments is to customize the behaviour of the main method

class Test
{
  public static void main(String[] args)
  {
    int n = Integer.parseInt(args[0]);
    System.out.println("The square of n is " + n*n);
  }
}

Java Test 4
// Output will be 16

// Or say you have 2 files, and want to merge them into a 3d file
// You can use the 2 files input as command line arguments
// So we can use those arguments at runtime

// Note that command line arguments are always Strings
// Why arguments to the main method are string type?
// Notice that String type arguments can be converted to any other datatype like int, boolean, double, etc very easily

class Test
  {
    public static void main(String[] args)
    {
      for(int i=0; i<args.length;i++)
        {
          System.out.println(args[i]);
        }
    }
  }

// Java Test 
// Passed with no command line argument,
// Then nothing will be printed at all

// If the code had <=  symbol
// And we passed command line arguments as Java Test A B C
// Then we will get 
// A
// B
// C
// Runtime error : Array Index Out of Bounds 
// Because we try to access the 3d index which is actually not present

class Test
  {
    public static void main(String[] args)
    {
      String[] argh = {"X","Y","Z"};
      args = argh;

      for(String s : args)
        {
          System.out.println(s);
        }
    }
  }

// Run the code as Java Test A B C
// Output will be X Y Z
// Same output for
// Java Test A B 
// Java Test A
// Java Test

class Test
  {
    public static void main(String[] args)
    {
      System.out.println(args[0] + args[1]);
    }
  }

// Java Test 10 20
// The output will be 1020
// Remember that the command line arguments passed in the main method are Strings!

class Test
  {
    public static void main(String[] args)
    {
      System.out.println(args[0]);
    }
  }

// Java Test Note Book
// Output : Note
// Here Note and Book will be considered as 2 seperate command line arguments because they are seperated by a space
// If we want Note and Book to be considered as a single command line argument then
// Pass it as 
// Java Test "Note Book"
// Now, the "Note Book" will be treated as a single command line argument
// Output : Note Book

// Space itself is a seperator between command line arguments
// If our command line argument itself contains a safe then we have to enclose that command line arguments within quotes

