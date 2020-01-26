package com.trl.undefined_tests;

import java.util.Stack;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 6/8/19
 */
public class Test_4 {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        processStacks(s1, s2);
        System.out.println(s1 + "   " + s2);
    }

    public static void processStacks(Stack x1, Stack x2) {
        x1.push(new Integer("100"));
        x2 = x1;
    }
}
