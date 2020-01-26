package com.trl.string.mehods.a2;

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
        String letters = "abcdef";
        System.err.println(letters.length());
        System.err.println(letters.charAt(3));
        System.err.println(letters.charAt(6));
    }
}

/*
Which are the results of the following code? (Choose all that apply)

String letters = "abcdef";
System.out.println(letters.length());
System.out.println(letters.charAt(3));
System.out.println(letters.charAt(6));

A. 5
B. 6
C. c
D. d
E. An exception is thrown.
F. The code does not compile.

B, D, E. length() is simply a count of the number of characters in a String . In this case, there are six characters.
charAt() returns the character at that index. Remember that indexes are zero based, which means that index 3 corresponds
to d and index 6 corresponds to 1 past the end of the array. A StringIndexOutOfBoundsException is thrown for the last line.
*/