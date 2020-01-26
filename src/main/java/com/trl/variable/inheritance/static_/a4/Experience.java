package com.trl.variable.inheritance.static_.a4;

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
        send(new Child());
        send_2(new Child());
    }

    public static void send(Parent msg) {
//        System.out.println(msg.call);                                                         // Compilation Error !!!
    }

    public static void send_2(Child msg) {
        System.out.println(msg.call);
    }

}

class Parent { }

class Child extends Parent {
    static String call = "Child";
}