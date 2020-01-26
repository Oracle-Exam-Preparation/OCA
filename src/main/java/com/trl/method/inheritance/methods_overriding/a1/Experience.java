package com.trl.method.inheritance.methods_overriding.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 13/07/19
 */
public class Experience {
    public static void main(String[] args) {
        Parent p_1 = new Parent();
        Parent p_2 = new Child();
        Child p_3 = new Child();

        p_1.pvm();
        p_2.pvm();
        p_3.pvm();
    }
}

class Parent {
    public void pvm() {
        System.out.println("Parent method ---> public void pvm()");
    }
}

class Child extends Parent {
    public void pvm() {
        System.out.println("Child method ---> public void pvm()");
    }
}
