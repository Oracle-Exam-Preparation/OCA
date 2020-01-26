package com.trl.method.inheritance.methods_overriding.a8;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 25/9/19
 */
public class Experience {
    public static void main(String args[]) {
        B b_c = new C();
        System.out.println(b_c.method(10, 100));
    }
}

class A {
    int method(int a, int b) {
        if (a > b) return a;
        else return b;
    }
}

class B extends A {
    int method(int a, int b) {
        return 2 * super.method(a, b);
    }
}

class C extends B {
    int method(int a, int b) {
        return super.method(2 * a, 2 * b);
    }
}