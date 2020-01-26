package com.trl.collections.methods.binarySearch.a3;

import java.util.Arrays;
import java.util.Collections;
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
        List<String> hex = Arrays.asList("C", "B", "b", "A", "c", "b", "F", "D", "a");

        Collections.sort(hex);
        System.out.println(hex);

        int a = Collections.binarySearch(hex, "A");
        int b = Collections.binarySearch(hex, "B");
        int c = Collections.binarySearch(hex, "C");
        int d = Collections.binarySearch(hex, "D");
        int f = Collections.binarySearch(hex, "F");
        int z = Collections.binarySearch(hex, "Z");

        System.out.println(a + " " + b + " " + c + " " + d + " " + f + " " + z);
    }
}
