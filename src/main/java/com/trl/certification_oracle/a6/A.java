package com.trl.certification_oracle.a6;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 13/07/19
 */
public class A {
    public static void main(String[] args) {

        int a = -10;
        int b = 17;

//        int c = ++a;   // -8
//        int d = --b;   // 15

        int c = ++a;   // -8
        int d = b--;   // 16

//        int c = a++;   // -9
//        int d = --b;   // 15
//
//        int c = a++;   // -9
//        int d = b--;   // 16

        c++;
        d--;

        System.out.println(c + ", " + d);

    }
}
