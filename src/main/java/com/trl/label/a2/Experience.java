package com.trl.label.a2;

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
    public void method1(int i) {
        int j = (i * 30 - 2) / 100;

        POINT1:
        for (; j < 10; j++) {
            boolean flag = false;
            while (!flag) {
                if (Math.random() > 0.5) break POINT1;
            }
        }

        while (j > 0) {
            System.out.println(j--);
//            if(j == 4) break POINT1;                                       // Compilation Error !!!
        }
    }
}
