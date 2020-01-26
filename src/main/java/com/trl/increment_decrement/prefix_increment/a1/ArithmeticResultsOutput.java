package com.trl.increment_decrement.prefix_increment.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 06/08/19
 */
public class ArithmeticResultsOutput {

    public static void main(String[] args) {

        int i1 = 100;
        int j1 = 200;
        if ((i1 == 99) & (--j1 == 199)) {
            System.out.print("Value1: " + (i1 + j1) + " ");
        } else {
            System.out.print("Value2: " + (i1 + j1) + " ");
        }

        int i2 = 100;
        int j2 = 200;
        if ((i2 == 99) && (--j2 == 199)) {
            System.out.print("Value1: " + (i2 + j2) + " ");
        } else {
            System.out.print("Value2: " + (i2 + j2) + " ");
        }

        int i3 = 100;
        int j3 = 200;
        if ((i3 == 100) | (--j3 == 200)) {
            System.out.print("Value1: " + (i3 + j3) + " ");
        } else {
            System.out.print("Value2: " + (i3 + j3) + " ");
        }

        int i4 = 100;
        int j4 = 200;
        if ((i4 == 100) || (--j4 == 200)) {
            System.out.print("Value1: " + (i4 + j4) + " ");
        } else {
            System.out.print("Value2: " + (i4 + j4) + " ");
        }

    }

}
