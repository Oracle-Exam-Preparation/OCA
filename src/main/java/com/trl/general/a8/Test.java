package com.trl.general.a8;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 10/9/19
 */
public class Test {
}

/*
Given the following my.school.ClassRoom and my.city.School class definitions, which line numbers in main() generate a
compiler error? (Choose all that apply)

1: package my.school;
2: public class Classroom {
3:     private int roomNumber;
4:     protected String teacherName;
5:     static int globalKey = 54321;
6:     public int floor = 3;
7:     Classroom(int r, String t) {
8:         roomNumber = r;
9:         teacherName = t; } }

1: package my.city;
2: import my.school.*;
3: public class School {
4:     public static void main(String[] args) {
5:         System.out.println(Classroom.globalKey);
6:         Classroom room = new Classroom(101, ""Mrs. Anderson");
7:         System.out.println(room.roomNumber);
8:         System.out.println(room.floor);
9:         System.out.println(room.teacherName); } }

A. None, the code compiles fine.
B. Line 5
C. Line 6
D. Line 7
E. Line 8
F. Line 9

B, C, D, F. The two classes are in different packages, which means private access and default (package private) access
will not compile. Additionally, protected access will not compile since School does not inherit from Classroom. Therefore,
only line 8 will compile because it uses public access.

Este test tiene error, enlace de tipo Classroom esta mal creada, y por esta razon no se puede llamar al ningun variable de la clase.
*/