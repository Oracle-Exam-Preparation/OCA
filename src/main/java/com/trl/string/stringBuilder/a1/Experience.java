package com.trl.string.stringBuilder.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 16/07/19
 */
public class Experience {
    public static void main(String[] args) {
        StringBuilder source = new StringBuilder("ABCD");
        System.out.println(source);

        source.reverse();
        System.out.println(source);

        source.append("EFG$").substring(0, 4);
        System.out.println(source);

        source.append("HIJ$").delete(0, 3).deleteCharAt(source.length() - 1);
        System.out.println(source);

        source.append("KLM$").delete(0, 3);
        System.out.println(source);

//        source.deleteCharAt(source.length());                       // Runtime Error !!! StringIndexOutOfBoundsException
//        System.out.println(source);

        source.delete(0, source.length());                          // Not Runtime Error !!!
        System.out.println("|" + source + "|");
    }
}
