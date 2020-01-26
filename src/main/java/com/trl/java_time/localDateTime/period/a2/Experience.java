package com.trl.java_time.localDateTime.period.a2;

import java.time.LocalDateTime;
import java.time.Period;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 8/9/19
 */
public class Experience {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2015, 5, 10, 10, 33, 44);
        Period p = Period.of(1, 0, 0);
        ldt = ldt.minus(p);
        System.out.println(ldt);   // 2014-05-10T10:33:44

        LocalDateTime ldt_1 = LocalDateTime.of(2015, 5, 10, 10, 33, 44);
        Period p_1 = Period.of(1, 1, 0);
        ldt_1 = ldt_1.minus(p_1);
        System.out.println(ldt_1);   // 2014-04-10T10:33:44

        LocalDateTime ldt_2 = LocalDateTime.of(2015, 5, 10, 10, 33, 44);
        Period p_2 = Period.of(1, 1, 1);
        ldt_2 = ldt_2.minus(p_2);
        System.out.println(ldt_2);   // 2014-04-09T10:33:44

    }
}
