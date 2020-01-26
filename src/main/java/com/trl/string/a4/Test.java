package com.trl.string.a4;

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

2: String s1 = "java";
3: StringBuilder s2 = new StringBuilder("java");
4: if (s1 == s2)
5:    System.out.print("1");
6: if (s1.equals(s2))
7:    System.out.print("2");

A. 1
B. 2
C. 12
D. No output is printed.
E. An exception is thrown.
F. The code does not compile.

F. The question is trying to distract you into paying attention to logical equality versus object reference equality.
It is hoping you will miss the fact that line 4 does not compile. Java does not allow you to compare String and
StringBuilder using == .
*/