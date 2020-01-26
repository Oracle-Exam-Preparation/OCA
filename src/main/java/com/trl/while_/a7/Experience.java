package com.trl.while_.a7;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 2/10/19
 */
public class Experience {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            i++;
            System.out.print(i + ", ");
        }
        System.out.println();

        int i1 = 0;
        while (i1 < 5) {
            System.out.print(i1 + ", ");
            i1++;
        }
        System.out.println();

        int i2 = 0;
        while (i2++ < 5) {
            System.out.print(i2 + ", ");
        }
        System.out.println("\n===================");

        int i3 = 0;
        while (i3 < 5) {
            ++i3;
            System.out.print(i3 + ", ");
        }
        System.out.println();

        int i4 = 0;
        while (i4 < 5) {
            System.out.print(i4 + ", ");
            ++i4;
        }
        System.out.println();

        int i5 = 0;
        while (++i5 < 5) {
            System.out.print(i5 + ", ");
        }
        System.out.println();
    }
}
