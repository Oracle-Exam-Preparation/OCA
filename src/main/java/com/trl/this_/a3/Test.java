package com.trl.this_.a3;

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
Which of the following are true? (Choose 2)

A. this() can be called from anywhere in a constructor.
B. this() can be called from any instance method in the class.
C. this.variableName can be called from any instance method in the class.
D. this.variableName can be called from any static method in the class.
E. You must include a default constructor in the code if the compiler does not include one.
F. You can call the default constructor written by the compiler using this().
G. You can access a private constructor with the main() method.

C, G. Since the main() method is in the same class, it can call private methods in the class. this() may only be called
as the first line of a constructor. this.variableName can be called from any instance method to refer to an instance
variable. It cannot be called from a static method because there is no instance of the class to refer to. Option F is tricky.
The default constructor is only written by the compiler if no user-defined constructors were provided. this() can only be
called from a constructor in the same class. Since there can be no user-defined constructors in the class if a default
constructor was created, it is impossible for option F to be true.
*/