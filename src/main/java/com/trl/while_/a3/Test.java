package com.trl.while_.a3;

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
What is the result of the following code snippet?

3: int m = 9, n = 1, x = 0;
4: while(m > n) {
5: m--;
6: n += 2;
7: x += m + n;
8: }
9: System.out.println(x);

A. 11
B. 13
C. 23
D. 36
E. 50
F. The code will not compile because of line 7.

D. Prior to the first iteration, m = 9, n = 1, and x = 0 . After the iteration of the first loop, m is updated to 8,
n to 3, and x to the sum of the new values for m + n, 0 + 11 = 11. After the iteration of the second loop, m is updated
to 7, n to 5, and x to the sum of the new values for m + n, 11 + 12 = 23. After the iteration of the third loop, m is
updated to 6, n to 7, and x to the sum of the new values for m + n, 23 + 13 = 36. On the fourth iteration of the loop,
m > n evaluates to false , as 6 < 7 is not true. The loop ends and the most recent value of x , 36 , is output, so the
correct answer is option D.
*/