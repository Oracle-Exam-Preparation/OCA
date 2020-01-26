package com.trl.string.mehods.trim.a1;

import com.sun.deploy.util.StringUtils;

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
        String source = "  A B C D E F ";
        System.out.println("source.trim() -->   |" + source.trim() + "|");

        String source_1 = "             A B C D E F                ";
        System.out.println("source_1.trim() --> |" + source_1.trim() + "|");

        String source_3 = " ";                                                                              // one space
        System.out.println("source_3.trim() --> |" + source_3.trim() + "|");

        String source_4 = "   ";                                                                          // three space
        System.out.println("source_4.trim() --> |" + source_4.trim() + "|");

        String source_5 = "          ";                                                                     // ten space
        System.out.println("source_5.trim() --> |" + source_5.trim() + "|");
    }
}
