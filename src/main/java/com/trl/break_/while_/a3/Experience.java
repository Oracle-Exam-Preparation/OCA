package com.trl.break_.while_.a3;

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
        int i = 0;
        while (i <= 5){
            int j = 0;
            while (j <= 5){
                j++;
                if (j == 3) {
                    break;
                }
                System.out.print(i + " - " + j + ", ");
            }
            i++;
        }
        System.out.println();

        int i1 = 0;
        while (i1 <= 5){
            int j1 = 0;
            while (j1 <= 5){
                j1++;
                if (j1 == 3) {
                    continue;
                }
                System.out.print(i1 + " - " + j1 + ", ");
            }
            i1++;
        }
    }
}
