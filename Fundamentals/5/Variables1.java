// Based on type of value represented by variable,
// All variables are divided into 2 types

// Primitive Variables
// can be used to represent primitive values
int x = 10;

// Reference Variables
// can be used to refer objects
Student s = new Student();
// s points to an object

// Based on position of declaration and behaviour
// All variables are divided into 3 types

// Instance variables (Attributes/properties/Object level variables)
// Static variables
// Local variables

// Instance Variables (Attributes/properties/Object level variables)
// If the value of a variable is varied from object to object
// Such type of variables are called instance variables
// For every object, a seperate copy of instance variable will be created
// Instance variables should be declared within the class directly
// But outside of any method or block or constructor
// Instance variable will be created at the time of object creation
// And destroyed at the time of object destruction
// Hence scope of instance variable is same as scope of object
// Objects are stored in Heap memory
// Instance variables are stored in Heap memory as a part of object
// For example we have a class Student that contains the name and rollno
// Then, for each object of the class Student, it can have different name and rollno
// These are the instance variables

// We cannot access instance variables directly from static area
// But we can access by using object reference
// We can access instance variables directly from instance area

class Test
  {
    int x = 10; // Instance variable

    public static void main(String[] args)
    {
      System.out.println(x);
      // Notice that the method is static
      // Static means it has nothing to do with the object
      // But, the variable it is trying to access is an instance variable
      // Which is always associated with a class
      // Hence, Compile Time Error
      // non-static variable x cannot be referenced from a static context

      // However,
      Test t = new Test();
      System.out.println(t.x);
      // This is valid 
    }

    public void m1()
    {
      System.out.println(x);
      // Now since the method is non-static,
      // Here we can print x directly now
    }
  }

// For instance variables, we are not required to initialize them explicitly
// JVM initializes them with the default values

class Test
  {
    int x;
    double d;
    float f;
    String s;
    boolean b;

    public static void main(String[] args)
    {
      Test t = new Test();
      System.out.println(t.x); // 0 int
      System.out.println(t.d); // 0.0 double
      System.out.println(t.f); // 0.0 float
      System.out.println(t.s); // null string
      System.out.println(t.b); // false boolean
    }
  }

// Static Variables
// If the value of a variable is not varied from object to object
// Then it is not recommended to declare variable as instance variable
// We can declare such type of variables at class level using static modifier

// In case of instance variables, for every object, a seperate copy will be created
// But in the case of static variables, a single copy will be created at class level,
// Shared by every object of the class

// Static Variables should be declared within the class directly but outside of block/method/constructor

// Static variables will be created at the time of class loading
// And destroyed at the time of class unloading
// Hence scope of static variable is exactly same as that of that class file

// On running Java Test class
// Following things occur internally
// 1) Start JVM
// 2) Create and Start Main Thread
// 3) Locate Test.class file
// 4) Load Test.class  -> Static Variable Creation
// 5) Execute Main method
// 6) Unload Test.class  -> Static Variable Destruction
// 7) Terminate Main Thread
// 8) Shut down JVM

// Static Variables are stored in Method Area
// Local variables are stored in Stack area

// Suppose we have a class Student
// That has the attributes as Name, roll, College
// If all the students belong to the same College
// Declaring College as a instance variable will create many unnecessary copies of that instance variable
// If 100 objects are created, 100 Instance variables of College will be created
// Which causes unnecessary memory
// Hence we can rather declare it static with Class,
// So that only 1 copy is created and is shared among all the objects

class Test
  {
    static int x = 10;
    public static void main(String[] args)
    {
      Test t = new Test();
      System.out.println(t.x); // Valid
      System.out.println(Test.x); // Valid and recommended as static variables are associated with class
      System.out.println(x); // Valid as we are in the same class
    }
  }

// We can access static variables either by object reference or class name
// But it is recommended to use class name
// Within the same class, we can access static variables direcly, class name is not required

// We can access static variables direcly from both instance and static areas
// This is because they are created very early at the time of class loading

class Test
  {
    static int x =  10;
    public static void main(String[] args)
    {
      System.out.println(x); // Valid
    }

    public void main()
    {
      System.out.println(x); // Valid
    }
  }

// For static variables, JVM provides default values

class Test
  {
    static int x;
    static boolean b;
    static float f;

    public static void main(String[] args)
    {
      System.out.println(x); // 0
      System.out.println(b); // false
      System.out.println(f); // 0.00
    }
  }

// Static variables are also known as class level variables or fields

class Test
  {
    static int x = 10;
    int y = 20;
    public static void main(String[] args)
    {
      Test t1 = new Test();
      t1.x = 999;
      t2.x = 444;

      Test t2 = new Test();
      System.out.println(t2.x); // 999 -> Static Variable so only 1 Copy
      System.out.println(t2.y); // 20 -> Instance variable so fresh copy
    }
  }
