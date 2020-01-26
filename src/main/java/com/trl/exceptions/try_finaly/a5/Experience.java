package com.trl.exceptions.try_finaly.a5;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 19/8/19
 */
public class Experience {
    public static void main(String[] args) {
        System.out.println(m());
    }

    public static int m() {
        try {
            throw new RuntimeException();
        } finally {
            return 0;
        }
    }
}
