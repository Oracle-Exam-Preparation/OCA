package com.trl.inheritance.a7;

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
Which of the following may only be hidden and not overridden? (Choose all that apply)

A. private instance methods
B. protected instance methods
C. public instance methods
D. static methods
E. public variables
F. private variables

A, D, E, F. First off, options B and C are incorrect because protected and public methods may be overridden, not hidden.
Option A is correct because private methods are always hidden in a subclass. Option D is also correct because static
methods cannot be overridden, only hidden. Options E and F are correct because variables may only be hidden, regardless
of the access modifier.
*/