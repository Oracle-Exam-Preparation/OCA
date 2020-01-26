package com.trl.exceptions.try_finaly.a2;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 12/8/19
 */
public class Experience {
    public static void main(String args[]) throws Exception {
        try {
            if (true) throw new Exception();
        } finally {
            System.out.println("C");
            if (true) return;
        }
    }
}

