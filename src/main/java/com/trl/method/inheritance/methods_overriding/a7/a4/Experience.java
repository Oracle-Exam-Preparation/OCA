package com.trl.method.inheritance.methods_overriding.a7.a4;

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
        send(new Child());
    }

    public static void send(Parent msg) {
//        msg.call();                                                   // Compilation Exception !!!
    }

    public static void send(Child msg) {
        msg.method();
    }
}

class Parent {
}

class Child extends Parent {
    static void method() {
        System.out.println("Child");
    }
}
