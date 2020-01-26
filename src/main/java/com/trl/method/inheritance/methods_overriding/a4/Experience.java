package com.trl.method.inheritance.methods_overriding.a4;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 23/8/19
 */
public class Experience {
    public static void main(String args[]) {
        Grandfather g_c = new Child();
        System.out.println(g_c.m1());
        System.out.println();

        Father f_c = new Child();
        System.out.println(f_c.m1());
        System.out.println();

        Child c_c = new Child();
        System.out.println(c_c.m1());
    }
}

class Grandfather {
    String m1() {
        return " GrandfatherA method";
    }
}

class Father extends Grandfather {
    String m1() {
        return "FatherA method";
    }
}

class Child extends Father {
    String m1() {
        return "ChildA method";
    }
}