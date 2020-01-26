package com.trl.string.concatenation.a1;

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
        String a = "";
        a += 2;
        a += 'c';
//        a += ((int)'c');
        a += false;
        System.out.println(a);
        if (a == "2cfalse") System.out.println("==");
        if (a.equals("2cfalse")) System.out.println("equals");
        System.out.println(a);
    }
}

/*
What is the result of the following code? (Choose all that apply)

13: String a = "";
14: a += 2;
15: a += 'c';
16: a += false;
17: if ( a == "2cfalse") System.out.println("==");
18: if ( a.equals("2cfalse")) System.out.println("equals");

A. Compile error on line 14.
B. Compile error on line 15.
C. Compile error on line 16.
D. Compile error on another line.
E. ==
F. equals
G. An exception is thrown.

F. a += 2 expands to a = a + 2 . A String concatenated with any other type gives a String . Lines 14, 15, and 16 all
append to a , giving a result of "2cfalse" . The if statement on line 18 returns false because the values of the two
String objects are the same using object equality. The if statement on line 17 returns false because the two String
objects are not the same in memory. One comes directly from the string pool and the other comes from building using
String operations.
*/