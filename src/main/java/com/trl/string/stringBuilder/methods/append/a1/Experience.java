package com.trl.string.stringBuilder.methods.append.a1;

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
        StringBuilder b_1 = new StringBuilder("ABC");
        b_1.append("DEF");
        System.out.println(b_1);

        StringBuilder b_2 = new StringBuilder("Examples:");
        b_2.append(" ").append("1"); // String
        b_2.append(" ").append(new StringBuffer("2"));
        b_2.append(" ").append('\u0031'); // char
        b_2.append(" ").append((int) 2); // int
        b_2.append(" ").append(1L); // long
        b_2.append(" ").append(2F); // float
        b_2.append(" ").append(1D); // double
        b_2.append(" ").append(true); // true

        /* Prints out "Examples: 1 2 1 2 1 2.0 1.0 true" */
        System.out.println(b_2);
    }
}
