package com.trl.collections.arrayList.a1;

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
public class Experience {
    public static void main(String[] args) {
        List<Integer> ages = new ArrayList<>();
        ages.add(Integer.parseInt("5"));
        ages.add(Integer.valueOf("6"));
        ages.add(7);
        ages.add(new Integer(3));
        ages.add(null);

//        for (int age : ages) {                                               // Runtime Error !!! NullPointerException
//            System.out.print(age + " ");
//        }

        for (Integer age : ages) {                                            // Not NullPointerException
            System.out.print(age + " ");
        }
        System.out.println();

        for (int i = 0; i < ages.size(); i++) {                               // Not NullPointerException
            System.out.print(ages.get(i) + " ");
        }
        System.out.println();

        System.out.println(ages);
    }
}