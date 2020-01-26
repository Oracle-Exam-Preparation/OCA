package com.trl.method.inheritance.interface_.default_methods.a1.a1;

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
1: interface Nocturnal {
2:     default boolean isBlind() { return true; }
3: }
4: public class Owl implements Nocturnal {
5:     public boolean isBlind() { return false; }
6:     public static void main(String[] args) {
7:         Nocturnal nocturnal = (Nocturnal)new Owl();
8:         System.out.println(nocturnal.isBlind());
9:     }
10: }

A. true
B. false
C. The code will not compile because of line 2.
D. The code will not compile because of line 5.
E. The code will not compile because of line 7.
F. The code will not compile because of line 8.

B. This code compiles and runs without issue, outputting false , so option B is the correct answer. The first declaration
of isBlind() is as a default interface method, assumed public . The second declaration of isBlind() correctly overrides
the default interface method. Finally, the newly created Owl instance may be automatically cast to a Nocturnal reference
without an explicit cast, although adding it doesn’t break the code.
*/