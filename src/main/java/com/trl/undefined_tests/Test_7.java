package com.trl.undefined_tests;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 12/8/19
 */
public class Test_7 {
    public static void main(String[] args) {
        Object t = new Integer(106);
        int k = ((Integer) t).intValue() / 10;
        System.out.println(k);

        System.out.println(100 / 9.9);

        System.out.println(100 / 10.0);

        System.out.println(100 / 10);

        System.out.println(3 + 100 / 10 * 2 - 13);
    }
}
