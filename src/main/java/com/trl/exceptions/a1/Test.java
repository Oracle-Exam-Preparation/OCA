package com.trl.exceptions.a1;

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
Which of the following statements are true? (Choose all that apply)

A. Checked exceptions are intended to be thrown by the JVM (and not the programmer).
B. Checked exceptions are required to be caught or declared.
C. Errors are intended to be thrown by the JVM (and not the programmer).
D. Errors are required to be caught or declared.
E. Runtime exceptions are intended to be thrown by the JVM (and not the programmer).
F. Runtime exceptions are required to be caught or declared.

B, C. Only checked exceptions are required to be handled (caught) or declared. Runtime exceptions are commonly thrown by
both the JVM and programmer code. Checked exceptions are usually thrown by programmer code. Errors are intended to be
thrown by the JVM. While a programmer could throw one, this would be a horrible practice.
*/