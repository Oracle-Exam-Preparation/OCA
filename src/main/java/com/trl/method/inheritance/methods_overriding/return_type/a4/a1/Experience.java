package com.trl.method.inheritance.methods_overriding.return_type.a4.a1;

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
    public Grandfather method() {
        return new Grandfather();
    }
}

class B extends A {
    @Override
    public Grandfather method() {
        return new Grandfather();
    }
}

class C extends A {
    @Override
    public Father method() {
        return new Father();
    }
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