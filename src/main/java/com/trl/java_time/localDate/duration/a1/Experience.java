package com.trl.java_time.localDate.duration.a1;

import java.time.Duration;
import java.time.LocalDate;

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
        Duration d = Duration.ofDays(1);

        // Runtime Error !!! java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Seconds
        ld = ld.minus(d);

        System.out.println(ld);

        LocalDate ld_1 = LocalDate.of(2015, 5, 10);
//        Duration d_1 = Duration.ofMonths(1);                                               // Compilation Error !!!

        LocalDate ld_2 = LocalDate.of(2015, 5, 10);
//        Duration d_2 = Duration.ofYears(1);                                               // Compilation Error !!!
    }
}
