package com.trl.method.inheritance.methods_overriding.return_type.a2;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 8/8/19
 */
public class Experience {
    public static void main(String[] args) {
        Parent p_c = new Child();
        p_c.method();
        p_c.method_2();
        p_c.method_3();
    }
}

class Parent {
    public Object method() {
        System.out.println("Parent --> method()");
        return new Object();
    }
    public Object method_2() {
        System.out.println("Parent --> method_2()");
        return new Object();
    }

    public Object method_3() {
        System.out.println("Parent --> method_3()");
        return new Object();
    }
}

class Child extends Parent {
    public String method() {
        System.out.println("Child --> method()");
        return "hello";
    }

    public Integer method_2() {
        System.out.println("Child --> method_2()");
        return 0;
    }

//    public int method_3() {                                             // Compilation Exception !!!
//        System.out.println("Child --> method_3()");
//        return 0;
//    }
}