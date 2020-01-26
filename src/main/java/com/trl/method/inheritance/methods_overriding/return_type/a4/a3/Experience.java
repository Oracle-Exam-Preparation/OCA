package com.trl.method.inheritance.methods_overriding.return_type.a4.a3;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 20/8/19
 */
public class Experience {
}

class A {
    public Child method() {
        return new Child();
    }
}

class B extends A {
    // Compilation Exception.
//    @Override
//    public Grandfather method() {
//        return new Grandfather();
//    }
}

class C extends A {
    // Compilation Exception.
//    @Override
//    public Father method() {
//        return new Father();
//    }
}

class D extends A {
    @Override
    public Child method() {
        return new Child();
    }
}

class Grandfather {
}

class Father extends Grandfather {
}

class Child extends Father {
}