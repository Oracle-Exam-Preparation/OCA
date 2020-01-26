package com.trl.constructor.a3;

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
        new Child(3);
    }
}

class Parent {
    int value_1;

    public Parent(int vale) {
        this.value_1 = vale;
    }
}

class Child extends Parent {
    int value_2;

    // clase hija esta obligado tener este constructor. si parent no tiene constructoru por defedcto, la clase hija esta
    // obligada llamar algun de los definidos constructores de clase padre
    public Child(int vale) {
        super(vale);
    }

    public Child(int vale_1, int value_2) {
        super(vale_1);
        this.value_2 = value_2;
    }
}