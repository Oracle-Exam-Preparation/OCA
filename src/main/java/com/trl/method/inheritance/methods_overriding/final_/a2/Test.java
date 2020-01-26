package com.trl.method.inheritance.methods_overriding.final_.a2;

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

1:  abstract class Reptile {
2:      public final void layEggs() { System.out.println("Reptile laying eggs"); }
3:      public static void main(String[] args) {
4:          Reptile reptile = new Lizard();
5:          reptile.layEggs();
6:      }
7:  }
8:  public class Lizard extends Reptile {
9:      public void layEggs() { System.out.println("Lizard laying eggs"); }
10: }

A. Reptile laying eggs
B. Lizard laying eggs
C. The code will not compile because of line 4.
D. The code will not compile because of line 5.
E. The code will not compile because of line 9.

E. The code doesn’t compile, so options A and B are incorrect. The issue with line 9 is that layEggs() is marked as final
in the superclass Reptile , which means it cannot be overridden. There are no errors on any other lines, so options C
and D are incorrect.
*/