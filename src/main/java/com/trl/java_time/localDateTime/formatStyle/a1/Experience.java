package com.trl.java_time.localDateTime.formatStyle.a1;

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

        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));             // NOT ERROR
        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));            // NOT ERROR
//        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG)));            // ERROR
//        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL)));            // ERROR

        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));         // NOT ERROR
        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));        // NOT ERROR
//        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)));        // ERROR
//        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)));        // ERROR

        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));             // NOT ERROR
        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));            // NOT ERROR
        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));              // NOT ERROR
        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));              // NOT ERROR
    }
}