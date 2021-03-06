package com.trl.method.methods_overloading.a1.a2;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 17/9/19
 */
public class Experience {
    public static void main(String[] args) {
        B b = new B();
        b.method(4);
        b.method(9.0);
    }
}

class A {
    public void method(double d) {
        System.out.println("A --> method(double d)");
    }
}

class B extends A {
    public void method(int i) {
        System.out.println("B --> method(int i)");
    }
}

class C extends B {
    public void method(String s) throws Exception{
        System.out.println("C --> method(int i)");
    }

//    public void method(int i) throws Exception{                             // Compilation Exception !!! Is overriding
//        System.out.println("C --> method(int i)");
//    }
//
    public void method(int i) {                                               // Not Compilation Exception !!!
        System.out.println("C --> method(int i)");
    }

//    public void method(double d) throws Exception{                          // Compilation Exception !!! Is overriding
//        System.out.println("C --> method(double d)");
//    }

    public void method(double d) {                                            // Not Compilation Exception !!!
        System.out.println("C --> method(double d)");
    }
}