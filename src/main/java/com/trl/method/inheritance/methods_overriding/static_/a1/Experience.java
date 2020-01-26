package com.trl.method.inheritance.methods_overriding.static_.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 21/07/19
 */
public class Experience {
    public static void main(String[] args) {
        A a_a = new A();
        a_a.methodNotStatic_2();
        a_a.methodStatic_1();
        A.methodStatic_1();
        System.out.println("========================");

        A a_b = new B();
        a_b.methodNotStatic_2();
        a_b.methodStatic_1();
//        a_b.methodStatic_3();                               // Compilation Exception !!!
        B.methodStatic_1();
        B.methodStatic_3();
        System.out.println("========================");

        B b_b = new B();
        b_b.methodNotStatic_2();
        b_b.methodStatic_1();
        b_b.methodStatic_3();
        B.methodStatic_1();
        B.methodStatic_3();

    }
}

class A {
    public static void methodStatic_1() {
        System.out.println("A --> methodStatic_1()");
    }

    public void methodNotStatic_2() {
        System.out.println("A --> methodNotStatic_2()");
    }
}

class B extends A {
    public static void methodStatic_1() {
        System.out.println("B --> methodStatic_1");
    }

    public void methodNotStatic_2() {
        System.out.println("B --> methodNotStatic_2");
    }

    public static void methodStatic_3() {
        System.out.println("B --> methodStatic_3");
    }

    public static void test_MethodStatic() {
        A.methodStatic_1();
        methodStatic_1();
        methodStatic_3();
//        methodNotStatic_2();                 // COMPILATION ERROR. Is not allowed calling "not static method" inside the "static method".
    }

    public void test_MethodNotStatic() {
        A.methodStatic_1();
        methodStatic_1();
        methodStatic_3();
        methodNotStatic_2();
    }
}