package com.trl.method.paramethers.type_parameters_reference.a3;

import java.util.Arrays;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 2/9/19
 */
public class Experience {
    public static void main(String[] args) {
        int[] array = new int[2];
        array[0] = 1;
        array[1] = 1;

        A.method(array);
        System.out.println(Arrays.toString(array));
    }
}

class A {
    public static void method(int[] arg) {
        arg[0] = 2;
        arg[1] = 2;
    }
}