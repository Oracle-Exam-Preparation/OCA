package com.trl.array.various_dimensional_array.initialization.a4;

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
    public static void main(String[] args) {
        int[][] square = new int[2][];
        square[0] = new int[5];
        square[1] = new int[3];
        System.out.println(Arrays.deepToString(square));
    }
}
