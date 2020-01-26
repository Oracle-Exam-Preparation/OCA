package com.trl.exceptions.multy_catch.a1.a1;

import java.io.IOException;

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
            method(3);
        } catch (InterruptedException | IOException e) {

        }try {
            method_2(3);
        } catch (ClassCastException | IOException e) {

        }
    }

    public static void method (int value) throws InterruptedException, IOException {
        if (value == 1) { throw new InterruptedException();
        } else if (value == 2){ throw new IOException();
        } else if (value == 3) { }
    }

    public static void method_2 (int value) throws ClassCastException, IOException {
        if (value == 1) { throw new ClassCastException();
        } else if (value == 2){ throw new IOException();
        } else if (value == 3) { }
    }
}
