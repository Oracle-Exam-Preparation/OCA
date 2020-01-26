package com.trl.collections.a4;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 8/9/19
 */
public class Test {
    public static void main(String[] args) {
        int[] a = new int[2];
        int[] b = new int[2];
        int[] c = a;
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
    }
}

/*
Which of the following are true? (Choose all that apply)

A. Two arrays with the same content are equal.
B. Two ArrayLists with the same content are equal.
C. If you call remove(0) using an empty ArrayList object, it will compile successfully.
D. If you call remove(0) using an empty ArrayList object, it will run successfully.
E. None of the above.

B, C. An array does not override equals() and so uses object equality. ArrayList does override equals() and defines it
as the same elements in the same order. The compiler does not know when an index is out of bounds and thus can’t give
you a compiler error. The code will throw an exception at runtime, though.
*/