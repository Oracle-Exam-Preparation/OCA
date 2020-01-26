package com.trl.variable.inheritance.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 17/8/19
 */

public class Experience {
    public static void main(String[] args) {
        A a_a = new A();
        System.out.println(a_a.h);
        System.out.println("==================");

        A a_b = new B();
        System.out.println(a_b.h);
        System.out.println("==================");

        B a_b_2 = (B) a_b;
        System.out.println(a_b_2.h);
        System.out.println("==================");

        B b_b = new B();
        System.out.println(b_b.h);
        System.out.println("==================");

    }
}

class A {
    public int h = 4;
}

class B extends A {
    public int h = 44;
}
