package com.trl.exceptions.a14;

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

1:  public class Laptop {
2:      public void start() {
3:          try {
4:              System.out.print("Starting up ");
5:              throw new Exception();
6:          } catch (Exception e) {
7:              System.out.print("Problem ");
8:              System.exit(0);
9:          } finally {
10:             System.out.print("Shutting down ");
11:         }
12:     }
13:     public static void main(String[] args) {
14:         new Laptop().start();
15: } }

A. Starting up
B. Starting up Problem
C. Starting up Problem Shutting down
D. Starting up Shutting down
E. The code does not compile.
F. An uncaught exception is thrown.

B. The main() method invokes start on a new Laptop object. Line 4 prints Starting up; then line 5 throws an Exception.
Line 6 catches the exception, line 7 prints Problem, and then line 8 calls System.exit(), which terminates the JVM.
The finally block does not execute because the JVM is no longer running.
*/