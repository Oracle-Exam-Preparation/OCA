package com.trl.increment_decrement.a3;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 17/07/19
 */
public class Main {
    public static void main(String[] args) {
        int x = 0;
        while (x++ < 5) {
        }
        String message = x > 5 ? "Greater than" : "false";
        System.out.println(message + "," + x);
    }
}
