package com.trl.exceptions.a19;

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
Which of the following can be inserted on line 8 to make this code compile? (Choose all that apply)

7: public void ohNo() throws IOException {
8:     // INSERT CODE HERE
9: }

A. System.out.println("it's ok");
B. throw new Exception();
C. throw new IllegalArgumentException();
D. throw new java.io.IOException();
E. throw new RuntimeException();

A, C, D, E. A method that declares an exception isn’t required to throw one, making option A correct. Runtime exceptions
can be thrown in any method, making options C and E correct. Option D matches the exception type declared and so is also
correct. Option B is incorrect because a broader exception is not allowed.
*/