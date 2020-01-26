package com.trl.operators.a2;

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
What is the output of the following code?

1: public class ArithmeticSample {
2:   public static void main(String[] args) {
3:     int x = 5 * 4 % 3;
4:     System.out.println(x);
5: }}

A. 2
B. 3
C. 5
D. 6
E. The code will not compile because of line 3.

A. The * and % have the same operator precedence, so the expression is evaluated from left-to-right.
The result of 5 * 4 is 20 , and 20 % 3 is 2 ( 20 divided by 3 is 18 , the remainder is 2 ). The output is 2 and option A
is the correct answer.
*/