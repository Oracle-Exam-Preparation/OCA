package com.trl.array.various_dimensional_array.initialization.a7;

import java.util.Arrays;

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
        int[][] a = new int[2][];
        System.out.println(Arrays.deepToString(a));

//        int[][] a = new int[2][4];

//        int[][] a = new int[4][2];                                                   // ArrayIndexOutOfBoundsException

//        int[][] a = new int[2][];
//        a[0] = new int[2];
//        a[1] = new int[4];

//        int[][] a = new int[4][];
//        a[0] = new int[2];
//        a[1] = new int[2];              // ArrayIndexOutOfBoundsException

//        a[0][0] = 1;
//        a[0][1] = 2;

//        a[1][0] = 3;
//        a[1][1] = 4;
//        a[1][2] = 5;
//        a[1][3] = 6;

        System.out.println(Arrays.deepToString(a));
    }
}
