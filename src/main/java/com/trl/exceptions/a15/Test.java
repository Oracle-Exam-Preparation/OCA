package com.trl.exceptions.a15;

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

1:  public class Dog {
2:      public String name;
3:      public void parseName() {
4:          System.out.print("1");
5:          try {
6:              System.out.print("2");
7:              int x = Integer.parseInt(name);
8:              System.out.print("3");
9:          } catch (NumberFormatException e) {
10:             System.out.print("4");
11:         }
12:     }
13:    public static void main(String[] args) {
14:        Dog leroy = new Dog();
15:        leroy.name = "Leroy";
16:        leroy.parseName();
17:        System.out.print("5");
18:} }

A. 12
B. 1234
C. 1235
D. 124
E. 1245
F. The code does not compile.
G. An uncaught exception is thrown.

E. The parseName method is invoked within main() on a new Dog object. Line 4 prints 1. The try block executes and 2 is
printed. Line 7 throws a NumberFormatException , so line 8 doesn’t execute. The exception is caught on line 9, and
line 10 prints 4. Because the exception is handled, execution resumes normally. parseName() runs to completion, and
line 17 executes, printing 5. That’s the end of the program, so the output is 1245.
*/