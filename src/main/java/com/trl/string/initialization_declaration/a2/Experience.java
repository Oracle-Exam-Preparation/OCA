package com.trl.string.initialization_declaration.a2;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 24/9/19
 */
public class Experience {
    public static void main(String[] args) {
        String str_1 = "hello";
        char[] char_array = {'h', 'e', 'l', 'l', 'o'};

        String str_2 = null;
//        String str_2;                                                  // Compilation Error !!!
//        String str_2 = "";
        for (char c : char_array) {
            str_2 = str_2 + c;
        }

        System.out.println((str_2 == str_1));
        System.out.println(str_2.equals(str_1));
        System.out.println(str_1 + " " + str_2);
    }
}
