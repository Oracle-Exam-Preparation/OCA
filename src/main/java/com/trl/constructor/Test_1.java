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
public class Test_1 {
    public static void main(String[] args) {
        B b_0 = new B();
        System.out.println(b_0);
        System.out.println("==================");

        B b_1 = new B(22);
        System.out.println(b_1);
        System.out.println(B.si);
    }
}

class B {
    static int si = 10;

    public B(int v) {
        this.si = v;
    }

    public B() {
        System.out.println(this);
    }

    public String toString() {
        return "TestClass.si = " + this.si;
    }
}