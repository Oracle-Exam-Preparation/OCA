package com.trl.method.paramethers.a2.a1;

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
Which of the following compile? (Choose all that apply)

A. public void moreA(int... nums) {}
B. public void moreB(String values, int... nums) {}
C. public void moreC(int... nums, String values) {}
D. public void moreD(String... values, int... nums) {}
E. public void moreE(String[] values, ...int nums) {}
F. public void moreF(String... values, int[] nums) {}
G. public void moreG(String[] values, int[] nums) {}

A, B, G. Options A and B are correct because the single vararg parameter is the last parameter declared. Option G is
correct because it doesn’t use any vararg parameters at all. Options C and F are incorrect because the vararg parameter
is not last. Option D is incorrect because two vararg parameters are not allowed in the same method. Option E is incorrect
because the ... for a vararg must be after the type, not before it.
*/