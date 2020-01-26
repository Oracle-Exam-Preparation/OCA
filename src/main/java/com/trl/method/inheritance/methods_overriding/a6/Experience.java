package com.trl.method.inheritance.methods_overriding.a6;

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
        System.out.println("================= z_z.m()");
        Z z_z = new Z();
        z_z.m();

        System.out.println("================= Z.m()");
        Z.m();

        System.out.println("================= abstractClass_z.m()");
        AbstractClass abstractClass_z = new Z();
        abstractClass_z.m();

        System.out.println("================= AbstractClass_z.m()");
        AbstractClass.m();

        System.out.println("================= interfaceA_z.m()");
        InterfaceA interfaceA_z = new Z();
//        interfaceA_z.m();                      // Compilation Exception !!!

        System.out.println("================= Pow.m()");
        InterfaceA.m();
    }
}

interface InterfaceA {
    static void m() {
        System.out.println("Interface --> m()");
    }
}

abstract class AbstractClass {
    static void m() {
        System.out.println("Abstract Class --> m()");
    }
}

class Z extends AbstractClass implements InterfaceA {
}