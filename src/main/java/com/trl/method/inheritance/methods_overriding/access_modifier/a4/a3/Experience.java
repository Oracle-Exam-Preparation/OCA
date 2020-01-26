package com.trl.method.inheritance.methods_overriding.access_modifier.a4.a3;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 18/9/19
 */
public class Experience {
    public static void main(String[] args) {
        A a_b = new B();
//        a_b.method();                                                       // Compilation Exception !!!

        B b_b = new B();
        b_b.method();                                                         // Not Compilation Exception !!!
    }
}

class A {
    private void method() {
        System.out.println("A --> method()");
    }
}

class B extends A {
    protected void method() {
        System.out.println("B --> method()");
    }
}

