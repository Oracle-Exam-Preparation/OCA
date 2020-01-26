package com.trl.exceptions.try_catch_finaly.a3.a3;

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
    public static void main(String args[]) {
        try {
            if (true) throw new Exception();
        } catch (Exception e) {
            System.out.println("B");
        } finally {
            System.out.println("C");
            if (true) return;
        }
    }
}

