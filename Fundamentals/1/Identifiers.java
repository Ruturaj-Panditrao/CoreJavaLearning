// Identifiers are the names used to identify the variables,methods,labels,classes

class Test
{
  public static void main(String[] args)
  {
    int x = 10;
  }
}
// 5 identifiers -> Test, main, String, args, x (String is a reserved classname in Java)

// Rules for defining Java Identifiers :

// 1> Only allowed characters are 'a-z', 'A-Z', $, _
// For any other character, we face compile time error : total_number is correct, while total# is invalid

// 2> Identifiers cannot start with digits : total123 is correct, but 123total is invalid 

// 3> Java Identifiers are Case Sensitive
// We can differentiate wrt case : number, Number, NUMBER are all different identifiers

// 4> There is no length limit restrictions for Java Identifiers
// Although not recommended to take too lengthy identifiers for good readability

// 5> We cannot use Reserved Words as Identifiers
// int x = 10 is valid but int if = 10 is invalid : String, Runnable are keywords so cannot be used as identifiers

// 6> All predefined Java class names and interface names can be used as Identifiers
// Although it is never a good practice to use those.

class Test
  {
    public static void main(String[] args)
    {
      int Runnable = 10;
      System.out.println(Runnable);
      // Works, but is not a good programming practice
    }
  }

// @ cannot be used in identifier name
// Integer can be used as a Identifier because it is a predefined classname
// However int, cannot be used as an Identifer because it is a reserved keyword

// In Java, only 53 Keywords are Reserved to represent a meaning or functionality.
// Such words are called as Reserved Words 53 :
// 50 Keywords : The reserved words that are associated with certain functionality : 48 are used keywords, 2 are unused : go, const
// 3 Reserved Literals : The reserved words that are just used to represent values and not functionality : true, false, null

// Keyword for Datatypes :
// byte, short, int, long, float, double, boolean, char

// Keywords for Flow Control :
// if, else, switch, case, default, while, do, for, break, continue, return

// Keywords for Modifiers :
// public, private, protected, static, final, abstract, synchronized, native, strictfp, transient, volatile, 

// Keyword for Exception Handling :
// try, catch, finally, throw, throws, assert

// Keywords for Class :
// class, interface, extends, implements, package, import

// Keywords for Objects :
// new, instanceof, super, this

// In Java, return type is mandatory.
// void 

// There is no delete keyword in Java, because destruction of useless objects is the responsibility of Garbage Collector.

// Unused Keywords : Banned keywords in Java. These are 
// goto : usage of goto created several problems in older languages, hence, this keyword was banned in Java
// const : use 'final' instead of const.
// goto and const are unused keywords and if we use them, we may face compile time errors

// Reserved Literals : 
// true, false : for boolean datatypes
// null : default values for object reference

// enum keyword : to define a group of named constants
enum month
  {
    jan, feb, march, dec;
  }

enum characterss
  {  
    goku,rock,man;
  }

// All 53 Reserved Words in Java contain only Lower Case Alphabet Symbols
// strictfp, assert and enum are new keywords in Java

// instanceof, implements, extends, import, synchronized.
