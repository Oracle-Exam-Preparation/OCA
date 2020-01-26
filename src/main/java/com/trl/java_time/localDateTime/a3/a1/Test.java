package com.trl.java_time.localDateTime.a3.a1;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 4/9/19
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.of(2015, Calendar.APRIL, 1, 01, 01, 01));    // A
        System.out.println(LocalDateTime.of(2015, Month.APRIL, 1, 01, 01, 01));       // B
        System.out.println(LocalDateTime.of(2015, 3, 1, 01, 01, 01));          // C
        System.out.println(LocalDateTime.of(2015, 4, 1, 01, 01, 01));          // D
//        System.out.println(new LocalDateTime(2015, 3, 1, 01, 01, 01));                                                     // E    ERROR
//        System.out.println(new LocalDateTime(2015, 4, 1, 01, 01, 01));                                                     // F    ERROR
    }
}

/*
Which of the following print out a date representing April 1, 2015? (Choose all that apply)

A. System.out.println(LocalDateTime.of(2015, Calendar.APRIL, 1, 01, 01, 01));
B. System.out.println(LocalDateTime.of(2015, Month.APRIL, 1, 01, 01, 01));
C. System.out.println(LocalDateTime.of(2015, 3, 1, 01, 01, 01));
D. System.out.println(LocalDateTime.of(2015, 4, 1, 01, 01, 01));
E. System.out.println(new LocalDateTime(2015, 3, 1, 01, 01, 01));
F. System.out.println(new LocalDateTime(2015, 4, 1, 01, 01, 01));

B, D. The new date APIs added in Java 8 use static methods rather than a constructor to create a new date, making
options E and F incorrect. The months are indexed starting with 1 in these APIs, making options A and C incorrect.
Option A uses the old Calendar constants which are indexed from 0. Therefore, options B and D are correct.
*/
