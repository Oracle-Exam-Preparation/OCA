package com.trl.exceptions.a16;

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
What is the output of the following program?

1:  public class Cat {
2:      public String name;
3:      public void parseName() {
4:          System.out.print("1");
5:          try {
6:              System.out.print("2");
7:              int x = Integer.parseInt(name);
8:              System.out.print("3");
9:          } catch (NullPointerException e) {
10:             System.out.print("4");
11:         }
12:         System.out.print("5");
13:     }
14:     public static void main(String[] args) {
15:         Cat leo = new Cat();
16:         leo.name = "Leo";
17:         leo.parseName();
18:         System.out.print("6");
19:     }
20: }

A. 12, followed by a stack trace for a NumberFormatException
B. 124, followed by a stack trace for a NumberFormatException
C. 12456
D. 12456
E. 1256, followed by a stack trace for a NumberFormatException
F. The code does not compile.
G. An uncaught exception is thrown.

A. The parseName method is invoked on a new Cat object. Line 4 prints 1. The try block is entered, and line 6 prints 2.
Line 7 throws a NumberFormatException. It isn’t caught, so parseName ends. main() doesn’t catch the exception either,
so the program terminates and the stack trace for the NumberFormatException is printed.
*/