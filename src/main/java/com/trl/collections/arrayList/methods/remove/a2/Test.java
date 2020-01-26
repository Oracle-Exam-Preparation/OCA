package com.trl.collections.arrayList.methods.remove.a2;

import java.util.ArrayList;
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
        List<Integer> ages = new ArrayList<>();
        ages.add(Integer.parseInt("5"));
        ages.add(Integer.valueOf("6"));
        ages.add(7);
        ages.add(new Integer(3));
        ages.add(null);

        System.out.println(ages);

        ages.remove(null);

        System.out.println(ages);
    }
}