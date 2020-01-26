package com.trl.exceptions.a10;

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
Which of the following exceptions are thrown by the JVM? (Choose all that apply)

A. ArrayIndexOutOfBoundsException
B. ExceptionInInitializerError
C. java.io.IOException
D. NullPointerException
E. NumberFormatException

A, B, D. java.io.IOException is thrown by many methods in the java.io package, but it is always thrown programmatically.
The same is true for NumberFormatException; it is thrown programmatically by the wrapper classes of java.lang. The other
three exceptions are all thrown by the JVM when the corresponding problem arises.

Identify whether an exception is thrown by the programmer or the JVM. IllegalArgumentException and NumberFormatException
are commonly thrown by the programmer. Most of the other runtime exceptions are typically thrown by the JVM.
*/