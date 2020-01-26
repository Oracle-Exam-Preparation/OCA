package com.trl.string.stringBuilder.methods.deleteCharAt.a1;

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
        StringBuilder source = new StringBuilder("ABCDEFGHIJKLMNOPQR");
        System.out.println(source);
        source.deleteCharAt(0);
        System.out.println(source);

        System.out.println("=========================================================================================");
        StringBuilder source_1 = new StringBuilder("ABCDEFGHIJKLMNOPQR");
//        System.out.println(source_1);
//        source_1.deleteCharAt(source_1.length());                  // Runtime Error !!! StringIndexOutOfBoundsException.
//        System.out.println(source_1);

        System.out.println("=========================================================================================");
        StringBuilder source_2 = new StringBuilder("ABCDEFGHIJKLMNOPQR");
        System.out.println(source_2);
        source_2.deleteCharAt(source_2.length() - 1);                                                   // Not Error !!!
        System.out.println(source_2);

        System.out.println("=========================================================================================");
        StringBuilder source_3 = new StringBuilder("ABCDEFGHIJKLMNOPQR");
//        System.out.println(source_3);
//        source_3.deleteCharAt(-1);                                 // Runtime Error !!! StringIndexOutOfBoundsException.
//        System.out.println(source_3);
    }
}
