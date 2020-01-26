package com.trl.operaciones_binarias.a1;

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

3: boolean x = true, z = true;
4: int y = 20;
5: x = (y != 10) ^ (z=false);
6: System.out.println(x+", "+y+", "+z);

A. true, 10, true
B. true, 20, false
C. false, 20, true
D. false, 20, false
E. false, 20, true

B. This example is tricky because of the second assignment operator embedded in line 5. The expression (z=false) assigns
the value false to z and returns false for the entire expression. Since y does not equal 10, the left-hand side returns
true; therefore, the exclusive or ( ^ ) of the entire expression assigned to x is true. The output reflects these
assignments, with no change to y, so option B is the only correct answer. The code compiles and runs without issue, so
option F is not correct.
*/