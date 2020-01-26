package com.trl.operators.a3;

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

3: int c = 7;
4: int result = 4;
5: result += ++c;
6: System.out.println(result);

A. 8
B. 11
C. 12
D. 15
E. 16
F. The code will not compile because of line 5.

C. The code compiles successfully, so option F is incorrect. On line 5, the pre-increment operator is used, so c is
incremented to 4 and the new value is returned to the expression. The value of result is computed by adding 4 to the
original value of 8, resulting in a new value of 12 , which is output on line 6. Therefore, option C is the correct answer.
*/