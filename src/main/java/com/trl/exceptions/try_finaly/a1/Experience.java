package com.trl.exceptions.try_finaly.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 14/8/19
 */
public class Experience {
    public static void main(String[] args) throws Exception {
        try {
            A.method_1();
        } finally {
            A.method_2();
        }
    }
}

class A {
    public static void method_1() throws A_Exception {
        throw new A_Exception();
    }

    public static void method_2() throws B_Exception {
        throw new B_Exception();
    }
}

class A_Exception extends Exception {
}

class B_Exception extends Exception {
}