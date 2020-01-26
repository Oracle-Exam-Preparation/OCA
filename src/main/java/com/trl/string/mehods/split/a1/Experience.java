package com.trl.string.mehods.split.a1;

import java.util.Arrays;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 2/10/19
 */
public class Experience {
    public static void main(String[] args) {
        String str = "Always check the information you are learning.";
        String[] result = str.split(" ");
        System.out.println(Arrays.toString(result));
    }
}
