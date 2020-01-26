package com.trl.undefined_tests;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 06/08/19
 */
public class Test_2 {
    public static void main(String[] args) {

        Test_2 test = new Test_2();
        test.crazyLoop();
    }

    void crazyLoop() {
        int c = 0;
        JACK:
        while (c < 8) {
            JILL:
            System.out.println(c);
            if (c > 3) continue JACK;
            else c++;   // infinity
        }
    }
}
