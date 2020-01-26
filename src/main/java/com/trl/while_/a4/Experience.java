package com.trl.while_.a4;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 23/9/19
 */
public class Experience {
    public static void main(String[] args) {
        int value = 0;

//        while (false){
//            value = 10;                                            // Compilation Exception !!! Unreachable statement.
//        }

        boolean b = false;
        while (b){
            value = 10;                                             // Not Compilation Error !!!
        }
    }
}
