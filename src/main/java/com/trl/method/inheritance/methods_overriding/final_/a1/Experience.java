package com.trl.method.inheritance.methods_overriding.final_.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 1/9/19
 */
public class Experience {
    public static void main(String[] args) {
        Parent p_p = new Parent();
        p_p.methodFinal();

        Parent p_c = new Child();
        p_c.methodFinal();

        Child c_c = new Child();
        c_c.methodFinal();
    }
}

class Parent {
    public final void methodFinal() {
        System.out.println("Parent --> public final void methodFinal()");
    }
}

class Child extends Parent {
//    public final void methodFinal() {                              // ERROR. Not allowed override final method.
//        System.out.println("Child --> public final void methodFinal()");
//    }
}