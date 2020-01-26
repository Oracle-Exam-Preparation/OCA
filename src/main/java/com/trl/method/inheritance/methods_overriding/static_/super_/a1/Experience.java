package com.trl.method.inheritance.methods_overriding.static_.super_.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 21/07/19
 */
public class Experience {}

class A {
    public void method() {
        System.out.println("Class Mid. Method findMind()");
    }
}

class B extends A {
    public static void methodStatic(String[] args) {
        // COMPILATION Exception. Keyword "super" not allowed use inside the "static method".
//        super.method();

        // COMPILATION Exception. Is not allowed calling "not static method" inside the "static method".
//        method();
    }

    public void methodNotStatic() {
        super.method();
        method();
    }
}