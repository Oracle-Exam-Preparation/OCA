package com.trl.continue_.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 17/07/19
 */
public class Experience {
    public static void main(String[] args) {
        int count = 0;
        Point:
        for (int row = 1; row <= 3; row++)
            for (int col = 1; col <= 2; col++) {
                if (row * col % 2 == 0) continue Point;
                count++;
            }
        System.out.println(count);
    }
}
