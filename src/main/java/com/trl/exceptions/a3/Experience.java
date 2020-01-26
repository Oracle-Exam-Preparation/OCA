package com.trl.exceptions.a3;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 12/8/19
 */
public class Experience {
    public static void main(String[] args) {
        A a_b = new B();
//        a_b.method();                                                // Compilation Exception !!!
        ((B) a_b).method();                                            // Not Compilation Exception !!!

        B b_b = new B();
        b_b.method();                                                  // Not Compilation Exception !!!
    }
}

class A {
    protected void method() throws Exception {
    }
}

class B extends A {
    @Override
    public void method() {
    }
}
