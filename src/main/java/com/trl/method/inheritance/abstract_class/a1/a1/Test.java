package com.trl.method.inheritance.abstract_class.a1.a1;

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

1: public abstract class Whale {
2:     public abstract void dive() {};
3:     public static void main(String[] args) {
4:         Whale whale = new Orca();
5:         whale.dive();
6:     }
7: }
8: class Orca extends Whale {
9:     public void dive(int depth) { System.out.println("Orca diving"); }
10: }

A. Orca diving
B. The code will not compile because of line 2.
C. The code will not compile because of line 8.
D. The code will not compile because of line 9.
E. The output cannot be determined from the code provided.

B. This may look like a complex question, but it is actually quite easy. Line 2 contains an invalid definition of an
abstract method. Abstract methods cannot contain a body, so the code will not compile and option B is the correct answer.
If the body {} was removed from line 2, the code would still not compile, although it would be line 8 that would throw
the compilation error. Since dive() in Whale is abstract and Orca extends Whale, then it must implement an overridden
version of dive(). The method on line 9 is an overloaded version of dive(), not an overridden version, so Orca is an
invalid subclass and will not compile.
*/