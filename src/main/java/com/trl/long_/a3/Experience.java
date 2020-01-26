package com.trl.long_.a3;

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
    public static void main(String[] args) {
        Long value = new Long(1L);
        method(value);
        System.out.println(value);

        Long value_2 = 1L;
        method(value_2);
        System.out.println(value_2);

        long value_3 = 1L;
        method(value_3);
        System.out.println(value_3);
    }

    public static void method(Long value) {
        value = 4L;
    }
}
