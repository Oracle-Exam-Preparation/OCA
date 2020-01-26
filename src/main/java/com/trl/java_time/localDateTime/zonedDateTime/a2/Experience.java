package com.trl.java_time.localDateTime.zonedDateTime.a2;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

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
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.of("US/Eastern"));
        System.out.println(zdt);

        ZonedDateTime zdt_2 = ZonedDateTime.of(ldt, ZoneId.of("Europe/Madrid"));
        System.out.println(zdt_2);
    }
}
