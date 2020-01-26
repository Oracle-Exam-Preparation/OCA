package com.trl.increment_decrement;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 7/8/19
 */
public class Test_1 {

    public static void main(String[] args) {

        Integer val1 = new Integer(5);
        int val2 = 9;
        testInts(val1++, ++val2);
        System.out.println(val1 + " " + val2);

    }

    public static void testInts(Integer obj, int var) {
        obj = var++;
        obj++;
    }

}
