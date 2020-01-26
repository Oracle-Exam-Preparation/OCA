package com.trl.string.mehods.lenght.a1;

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
        String str = "  12 ";
        System.out.println(str.length());

        String str_1 = "box";
        System.out.println(str_1.length());

        String str_2 = " ";
        System.out.println(str_2.length());

        String str_3 = "";
        System.out.println(str_3.length());

        // Use of array's length attribute
        String[] stringArray = new String[3];
        int value2 = stringArray.length;
    }
}
