package com.trl.method.static_.a2;

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
Which are true of the following code? (Choose all that apply)

1: public class Rope {
2:     public static void swing() {
3:         System.out.print("swing ");
4:     }
5:     public void climb() {
6:         System.out.println("climb ");
7:     }
8:     public static void play() {
9:         swing();
10:        climb();
11:    }
12:    public static void main(String[] args) {
13:        Rope rope = new Rope();
14:        rope.play();
15:        Rope rope2 = null;
16:        rope2.play();
17:    }
18: }

A. The code compiles as is.
B. There is exactly one compiler error in the code.
C. There are exactly two compiler errors in the code.
D. If the lines with compiler errors are removed, the output is climb climb.
E. If the lines with compiler errors are removed, the output is swing swing.
F. If the lines with compile errors are removed, the code throws a NullPointerException.

B, E. Line 10 does not compile because static methods are not allowed to call instance methods. Even though we are calling
play() as if it were an instance method and an instance exists, Java knows play() is really a static method and treats it
as such. If line 10 is removed, the code works. It does not throw a NullPointerException on line 16 because play() is a
static method. Java looks at the type of the reference for rope2 and translates the call to Rope.play().
*/