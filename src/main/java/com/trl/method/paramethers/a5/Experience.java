package com.trl.method.paramethers.a5;

import java.util.Arrays;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 18/8/19
 */
public class Experience {
    public static void main(String args[]) {
        new A().method();
    }
}

class A {
    char c;
    public void method() {
        char[] cA = {'a', 'b'};
        method_2(c, cA);
        System.out.println(((int) c) + "," + Arrays.toString(cA));
    }
    public void method_2(char c, char[] cA) {
        c = 'b';
        cA[1] = cA[0] = 'm';
    }
}