package com.trl.variable.inheritance.access_modifer;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 23/8/19
 */
public class Test_2 {
    public static void main(String[] args) {
        A_A a_a = new A_A();
        A_A a = new B_B();
        B_B b = new B_B();

//        System.out.println(a.i);     // ERROR. private variable
//        System.out.println(a_a.i);     // ERROR. private variable
        System.out.println(b.i);     // NOT ERROR
//        System.out.println(((A_A)b).i);     // ERROR. private variable
    }
}

class A_A {
    private int i = 10;

    //    public int i = 10;
    public void f() {
    }

    public void g() {
    }
}

class B_B extends A_A {
    public int i = 20;

    public void g() {
    }
}