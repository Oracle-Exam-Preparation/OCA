package com.trl.swich.continue_;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 30/8/19
 */
public class Test_7 {
    public static void main(String[] args) {

        m(2);

    }

    public static int m(int y) {
        switch (y) {
            default:
                System.out.println("Default");
//                continue;                                  // ERROR. Not allowed use "continue". Allowed only in loop
            case 0:
                System.out.println("case 0");
                return 0;
            case 1:
                System.out.println("case 1");
                return 0;
        }
    }

}
