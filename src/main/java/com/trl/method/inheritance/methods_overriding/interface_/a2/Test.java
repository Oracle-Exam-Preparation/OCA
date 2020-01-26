package com.trl.method.inheritance.methods_overriding.interface_.a2;

public class Test {
    public static void main(String[] args) {

        System.out.println("================= z_z.m()");
        Z z_z = new Z();
//        z_z.m();                                 // ERROR

        System.out.println("================= Z.m()");
//        Z.m();                                   // ERROR

        System.out.println("================= interfaceA_z.m()");
        InterfaceA interfaceA_z = new Z();
//        interfaceA_z.m();                      // ERROR

        System.out.println("================= Pow.m()");
        InterfaceA.m();

    }
}

interface InterfaceA {
    static void m() {
        System.out.println("In Pow.wow");
    }
}

class Z implements InterfaceA {
}