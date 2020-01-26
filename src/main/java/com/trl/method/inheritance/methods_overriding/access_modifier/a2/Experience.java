package com.trl.method.inheritance.methods_overriding.access_modifier.a2;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 30/8/19
 */
public class Experience {
    public static void main(String[] args) {
//        B b = new B();
//        System.out.println(b.method());
    }
}

interface A {
    int method();
}

abstract class B implements A {
//    protected int method() {    // Compilation Exception. no se puede poner access modifier mas restrigido que de clase Parent
//        return 4;
//    }
}

class C extends B {
    // It's override method.
    public int method() {
        return 2;
    }

    // It's overloaded method. It's not override method.
    public int method(int length) {
        return 2;
    }
}