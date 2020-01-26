package com.trl.for_.a8;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 17/8/19
 */
public class Experience {
    public static void main(String[] args) {
        int c = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    c++;
                    if (k > j) {
                        System.out.println("i = " + i + "\nj = " + j + "\nk = " + k + "\nc = " + c + "\nk > j = " + (k > j));
                        System.out.println("brake \n========================");
                        System.out.println("========================");
                        break;
                    }
                    System.out.println("i = " + i + "\nj = " + j + "\nk = " + k + "\nc = " + c + "\nk > j = " + (k > j));
                    System.out.println("============");
                }
            }
            System.out.println("================================================");
            System.out.println("================================================");
            System.out.println("================================================");
        }
        System.out.println(c);
    }
}
