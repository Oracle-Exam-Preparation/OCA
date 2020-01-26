package com.trl.array.various_dimensional_array.initialization.a14;

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
Which of these array declarations is not legal? (Choose all that apply)

A. int[][] scores = new int[5][];
B. Object[][][] cubbies = new Object[3][0][5];
C. String beans[] = new beans[6];
D. java.util.Date[] dates[] = new java.util.Date[2][];
E. int[][] types = new int[];
F. int[][] java = new int[][];

C, E, F. Option C uses the variable name as if it were a type, which is clearly illegal. Options E and F don’t specify
any size. Although it is legal to leave out the size for later dimensions of a multidimensional array, the first one is
required. Option A declares a legal 2D array. Option B declares a legal 3D array. Option D declares a legal 2D array.
Remember that it is normal to see on the exam types you might not have learned. You aren’t expected to know anything
about them.
*/