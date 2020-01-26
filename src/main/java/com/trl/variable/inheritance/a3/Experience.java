package com.trl.variable.inheritance.a3;

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
        System.out.println(g_c.name);
        System.out.println();

        Father f_c = new Child();
        System.out.println(f_c.name);
        System.out.println();

        Child c_c = new Child();
        System.out.println(c_c.name);
    }
}

class Grandfather {
    String name = "Grandfather variable";
}

class Father extends Grandfather {
    String name = "Father variable";
}

class Child extends Father {
    String name = "Child variable";
}
