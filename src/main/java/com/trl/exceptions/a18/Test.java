package com.trl.exceptions.a18;

/**
 * This test is taken from the book:         OCA: Oracle ®
 *                                     Certified Associate Java ®
 *                                         SE 8 Programmer I
 *                                            Study Guide
 *                                            Exam 1Z0-808
 *
 * @link www.oreilly.com/library/view/oca-oracle-certified/9781118957424/
 */
public class Test {
}

/*
Which of the following statements are true? (Choose all that apply)

A. You can declare a method with Exception as the return type.
B. You can declare any subclass of Error in the throws part of a method declaration.
C. You can declare any subclass of Exception in the throws part of a method declaration.
D. You can declare any subclass of Object in the throws part of a method declaration.
E. You can declare any subclass of RuntimeException in the throws part of a method declaration.

A, B, C, E. Classes listed in the throws part of a method declaration must extend java.lang.Throwable. This includes Error,
Exception, and RuntimeException. Arbitrary classes such as String can’t go there. Any Java type, including Exception,
can be declared as the return type. However, this will simply return the object rather than throw an exception.
*/