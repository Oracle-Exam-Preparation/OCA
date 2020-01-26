package com.trl.constructor.a4;

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

    }
}

class Parent {
    int age;

    Parent(int age) {
        System.out.println("Parent(age)");
    }
}

class Child extends Parent {
    Child(int value) {
        super(0);   // llamada al constructor de padre simpre tiene que estar en primera linea del constructor hija.
        System.out.println("Child(int)");
    }
}