package com.trl.method.methods_overloading.return_type.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 7/8/19
 */
public class Experience {
}

class A {
    public int setVar(int a, int b, float c) {
        return 0;
    }

    // Compilation Exception. compilator destinge dos methodos por "name method and parameter list", pero no destinge por "return value".
//    public float setVar(int a, int b, float c) {
//        return 0.0F;
//    }

    // Important, is allowed change "return value"
    public float setVar(int a) {
        return 0;
    }
}