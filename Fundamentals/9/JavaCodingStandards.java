// If someone tells you to write a Simple Java code to write a method that returns the sum of 2 variables
// Normally we write 

class A
  {
    public int m1(int a, int b)
    {
      return a+b;
    }
  }

// But a good coding professional practice will be :

package com.rutu.panditrao

public class Calculate
  {
    public static int sum(int number1, int number2)
    {
      return number1 + number2;
    }
  }
// The above method has been declared static because it does not use any instance variable in its functioning
// Hence it is better declared as static

// Whenever we write Java code, it is highly recommended to follow coding standards
// Whenever we write any component, its name should reflect the purpose(functionality) of that component

// Coding practices for Class
// Usually class names are nouns
// Should start with uppercase characters
// And if it contains multiple words, every word should start with Uppercase 
// Examples : String, RuturajClass, StringBuffer, BigSnake, etc

// Coding practices for Interfaces
// Usually interface names are adjectives
// Runnable, Comparable, Serializable
// Should start with upper case character if it contains multiple words
// Every word should start with uppercase character

// Coding practices for Methods
// Usually method names are verbs or verb-noun combinations
// Should start with lower case
// If it contains multiple words then every new word should start with capital letter 
// camelCase convention
// Examples : print(), sleep(), run(), eat()
// getSalary(), setName()

// Coding standards for variables
// Start with lowercase
// If contains multiple words then new word should start with capital letter
// camelCase convention
// Examples : salary, mobileNumber, etc

// Coding standars for constants
// MAX_VALUE, MAX_PRIORITY, NORM_PRIORITY, MIN_PRIORITY, PI
// Contain only Uppercase characters
// If it contains multiple words then these words are seperated by underscores
// Usually we can declare constants with a public,static and final modifiers

// Java Bean Coding Standards
// Java Bean is a simple class
// With private variables and public getter and setter methods

public class StudentBean
  {
    private String name;

    public void setName(String name)
    {
      this.name = name;
    }

    public string getName
    {
      return name;
    }
  }

// class name ending with 'Bean' is an optional naming convention
// Java Bean is a simple Java class with private properties and public setter and getter methods

// For setter method
// The return type is void, it is public, the method name should be prefixed with set
// It should take some argument, it should not be a no-argument method

// For getter method
// Return type should not be void, it should be public, method name should be prefixed with get
// It should not take any argument

// For Boolean methods,
// Getter methods are recommended to be prefixed with is rather than get
// Like isEmpty(), isPossible()

private boolean empty;
public boolean isEmpty()
{
  return empty;
}
