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
