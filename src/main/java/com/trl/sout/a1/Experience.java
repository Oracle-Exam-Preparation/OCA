package com.trl.sout.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 7/8/19
 */
public class Experience {
    public static void main(String[] args) {
        String hello = "Hello", lo = "lo";

        System.out.println("hello == (\"Hel\"+lo).intern() --> " + hello == ("Hel" + lo).intern());      // Attention !!!
        System.out.println("hello == (\"Hel\"+lo).intern() --> " + (hello == ("Hel" + lo).intern()));
    }
}
