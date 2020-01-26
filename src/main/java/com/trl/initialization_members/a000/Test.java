package com.trl.initialization_members.a000;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 11/9/19
 */
public class Test {
}

/*
Which of the following will compile when inserted in the following code? (Choose all that apply)
public class Order3 {
    final String value1 = "1";
    static String value2 = "2";
    String value3 = "3";
    {
        // CODE SNIPPET 1
    }
    static {
        // CODE SNIPPET 2
    }
}

A. value1 = "d"; instead of // CODE SNIPPET 1
B. value2 = "e"; instead of // CODE SNIPPET 1
C. value3 = "f"; instead of // CODE SNIPPET 1
D. value1 = "g"; instead of // CODE SNIPPET 2
E. value2 = "h"; instead of // CODE SNIPPET 2
F. value3 = "i"; instead of // CODE SNIPPET 2

B, C, E. value1 is a final instance variable. It can only be set once: in the variable declaration, an instance initializer,
or a constructor. Option A does not compile because the final variable was already set in the declaration. value2 is a
static variable. Both instance and static initializers are able to access static variables, making options B and E correct.
value3 is an instance variable. Options D and F do not compile because a static initializer does not have access to
instance variables.
*/