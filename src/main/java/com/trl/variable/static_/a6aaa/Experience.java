package com.trl.variable.static_.a6aaa;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 6/8/19
 */
public class Experience {
    public static void main(String[] args) {
        System.out.println(A.age);

        A a = new A();
        System.out.println(a.age);

        System.out.println(A.age);
        new A();
        System.out.println(A.age);
    }
}

class A {
    public static int age = 0;

    public A() {
        age++;
    }
}