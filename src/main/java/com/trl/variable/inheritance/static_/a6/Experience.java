package com.trl.variable.inheritance.static_.a6;

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
        Child c_c = new Child();
        System.out.println("c_c.notStaticVariable   --> " + c_c.notStaticVariable);
        System.out.println("c_c.staticVariable      --> " + c_c.staticVariable);
        System.out.println("Child.staticVariable    --> " + Child.staticVariable);

        System.out.println("c_c.notStaticVariable_2 --> " + c_c.notStaticVariable_2);
        System.out.println("c_c.staticVariable_2    --> " + c_c.staticVariable_2);
        System.out.println("Child.staticVariable_2  --> " + Child.staticVariable_2);
        System.out.println("=================================================");

        Parent p_c = new Child();
        System.out.println("p_c.notStaticVariable   --> " + p_c.notStaticVariable);
        System.out.println("p_c.staticVariable      --> " + p_c.staticVariable);

        System.out.println("p_c.notStaticVariable_2 --> " + p_c.notStaticVariable_2);
        System.out.println("p_c.staticVariable_2    --> " + p_c.staticVariable_2);
        System.out.println("=================================================");

        Parent p_p = new Parent();
        System.out.println("p_p.notStaticVariable   --> " + p_p.notStaticVariable);
        System.out.println("p_p.staticVariable      --> " + p_p.staticVariable);
        System.out.println("Parent.staticVariable   --> " + Parent.staticVariable);

        System.out.println("p_p.notStaticVariable_2 --> " + p_p.notStaticVariable_2);
        System.out.println("p_p.staticVariable_2    --> " + p_p.staticVariable_2);
        System.out.println("Parent.staticVariable_2 --> " + Parent.staticVariable_2);
    }
}

class Parent {
    int notStaticVariable = 10;
    static int staticVariable = 10;
    int notStaticVariable_2 = 10;
    static int staticVariable_2 = 10;
}

class Child extends Parent {
    int notStaticVariable = 20;
    static int staticVariable = 20;
}