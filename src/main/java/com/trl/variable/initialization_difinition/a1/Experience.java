package com.trl.variable.initialization_difinition.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 28/9/19
 */
public class Experience {
    public static void main(String[] args) {
//        int a = b = c = d = 10;                                            // Compilation Error !!!
//        int a_0 = 100 = b_0 = c_0 = d_0;                                   // Compilation Error !!!

        int a_1, b_1, c_1, d_1; a_1 = b_1 = c_1 = d_1 = 10;

        int a_2, b_2, c_2 = 100;
        int a_3 = 100, b_3, c_3;
        int a_4 = 100, b_4 = 100, c_4;
        int a_5 = 100, b_5 = 100, c_5 = 100;
    }
}
