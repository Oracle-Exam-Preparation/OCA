package com.trl.break_.for_.a2;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 30/9/19
 */
public class Experience {
    public static void main(String[] args) {
        System.out.println("================ break");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.print(i + ", ");
        }

        System.out.println("\n================ continue");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i + ", ");
        }
    }
}
