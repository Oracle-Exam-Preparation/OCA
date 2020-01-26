package com.trl.constructor;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 22/8/19
 */
public class Test {
    public static void main(String args[]) {
        A a, b;
        a = new A();
//        b = new A(5L);       // ERROR. Class A not have constructor with parameter long
    }
}


class A {
    long l1;

    public void A(long pLong) {       // Its not constructor, its method.
        l1 = pLong;
    }
}
