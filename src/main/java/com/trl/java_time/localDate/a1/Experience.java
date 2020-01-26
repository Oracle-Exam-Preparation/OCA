package com.trl.java_time.localDate.a1;

import java.time.LocalDate;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 12/8/19
 */
public class Experience {
    public static void main(String[] args) {
        // ========================================================================================================= DAY
        System.out.println(LocalDate.parse("2019-01-01"));                  // NOT ERROR
//        System.out.println(LocalDate.parse("2019-01-00"));                // ERROR
//        System.out.println(LocalDate.parse("2019-01-50"));                // ERROR

//        System.out.println(LocalDate.parse("2019-01-1"));                 // ERROR

        // ======================================================================================================= Month
//        System.out.println(LocalDate.parse("2019-00-01"));                // ERROR
//        System.out.println(LocalDate.parse("2019-13-01"));                // ERROR
        System.out.println(LocalDate.parse("2019-12-01"));                  // NOT ERROR

//        System.out.println(LocalDate.parse("2019-1-01"));                 // ERROR

        // ======================================================================================================== Year
//        System.out.println(LocalDate.parse("0-01-01"));                   // ERROR
//        System.out.println(LocalDate.parse("00-01-01"));                  // ERROR
//        System.out.println(LocalDate.parse("000-01-01"));                 // ERROR

        System.out.println(LocalDate.parse("0000-01-01"));                  // NOT ERROR
        System.out.println(LocalDate.parse("1000-01-01"));                  // NOT ERROR
        System.out.println(LocalDate.parse("3000-01-01"));                  // NOT ERROR
    }
}
