package com.trl.instanceof_;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 26/8/19
 */
public class Test_1 {
    public static void main(String[] args) {

        C c = new C();
        System.out.println(c instanceof A);
        System.out.println(c instanceof B);
        System.out.println(c instanceof C);

        System.out.println();
        A a = new C();
        System.out.println(a instanceof A);
        System.out.println(a instanceof B);
        System.out.println(a instanceof C);

        System.out.println();
        A a_2 = new B();
        System.out.println(a_2 instanceof A);
        System.out.println(a_2 instanceof B);
        System.out.println(a_2 instanceof C);

    }
}

class A {
}

class B extends A {
}

class C extends B {
}
