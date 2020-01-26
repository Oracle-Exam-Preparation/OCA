package com.trl.string.immutable.a1;

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
        String s = "purr";
        s.toUpperCase();                // String is immutable
        s.trim();                       // String is immutable
        s.substring(1, 3);              // String is immutable
        s += " two";                    // In this line occur s = "purr" + " two"
        System.out.println(s.length());
        System.out.println(s);
    }
}

/*
What is the result of the following code?

3: String s = "purr";
4: s.toUpperCase();
5: s.trim();
6: s.substring(1, 3);
7: s += " two";
8: System.out.println(s.length());

A. 2
B. 4
C. 8
D. 10
E. An exception is thrown.
F. The code does not compile.

C. This question is trying to see if you know that String objects are immutable. Line 4 returns "PURR" but the result
is ignored and not stored in s . Line 5 returns "purr" since there is no whitespace present but the result is again
ignored. Line 6 returns "ur" because it starts with index 1 and ends before index 3 using zero-based indexes. The result
is ignored again. Finally, on line 6 something happens. We concatenate four new characters to s and now have a String
of length 8.
*/