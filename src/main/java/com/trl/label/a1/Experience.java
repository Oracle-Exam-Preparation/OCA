package com.trl.label.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 23/9/19
 */
public class Experience {
    public void method_1 () {
        int c = 0;
        JACK:
        while (c < 8) {
            JILL:
            System.out.println(c);
//            if (c > 3) break JILL;                                              // Compilation Exception !!!
//            else c++;
        }
    }

    public void method_2 () {
        int c = 0;
        JACK:
        while (c < 8) {
            JILL:
            while (c < 5) {
                System.out.println(c);
            if (c > 3) break JILL;                                              // Not Compilation Exception !!!
            else c++;
            }
        }
    }
}

