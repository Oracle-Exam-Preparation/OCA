package com.trl.lambda.a3;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 11/9/19
 */
public class Test {
}

/*
What is the result of the following code?

1: interface Climb {
2:     boolean isTooHigh(int height, int limit);
3: }
4:
5: public class Climber {
6:     public static void main(String[] args) {
7:         check((h, l) -> h.append(l).isEmpty(), 5);
8:     }
9:     private static void check(Climb climb, int height) {
10:        if (climb.isTooHigh(height, 10))
11:            System.out.println("too high");
12:        else
13:            System.out.println("ok");
14:     }
15: }

A. ok
B. too high
C. Compiler error on line 7.
D. Compiler error on line 10.
E. Compiler error on a different line.
F. A runtime exception is thrown

C. The interface takes two int parameters. The code on line 7 attempts to use them as if one is a StringBuilder. It is
tricky to use types in a lambda when they are implicitly specified. Remember to check the interface for the real type.
*/