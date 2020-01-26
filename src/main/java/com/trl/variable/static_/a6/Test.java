package com.trl.variable.static_.a6;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 10/9/19
 */
public class Test {
}

/*
What is the output of the following code?

import rope.*;
import static rope.Rope.*;
public class RopeSwing {
    private static Rope rope1 = new Rope();
    private static Rope rope2 = new Rope();
    {
        System.out.println(rope1.length);
    }
    public static void main(String[] args) {
        rope1.length = 2;
        rope2.length = 8;
        System.out.println(rope1.length);
    }
}

package rope;
public class Rope {
public static int length = 0;
}

A. 02
B. 08
C. 2
D. 8
E. The code does not compile.
F. An exception is thrown.

D. There are two details to notice in this code. First, note that RopeSwing has an instance initializer and not a static
initializer. Since RopeSwing is never constructed, the instance initializer does not run. The other detail is that length
is static. Changes from one object update this common static variable.
*/