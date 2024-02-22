// new 
// can be used to create objects
Student stud = new Student();
Customer cust = new Customer(); 
// Here we know the classname before creating the object

// But how can we create objects if we do not the classname from beginning?
// We only know it at runtime, from the file, database or command line arguments
// In this case, it is not possible to create the object using new operator

class Test
  {
    public static void main(String[] args)
    {
      
    }
  }

// If command line argument is Student,
// The object of Student has to be created
// If the command line argument is Customer,
// The object of Customer has to be created

// There are some instances where 'new' cannot be used to create objects
// In these cases we need to use newInstance() 

class Test
  {
    public static void main(String[] args)
    {
      Object o = Class.forName(args[0]).newInstance();
      System.out.println("Object created for "+ o.getClass().getName());
    }
  }

// Both new and newInstance() are used to create new objects
// We can use the new operator if we know the class name beforehand
// newInstance() is a method present in class 'Class'
// We can ue newInstance() to create object, if we do not know class name at the beginning
// And it is available dynamically at runtime

// Real life application :
// Web container does not for which class it has to create servlet object
// It only gets the name at runtime
// Hence it has to make use of the newInstance() method to create the object of that class at runtime

// Other difference between new and newInstance() method
Test t1 = new Test();
// In this case, no argument constructor will be called
Test t2 = new Test(10);
// In this case, integer argument constructor will be called
Test t3 = new Test("Hello")
// In this case, string argument constructor will be called

// So, in case of new operator, we can decide which constructor we wish to invoke, since we can pass arguments

// But, in case of newInstance() method,
// it is a fixed .newInstance() syntax where we cannot pass any argument
// Hence, to use this method, our class must have a no argument constructor
// Else, we will get a Runtime error as InstantiationException
// The class must contain a no-arg constructor
// newInstance() method internally calls that no-arg constructor

// So, since Web Container class creates the Objects of Servlet class,
// Every Servlet class must contain a no-arg constructor
// Because web container will use newInstance() method to create object of Servlet class

// While using new operator to create object
// We will get runtime error if the Test.class is not present
Test t = new Test()
// We get a Runtime error as
// NoClassDefFoundError : Test 

// However if we use newInstance() method to create a class
// And the class is not present, then we get
// Runtime error as : ClassNotFoundException

// new vs newInstance()
//                         new                                             newInstance()
//  1)It is an operator in Java                                            it is a method in java.lang.Class
//  2)We can use new operator to create object if we know the              We can use this method if we don't know the class name
//  class name at the beginning                                            at the beginning and it is available dynamically at runtime
//  3)To use new operator class is not required to contain                 Compulsary class should contain a no-arg constructor
//  a no-arg constructor       
//  4)At runtime if class file is not available,                           Here we get a ClassNotFound Exception
//  We get Runtime error as 
//  NoClassDefFound Error

// Difference between ClassNotFound Exception and NoClassDefFound Error

Test t = new Test();
// Here if Test class is not present,
// For hardcoded class names, at runtime if corresponding Test.class file is not available, then we will get runtime exception
// NoClassDefFound Error, which is unchecked

// For dynamically provided class names 
// At runtime if corresponding .class file is not available, we will get runtime exception saying classNotFoundException,
// Which is checked exception
// Refer above example for newInstance() method 

// Checked exceptions are checked by the Java compiler, so they are called compile-time exceptions.
// Java runtime throws ClassNotFoundException while trying to load a class at runtime only and the name was provided during runtime. 
// In the case of NoClassDefFoundError, the class was present at compile time, but Java runtime could not find it in Java classpath during runtime.

// instanceof vs isInstance()

// instanceof is an operator in Java
// We can use instanceof to check whether the given object is of particular type or not
// And we know the type at the beginning

Thread t = new Thread();
System.out.println(t instanceof Runnable); // Gives True
System.out.println(t instanceof Object); // Gives True

// isInstance() is a method present in java.lang.class
// We can use isInstance() method to check whether the given object is of particular type or not
// And we don't know the type at the beginning and is available dynamically at runtime

class Test
  {
    public static void main(String[] args)
    {
      Thread t = new Thread();
      System.out.println(Class.forName(args[0]).isInstance(t));
    }
  }
// Here we pass Java Test Runnable
// We get true
// Here we don't know what will be passed in the command line argument

// isInstance() is method equivalent of instanceof operator
