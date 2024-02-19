// Operator and Operand Precedence

// Priority order
// Unary operator > Binary operator > Ternary Operator > Assignment Operator

// The operator precedence order is as follows :

1) Unary Operators : (3 levels)
[ ], x++, x--
++x, --x, ~ , !
new, <type>

2) Arithmetic Operators : 
*, /, %
+, - 

3) Shift Operators :
>>, >>>, <<

4) Comparison Operators :
<, <=, >, >=, instanceof

5) equality operators :
==, !=

6) Bitwise operators :
&
^
|

7) Short Circuit Operators :
&&
||

8) Conditional Operators:
?:

9) Assignment Operators :
=, +=, -=, *=

// Evaluation Order of Java Operands

class Test
  {
    public static void main(String[] args)
    {
      System.out.println(m1(1)+m1(2)*m1(3)/m1(4)+m1(5)*m1(6);
    }
  }

// Note that there is no particular operand precedence
// The operands will be evaluated, all of them, from left to right
// So say we get
// 1+2*3/4+5*6
// Now operator precedence will be applied over this expression
// Multiplication
// 1+6/4+5*6
// 1+1+5*6
// 1+1+30
// 2+30
// 32

// Before applying any operator,
// All operands will be evaluated from left to right
// In Java, we have only operator precedence but not operand precedence
// Before applying any operator, all operands will be evaluated from left to right

  
  
