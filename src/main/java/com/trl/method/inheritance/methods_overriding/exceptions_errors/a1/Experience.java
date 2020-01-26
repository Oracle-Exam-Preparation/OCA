package com.trl.method.inheritance.methods_overriding.exceptions_errors.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 12/9/19
 */
public class Experience {
    public static void main(String[] args) {
        Grandfather g_g = new Grandfather();
        try {
            g_g.method();                               // Mandatory try{}catch
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("=================================");

        Grandfather g_f = new Father();
        try {
            g_f.method();                             // Mandatory try{}catch
        } catch (Exception e) {
            e.printStackTrace();
        }

        Father f_f = new Father();
        f_f.method();

        System.out.println("=================================");

        Grandfather g_c = new Child();
        try {
            g_c.method();                              // Mandatory try{}catch
        } catch (Exception e) {
            e.printStackTrace();
        }

        Child c_c = new Child();
        c_c.method();
    }
}

class Grandfather {
    public void method() throws Exception {
        System.out.println("Grandfather  --> method()");
    }
}

class Father extends Grandfather {
    @Override
    public void method() throws RuntimeException {
        System.out.println("Father --> method()");
    }
}

class Child extends Grandfather {
    @Override
    public void method() {
        System.out.println("Child --> method()");
    }
}