package com.trl.java_time.localDateTime.period.a3.a2;

import java.time.LocalDateTime;
import java.time.Period;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 21/07/19
 */
public class Experience {
    public static void main(String[] argv) {
        LocalDateTime ldt = LocalDateTime.of(2015, 5, 10, 10, 33, 44);

        Period p = Period.of(1, 0, 0);
        Period p_2 = Period.of(1, 1, 0);
        Period p_3 = Period.of(1, 1, 3);
//        Period p_4 = Period.of(1, 1, 3, 23);                        // Compilation Error !!!
//        Period p_5 = Period.of(1, 1, 3, 23, 59);                    // Compilation Error !!!
//        Period p_6 = Period.of(1, 1, 3, 23, 59);                    // Compilation Error !!!

        ldt = ldt.minus(p);
        System.out.println(ldt);   // 2014-05-10T10:33:44
    }
}
