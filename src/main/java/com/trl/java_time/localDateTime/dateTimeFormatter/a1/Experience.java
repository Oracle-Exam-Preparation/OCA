package com.trl.java_time.localDateTime.dateTimeFormatter.a1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 12/8/19
 */
public class Experience {
    public static void main(String[] args) {
        LocalDateTime greatDay = LocalDateTime.parse("2019-01-01T01:01:01");

        System.out.println(greatDay.format(DateTimeFormatter.ISO_TIME));                    // NOT ERROR

        System.out.println(greatDay.format(DateTimeFormatter.ISO_DATE));                    // NOT ERROR

        System.out.println(greatDay.format(DateTimeFormatter.ISO_DATE_TIME));               // NOT ERROR

        System.out.println(greatDay.format(DateTimeFormatter.ISO_LOCAL_TIME));              // NOT ERROR

        System.out.println(greatDay.format(DateTimeFormatter.ISO_LOCAL_DATE));              // NOT ERROR

        System.out.println(greatDay.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));         // NOT ERROR

        System.out.println(greatDay.format(DateTimeFormatter.ISO_ORDINAL_DATE));            // NOT ERROR

        System.out.println(greatDay.format(DateTimeFormatter.ISO_WEEK_DATE));               // NOT ERROR

        System.out.println(greatDay.format(DateTimeFormatter.BASIC_ISO_DATE));              // NOT ERROR

//        System.out.println(greatDay.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));       // ERROR

//        System.out.println(greatDay.format(DateTimeFormatter.ISO_INSTANT));               // ERROR

//        System.out.println(greatDay.format(DateTimeFormatter.ISO_OFFSET_DATE));           // ERROR
//        System.out.println(greatDay.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));      // ERROR
//        System.out.println(greatDay.format(DateTimeFormatter.ISO_OFFSET_TIME));           // ERROR

//        System.out.println(greatDay.format(DateTimeFormatter.RFC_1123_DATE_TIME));        // ERROR
    }
}
