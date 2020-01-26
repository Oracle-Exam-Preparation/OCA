package com.trl.constructor.a6;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 5/9/19
 */
public class Test {
}

/*
What does the following code output?

1: public class Salmon {
2:   int count;
3:   public void Salmon() {
4:       count = 4;
5:   }
6:   public static void main(String[] args) {
7:       Salmon s = new Salmon();
8:       System.out.println(s.count);
9:   } }

A. 0
B. 4
C. Compilation fails on line 3.
D. Compilation fails on line 4.
E. Compilation fails on line 7.
F. Compilation fails on line 8.

A. While the code on line 3 does compile, it is not a constructor because it has a return type. It is a method that
happens to have the same name as the class. When the code runs, the default constructor is called and count has the
default value (0) for an int.
*/