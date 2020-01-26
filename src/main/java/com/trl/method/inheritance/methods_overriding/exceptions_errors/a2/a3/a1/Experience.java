package com.trl.method.inheritance.methods_overriding.exceptions_errors.a2.a3.a1;

import java.io.IOException;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 13/9/19
 */
public class Experience {
}

class Parent {
    public void method() throws IOException {
        System.out.println("Parent --> method()");
    }
}

class Child_A extends Parent {
//    public void method() throws Exception {        // Compilation exception.
//        System.out.println("Child_A --> method()");
//    }
}

class Child_B extends Parent {
    public void method() throws RuntimeException {        // Not compilation exception.
        System.out.println("Child_B --> method()");
    }
}