package com.trl.inheritance.a2;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 23/8/19
 */
public class Test {
    public static void main(String args[]) {
        Parent parent = new Parent();
        Child child = new Child();
        parent = child;

        Parent parentA = new Parent();
        Child childA = new Child();
//        childA = parentA;            // COMPILATION ERROR. Object de tipo Parent no puede tener enlace de tipo Child.

        Parent parentB = new Parent();
        Child childB = new Child();
        parentB = (Child) childB;      // No es obligatorio hacer casting.

        Parent parentC = new Child();
        Child childC = new Child();
        childC = (Child) parent;      // En este caso es obligatorio hacer casting.

        Parent parentD = new Parent();
        Child childD = new Child();
        // RunTimeException --> java.lang.ClassCastException.
        // Enlace es de tipo Parent, pero Objeto tiene que ser de tipo Child si no, va saltar Exception.
        childD = (Child) parentD;
    }
}

class Parent {
}

class Child extends Parent {
}