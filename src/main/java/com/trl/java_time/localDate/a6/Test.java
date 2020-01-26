package com.trl.java_time.localDate.a6;

import java.time.LocalDate;
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
        LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
        date.plusYears(1);
        date.plusMonths(1);
        date.plusDays(1);
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
    }
}

/*
What is the output of the following code?

LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
date.plusYears(1);
date.plusMonths(1);
date.plusDays(1);
System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());

A. 2018 APRIL 2
B. 2018 APRIL 30
C. 2018 MAY 2
D. 2021 APRIL 2
E. 2021 APRIL 30
F. 2021 MAY 2
G. A runtime exception is thrown.

B. The date starts out as April 30, 2018. Since dates are immutable and the plus methods have their return values
ignored, the result is unchanged. Therefore, option B is correct.
*/