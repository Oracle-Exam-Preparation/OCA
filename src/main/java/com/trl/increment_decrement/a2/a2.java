package com.trl.increment_decrement.a2;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 17/07/19
 */
public class a2 {
    public static void main(String[] args) {

        int x = 4;
        long y = x * 4 - x++ + --x;
        if (y < 10) System.out.println("A   y = " + y);
        else System.out.println("B   y = " + y);
//        else System.out.println("C   y = " + y);

    }
}
