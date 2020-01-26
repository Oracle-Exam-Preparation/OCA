package com.trl.method.inheritance.methods_overriding.a7.a2;

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
        method_A(new Child());
        method_B(new Child());
        System.out.println();

        method_A(new Parent());
//        send_2(new Parent());                                       // Compilation Exception !!!
    }

    public static void method_A(Parent msg) {
        msg.method();
    }

    public static void method_B(Child msg) {
        msg.method();
    }
}

class Parent {
    static void method() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
}
