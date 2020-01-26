package com.trl.collections.arrayList.methods.equal.a1;

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
What is the result of the following?

List<String> one = new ArrayList<String>();
one.add("abc");
List<String> two = new ArrayList<>();
two.add("abc");
if (one == two)
    System.out.println("A");
else if (one.equals(two))
    System.out.println("B");
else
    System.out.println("C");

A. A
B. B
C. C
D. An exception is thrown.
E. The code does not compile.

B. The first if statement is false because the variables do not point to the same object. The second if statement is true
because ArrayList implements equality to mean the same elements in the same order.
*/