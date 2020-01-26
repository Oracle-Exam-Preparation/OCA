package com.trl.array.various_dimensional_array.initialization.a3;

import java.util.Arrays;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 06/08/19
 */
public class Experience {
    int[] array1, array2[];
    int[][] array3;
    int[] array4[], array5[];
    int array6[], array7[][];
    int[][][] array8, array9;
    int[][][] array10, array11[];
    int[] array12[][], array13[];
    int array14, array15[], array16, array17[][][];

    public void test() {
        array1 = new int[0];
//        array2 = new int[0];   // ERROR
        array2 = new int[0][];
        array3 = new int[0][];
        array4 = new int[0][];
        array5 = new int[0][];
        array6 = new int[0];
        array7 = new int[0][];
        array8 = new int[0][][];
        array9 = new int[0][][];
        array10 = new int[0][][];
        array11 = new int[0][][][];
        array12 = new int[0][][];
        array13 = new int[0][];
        array14 = 0;
        array15 = new int[0];
        array16 = 0;
        array17 = new int[0][][];
    }

    public static void main(String[] args) {
        Experience e = new Experience();

        System.out.println(Arrays.toString(e.array1) + ", " + e.array1);
        System.out.println(Arrays.toString(e.array2));
        System.out.println(Arrays.toString(e.array3));
        System.out.println(Arrays.toString(e.array4));
        System.out.println(Arrays.toString(e.array5));
    }
}