package com.trl.array.equals.a1;

import java.util.Arrays;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 8/9/19
 */
public class Experience {
    public static void main(String[] args) {
        int[] a = new int[2];

        int[] b = new int[2];

        int[] c = new int[2];
        c[0] = 1;
        c[1] = 2;

        int[] d = a;
        int[] e = new int[3];

        System.out.println("a.equals(b) --> " + a.equals(b));
        System.out.println("a.equals(c) --> " + a.equals(c));
        System.out.println("a.equals(d) --> " + a.equals(d));
        System.out.println("a.equals(e) --> " + a.equals(e));
        System.out.println();

        System.out.println("a == b --> " + (a == b));
        System.out.println("a == c --> " + (a == c));
        System.out.println("a == d --> " + (a == d));
        System.out.println("a == e --> " + (a == e));
        System.out.println();

        System.out.println("Arrays.equals(a, b) --> " + Arrays.equals(a, b));
        System.out.println("Arrays.equals(a, c) --> " + Arrays.equals(a, c));
        System.out.println("Arrays.equals(a, d) --> " + Arrays.equals(a, d));
        System.out.println("Arrays.equals(a, e) --> " + Arrays.equals(a, e));
    }
}
