package com.trl.exceptions.a24;

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
What does the output of the following contain? (Choose all that apply)

12: public static void main(String[] args) {
13:     System.out.print("a");
14:     try {
15:         System.out.print("b");
16:         throw new IllegalArgumentException();
17:     } catch (IllegalArgumentException e) {
18:         System.out.print("c");
19:         throw new RuntimeException("1");
20:     } catch (RuntimeException e) {
21:         System.out.print("d");
22:         throw new RuntimeException("2");
23:     } finally {
24:         System.out.print("e");
25:         throw new RuntimeException("3");
26:     }
27: }

A. abce
B. abde
C. An exception with the message set to "1"
D. An exception with the message set to "2"
E. An exception with the message set to "3"
F. Nothing; the code does not compile.

A, E. The code begins normally and prints a on line 13, followed by b on line 15. On line 16, it throws an exception
that’s caught on line 17. Remember, only the most specific matching catch is run. Line 18 prints c , and then line 19
throws another exception. Regardless, the finally block runs, printing e . Since the finally block also throws an
exception, that’s the one printed.
*/