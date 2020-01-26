package com.trl.increment_decrement;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 06/08/19
 */
public class Test {

    public static void main(String[] args) {

        Integer val1 = 5;
        int val2 = 9;

        testInts(val1++, ++val2);
        System.out.println("Outside method --> " + val1 + ", " + val2);

    }

    public static void testInts(Integer obj, int var) {
        System.out.println("Inside method --> " + obj + ", " + var);
    }

}
