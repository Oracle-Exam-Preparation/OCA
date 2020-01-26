package com.trl.string.string_pool.a2;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 16/8/19
 */
public class Experience {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hel";
        final String s22 = "hel";
        String s3 = "lo";
        String s4 = "hello";

        System.out.println("s1 == s4 --> " + (s1 == s4));

        System.out.println("s1 == s2 + s3 --> " + (s1 == s2 + s3));
        System.out.println("s1 == s2 + \"lo\" --> " + (s1 == s2 + "lo"));

        System.out.println("s1 == s22 + s3 --> " + (s1 == s22 + s3));
        System.out.println("s1 == s22 + \"lo\" --> " + (s1 == s22 + "lo"));
    }
}
