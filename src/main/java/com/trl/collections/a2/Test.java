package com.trl.collections.a2;

import java.util.Arrays;
import java.util.List;

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
    public static void main(String[] args) {
        String[] array = {"Tom", "Dick", "Harry"};
//        List<String> list = names.asList(array);                                  // Compilation Error !!!
        List<String> list = Arrays.asList(array);
        list.set(0, "Sue");
        System.out.println(array[0]);
    }
}

/*
What is the result of the following?

6: String [] names = {"Tom", "Dick", "Harry"};
7: List<String> list = names.asList();
8: list.set(0, "Sue");
9: System.out.println(names[0]);

A. Sue
B. Tom
C. Compiler error on line 7.
D. Compiler error on line 8.
E. An exception is thrown.

C. Converting from an array to an ArrayList uses Arrays.asList(names). There is no asList() method on an array instance.
If this code were corrected to compile, the answer would be option A.
*/