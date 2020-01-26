package com.trl.method.methods_overloading.static_.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 1/9/19
 */
public class Experience {
}

class A {
    public static void method() { }

    // "Method Signature" is part of the method declaration.
    // It's the combination of the method name and the parameter list.
//    public void methodFinal() { }                      // Compilation Exception.

    public static void method(int i) { }

    public void method(String s) { }

    public static int method(int i, int c) {
        return 0;
    }
}