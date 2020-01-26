package com.trl.method.inheritance.methods_overriding.a7.a3;

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
        send(new Parent());
    }

    public static void send(Parent msg) {
        msg.method();
    }
}

class Parent {
    static void method() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
//    void method() {                                                  // Compilation Exception !!!
//        System.out.println("Child");
//    }
}
