package com.trl.java_time.localDateTime.dateTimeFormatter.formatStyle.a1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 8/9/19
 */
public class Experience {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2019, 01, 01, 01, 01, 01);

        System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).format(dateTime));             // NOT ERROR
        System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).format(dateTime));            // NOT ERROR
//        System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG).format(dateTime));            // ERROR
//        System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL).format(dateTime));            // ERROR

        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(dateTime));         // NOT ERROR
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(dateTime));        // NOT ERROR
//        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).format(dateTime));        // ERROR
//        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).format(dateTime));        // ERROR

        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(dateTime));             // NOT ERROR
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(dateTime));            // NOT ERROR
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(dateTime));              // NOT ERROR
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(dateTime));              // NOT ERROR
    }
}