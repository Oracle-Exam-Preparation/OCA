package com.trl.constructor.inheritance.a2;

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

//        new Child(0,0);   // COMPILE ERROR
        // Clase "Child"(Hija) no herede constructores de clase "Parent"(Padre). Cada objeto tiene sus propios constructores.

    }

}

class Parent {

    Parent() {
        System.out.println("Parent()");
    }

    Parent(int value_1, int value_2) {
        System.out.println("Parent(int, int)");
    }

}

class Child extends Parent {

    Child() {
        System.out.println("Child()");
    }

    Child(int value) {
        System.out.println("Child(int)");
    }

}