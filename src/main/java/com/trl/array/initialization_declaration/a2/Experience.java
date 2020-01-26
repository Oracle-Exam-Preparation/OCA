package com.trl.array.initialization_declaration.a2;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 06/08/19
 */
public class Experience{
    public static void main(String[] args) {

//        Object[] arg_1 = new Object();                          // Compilation Exception !!!
//        Object arg_2[] = new Object();                          // Compilation Exception !!!

//        Object[] arg_3 = new Object[];                          // Compilation Exception !!!
//        Object arg_4[] = new Object[];                          // Compilation Exception !!!
        Object[] arg_5 = new Object[7];
        Object arg_6[] = new Object[7];

//        Object[] arg_7 = new Object[3]();                       // Compilation Exception !!!
//        Object arg_8[] = new Object[3]();                       // Compilation Exception !!!

//        Object[8] arg_9 = new Object[];                        // Compilation Exception !!!
//        Object[3] arg_10 = new Object[3]();                     // Compilation Exception !!!
//        Object[7] arg_12 = new Object[7];                       // Compilation Exception !!!

//        Object arg_13[] = new {new Object(), new Object()};     // Compilation Exception !!!

        Object[] arg_14 = {new Object(), new Object()};
        Object[] arg_15 = {new Object[1], new Object[1]};
        Object[] arg_16 = {new Object[1], new int[1], new String[1], new StringBuilder[1]};

        Object arg_17 = new Object[1];
        Object arg_18 = new int[1];
    }
}
