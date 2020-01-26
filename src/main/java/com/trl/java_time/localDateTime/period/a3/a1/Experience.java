package com.trl.java_time.localDateTime.period.a3.a1;

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
        Period p_1 = Period.ofMonths(1);
        Period p_2 = Period.ofDays(1);
//        Period p_3 = Period.ofHours(1);               // Not found method ofHours() in class Period
//        Period p_3 = Period.ofMinutes(1);             // Not found method ofMinutes() in class Period
//        Period p_3 = Period.ofSeconds(1);             // Not found method ofSeconds() in class Period

        ldt = ldt.minus(p);
        System.out.println(ldt);   // 2014-05-10T10:33:44
    }
}
