package com.trl.for_.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 7/8/19
 */
public class Experience {
    public static void main(String args[]) {
        int i;
        int j;
        for (i = 0, j = 0; j < i; ++j, i++) {
            System.out.println(i + " " + j);
        }
        System.out.println(i + " " + j);

        // =============================================================================================================

        for (int ii = 0, jj = 0; ii < 10 && jj < 10; ii++, jj++) {
            System.out.println(ii + " " + jj);
        }

//        for (int i2 = 0, int j2 = 0; i2 < 10 && j2 < 10; i2++, j2++) {                        // Compilation Error !!!
//            System.out.println(i2 + " " + j2);
//        }
    }
}

