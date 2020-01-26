package com.trl.method.inheritance.methods_overriding.exceptions_errors.a2.a1;

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

class Father {
    public void method() throws Exception {
        System.out.println("Father --> method()");
    }
}

class Child_A extends Father {
    public void method() throws RuntimeException {        // Not compilation exception.
        System.out.println("Child_A --> method()");
    }
}

class Child_B extends Father {
    public void method() {                                // Not compilation exception.
        System.out.println("Child_B --> method()");
    }
}