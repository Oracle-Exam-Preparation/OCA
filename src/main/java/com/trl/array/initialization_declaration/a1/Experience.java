package com.trl.array.initialization_declaration.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 14/9/19
 */
public class Experience {
    public static void main(String[] args) {
        int[] arg = new int[3];
//        int[] arg_1 = new int[];                       // Compilation Exception !!!

        int[] arg_2 = {1, 2, 3};
        int[] arg_3 = {};

        int[] arg_4 = new int[]{1, 2, 3};
        int[] arg_5 = new int[]{};
//        int[] arg_6 = new int[3]{};                   // Compilation Exception !!!
    }
}
