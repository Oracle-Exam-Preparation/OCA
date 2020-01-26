package com.trl.exceptions.try_catch_finaly.a2;

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
        } catch (Exception e) {
            A.method_2();
        }finally {
            A.method_3();
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

    public static void method_3() throws C_Exception {
        throw new C_Exception();
    }
}

class A_Exception extends Exception {
}

class B_Exception extends Exception {
}

class C_Exception extends Exception {
}