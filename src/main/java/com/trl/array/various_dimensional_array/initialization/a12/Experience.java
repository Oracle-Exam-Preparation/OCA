package com.trl.array.various_dimensional_array.initialization.a12;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 12/8/19
 */
public class Experience {
    public static void main(String[] args) {
        int[][] arg = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10}};

        System.out.println(arg.getClass().isArray());
        System.out.println(arg[1].length);
        System.out.println(arg[2].getClass().isArray());
        System.out.println(arg[1][2]);
    }
}
