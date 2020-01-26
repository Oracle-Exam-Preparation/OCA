package com.trl.array.various_dimensional_array.initialization.a1;

import java.util.Arrays;

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
        int[] arg_1 = new int[1];
        int[] arg_2 = new int[1];
        int[] arg_3 = new int[1];
        int[] arg_4 = new int[1];

        int[][] arg_A = {arg_1, arg_2, arg_3, arg_4};
        System.out.println(Arrays.deepToString(arg_A));

        int[][] arg_B = {arg_1};
        System.out.println(Arrays.deepToString(arg_B));

        int[][] arg_C = {new int[2]};
//        int[][] arg_CC = {new Integer[2]};                                                // Compilation Exception !!!
//        int[][] arg_D = {new String[2]};                                                  // Compilation Exception !!!

//        String[][] arg = new String[2];                                                       // Compilation ERROR !!!
        String[][] arg_E = {new String[2]};

        String[] arg_5 = new String[2];
        String[][] arg_G = {arg_5};
    }
}
