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
public class Test_3 {
    public static void main(String[] args) {
        A_1 a = new A_1();//1
        A_1 b = new B_1();//2
        B_1 b_b = new B_1();//2

        System.out.println(a.i);     // NOT ERROR
        System.out.println(b.i);     // NOT ERROR
//        System.out.println(b_b.i);     // ERROR
    }
}

class A_1 {
    public int i = 10;
}

class B_1 extends A_1 {
    private int i = 20;
}
