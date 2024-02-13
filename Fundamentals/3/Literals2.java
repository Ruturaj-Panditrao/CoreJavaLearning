char ch = 'a';

char ch = a;
// Cannot find symbol,variable a, location : class Test

char ch = "a";
// Incompatible types, found java.lang.string required char

char ch = 'ab';
// Compile Time Error :  (3 lines in the error)
// Unclosed char literal  // For the first apostrophe, as it expected it to close
// Unclosed char literal  // For the second apostrophe, as it expected it to close
// Not a statement        // Not a valid Java Statement



