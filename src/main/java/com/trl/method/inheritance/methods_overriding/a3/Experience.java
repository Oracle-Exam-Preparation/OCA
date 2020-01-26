package com.trl.method.inheritance.methods_overriding.a3;

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
        Parent p_p = new Parent();
        Parent p_c = new Child();
        Child c_c = new Child();
        send(p_p);
        send(p_c);
        send(c_c);
    }
    public static void send(Parent msg) {
        msg.call();
    }
}

class Parent {
    void call() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    void call() {
        System.out.println("Child");
    }
}