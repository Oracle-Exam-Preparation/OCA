package com.trl.method.inheritance.methods_overriding.return_type.a3.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 7/8/19
 */
public class Experience {

}

class A {
    public int method(int a, int b, float c) {
        return 0;
    }
}

class AA {
    public short method(int a, int b, float c) {
        return 0;
    }
}

class B extends A {
    @Override
    public int method(int a, int b, float c) {
        return super.method(a, b, c);
    }
}

class C extends A {
//    @Override
//    public float method(int a, int b, float c) {                               // Compilation Exception !!!
//        return super.method(a, b, c);
//    }
}

class D extends A {
//    @Override
//    public Integer method(int a, int b, float c) {                             // Compilation Exception !!!
//        return super.method(a, b, c);
//    }
}

class E extends A {
//    @Override
//    public short method(int a, int b, float c) {                              // Compilation Exception !!!
//        return super.method(a, b, c);
//    }
}

class F extends AA {
//    @Override
//    public int method(int a, int b, float c) {                                // Compilation Exception !!!
//        return super.method(a, b, c);
//    }
}