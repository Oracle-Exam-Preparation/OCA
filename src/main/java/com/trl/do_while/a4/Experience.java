package com.trl.do_while.a4;

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
        do{
            i++;
            System.out.print(i + ", ");
        } while (i < 5);
        System.out.println();

        int i1 = 0;
        do {
            System.out.print(i1 + ", ");
            i1++;
        } while (i1 < 5);
        System.out.println();

        int i2 = 0;
        do {
            System.out.print(i2 + ", ");
        } while (i2++ < 5);
        System.out.println("\n===================");

        int i3 = 0;
        do{
            ++i3;
            System.out.print(i3 + ", ");
        } while (i3 < 5);
        System.out.println();

        int i4 = 0;
        do{
            System.out.print(i4 + ", ");
            ++i4;
        } while (i4 < 5);
        System.out.println();

        int i5 = 0;
        do{
            System.out.print(i5 + ", ");
        }
        while (++i5 < 5);
        System.out.println();
    }
}
