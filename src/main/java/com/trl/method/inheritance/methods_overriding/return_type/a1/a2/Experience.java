package com.trl.method.inheritance.methods_overriding.return_type.a1.a2;

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

class A {
    public Number method() {
        return 0;
    }
}

class B extends A {
    public Integer method() {                               // NOT compilation Exception.
        return 0;
    }
}