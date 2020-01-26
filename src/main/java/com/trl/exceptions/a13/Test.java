package com.trl.exceptions.a13;

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
What is the output of the following snippet, assuming a and b are both 0?

3:  try {
4:      return a / b;
5:  } catch (RuntimeException e) {
6:      return -1;
7:  } catch (ArithmeticException e) {
8:      return 0;
9:  } finally {
10:     System.out.print("done");
11: }

A. -1
B. 0
C. done-1
D. done0
E. The code does not compile.
F. An uncaught exception is thrown.

E. The order of catch blocks is important because they’re checked in the order they appear after the try block.
Because ArithmeticException is a child class of RuntimeException, the catch block on line 7 is unreachable.
(If an ArithmeticException is thrown in try try block, it will be caught on line 5.) Line 7 generates a compiler error
because it is unreachable code.
*/