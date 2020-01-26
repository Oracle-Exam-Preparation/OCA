package com.trl.method.inheritance.methods_overriding.exceptions_errors.a2.a2;

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
    public void method() {
        System.out.println("Parent --> method()");
    }
}

class Child_A extends Parent {
    // Not compilation exception. Overridden method does not throw Exception. But overridden method allow throw "unchecked exceptions"
    public void method() throws RuntimeException {
        System.out.println("Child_A --> method()");
    }
}

class Child_B extends Parent {
    // Compilation exception. Overridden method does not throw Exception. Thus and so overridden method does not
    // allow throw "checked exceptions"
//    public void method() throws Exception{
//        System.out.println("Child_B --> method()");
//    }
}