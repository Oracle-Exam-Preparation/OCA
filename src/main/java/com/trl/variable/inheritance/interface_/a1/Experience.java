package com.trl.variable.inheritance.interface_.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 26/8/19
 */
public class Experience {
    public static void main(String[] args) {
        B b = new B();
        int a_1 = b.value;
//            int a_2 = value;                                                   // Compilation Error !!!
        int a_3 = B.value;
        int a_4 = A.value;
    }
}

class B implements A {
    public static void main(String[] args) {
        B b = new B();
        int a_1 = b.value;
        int a_2 = value;
        int a_3 = B.value;
        int a_4 = A.value;
    }
}

interface A {
    int value = 0;
}