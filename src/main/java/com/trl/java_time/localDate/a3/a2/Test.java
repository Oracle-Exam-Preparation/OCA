package com.trl.java_time.localDate.a3.a2;

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
}

/*
Which of the following can be inserted into the blank to create a date of June 21, 2014? (Choose all that apply)

import java.time.*;
public class StartOfSummer {
    public static void main(String[] args) {
        LocalDate date = ____________________________
    }
}

A. new LocalDate(2014, 5, 21);
B. new LocalDate(2014, 6, 21);
C. LocalDate.of(2014, 5, 21);
D. LocalDate.of(2014, 6, 21);
E. LocalDate.of(2014, Calendar.JUNE, 21);
F. LocalDate.of(2014, Month.JUNE, 21);

D, F. Options A and B are incorrect because LocalDate does not have a public constructor. Option C is incorrect because
months start counting with 1 rather than 0. Option E is incorrect because it uses the old pre–Java 8 way of counting
months, again beginning with 0. Options D and F are both correct ways of specifying the desired date.
*/