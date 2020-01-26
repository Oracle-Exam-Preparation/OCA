package com.trl.import_.static_import.a1;

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
Which of the following can replace line 2 to make this code compile? (Choose all that apply)

1: import java.util.*;
2: // INSERT CODE HERE
3: public class Imports {
4:     public void method(ArrayList<String> list) {
5:         sort(list);
6:     }
7: }

A. import static java.util.Collections;
B. import static java.util.Collections.*;
C. import static java.util.Collections.sort(ArrayList<String>);
D. static import java.util.Collections;
E. static import java.util.Collections.*;
F. static import java.util.Collections.sort(ArrayList<String>);

B. The two valid ways to do this are import static java.util.Collections.*; and import static java.util.Collections.sort;.
Option A is incorrect because you can only do a static import on static members. Classes such as Collections require a
regular import. Option C is nonsense as method parameters have no business in an import. Options D, E, and F try to
trick you into reversing the syntax of import static.
*/