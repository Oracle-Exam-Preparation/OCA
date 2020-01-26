package com.trl.exceptions.a21.a2;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 21/9/19
 */
public class Experience {
}

class A extends Exception {
}

class B extends RuntimeException {
}

interface C {
    void roar() throws A;
}

class D_1 implements C {
    @Override
    public void roar() {
    }
}

//class D_2 implements C {
//    @Override
//    public void roar() throws Exception {                                   // Compilation Exception !!!
//    }
//}

class D_3 implements C {
    @Override
    public void roar() throws A {
    }
}

class D_4 implements C {
    @Override
    public void roar() throws IllegalArgumentException {
    }
}

class D_5 implements C {
    @Override
    public void roar() throws B {
    }
}

