package com.trl.method.inheritance.methods_overriding.exceptions_errors.a2.a3.a3;

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
    public void method() throws A_Exception {
        System.out.println("Parent --> method()");
    }
}

class Child_A extends Parent {
    public void method() throws ClassCastException {         // Not compilation exception.
        System.out.println("Child_A --> method()");
    }
}

class Child_B extends Parent {
    public void method() throws ArithmeticException {        // Not compilation exception.
        System.out.println("Child_B --> method()");
    }
}

class Child_C extends Parent {
//    public void method() throws Exception {                      // Compilation exception.
//        System.out.println("Child_C --> method()");
//    }
}

class Child_D extends Parent {
//    public void method() throws IOException {                    // Compilation exception.
//        System.out.println("Child_D --> method()");
//    }
}

class Child_E extends Parent {
    public void method() throws RuntimeException {               // Not Compilation exception.
        System.out.println("Child_D --> method()");
    }
}

class Child_F extends Parent {
//    public void method() throws SQLException {               // Compilation exception.
//        System.out.println("Child_D --> method()");
//    }
}

class A_Exception extends Exception { }