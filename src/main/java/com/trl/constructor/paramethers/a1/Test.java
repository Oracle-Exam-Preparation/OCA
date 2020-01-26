package com.trl.constructor.paramethers.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 11/9/19
 */
public class Test {
}

/*
Which of the following are true about the following code? (Choose all that apply)

public class Create {
    Create() {
        System.out.print("1 ");
    }
    Create(int num) {
        System.out.print("2 ");
    }
    Create(Integer num) {
        System.out.print("3 ");
    }
    Create(Object num) {
        System.out.print("4 ");
    }
    Create(int... nums) {
        System.out.print("5 ");
    }
    public static void main(String[] args) {
        new Create(100);
        new Create(1000L);
    }
}

A. The code prints out 2 4.
B. The code prints out 3 4.
C. The code prints out 4 2.
D. The code prints out 4 4.
E. The code prints 3 4 if you remove the constructor Create(int num).
F. The code prints 4 4 if you remove the constructor Create(int num).
G. The code prints 5 4 if you remove the constructor Create(int num).

A, E. The 100 parameter is an int and so calls the matching int constructor. When this constructor is removed, Java looks
for the next most specific constructor. Java prefers autoboxing to varargs, and so chooses the Integer constructor. The
100L parameter is a long . Since it can’t be converted into a smaller type, it is autoboxed into a Long and then the
constructor for Object is called.
*/

class Create {
    Create() {
        System.out.print("1 ");
    }
    Create(int num) {
        System.out.print("2 ");
    }
    Create(Integer num) {
        System.out.print("3 ");
    }
    Create(Object num) {
        System.out.print("4 ");
    }
    Create(int... nums) {
        System.out.print("5 ");
    }
    public static void main(String[] args) {
        new Create(100);
        new Create(1000L);
    }
}