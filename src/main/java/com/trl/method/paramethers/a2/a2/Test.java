package com.trl.method.paramethers.a2.a2;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 10/9/19
 */
public class Test {
    public void moreA(int... nums) {}                              // A
    public void moreB(String values, int... nums) {}               // B
//    public void moreC(int... nums, String values) {}             // C   ERROR
//    public void moreD(String... values, int... nums) {}          // D   ERROR
//    public void moreE(String[] values, ...int nums) {}           // E   ERROR
//    public void moreF(String... values, int[] nums) {}           // F   ERROR
    public void moreG(String[] values, int[] nums) {}              // G
    public void moreH(String[] values, int... nums) {}             // H
}

/*
Which of the following compile? (Choose all that apply)

A. public void moreA(int... nums) {}
B. public void moreB(String values, int... nums) {}
C. public void moreC(int... nums, String values) {}
D. public void moreD(String... values, int... nums) {}
E. public void moreE(String[] values, ...int nums) {}
F. public void moreF(String... values, int[] nums) {}
G. public void moreG(String[] values, int[] nums) {}
H. public void moreH(String[] values, int... nums) {}

A, B, G, H. Correct answer.
*/