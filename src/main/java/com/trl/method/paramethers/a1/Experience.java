package com.trl.method.paramethers.a1;

import java.util.Arrays;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 10/9/19
 */
public class Experience {
    public static void main(String[] args) {
        A a = new A();

        // ATTENTION not occur COMPILATION ERROR.
        // And not occur RunTime EXCEPTION.
        // Return zero.
        a.method(true);

        a.method_2(1);
    }
}

class A {
    public void method(boolean b, boolean... b2) {
        System.out.println(b + " " + Arrays.toString(b2));
    }

    public void method_2(int i, boolean... b2) {
        System.out.println(i + " " + Arrays.toString(b2));
    }
}