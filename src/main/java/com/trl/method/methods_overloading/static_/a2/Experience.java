package com.trl.method.methods_overloading.static_.a2;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 18/8/19
 */
public class Experience {
    public static void main(String[] args) {
        new A().method();
    }
}

class A {
    public static void method() {
        System.out.println("A --> static method()");
    }

//    public void sayHello() { System.out.println("A --> method()"); }
}
