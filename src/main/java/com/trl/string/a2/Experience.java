package com.trl.string.a2;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 21/07/19
 */
public class Experience {
    public static void main(String[] args) {
        String s = "ABC";
        String t = new String(s);

        System.out.println("\"ABC\".equals(s) --> " + "ABC".equals(s));
        System.out.println("t == s --> " + (t == s));
        System.out.println("t.equals(s) --> " + t.equals(s));
        System.out.println("\"ABC\" == s --> " + ("ABC" == s));
        System.out.println("\"ABC\" == t --> " + ("ABC" == t));
        System.out.println();

        // Attention parenthesis !!!
        System.out.println("\"ABC\".equals(s) --> " + "ABC".equals(s));
        System.out.println("t == s --> " + t == s);
        System.out.println("t.equals(s) --> " + t.equals(s));
        System.out.println("\"ABC\" == s --> " + "ABC" == s);
        System.out.println("\"ABC\" == t --> " + "ABC" == t);
    }
}
