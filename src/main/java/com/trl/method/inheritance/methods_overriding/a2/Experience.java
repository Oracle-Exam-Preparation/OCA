package com.trl.method.inheritance.methods_overriding.a2;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 13/07/19
 */
public class Experience {
    public static void main(String[] args) {
        Parent p_1 = new Parent();
        Parent p_2 = new Child();
        Child p_3 = new Child();

        p_1.pvm();

        // Esta llamada se hace al metodo del clase padre "Parent" que se esta herredando.
        // Class "Child" no tiene methodo "pvm()" sobrescrito (override) del clase padre "Parent".
        p_2.pvm();
        p_3.pvm();

//         p_1.pvm(23);   // COMPILATION ERROR.
        // Enlace de tipo "Parent" no tiene definido metodo "public void pvm(int value)"
        // Metodo "public void pvm(int value)" es una parte de al class "Child".
        // El metodo "public void pvm(int value)" es un metodo "overload".
        p_3.pvm(3);

        // Con enlace de tipo "Parnt" no se puede llegar al method pvm(int), por razon que clase "Parent"
        // no tiene definido este methodo.
//        p_2.pvm(3);                       // Compilation Exception !!!
    }
}

class Parent {
    public void pvm() {
        System.out.println("Parent method ---> public void pvm()");
    }
}

class Child extends Parent {
    public void pvm(int value) {
        System.out.println("Child method ---> public void pvm()");
    }
}
