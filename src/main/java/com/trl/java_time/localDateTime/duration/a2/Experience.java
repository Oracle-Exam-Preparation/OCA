package com.trl.java_time.localDateTime.duration.a2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

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

        LocalDateTime ldt_H = LocalDateTime.of(2015, 5, 10, 10,1, 1);
        // java.time.temporal.UnsupportedTemporalTypeException: Unit must not have an estimated duration
//        Duration d_H = Duration.of(1, ChronoUnit.FOREVER);
//        ldt_H = ldt_H.plus(d_H);
//        System.out.println(ldt_H);
//
        LocalDateTime ldt_F = LocalDateTime.of(2015, 5, 10, 10,1, 1);
        // java.time.temporal.UnsupportedTemporalTypeException: Unit must not have an estimated duration
//        Duration d_F = Duration.of(1, ChronoUnit.ERAS);
//        ldt_F = ldt_F.plus(d_F);
//        System.out.println(ldt_F);

        LocalDateTime ldt_E = LocalDateTime.of(2015, 5, 10, 10,1, 1);
        // java.time.temporal.UnsupportedTemporalTypeException: Unit must not have an estimated duration
//        Duration d_E = Duration.of(1, ChronoUnit.CENTURIES);
//        ldt_E = ldt_E.plus(d_E);
//        System.out.println(ldt_E);

        LocalDateTime ldt_D = LocalDateTime.of(2015, 5, 10, 10,1, 1);
        // java.time.temporal.UnsupportedTemporalTypeException: Unit must not have an estimated duration
//        Duration d_D = Duration.of(1, ChronoUnit.DECADES);
//        ldt_D = ldt_D.plus(d_D);
//        System.out.println(ldt_D);

        LocalDateTime ldt_C = LocalDateTime.of(2015, 5, 10, 10,1, 1);
        // java.time.temporal.UnsupportedTemporalTypeException: Unit must not have an estimated duration
//        Duration d_C = Duration.of(1, ChronoUnit.YEARS);
//        ldt_C = ldt_C.plus(d_C);
//        System.out.println(ldt_C);
//
        LocalDateTime ldt_B = LocalDateTime.of(2015, 5, 10, 10,1, 1);
        // java.time.temporal.UnsupportedTemporalTypeException: Unit must not have an estimated duration
//        Duration d_B = Duration.of(1, ChronoUnit.MONTHS);
//        ldt_B = ldt_B.plus(d_B);
//        System.out.println(ldt_B);

        LocalDateTime ldt_A = LocalDateTime.of(2015, 5, 10, 10,1, 1);
        // java.time.temporal.UnsupportedTemporalTypeException: Unit must not have an estimated duration
//        Duration d_A = Duration.of(1, ChronoUnit.WEEKS);
//        ldt_A = ldt_A.plus(d_A);
//        System.out.println(ldt_A);

        LocalDateTime ldt_0 = LocalDateTime.of(2015, 5, 10, 10,1, 1);
        Duration d_0 = Duration.of(1, ChronoUnit.HALF_DAYS);
        ldt_0 = ldt_0.plus(d_0);
        System.out.println(ldt_0);

        LocalDateTime ldt_1 = LocalDateTime.of(2015, 5, 10, 10,1, 1);
        Duration d_1 = Duration.of(1, ChronoUnit.DAYS);
        ldt_1 = ldt_1.plus(d_1);
        System.out.println(ldt_1);

        LocalDateTime ldt_2 = LocalDateTime.of(2015, 5, 10, 10,1, 1);
        Duration d_2 = Duration.of(1, ChronoUnit.HOURS);
        ldt_2 = ldt_2.plus(d_2);
        System.out.println(ldt_2);

        LocalDateTime ldt_3 = LocalDateTime.of(2015, 5, 10, 10,1, 1);
        Duration d_3 = Duration.of(1, ChronoUnit.MINUTES);
        ldt_3 = ldt_3.plus(d_3);
        System.out.println(ldt_3);

        LocalDateTime ldt_4 = LocalDateTime.of(2015, 5, 10, 10,1, 1);
        Duration d_4 = Duration.of(1, ChronoUnit.SECONDS);
        ldt_4 = ldt_4.plus(d_4);
        System.out.println(ldt_4);

        LocalDateTime ldt_5 = LocalDateTime.of(2015, 5, 10, 10,1, 1);
        Duration d_5 = Duration.of(1, ChronoUnit.MILLIS);
        ldt_5 = ldt_5.plus(d_5);
        System.out.println(ldt_5);

        LocalDateTime ldt_6 = LocalDateTime.of(2015, 5, 10, 10,1, 1);
        Duration d_6 = Duration.of(1, ChronoUnit.NANOS);
        ldt_6 = ldt_6.plus(d_6);
        System.out.println(ldt_6);

        LocalDateTime ldt_7 = LocalDateTime.of(2015, 5, 10, 10,1, 1);
        Duration d_7 = Duration.of(1,
                ChronoUnit.DAYS).of(1, ChronoUnit.HOURS).of(1, ChronoUnit.MINUTES).of(1, ChronoUnit.SECONDS);           // Attention !!!
        ldt_7 = ldt_7.plus(d_7);
        System.out.println(ldt_7);
    }
}
