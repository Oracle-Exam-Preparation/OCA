package com.trl.method.inheritance.methods_overriding.a5;

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
        Parent p_p = new Parent();
        Parent p_c = new Child();
        Child c_c = new Child();

//        p_p.doStuff();                         // Compilation Exception !!!
//        ((Child) p_p).doStuff();               // RuntimeException. java.lang.ClassCastException

//        (p_c.doStuff();                        // Compilation Exception !!!
        ((Child) p_c).doStuff();

        c_c.doStuff();
    }
}

class Parent {
    public int getCode() {
        return 2;
    }
}

class Child extends Parent {
    public void doStuff() {
        System.out.println("Child doStuff()");
    }
}
