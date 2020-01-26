package com.trl.if_.a1;

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

3: int x = 4;
4: long y = x * 4 - x++;
5: if(y<10) System.out.println("Too Low");
6: else System.out.println("Just right");
7: else System.out.println("Too High");

A. Too Low
B. Just Right
C. Too High
D. Compiles but throws a NullPointerException.
E. The code will not compile because of line 6.
F. The code will not compile because of line 7.

F. The code does not compile because two else statements cannot be chained together without additional if-then statements,
so the correct answer is option F. Option E is incorrect as Line 6 by itself does not cause a problem, only when it is
paired with Line 7. One way to fix this code so it compiles would be to add an if-then statement on line 6. The other
solution would be to remove line 7.
*/