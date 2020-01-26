package com.trl.while_.a5;

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
    public static void main(String args[]) throws Exception {
        A a = new A();
        a.method_2();
        System.out.println(a.getValue());
    }
}


class A {
    private int value = 5;

    public void method_2() {
        int x = 0;
        while ((x = getValue()) != 0) {
            for (int m = 10; m >= 0; m--) {
                x = m;
            }
        }
    }

    public int getValue() {
        return value;
    }
}
