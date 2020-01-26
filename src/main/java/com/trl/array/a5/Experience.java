package com.trl.array.a5;

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
        int[][] a = {{0, 1}, {10, 11}};
        int i = 99;

        a[method()][i = 1]++;
//        a[method()][i = 1+1]++;
        System.out.println(i + ", " + a[1][1]);
        System.out.println(Arrays.deepToString(a));
    }
    static int method() {
        return 1;
    }
}
