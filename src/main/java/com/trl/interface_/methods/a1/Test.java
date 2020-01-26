package com.trl.interface_.methods.a1;

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
What modifiers are implicitly applied to all interface methods? (Choose all that apply)

A. protected
B. public
C. static
D. void
E. abstract
F. default

B. All interface methods are implicitly public, so option B is correct and option A is not. Interface methods may be
declared as static or default but are never implicitly added, so options C and F are incorrect. Option D is
incorrect — void is not a modifier, it is a return type. Option E is a tricky one, because prior to Java 8 all interface
methods would be assumed to be abstract. Since Java 8 now includes default and static methods and they are never abstract,
you cannot assume the abstract modifier will be implicitly applied to all methods by the compiler.
*/