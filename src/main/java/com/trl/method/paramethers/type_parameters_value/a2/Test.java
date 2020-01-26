package com.trl.method.paramethers.type_parameters_value.a2;

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
What is the result of the following program?

1: public class Squares {
2:     public static long square(int x) {
3:         long y = x * (long) x;
4:         x = -1;
5:         return y;
6:     }
7:     public static void main(String[] args) {
8:         int value = 9;
9:         long result = square(value);
10:        System.out.println(value);
11: } }

A. -1
B. 9
C. 81
D. Compiler error on line 9.
E. Compiler error on a different line.

B. Since Java is pass-by-value and the variable on line 8 never gets reassigned, it stays as 9. In the method square, x
starts as 9. y becomes 81 and then x gets set to –1. Line 9 does set result to 81. However, we are printing out value
and that is still 9.
*/
