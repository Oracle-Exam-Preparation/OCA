package com.trl.thread;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 16/8/19
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> System.out.println("Thread end."));

        synchronized (thread) {
            thread.start();
            thread.wait();
        }
        System.out.println("Main end.");
    }
}
