package com.trl.for_.a2;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 7/8/19
 */
public class Experience {
    public static void main(String[] args) {
        int[] arg = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        int sum = 0;

        for (int i = 0, j = arg.length - 1; i < 5 && j >= 5; i++, j--) {
            sum = sum + arg[i] + arg[j];
            System.out.println(i + " " + j);
        }

        System.out.println(sum);
    }
}
