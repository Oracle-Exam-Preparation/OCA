package com.trl.exceptions.a2.a1;

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
        try {
            a[method()][i = 1]++;
        } catch (Exception e) {
            System.out.println(i + ", " + Arrays.deepToString(a));
        }
    }

    static int method() throws Exception {
        throw new Exception("unimplemented");
    }
}
