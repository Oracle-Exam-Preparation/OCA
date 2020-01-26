package com.trl.thread;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 19/8/19
 */
public class Test_1 {
    public static void main(String[] args) {

        new Thread(() -> {
            try {
                throw new RuntimeException();
            } finally {
                System.out.println("Hello from Finally.");
            }
        }).start();

        System.out.println("Hello");

    }
}
