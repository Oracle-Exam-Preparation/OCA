package com.trl.if_.a2;

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
What is the output of the following code snippet?

3: int x1 = 50, x2 = 75;
4: boolean b = x1 >= x2;
5: if(b = true) System.out.println("Success");
6: else System.out.println("Failure");

A. Success
B. Failure
C. The code will not compile because of line 4.
D. The code will not compile because of line 5.

A. The code compiles successfully, so options C and D are incorrect. The value of b after line 4 is false . However, the
if-then statement on line 5 contains an assignment, not a comparison. The variable b is assigned true on line 3, and the
assignment operator returns true , so line 5 executes and displays Success , so the answer is option A.
*/