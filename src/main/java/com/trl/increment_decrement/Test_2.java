package com.trl.increment_decrement;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 16/8/19
 */
public class Test_2 {
    public static void main(String[] args) {

        System.out.println("======================= i++ j++");
        for (int i = 0, j = 0; i < 10 && j < 10; i++, j++) {
            System.out.println(i + " " + j);
        }

        System.out.println("======================= i++ ++j");
        for (int i = 0, j = 0; i < 10 && j < 10; i++, ++j) {
            System.out.println(i + " " + j);
        }

        System.out.println("======================= ++i ++j");
        for (int i = 0, j = 0; i < 10 && j < 10; ++i, ++j) {
            System.out.println(i + " " + j);
        }

        System.out.println("======================== i-- j--");
        for (int i = 10, j = 10; i >= 0 && j >= 0; i--, j--) {
            System.out.println(i + " " + j);
        }

        System.out.println("======================= i++ --j");
        for (int i = 0, j = 10; i <= 10 && j >= 0; i++, --j) {
            System.out.println(i + " " + j);
        }

        System.out.println("======================= --i --j");
        for (int i = 10, j = 10; i >= 0 && j >= 0; --i, --j) {
            System.out.println(i + " " + j);
        }

    }
}
