package com.trl.java_time.localDateTime.duration.a1;

import java.time.Duration;
import java.time.LocalDateTime;

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
        LocalDateTime ldt = LocalDateTime.of(2015, 5, 10, 10,1, 1);
        Duration d = Duration.ofDays(1);
        ldt = ldt.plus(d);
        System.out.println(ldt);

        LocalDateTime ldt_2 = LocalDateTime.of(2015, 5, 10, 10,1, 1);
        Duration d_2 = Duration.ofHours(1);
        ldt_2 = ldt_2.plus(d_2);
        System.out.println(ldt_2);

        LocalDateTime ldt_3 = LocalDateTime.of(2015, 5, 10, 10,1, 1);
        Duration d_3 = Duration.ofMinutes(1);
        ldt_3 = ldt_3.plus(d_3);
        System.out.println(ldt_3);

        LocalDateTime ldt_4 = LocalDateTime.of(2015, 5, 10, 10,1, 1);
        Duration d_4 = Duration.ofSeconds(1);
        ldt_4 = ldt_4.plus(d_4);
        System.out.println(ldt_4);

        LocalDateTime ldt_5 = LocalDateTime.of(2015, 5, 10, 10,1, 1);
        Duration d_5 = Duration.ofMillis(1);
        ldt_5 = ldt_5.plus(d_5);
        System.out.println(ldt_5);

        LocalDateTime ldt_6 = LocalDateTime.of(2015, 5, 10, 10,1, 1);
        Duration d_6 = Duration.ofNanos(1);
        ldt_6 = ldt_6.plus(d_6);
        System.out.println(ldt_6);

        LocalDateTime ldt_7 = LocalDateTime.of(2015, 5, 10, 10,1, 1);
        Duration d_7 = Duration.ofDays(1).ofHours(1).ofMinutes(1).ofSeconds(1);           // Attention !!!
        ldt_7 = ldt_7.plus(d_7);
        System.out.println(ldt_7);
    }
}
