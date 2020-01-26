package com.trl.undefined_tests;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 9/8/19
 */
public class Test_6 {
    public static void main(String[] args) {
        int a = 5, b = 7, k = 0;
        Integer m = null;

        k = new Integer(a) + new Integer(b);
        System.out.println(k);

        k = new Integer(a) + b;
        System.out.println(k);

        k = a + new Integer(b);
        System.out.println(k);

        m = new Integer(a) + new Integer(b);
        System.out.println(m);
    }
}
