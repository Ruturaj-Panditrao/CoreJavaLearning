// If-else ladder can become tiring and non-readable
// if several options are available then it is not recommended to use nested if-else

switch(x)
  {
    case 1 :
      Action1;
      break;

    case 2 :
      Action2;
      break;

    case 3 :
      Action3;
      break;

    default :
      defaultAction;
  }

// Allowed arguments are byte, short, int, char, Byte, Short, Integer, Character, String, enum
// byte, Byte (corresponding wrapper class) is also allowed
// Why not boolean? if only true and false are present then you can go for if-else right
// We can take int, the range of int is -2147483648 to +2147483647
// So we can take these many switch cases, case 1,2,3,4,5  to so many
// Hence no need of long
// float and double are not there since there can be infinite number of these decimals

// Except switch(), curly braces are optional everywhere
// both case and default are optional
// you can have an empty switch, it is also allowed

