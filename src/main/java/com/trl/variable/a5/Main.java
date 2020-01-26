package com.trl.variable.a5;

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
        // si la variable de padre y variable de hija tienen un variable cual tiene mismo nombre en clase padre y en clase hija.
        // al variable de hija se puede llama, pero con enlace de tipo clase hija no se puede llama variable de clase padre.
        System.out.println("child.value = " + child.value);
        // para poder llama la variable de la calse pader hace falta hacer casting enlace de hija al clase de tipo padre.
        System.out.println("((Parent)child).value = " + ((Parent) child).value);
    }
}

class Parent {
    int value;
    public Parent(int vale) {
        this.value = vale;
    }
}

class Child extends Parent {
    int value;
    public Child(int vale) {
        super(vale);
    }
    public Child(int vale_1, int value_2) {
        super(vale_1);
        this.value = value_2;
    }
}