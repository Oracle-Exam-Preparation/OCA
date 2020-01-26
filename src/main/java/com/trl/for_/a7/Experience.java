package com.trl.for_.a7;

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
        // ERROR
//        for (int i=5; i=0; i--) { }

        // ERROR
//        int j=5;
//        for(int i=0, j+=5;  i<j ; i++) {  j--;  }

        // ERROR
//        int i, j;
//        for (j=10; i<j; j--) { i += 2; }

        int i = 10;
        for (; i > 0; i--) {
        }

        for (int ii = 0, jj = 10; ii < jj; ii++, --jj) {
            ;
        }
    }
}
