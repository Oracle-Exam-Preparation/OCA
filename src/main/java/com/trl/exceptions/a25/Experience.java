package com.trl.exceptions.a25;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 22/9/19
 */
public class Experience {
    public static void main(String[] args) {
        method();
    }
    public static void method() {
        try {
            throw new Error();
        }finally {
            System.err.println(0);
        }
//        System.err.println(1);                                       // Compilation Exception !!! Unreachable statement.
    }
}
