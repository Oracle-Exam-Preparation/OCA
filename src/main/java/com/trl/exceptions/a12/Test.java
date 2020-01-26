package com.trl.exceptions.a12;

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
What is printed besides the stack trace caused by the NullPointerException from line 16?

1: public class DoSomething {
2:     public void go() {
3:         System.out.print("A");
4:         try {
5:             stop();
6:         } catch (ArithmeticException e) {
7:             System.out.print("B");
8:         } finally {
9:             System.out.print("C");
10:        }
11:        System.out.print("D");
12:    }
13:    public void stop() {
14:        System.out.print("E");
15:        Object x = null;
16:        x.toString();
17:        System.out.print("F");
18:    }
19:    public static void main(String[] args) {
20:        new DoSomething().go();
21:    }
22: }

A. AE
B. AEBCD
C. AEC
D. AECD
E. No output appears other than the stack trace.

C. The main() method invokes go and A is printed on line 3. The stop method is invoked and E is printed on line 14.
Line 16 throws a NullPointerException, so stop immediately ends and line 17 doesn’t execute. The exception isn’t caught
in go, so the go method ends as well, but not before its finally block executes and C is printed on line 9.
Because main() doesn’t catch the exception, the stack trace displays and no further output occurs, so AEC was the output
printed before the stack trace.
*/