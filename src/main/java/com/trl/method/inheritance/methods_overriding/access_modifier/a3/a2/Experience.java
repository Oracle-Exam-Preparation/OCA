package com.trl.method.inheritance.methods_overriding.access_modifier.a3.a2;

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

class Parent {
    public void method() {
        System.out.println("Parent.");
    }
}

class Child extends Parent {
//    protected void method() {                           // Compilation Exception !!!
//        System.out.println("Child.");
//    }
}

