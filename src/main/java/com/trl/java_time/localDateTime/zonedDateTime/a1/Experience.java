package com.trl.java_time.localDateTime.zonedDateTime.a1;

import java.time.*;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 28/9/19
 */
public class Experience {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2019, 9, 10, 1, 1, 1);
        ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.of("US/Eastern"));
        zdt = zdt.plus(Duration.ofDays(1));
        System.out.println(zdt);

        ZonedDateTime zdt2 = ZonedDateTime.of(ldt, ZoneId.of("US/Eastern"));
        zdt2 = zdt2.plus(Period.ofDays(1));
        System.out.println(zdt2);
    }
}
