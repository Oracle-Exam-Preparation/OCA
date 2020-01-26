package com.trl.java_time.localDateTime.a4;

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
        LocalDateTime dateTime = LocalDateTime.of(2018, Month.APRIL, 40, 01, 01, 01);
        System.out.println(dateTime.getYear() + " " + dateTime.getMonth() + " " + dateTime.getDayOfMonth() + " " +
                dateTime.getHour() + " " + dateTime.getMinute() + " " + dateTime.getSecond());
    }
}

/*
What is the output of the following code?

LocalDateTime date = LocalDateTime.of(2018, Month.APRIL, 40, 01, 01, 01);
System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());

A. 2018 APRIL 4 1 1 1
B. 2018 APRIL 30 1 1 1
C. 2018 MAY 10 1 1 1
D. Another date.
E. The code does not compile.
F. A runtime exception is thrown.

F. Java throws an exception if invalid date values are passed. There is no 40th day in April—or any other month for that matter.
*/