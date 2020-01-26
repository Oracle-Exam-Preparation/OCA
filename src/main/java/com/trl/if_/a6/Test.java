package com.trl.if_.a6;

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
        int luck = 10;
        if ((luck > 10 ? luck++ : --luck) < 10) {           // line 4
            System.out.print("Bear");
        }
        if (luck < 10) System.out.print("Shark");           // line 6
    }
}

/*
What is the output of the following program?

1. public class BearOrShark {
2.    public static void main(String[] args) {
3.        int luck = 10;
4.        if ((luck > 10 ? luck++ : --luck) < 10) {
5.            System.out.print("Bear"); }
6.        if (luck < 10) System.out.print("Shark");
7. }}

A. Bear
B. Shark
C. BearShark
D. The code will not compile because of line 4.
E. The code will not compile because of line 6.
F. The code compiles without issue but does not produce any output.

*/