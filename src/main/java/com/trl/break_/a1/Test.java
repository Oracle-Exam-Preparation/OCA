package com.trl.break_.a1;

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

3: java.util.List<Integer> list = new java.util.ArrayList<Integer>();
4: list.add(10);
5: list.add(14);
6: for(int x : list) {
7:     System.out.print(x + ", ");
8:     break;
9: }

A. 10, 14,
B. 10, 14
C. 10,
D. The code will not compile because of line 7.
E. The code will not compile because of line 8.
F. The code contains an infinite loop and does not terminate.

C. This code does not contain any compilation errors or an infinite loop, so options D, E, and F are incorrect.
The break statement on line 8 causes the loop to execute once and finish, so option C is the correct answer.
*/