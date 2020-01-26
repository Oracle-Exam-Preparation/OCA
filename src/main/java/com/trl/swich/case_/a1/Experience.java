package com.trl.swich.case_.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 3/10/19
 */
public class Experience {
    public static void main(String[] args) {
        int i = 10;
        switch (i) {
            case 1_00:
                System.out.println("10");
                break;
            // Compilation Error !!! No se perimite repetir le mismo value en case.
//            case 100:
//                System.out.println("10");
//                break;
        }
    }
}
