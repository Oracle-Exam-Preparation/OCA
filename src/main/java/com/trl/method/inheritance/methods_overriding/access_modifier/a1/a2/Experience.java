package com.trl.method.inheritance.methods_overriding.access_modifier.a1.a2;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 3/9/19
 */
public class Experience {
    public static void main(String[] args) {
        A a_b = new B(5);
//        System.out.println("," + a_b.method());                     // Compilation Exception !!!
        System.out.println("," + ((B) a_b).method());
        System.out.println();

        B b_b = new B(5);
        b_b.method();
    }
}

class A {
    public A() {
        System.out.print("A --> A()");
    }
    public A(int age) {
        System.out.print("A --> A(int age)");
    }
    private boolean method() {                            // Methods with access modifier "private" can not be override.
        System.out.print("A --> method()");
        return false;
    }
}

class B extends A {
    public B(int age) {
        System.out.print("B --> B()");
    }
    public boolean method() {                            // This is not overriding!!! Is new definition method.
        System.out.print("B --> method()");
        return true;
    }
}