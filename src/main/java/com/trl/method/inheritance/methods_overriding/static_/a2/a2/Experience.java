package com.trl.method.inheritance.methods_overriding.static_.a2.a2;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 12/9/19
 */
public class Experience {
}

class A {
    public static Integer method() {
        System.out.println("A --> method()");
        return 0;
    }
}

class B extends A {
//    public Integer method() {                               // Compilation Exception !!! Cannot override "static method"
//        System.out.println("B --> method()");
//        return 0;
//    }
}