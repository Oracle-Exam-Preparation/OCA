package com.trl.swich.return_;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 30/8/19
 */
public class Test_6 {
    public static void main(String[] args) {
        m(2);
        System.out.println("=======================");
        m_2(1);
    }

    public static void m(int y) {
        switch (y) {
            default:
                System.out.println("Default");
                return;
            case 0:
                System.out.println("case 0");
                return;
            case 1:
                System.out.println("case 1");
                return;
        }
    }

    public static void m_2(int y) {
        switch (y) {
            case 0:
                System.out.println("case 0");
                return;
            case 1:
                System.out.println("case 1");
                return;
            default:
                System.out.println("Default");
                return;
        }
    }

}
