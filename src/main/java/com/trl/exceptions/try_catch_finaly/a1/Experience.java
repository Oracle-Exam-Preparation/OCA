package com.trl.exceptions.try_catch_finaly.a1;

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
        System.out.println("a");
        try {
            System.out.println("b");
            if (true) throw new IllegalArgumentException();
            System.out.println("c");
        } catch (RuntimeException e) {
            System.out.println("d");
        } finally {
            System.out.println("e");
        }
        System.out.println("f");
    }
}
