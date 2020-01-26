package com.trl.java_time.localDate.dateTimeFormatter.formatStyle.a1;

import java.time.LocalDate;
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
        LocalDate date = LocalDate.of(2015, 05, 10);

        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(date));             // NOT ERROR
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(date));            // NOT ERROR
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(date));              // NOT ERROR
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(date));              // NOT ERROR

//        System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).format(date));           // ERROR
//        System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).format(date));          // ERROR
//        System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG).format(date));            // ERROR
//        System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL).format(date));            // ERROR

//        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(date));        // ERROR
//        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(date));       // ERROR
//        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).format(date));         // ERROR
//        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).format(date));         // ERROR
    }
}