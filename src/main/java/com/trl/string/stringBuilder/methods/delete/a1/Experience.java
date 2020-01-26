package com.trl.string.stringBuilder.methods.delete.a1;

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
        source.delete(6, 18);
        source.delete(6,source.length());                                                            // The same result.
        System.out.println(source);

        System.out.println("=========================================================================================");
        StringBuilder source_1 = new StringBuilder("ABCDEFGHIJKLMNOPQR");
        System.out.println(source_1);
        source_1.delete(6, 1000);                                                                       // Not Error !!!
        System.out.println(source_1);

        System.out.println("=========================================================================================");
        StringBuilder source_2 = new StringBuilder("ABCDEFGHIJKLMNOPQR");
        System.out.println(source_2);
        source_2.delete(source_2.length(), source_2.length());  // Not Error !!! But also does not delete the character.
        System.out.println(source_2);

        System.out.println("=========================================================================================");
        StringBuilder source_3 = new StringBuilder("ABCDEFGHIJKLMNOPQR");
        System.out.println(source_3);
        source_3.delete(1, 1);                                  // Not Error !!! But also does not delete the character.
        System.out.println(source_3);

        System.out.println("=========================================================================================");
        StringBuilder source_4 = new StringBuilder("ABCDEFGHIJKLMNOPQR");
        System.out.println(source_4);
        source_4.delete(source_4.length() + 1, source_4.length()); // Runtime Error !!! StringIndexOutOfBoundsException.
        System.out.println(source_4);
    }
}
