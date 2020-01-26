package com.trl.boolean_.a2.a2;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 12/8/19
 */
public class Experience {
    public static void main(String[] args) {
        boolean b1 = false;
        boolean b2 = false;
        if (b2 != (b1 = !b2)){                          // Not Compilation Exception !!!
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
