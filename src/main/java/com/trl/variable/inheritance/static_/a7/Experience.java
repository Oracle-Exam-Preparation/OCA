package com.trl.variable.inheritance.static_.a7;

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

class B extends A {
    public static void main(String[] args) {
        B s = new B();
        int j = s.value;
        // Compilatio Exception. variabele no static no se permite usar dentro de un methodo estatic.
//        int l = value;
    }
}

abstract class A {
    int value = 0;
}