package com.trl.swich.a3;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 11/8/19
 */
public class Test_3 {
    public static void main(String[] args) {
        method(1);
    }

    private static void method(int i) {
        switch (i) {
            case 0:
                boolean b = false;
                break;

            case 1:
                b = true;
                System.out.println(b);
                break;
        }
    }
}
