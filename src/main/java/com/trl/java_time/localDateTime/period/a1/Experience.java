package com.trl.java_time.localDateTime.period.a1;

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
        Period p = Period.ofYears(1);
        ldt = ldt.minus(p);
        System.out.println(ldt);   // 2014-05-10T10:33:44

        LocalDateTime ldt_1 = LocalDateTime.of(2015, 5, 10, 10, 33, 44);
        Period p_1 = Period.ofDays(1).ofYears(1);
        ldt_1 = ldt_1.minus(p_1);
        System.out.println(ldt_1);   // 2014-05-10T10:33:44

        LocalDateTime ldt_2 = LocalDateTime.of(2015, 5, 10, 10, 33, 44);
        Period p_2 = Period.ofDays(1).ofMonths(3).ofYears(1);
        ldt_2 = ldt_2.minus(p_2);
        System.out.println(ldt_2);   // 2014-05-10T10:33:44
    }
}
