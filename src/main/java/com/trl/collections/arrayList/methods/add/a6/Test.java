package com.trl.collections.arrayList.methods.add.a6;

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
What is the result of the following statements?

6: List<String> list = new ArrayList<String>();
7: list.add("one");
8: list.add("two");
9: list.add(7);
10: for(String s : list) System.out.print(s);

A. onetwo
B. onetwo7
C. onetwo followed by an exception
D. Compiler error on line 9.
E. Compiler error on line 10.

D. The code does not compile because list is instantiated using generics. Only String objects can be added to list and
7 is an int.
*/
