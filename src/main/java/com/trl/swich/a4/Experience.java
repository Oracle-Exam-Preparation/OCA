package com.trl.swich.a4;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 3/10/19
 */
public class Experience {

    private static int i = 0;

    public static void main(String[] args) {
        method(5);
        System.out.println(i);
    }

    public static void method (int value) {
        switch (value) {
            case 1: i++;
            case 2: i++;
            case 3: i++;
            case 4: i++;
            case 5: i++;
            case 6: i++;
            default: i++;
        }
    }
}
