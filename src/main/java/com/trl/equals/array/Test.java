package com.trl.equals.array;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 2/9/19
 */
public class Test {
    public static void main(String[] args) {
        int[] arg = new int[2];
        int[] arg2 = new int[2];
        int[] arg3 = arg;

        System.out.println(arg.equals(arg2));
        System.out.println(arg.equals(arg3));

        System.out.println("==========");
        System.out.println(arg == arg2);
        System.out.println(arg == arg3);
    }
}
