package com.trl.variable.inheritance.interface_.a2;

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

class B implements A {
    public B() {
//        value = 1;                                                      // Compilation Error!!! static final variable.
        int i = value;
    }
}

interface A {
    int value = 0;
}