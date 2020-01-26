package com.trl.string.mehods.lenght.a2;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 06/08/19
 */
public class Experience {
    public static void main(String[] args) {
        String str = "Hello";
        str = null;

//        System.out.println(str.length);
        System.out.println(str.length());                                     // Runtime Error !!! NullPointerException.
    }
}
