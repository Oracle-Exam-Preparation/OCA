package com.trl.exceptions.a11;

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
What will happen if you add the statement System.out.println(5 / 0); to a working main() method?

A. It will not compile.
B. It will not run.
C. It will run and throw an ArithmeticException.
D. It will run and throw an IllegalArgumentException.
E. None of the above.

C. The compiler tests the operation for a valid type but not a valid result, so the code will still compile and run.
At runtime, evaluation of the parameter takes place before passing it to the print() method, so an ArithmeticException
object is raised.
*/