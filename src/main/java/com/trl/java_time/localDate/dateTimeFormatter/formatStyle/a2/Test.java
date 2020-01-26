package com.trl.java_time.localDate.dateTimeFormatter.formatStyle.a2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

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
        LocalDate d = LocalDate.of(2015, 05, 10);
        Period p = Period.ofDays(1).ofYears(2);
        d = d.minus(p);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(f.format(d));
    }
}

/*
What is the output of the following code?

LocalDate d = LocalDate.of(2015, 5, 10);
Period p = Period.ofDays(1).ofYears(2);
d = d.minus(p);
DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
System.out.println(f.format(d));

A. 5/9/13 11:22 AM
B. 5/10/13
C. 5/9/14
D. 5/10/14
E. The code does not compile.
F. A runtime exception is thrown.

B. Period does not allow chaining. Only the last Period method called counts, so only the two years are subtracted.
*/