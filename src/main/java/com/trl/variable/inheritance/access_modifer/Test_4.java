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
public class Test_4 {
    public static void main(String[] args) {
        A_2 a = new A_2();//1
        A_2 b = new B_2();//2
        B_2 b_b = new B_2();//2

        System.out.println(a.i);
        System.out.println(b.i);
        System.out.println(b_b.i);
    }
}

class A_2 {
    public int i = 10;
}

class B_2 extends A_2 {
    public int i = 20;
}
