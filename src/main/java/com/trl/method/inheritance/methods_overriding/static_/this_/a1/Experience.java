package com.trl.method.inheritance.methods_overriding.static_.this_.a1;

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
    public static void methodStatic(String[] args) {
        // COMPILATION ERROR. Keyword "this" not allowed use inside the "static method".
//        this.method();

        // COMPILATION ERROR. Is not allowed calling "not static method" inside the "static method".
//        method();
    }

    public void methodNotStatic() {
        this.method();
        method();
    }

    public void method() {
        System.out.println("A --> method()");
    }
}