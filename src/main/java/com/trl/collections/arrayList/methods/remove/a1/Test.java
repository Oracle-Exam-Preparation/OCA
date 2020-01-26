package com.trl.collections.arrayList.methods.remove.a1;

import java.util.ArrayList;

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
        ArrayList<Integer> list = new ArrayList<>();
        list.remove(0);                                                   // java.lang.IndexOutOfBoundsException
    }
}

/*
Which of the following are true? (Choose all that apply)

A. If you call remove(0) using an empty ArrayList object, it will compile successfully.
B. If you call remove(0) using an empty ArrayList object, it will run successfully.

A. ArrayList does override equals() and defines it as the same elements in the same order. The compiler does not know when
an index is out of bounds and thus can’t give you a compiler error. The code will throw an exception at runtime, though.
*/