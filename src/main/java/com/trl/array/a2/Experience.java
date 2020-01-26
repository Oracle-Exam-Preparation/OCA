package com.trl.array.a2;

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

        int[] a = {1, 2, 3, 4};
        int[] b = {2, 3, 1, 0};
        System.out.println(a[0]);
        System.out.println(a[ a[0] ]);
        System.out.println("===");
        System.out.println(a[1]);
        System.out.println(a[ a[1] ]);

        System.out.println("=========================");

        int[] c = {1, 2, 3, 4};
        int[] d = {2, 3, 1, 0};
        System.out.println(c[ (c = d)[3] ]);
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
        System.out.println(c[0]);
    }
}
