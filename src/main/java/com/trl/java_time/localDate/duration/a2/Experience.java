package com.trl.java_time.localDate.duration.a2;

import java.time.Duration;
import java.time.LocalDate;
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
        LocalDate ld_H = LocalDate.of(2015, 5, 10);
        // java.time.temporal.UnsupportedTemporalTypeException: Unit must not have an estimated duration
//        Duration d_H = Duration.of(1, ChronoUnit.FOREVER);
//        ld_H = ld_H.plus(d_H);
//        System.out.println(ld_H);
//
        LocalDate ld_F = LocalDate.of(2015, 5, 10);
        // java.time.temporal.UnsupportedTemporalTypeException: Unit must not have an estimated duration
//        Duration d_F = Duration.of(1, ChronoUnit.ERAS);
//        ld_F = ld_F.plus(d_F);
//        System.out.println(ld_F);

        LocalDate ld_E = LocalDate.of(2015, 5, 10);
        // java.time.temporal.UnsupportedTemporalTypeException: Unit must not have an estimated duration
//        Duration d_E = Duration.of(1, ChronoUnit.CENTURIES);
//        ld_E = ld_E.plus(d_E);
//        System.out.println(ld_E);

        LocalDate ld_D = LocalDate.of(2015, 5, 10);
        // java.time.temporal.UnsupportedTemporalTypeException: Unit must not have an estimated duration
//        Duration d_D = Duration.of(1, ChronoUnit.DECADES);
//        ld_D = ld_D.plus(d_D);
//        System.out.println(ld_D);

        LocalDate ld_C = LocalDate.of(2015, 5, 10);
        // java.time.temporal.UnsupportedTemporalTypeException: Unit must not have an estimated duration
//        Duration d_C = Duration.of(1, ChronoUnit.YEARS);
//        ld_C = ld_C.plus(d_C);
//        System.out.println(ld_C);
//
        LocalDate ld_B = LocalDate.of(2015, 5, 10);
        // java.time.temporal.UnsupportedTemporalTypeException: Unit must not have an estimated duration
//        Duration d_B = Duration.of(1, ChronoUnit.MONTHS);
//        ld_B = ld_B.plus(d_B);
//        System.out.println(ld_B);

        LocalDate ld_A = LocalDate.of(2015, 5, 10);
        // java.time.temporal.UnsupportedTemporalTypeException: Unit must not have an estimated duration
//        Duration d_A = Duration.of(1, ChronoUnit.WEEKS);
//        ld_A = ld_A.plus(d_A);
//        System.out.println(ld_A);

        LocalDate ld_0 = LocalDate.of(2015, 5, 10);
        Duration d_0 = Duration.of(1, ChronoUnit.HALF_DAYS);
        // java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Seconds
//        ld_0 = ld_0.plus(d_0);
//        System.out.println(ld_0);

        LocalDate ld_1 = LocalDate.of(2015, 5, 10);
        Duration d_1 = Duration.of(1, ChronoUnit.DAYS);
        // java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Seconds
//        ld_1 = ld_1.plus(d_1);
//        System.out.println(ld_1);

        LocalDate ld_2 = LocalDate.of(2015, 5, 10);
        Duration d_2 = Duration.of(1, ChronoUnit.HOURS);
        // java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Seconds
//        ld_2 = ld_2.plus(d_2);
//        System.out.println(ld_2);

        LocalDate ld_3 = LocalDate.of(2015, 5, 10);
        Duration d_3 = Duration.of(1, ChronoUnit.MINUTES);
        // java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Seconds
//        ld_3 = ld_3.plus(d_3);
//        System.out.println(ld_3);

        LocalDate ld_4 = LocalDate.of(2015, 5, 10);
        Duration d_4 = Duration.of(1, ChronoUnit.SECONDS);
        // java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Seconds
//        ld_4 = ld_4.plus(d_4);
//        System.out.println(ld_4);

        LocalDate ld_5 = LocalDate.of(2015, 5, 10);
        Duration d_5 = Duration.of(1, ChronoUnit.MILLIS);
        // java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Seconds
//        ld_5 = ld_5.plus(d_5);
//        System.out.println(ld_5);

        LocalDate ld_6 = LocalDate.of(2015, 5, 10);
        Duration d_6 = Duration.of(1, ChronoUnit.NANOS);
        // java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Seconds
//        ld_6 = ld_6.plus(d_6);
//        System.out.println(ld_6);

        LocalDate ld_7 = LocalDate.of(2015, 5, 10);
        Duration d_7 = Duration.of(1,
                ChronoUnit.DAYS).of(1, ChronoUnit.HOURS).of(1, ChronoUnit.MINUTES).of(1, ChronoUnit.SECONDS);           // Attention !!!
        // java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Seconds
//        ld_7 = ld_7.plus(d_7);
//        System.out.println(ld_7);
    }
}
