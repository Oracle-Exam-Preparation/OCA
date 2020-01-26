package com.trl.method.methods_overloading.final_.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 1/9/19
 */
public class Experience { }

class A {
    public final void methodFinal() {
    }

    //    public void methodFinal() { }                      // Compilation Exception !!!

    public final void methodFinal(int i) {}

    public void methodFinal(String s) { }
}