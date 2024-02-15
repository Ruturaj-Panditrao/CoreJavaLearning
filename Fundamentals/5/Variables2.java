// Local Variables (Temporary/Stack/Automatic Variables)

// Variables that are created to meet temporary requirements of programmer
// We declare variables inside block, method or constructor
// Such variables are called local/stack/automatic variables

// Automatic because the scope ends automatically as we come out of the block, method or constructor
// They are stored in stack
// Local variables are created while executing the block in which the local variables are declared
// Once block execution is complete Local variables are destroyed 
// Hence scope of local variable is exactly the block in which we declare it


class Test
  {
    public static void main(String[] args)
    {
      int i = 0;
      for(int j=0; j<3; j++)
        {
          i = i+j;
        }

      System.out.println(i+".."+j);
    }
  }

i -> 2, j -> invalid scope 
// Compile Time error : cannot find symbol : variable j in class Test

class Test
  {
    public static void main(String[] args)
    {
      try
        {
          int j = Integer.parseInt("ten");
        }
      catch(NumberFormatException)
            {
        j = 10;
      }

      System.out.println(j); 
      // Compile Time Error -> cannot find j as it was declared in the local scope of try block
    }
  }

// For local variables, JVM does not provide default values
// Compulsory we should perform initialization explicitly before using the variable
// If we don't use the variable, then it is not required

class Test
  {
    public static void main(String[] args)
    {
      int x;
      System.out.println("Hello");
      // No compile time error since we didn't use x 
    }
  }

class Test
  {
    public static void main(String[] args)
    {
      int x;
      System.out.println(x);
      // Compile Time Error
      // Variable x might not have been initialized
    }
  }

class Test
  {
    public static void main(String[] args)
    {
      int x;
      if(args.length > 3)
      {
        x = 10;
      }

      System.out.println(x);

      // Compile Time Error : variable x might not have been initialized
    }
  }


class Test
  {
    public static void main(String[] args)
    {
      int x;
      if(args.length > 1)
      {
        x = 10;
      }
      else
      {
        x = 20;
      }

      System.out.println(x); // Valid
    }
  }

// It is never recommended to perform initialization for local variables inside logical blocks because there is no guarantee of these blocks always at runtime
// It is highly recommended to initialize local variables atleast with default values

class Test
  {
    int x = 10; // Instance variable
    static int y = 20; // Static variable

    public static void main(String[] args)
    {
      int z= 30;
    }
  }

// For instance and static variables, we can access them based on modifiers like :
// public : anywhere
// private : only within the class
// default : anywhere within the package
// protected : anywhere within the current package but in other packages only in its child classes

// The only applicable modifier for local variables is final
// Any other modifier will give compile time error

class Test
  {
    public static void main(String[] args)
    {
      public int x = 10; // Invalid
      private int x = 10; // Invalid
      protected int x = 10; // Invalid
      static int x = 10; // Invalid
      transient int x = 10; // Invalid
      volatile int x = 10; // Invalid
      // In all of the above,
      // We will get compile time error as Illegal start of Expression

      final int x = 10; // Valid
    }
  }

// Instance variable and Static variables are default access modifiers by default
// If we don't declare any modifier, it is default by default
// But this rule is applicable only for instance and static variables but not local variables

// Instance and Static variables can be accessed by multiple threads simultaneously
// hence these are not thread-safe

// However in the case of local variables, a seperate copy will be created
// Hence local variables are thread safe

// Every variable in Java should be instance or static or local
// Every variable in Java should be primitive or reference

// Hence various possible combinations of variables in Java are 
// instance primitive
// instance reference
// static primitive
// static reference
// local primitive
// local reference

class Test 
  {
    int x = 10; // instance primitive
    static String s = "Hello"; // static reference

    public static void main(String args[])
    {
      int x = new int[5]; // local reference
    }
  }

class Test
  {
    int[] x; // Instance reference variable

    public static void main(String[] args)
    {
      Test t = new Test();
      System.out.println(t.x) -> null; // Reference variables are initialized to Null by default
      System.out.println(t.x[0]) -> Runtime error -> Null Pointer Exception
    }
  }


// At the Instance level

int[] x;

System.out.println(x); // null
System.out.println(x[0); // Runtime error, Null pointer exception

int[] x = new int[5];

System.out.println(x); [I@e235
System.out.println(x[0]); // 0


// At the Static level,

static int[] x;

System.out.println(x); // null
System.out.println(x[0]); // Runtime error, Null pointer exception

static int[] x = new int[5];

System.out.println(x); // [I@e235
Systen.out.println(x[0]); // 0

// At the Local level

int[] x; 

System.out.println(x);  // Compile time error
System.out.println(x[0]); // Compile time error
// Variable x might not have been initialized

int[] x = new int[5];

System.out.println(x); // [I@e325
System.out.println(x[0]); // 0

// Once we create an array,
// Every array element is initialized with default values
// Irrespective of it is instance or static or local array
Syste,
