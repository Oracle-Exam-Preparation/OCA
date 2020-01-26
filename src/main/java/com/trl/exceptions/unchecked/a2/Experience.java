package com.trl.exceptions.unchecked.a2;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 22/9/19
 */
public class Experience {
    public static void main(String[] args) {
        try {
            throw new Error();
        } catch (Throwable t) {
            throw t;
        }
    }
}
