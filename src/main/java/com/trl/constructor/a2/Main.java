package com.trl.constructor.a2;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 13/07/19
 */
public class Main {
    public static void main(String[] args) {
        new Child();
        new Parent();
    }
}

class Parent {
    int value;
}

class Child extends Parent {
    int value;
}

// se compila sin errores.