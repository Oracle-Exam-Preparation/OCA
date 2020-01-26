package com.trl.short_;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 26/8/19
 */
public class Experience {
    public static void main(String[] args) {
        Short s = new Short("9");
        Short s_1 = new Short((short) 9);

        // Compilation Exception !!! Not exist constructor with parameter int.
//        Short s_2 = new Short(9);

        short s_3 = 9;
        Short s_4 = new Short(s_3);
    }
}
