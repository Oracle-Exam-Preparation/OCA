package com.trl.logical_operator.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 27/9/19
 */
public class Experience {
    public static void main(String[] args) {
        boolean b_1 = true;
        boolean b_2 = false;
        boolean b_3 = false;
        b_3 = (b_2 & A.method("1"));
        b_3 = (b_2 && A.method("2"));
        b_3 = (b_1 | A.method("3"));
        b_3 = (b_1 || A.method("4"));
    }
}

class A {
    public static boolean method(String str) {
        System.out.println(str);
        return true;
    }
}