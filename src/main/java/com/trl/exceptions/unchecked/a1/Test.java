package com.trl.exceptions.unchecked.a1;

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
Which of the following are unchecked exceptions? (Choose all that apply)

A. ArrayIndexOutOfBoundsException
B. IllegalArgumentException
C. IOException
D. NumberFormatException
E. Any exception that extends RuntimeException
F. Any exception that extends Exception

A, B, D, E. ArrayIndexOutOfBoundsException , IllegalArgumentException , and NumberFormatException are runtime exceptions.
Sorry, you have to memorize them. Any class that extends RuntimeException is a runtime (unchecked) exception. Classes that
extend Exception but not RuntimeException are checked exceptions.
*/