package com.trl.variable.inheritance.static_.a5;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 26/8/19
 */
public class Experience {}

class A {
    int thevalue = 0;
}

class B extends A {
    { int i = thevalue; }

    public static void main(String[] args) {
        B b = new B();
        int j = b.thevalue;
//        int l = thevalue;              // ERROR. variable no static no se permite usar dentro de un method statico
    }
}