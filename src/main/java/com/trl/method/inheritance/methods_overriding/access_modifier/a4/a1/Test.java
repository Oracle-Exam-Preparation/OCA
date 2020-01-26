package com.trl.method.inheritance.methods_overriding.access_modifier.a4.a1;

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
What is the result of the following code?

1: public abstract class Bird {
2:     private void fly() { System.out.println("Bird is flying"); }
3:     public static void main(String[] args) {
4:         Bird bird = new Pelican();
5:         bird.fly();
6:     }
7: }
8: class Pelican extends Bird {
9:     protected void fly() { System.out.println("Pelican is flying"); }
10: }

A. Bird is flying
B. Pelican is flying
C. The code will not compile because of line 4.
D. The code will not compile because of line 5.
E. The code will not compile because of line 9.

A. The code compiles and runs without issue, so options C, D, and E are incorrect. The trick here is that the method fly()
is marked as private in the parent class Bird, which means it may only be hidden, not overridden. With hidden methods,
the specific method used depends on where it is referenced. Since it is referenced within the Bird class, the method
declared on line 2 was used, and option A is correct. Alternatively, if the method was referenced within the Pelican class,
or if the method in the parent class was marked as protected and overridden in the subclass, then the method on line
9 would have been used.
*/