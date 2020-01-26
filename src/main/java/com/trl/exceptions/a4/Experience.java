package com.trl.exceptions.a4;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 16/8/19
 */
public class Experience {
    public static void main(String[] args) {
        try {
            A.method();
        } catch (Throwable throwable) {
            A.method();
        }
    }
}

class A {
    static {
        if (true) {
            throw new NullPointerException();
        }
    }

    public static void method() {
    }
}