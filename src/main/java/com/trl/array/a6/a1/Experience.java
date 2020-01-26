package com.trl.array.a6.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 16/8/19
 */
public class Experience {
    public static void main(String[] args) {
        int[] arg = new int[1];
        int i = 2;
        arg[--i] = 1 / --i;                  // Runtime Exception: java.lang.ArithmeticException
        System.out.println(arg);
    }
}
