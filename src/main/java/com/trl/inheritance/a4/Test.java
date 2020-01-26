package com.trl.inheritance.a4;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 22/8/19
 */
public class Test {
    public static void main(String[] args) {

        InterfaceA interfaceA = new Child();
        System.out.println("InterfaceA.VALUE --> " + InterfaceA.VALUE);
        System.out.println("((InterfaceA) interfaceA).VALUE --> " + ((InterfaceA) interfaceA).VALUE);
//        System.out.println("((Child) interfaceA).VALUE --> " + ((Child) interfaceA).VALUE);      // COMPILATION ERROR
        System.out.println("interfaceA.m1() --> " + interfaceA.m1());
        System.out.println("((Child)interfaceA).m1() --> " + ((Child)interfaceA).m1());
        System.out.println("==============================================");

        Child child = new Child();
        System.out.println("child.m1() --> " + child.m1());
//        System.out.println("child.VALUE --> " + child.VALUE);                // COMPILATION ERROR
        System.out.println("==============================================");

        InterfaceB interfaceB = new Child();
        System.out.println("((InterfaceB) interfaceA).VALUE --> " + ((InterfaceB) interfaceA).VALUE);
        System.out.println("((InterfaceA) interfaceB).VALUE --> " + ((InterfaceA) interfaceB).VALUE);
        System.out.println("interfaceB.m1() --> " + interfaceB.m1());

    }

}

class Child implements InterfaceA, InterfaceB {
    public int m1() {
        return 0;
    }
}

interface InterfaceA {
    int VALUE = 1;
    int m1();
}

interface InterfaceB {
    int VALUE = 2;
    int m1();
}
