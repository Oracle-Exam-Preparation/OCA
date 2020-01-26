package com.trl.main_.a2;

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
Which of the following legally fill in the blank so you can run the main() method from the command line? (Choose all that apply)

public static void main(__________)

A. String[] _names
B. String[] 123
C. String abc[]
D. String _Names[]
E. String... $n
F. String names
G. None of the above.

A, C, D, E. Option A is correct because it is the traditional main() method signature and variables may begin with
underscores. Options C and D are correct because the array operator may appear after the variable name. Option E is
correct because varargs are allowed in place of an array. Option B is incorrect because variables are not allowed to
begin with a digit. Option F is incorrect because the argument must be an array or varargs. Option F is a perfectly
good method. However, it is not one that can be run from the command line because it has the wrong parameter type.
*/