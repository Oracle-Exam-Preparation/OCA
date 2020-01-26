package com.trl.certification_oracle.a3;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 13/07/19
 */
public class Test {
    public static void main(String[] args) {
        int row = 10;
        for (; row > 0; ) {
            int col = row;
            while (col >= 0) {
                System.out.println(col + " ");
                col -= 2;
            }
            row = row / col;
        }
    }
}
