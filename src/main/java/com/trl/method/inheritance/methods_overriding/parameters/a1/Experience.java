package com.trl.method.inheritance.methods_overriding.parameters.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 16/9/19
 */
public class Experience {
    public static void main(String[] args) {
        A a_a = new A();
        a_a.method("", 0);
//        a_a.method(0, "");                                   // Compilation Exception !!!
//        ((B)a_a).method(0, "");                         // RuntimeException !!! java.lang.ClassCastException
        System.out.println();

        A a_b = new B();
        a_b.method("", 0);
//        a_b.method(0, "");                                   // Compilation Exception !!!
        ((B)a_b).method(0, "");                         // Not Compilation Exception !!!
        System.out.println();

        B b_b = new B();
        b_b.method("", 0);
        b_b.method(0, "");                              // Not Compilation Exception !!!
    }
}

class A {
    public void method(String s, int i) {
        System.out.println("A --> method(String s, int i)");
    }
}

class B extends A{
    // This method is not "override", it is "overload"
    public void method(int i, String s) {
        System.out.println("A --> method(int i, String s)");
    }
}