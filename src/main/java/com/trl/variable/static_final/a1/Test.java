package com.trl.variable.static_final.a1;

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
How many compiler errors are in the following code?

1: public class RopeSwing {
2:     private static final String leftRope;
3:     private static final String rightRope;
4:     private static final String bench;
5:     private static final String name = "name";
6:     static {
7:         leftRope = "left";
8:         rightRope = "right";
9:     }
10:    static {
11:        name = "name";
12:        rightRope = "right";
13:    }
14:    public static void main(String[] args) {
15:        bench = "bench";
16:    }
17: }

A. 0
B. 1
C. 2
D. 3
E. 4
F. 5

E. static final variables must be set exactly once, and it must be in the declaration line or in a static initialization
block. Line 4 doesn’t compile because bench is not set in either of these locations. Line 15 doesn’t compile because final
variables are not allowed to be set after that point. Line 11 doesn’t compile because name is set twice: once in the
declaration and again in the static block. Line 12 doesn’t compile because rightRope is set twice as well. Both are in
static initialization blocks.
*/