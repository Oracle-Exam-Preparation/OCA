package com.trl.array.arrays.asList.a1;

import java.util.Arrays;
import java.util.List;

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
        String[] arg = {"Tom", "Dick", "Harry"};
        List<String> list = Arrays.asList(arg);
        list.set(0, "Sue");

        System.out.println(Arrays.toString(arg));
        System.out.println(list);
    }
}
