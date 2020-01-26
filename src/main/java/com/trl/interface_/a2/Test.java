package com.trl.interface_.a2;

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
Choose the correct statement about the following code:

1: public interface Herbivore {
2:     int amount = 10;
3:     public static void eatGrass();
4:     public int chew() {
5:         return 13;
6:     }
7: }

A. It compiles and runs without issue.
B. The code will not compile because of line 2.
C. The code will not compile because of line 3.
D. The code will not compile because of line 4.
E. The code will not compile because of lines 2 and 3.
F. The code will not compile because of lines 3 and 4.

F. The interface variable amount is correctly declared, with public and static being assumed and automatically inserted
by the compiler, so option B is incorrect. The method declaration for eatGrass() on line 3 is incorrect because the
method has been marked as static but no method body has been provided. The method declaration for chew() on line 4 is
also incorrect, since an interface method that provides a body must be marked as default or static explicitly. Therefore,
option F is the correct answer since this code contains two compile-time errors.
*/