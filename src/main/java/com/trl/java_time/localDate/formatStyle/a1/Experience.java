package com.trl.java_time.localDate.formatStyle.a1;

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
        LocalDate date = LocalDate.of(2019, 01, 01);

        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));             // NOT ERROR
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));            // NOT ERROR
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));              // NOT ERROR
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));              // NOT ERROR

//        System.out.println(date.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));          // ERROR
//        System.out.println(date.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));         // ERROR
//        System.out.println(date.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG)));           // ERROR
//        System.out.println(date.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL)));           // ERROR

//        System.out.println(date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));       // ERROR
//        System.out.println(date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));      // ERROR
//        System.out.println(date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)));        // ERROR
//        System.out.println(date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)));        // ERROR
    }
}