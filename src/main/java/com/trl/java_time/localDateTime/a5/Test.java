package com.trl.java_time.localDateTime.a5;

import java.time.LocalDateTime;
import java.time.Month;

/**
 * This test is taken from the book:         OCA: Oracle ®
 *                                     Certified Associate Java ®
 *                                         SE 8 Programmer I
 *                                            Study Guide
 *                                            Exam 1Z0-808
 *
 * @link www.oreilly.com/library/view/oca-oracle-certified/9781118957424/
 */
public class Test {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2018, Month.APRIL, 30, 01, 01, 01);
        dateTime.plusYears(1);
        dateTime.plusMonths(1);
        dateTime.plusDays(1);
        dateTime.plusHours(1);
        dateTime.plusMinutes(1);
        dateTime.plusSeconds(1);

        System.out.println(dateTime.getYear() + " " + dateTime.getMonth() + " " + dateTime.getDayOfMonth() + " " +
                dateTime.getHour() + " " + dateTime.getMinute() + " " + dateTime.getSecond());
    }
}

/*
What is the output of the following code?

LocalDateTime dateTime = LocalDateTime.of(2018, Month.APRIL, 30, 01, 01, 01);
dateTime.plusYears(1);
dateTime.plusMonths(1);
dateTime.plusDays(1);
dateTime.plusHours(1);
dateTime.plusMinutes(1);
dateTime.plusSeconds(1);
System.out.println(dateTime.getYear() + " " + dateTime.getMonth() + " " + dateTime.getDayOfMonth() + " " +
                dateTime.getHour() + " " + dateTime.getMinute() + " " + dateTime.getSecond());

A. 2018 APRIL 2 2 2 2
B. 2018 APRIL 30 1 1 1
C. 2018 MAY 2 2 2 2
D. 2021 APRIL 2 1 2 1
E. 2021 APRIL 30 2 2 2
F. 2021 MAY 2 1 1 2
G. A runtime exception is thrown.

B. The date starts out as April 30, 2018. Since dates are immutable and the plus methods have their return values
ignored, the result is unchanged. Therefore, option B is correct.
*/