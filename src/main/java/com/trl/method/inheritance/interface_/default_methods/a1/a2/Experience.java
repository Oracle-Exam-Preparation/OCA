package com.trl.method.inheritance.interface_.default_methods.a1.a2;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 17/9/19
 */
public class Experience {
    public static void main(String[] args) {
        A n = new A() {
            @Override
            public void method() {
                System.out.println("Hello");
            }
        };
        n.method();

        A a = (A) new B();
        a.method();

        B o = new B();
        o.method();
    }
}

interface A {
    default void method() {
        System.out.println("A --> method()");
    }
}

class B implements A {
    public void method() {
        System.out.println("B --> method()");
    }
}