package com.trl.method.access_modifier.a1.b;

import com.trl.method.access_modifier.a1.a.A;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 1/9/19
 */
public class B {
    public static void main(String[] args) {
        A a = new A();
//        a.privateMethod();              // Compilation Exception !!!
//        a.packageMethod();              // Compilation Exception !!!
//        a.protectedMethod();            // Compilation Exception !!!
        a.publicMethod();
    }
}
