package com.trl.this_.variable_static.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 22/8/19
 */
public class TestClass {
    static int si = 10;

    public TestClass() {
        System.out.println(this);
    }

    public String toString() {
        return "TestClass.si = " + this.si;
    }
}

class Main {
    public static void main(String[] args) {
        new TestClass();
    }
}
