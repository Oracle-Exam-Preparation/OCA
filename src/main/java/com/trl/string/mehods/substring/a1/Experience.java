package com.trl.string.mehods.substring.a1;

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
        String str = "ABCDEFGHIJKLMNOP";

        String result = str.substring(0);
        System.err.println("str.substring(0) = " + result);

        String result_0 = str.substring(1);
        System.err.println("str.substring(1) = " + result_0);

        String result_1 = str.substring(9, 10);
        System.err.println("str.substring(9, 10) = " + result_1);

        String result_2 = str.substring(9, 16);
        System.err.println("str.substring(9, 16) = " + result_2);

        String result_3 = str.substring(9, str.length());
        System.err.println("str.substring(9, str.length()) = " + result_3);

        String result_4 = str.substring(1, 1);
        System.err.println("str.substring(1, 1) = " + result_4);

        String result_5 = str.substring(str.length());
        System.err.println("str.substring(str.length()) = " + result_5);

//        String result_6 = str.substring(str.length() + 1);         // Runtime Error !!! StringIndexOutOfBoundsException.
//        System.err.println("str.substring(str.length() + 1) = " + result_6);

//        String result_7 = str.substring(2, 1);                     // Runtime Error !!! StringIndexOutOfBoundsException.
//        System.err.println("str.substring(2, 1) = " + result_7);

//        String result_8 = str.substring(9, str.length() + 1);     // Runtime Error !!! StringIndexOutOfBoundsException.
//        System.err.println("str.substring(9, str.length() + 1) = " + result_8);

        // =============================================================================================================

        String s = "MINIMUM";
        System.out.println(s.substring(4, 7));
        System.out.println(s.substring(5));
        System.out.println(s.substring(s.indexOf('I', 3)));

        // indexOf() return -1. And so it will be thrown Runtime Exception: StringIndexOutOfBoundsException
        System.out.println(s.substring(s.indexOf('I', 4)));
    }
}
