package com.trl.array.initialization_declaration.a5;

import java.util.Arrays;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 24/9/19
 */
public class Experience {
    public static void main(String[] args) {
        String[] arr = new String[2];
        A.method(arr);
        System.out.println(Arrays.toString(arr));
    }
}

class A {
    public static void method(String[] arr) {
        int ind = 0;
        for (String str : arr) {
            str.concat(str + " " + ind);                                   // Runtime Exception !!! Value str is null
            ind++;
        }
    }
}