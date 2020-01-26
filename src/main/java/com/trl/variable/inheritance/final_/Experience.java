package com.trl.variable.inheritance.final_;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 23/8/19
 */
public class Experience {
    public static void main(String[] args) {
        B b = new B();
        b.fi = 20;
//        ((A)b).fi = 20;                                                  // ERROR not permitted change final variable.
        System.out.println(b.fi);
        System.out.println(((A) b).fi);
    }
}

class A {
    final int fi = 10;
}

class B extends A {
    int fi = 15;
}