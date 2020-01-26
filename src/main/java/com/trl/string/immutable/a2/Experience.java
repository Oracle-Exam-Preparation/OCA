package com.trl.string.immutable.a2;

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
        String str = "1";
        str.concat("2");
        str.concat("3");

        System.out.println(str);

        // String immutable
        String str_2 = "A";
        str_2 = str_2.concat("B");
        str_2 = str_2.concat("C");
        System.out.println(str_2);
    }
}
