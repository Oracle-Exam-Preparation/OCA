package com.trl.method.exceptions_errors.a1;

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
        Experience ex = new Experience();
        ex.method();
//        Experience.method_2();
//        ex.method_3();
    }

    private void method() {
        try {
            method();
        } finally {
            method();
        }
    }

    private static void method_2() {
        try {
            method_2();
        } finally {
            method_2();
        }
    }

    private void method_3() {
        try {
            method_3();
        } finally { }
    }
}
