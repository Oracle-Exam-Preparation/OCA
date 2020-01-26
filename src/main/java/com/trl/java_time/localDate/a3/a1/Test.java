package com.trl.java_time.localDate.a3.a1;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

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
        System.out.println(LocalDate.of(2015, Calendar.APRIL, 1));          // A
        System.out.println(LocalDate.of(2015, Month.APRIL, 1));             // B
        System.out.println(LocalDate.of(2015, 3, 1));                // C
        System.out.println(LocalDate.of(2015, 4, 1));                // D
//        System.out.println(new LocalDate(2015, 3, 1));               // E    ERROR
//        System.out.println(new LocalDate(2015, 4, 1));               // F    ERROR
    }
}

/*
Which of the following print out a date representing April 1, 2015? (Choose all that apply)

A. System.out.println(LocalDate.of(2015, Calendar.APRIL, 1));
B. System.out.println(LocalDate.of(2015, Month.APRIL, 1));
C. System.out.println(LocalDate.of(2015, 3, 1));
D. System.out.println(LocalDate.of(2015, 4, 1));
E. System.out.println(new LocalDate(2015, 3, 1));
F. System.out.println(new LocalDate(2015, 4, 1));

B, D. The new date APIs added in Java 8 use static methods rather than a constructor to create a new date, making
options E and F incorrect. The months are indexed starting with 1 in these APIs, making options A and C incorrect.
Option A uses the old Calendar constants which are indexed from 0. Therefore, options B and D are correct.
*/
