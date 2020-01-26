package com.trl.method.methods_overloading.parameters.a4;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 18/8/19
 */
public class Experience {
    public static void main(String args[]) {
        A a = new A();
        // NOT Compilation Exception. Compilador elige implementacion de methodo cual tiene parametro mas restricto.
        a.method(null);

        B b = new B();
        // Compilation Exception. Compilador en este caso no sabe cual methdo eligir.
        // String y StringBuilder estas dos classses se encuentran en mismo nivel de herencia.
//        b.method(null);
    }
}

class A {
    public void method(Object o) {
        System.out.println("Object Version");
    }

    public void method(java.io.FileNotFoundException s) {
        System.out.println("java.io.FileNotFoundException Version");
    }

    public void method(java.io.IOException s) {
        System.out.println("IOException Version");
    }
}

class B {
    public void method(Object o) {
        System.out.println("Object Version");
    }

    public void method(String s) {
        System.out.println("String Version");
    }

    public void method(StringBuilder sb) {
        System.out.println("StringBuilder Version");
    }
}
