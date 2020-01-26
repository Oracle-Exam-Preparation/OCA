package com.trl.array.various_dimensional_array.initialization.a13.a1;

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
        int index = 4;
        int[][][] arg = new int[index][index = 3][index];
        System.out.println(arg.length + ", " + arg[0].length + ", " + arg[0][0].length);
    }
}
