package com.trl.java_time.localDate.period.a1;

import java.time.LocalDate;
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
        LocalDate ld = LocalDate.of(2015, 5, 10);
        Period p = Period.ofYears(1);
        ld = ld.minus(p);
        System.out.println(ld);   // 2014-05-10

        LocalDate ld_1 = LocalDate.of(2015, 5, 10);
        Period p_1 = Period.ofDays(1).ofYears(1);
        ld_1 = ld_1.minus(p_1);
        System.out.println(ld_1);   // 2014-05-10

        LocalDate ld_2 = LocalDate.of(2015, 5, 10);
        Period p_2 = Period.ofDays(1).ofMonths(1).ofYears(1);
        ld_2 = ld_2.minus(p_2);
        System.out.println(ld_2);   // 2014-05-10
    }
}
