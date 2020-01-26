package com.trl.java_time.localDateTime.a3.a2;

import java.time.LocalDateTime;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 8/9/19
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.of(2014, 6, 21, 01, 01, 01));

    }
}

/*
Which of the following can be inserted into the blank to create a date of 2014-06-21T01:01:01? (Choose all that apply)

import java.time.*;
public class StartOfSummer {
    public static void main(String[] args) {
        LocalDateTime date = ____________________________
    }
}

A. new LocalDateTime(2014, 5, 21, 01, 01, 01);
B. new LocalDateTime(2014, 6, 21, 01, 01, 01);
C. LocalDateTime.of(2014, 5, 21, 01, 01, 01);
D. LocalDateTime.of(2014, 6, 21, 01, 01, 01);
E. LocalDateTime.of(2014, Calendar.JUNE, 21, 01, 01, 01);
F. LocalDateTime.of(2014, Month.JUNE, 21, 01, 01, 01);

D, F. Options A and B are incorrect because LocalDate does not have a public constructor. Option C is incorrect because
months start counting with 1 rather than 0. Option E is incorrect because it uses the old pre–Java 8 way of counting
months, again beginning with 0. Options D and F are both correct ways of specifying the desired date.
*/