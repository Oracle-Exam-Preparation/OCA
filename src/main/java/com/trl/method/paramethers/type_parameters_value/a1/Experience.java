package com.trl.method.paramethers.type_parameters_value.a1;

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
        int a = 15;
        int b = 10;
        A.method(a, b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

class A {
    public static void method(int x, int y) {
        x = 0;
        y = 0;
    }
}