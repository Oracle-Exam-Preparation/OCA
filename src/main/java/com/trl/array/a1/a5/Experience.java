package com.trl.array.a1.a5;

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

    public static int[] method() {
        return new int[]{1, 2, 3, 4};
    }

    public static void main(String[] args) {
        int index = 1;
        int i = method()[index = 2]++;
        System.out.println(i);
        System.out.println("index = " + index);
        System.out.println(Arrays.toString(method()));
    }

}
