package com.trl.variable.a6;

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
        Child child = new Child(3, 4);
        // si variables de clase padre y de clase hija tienen diferentes nombres se permite llamar las variables con
        // tipo de enlase hija.
        System.out.println("child.value_C = " + child.value_C);
        System.out.println("child.value_P = " + child.value_P);
        // tambien se puede llamar de esta forma, primero castear enlace al tipo de padre y luego llama variable de padre, pero es redundante.
        System.out.println("((Parent)child).value = " + ((Parent) child).value_P);
    }
}

class Parent {
    int value_P;
    public Parent(int vale) {
        this.value_P = vale;
    }
}

class Child extends Parent {
    int value_C;
    public Child(int vale) {
        super(vale);
    }
    public Child(int vale_1, int value_2) {
        super(vale_1);
        this.value_C = value_2;
    }
}