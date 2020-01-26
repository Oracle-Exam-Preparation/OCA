package com.trl.array.a6.a2;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 14/9/19
 */
public class Experience {
    public static void main(String[] args) {
        int[] arg = new int[2];
        int i = 3;
        arg[--i] = 1 / --i;                          // Runtime Exception: java.lang.ArrayIndexOutOfBoundsException
        System.out.println(arg);
    }
}
