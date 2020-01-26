package com.trl.java_time.localDateTime.a1;

import java.time.LocalDateTime;

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
//        System.out.println(LocalDateTime.parse("2019-09-10"));                // ERROR

//        System.out.println(LocalDateTime.parse("2019-09-10T"));               // ERROR

//        System.out.println(LocalDateTime.parse("2019-09-10 00:00:00"));       // ERROR

//        System.out.println(LocalDateTime.parse("2019-09-10T0:0:0"));          // ERROR
//        System.out.println(LocalDateTime.parse("2019-09-10T00:0:0"));         // ERROR
//        System.out.println(LocalDateTime.parse("2019-09-10T00:00:0"));        // ERROR
        System.out.println(LocalDateTime.parse("2019-09-10T00:00:00"));         // NOT ERROR

//        System.out.println(LocalDateTime.parse("2019-09-10T00"));             // ERROR
        System.out.println(LocalDateTime.parse("2019-09-10T00:00"));            // NOT ERROR

        System.out.println(LocalDateTime.parse("2019-09-10T10:33:44"));         //NOT ERROR

//        System.out.println(LocalDateTime.parse("2019-09-10T25:00:00"));       // ERROR
//        System.out.println(LocalDateTime.parse("2019-09-10T00:61:00"));       // ERROR
//        System.out.println(LocalDateTime.parse("2019-09-10T00:00:61"));       // ERROR

//        System.out.println(LocalDateTime.parse("2019-09-10T24:00:00"));       // ERROR
//        System.out.println(LocalDateTime.parse("2019-09-10T00:60:00"));       // ERROR
//        System.out.println(LocalDateTime.parse("2019-09-10T00:00:60"));       // ERROR
//
        System.out.println(LocalDateTime.parse("2019-09-10T23:00:00"));         // NOT ERROR
        System.out.println(LocalDateTime.parse("2019-09-10T00:59:00"));         // NOT ERROR
        System.out.println(LocalDateTime.parse("2019-09-10T00:00:59"));         // NOT ERROR

    }
}
