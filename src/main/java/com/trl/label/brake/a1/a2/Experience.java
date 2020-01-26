package com.trl.label.brake.a1.a2;

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
        OUTER:
        for (int i = 0; i < 5; i++) {
            INNER:
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    break OUTER;
                }
                System.out.print(i + " - " + j + ", ");
            }
        }

        System.out.println();

        OUTER:
        for (int i = 0; i < 5; i++) {
            INNER:
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    continue OUTER;
                }
                System.out.print(i + " - " + j + ", ");
            }
        }
    }
}
