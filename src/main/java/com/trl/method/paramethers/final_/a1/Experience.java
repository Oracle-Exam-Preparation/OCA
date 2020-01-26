package com.trl.method.paramethers.final_.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 27/9/19
 */
public class Experience {
}

class A {
    public static A setIt(final A x, final A y){
//        x = y;                                                                            // Compilation Error !!!
        return x;
    }
}