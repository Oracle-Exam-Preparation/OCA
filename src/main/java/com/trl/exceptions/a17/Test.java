package com.trl.exceptions.a17;

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
What is printed by the following? (Choose all that apply)

1:  public class Mouse {
2:      public String name;
3:      public void run() {
4:          System.out.print("1");
5:          try {
6:              System.out.print("2");
7:              name.toString();
8:              System.out.print("3");
9:          } catch (NullPointerException e) {
10:             System.out.print("4");
11:             throw e;
12:         }
13:         System.out.print("5");
14:     }
15:     public static void main(String[] args) {
16:         Mouse jerry = new Mouse();
17:         jerry.run();
18:         System.out.print("6");
19: } }

A, B, D, G. The main() method invokes run on a new Mouse object. Line 4 prints 1 and line 6 prints 2, so options A and B
are correct. Line 7 throws a NullPointerException, which causes line 8 to be skipped, so C is incorrect. The exception is
caught on line 9 and line 10 prints 4, so option D is correct. Line 11 throws the exception again, which causes run() to
immediately end, so line 13 doesn’t execute and option E is incorrect. The main() method doesn’t catch the exception either,
so line 18 doesn’t execute and option F is incorrect. The uncaught NullPointerException causes the stack trace to be printed,
so option G is correct.
*/