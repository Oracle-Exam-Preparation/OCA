package com.trl.bytes.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 06/08/19
 */
public class Main {

    public static void main(String[] args) {

        int b1 = 0b0101_0101_0101_0101;
        System.out.println(b1);

        int b2 = 0b1010_1010_1010_1010;
        System.out.println(b2);

        int b3 = b1 & b2;
        System.out.println("Value:" + b3);

    }

}
