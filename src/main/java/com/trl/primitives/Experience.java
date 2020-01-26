package com.trl.primitives;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 26/8/19
 */
public class Experience {
    public static void main(String[] args) {
        byte b = 0;
        short s = 0;
        char c = 0;
        int i = 0;
        float f = 0.0F;
        double d = 0.0;
        long l = 0L;

        byte b_2 = 1;
        short s_2 = 1;
        char c_2 = 1;
        int i_2 = 1;
        float f_2 = 1.0F;
        double d_2 = 1.0;
        long l_2 = 1L;

        System.out.println(b == b);
        System.out.println(b == s);
        System.out.println(b == c);
        System.out.println(b == i);
        System.out.println(b == f);
        System.out.println(b == d);
        System.out.println(b == l);
        System.out.println();

        System.out.println(b == b_2);
        System.out.println(b == s_2);
        System.out.println(b == c_2);
        System.out.println(b == i_2);
        System.out.println(b == f_2);
        System.out.println(b == d_2);
        System.out.println(b == l_2);
    }
}
