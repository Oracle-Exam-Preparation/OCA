package com.trl.while_.a2;

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
    public static void main(String[] args) {

    }
}

/*
What is the output of the following code snippet?

3: while (y <= 10) {
4:    int y = 1;
5:    System.out.println(y++ + " ");
6: }

A. 1 2 3 4 5 6 7 8 9
B. 1 2 3 4 5 6 7 8 9 10
C. 1 2 3 4 5 6 7 8 9 10 11
D. The code will not compile because of line 3.
E. The code contains an infinite loop and does not terminate.

D. The variable y is declared within the body of the while statement, so it is out of scope on line 3. Line 3
generates a compiler error, so option D is the correct answer.
*/