package com.trl.integer.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 11/8/19
 */
public class Experience {
    public static void main(String[] args) {
        int a = 5, b = 7, k = 0;
        Integer m = null;

        k = new Integer(a) + new Integer(b);
        k = new Integer(a) + b;
        k = new Integer(a) + 9;
        k = a + new Integer(b);

        m = new Integer(a) + new Integer(b);
        m = 1 + 2;
        m = new Integer(1) + 2;
        m = new Integer(1) + b;
        m = a + new Integer(b);
    }
}
