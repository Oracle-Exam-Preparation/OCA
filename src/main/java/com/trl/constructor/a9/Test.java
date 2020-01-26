package com.trl.constructor.a9;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 11/9/19
 */
public class Test {
}

/*
What is the output of the following code?
1: class Mammal {
2:     public Mammal(int age) {
3:         System.out.print("Mammal");
4:     }
5: }
6: public class Platypus extends Mammal {
7:     public Platypus() {
8:         System.out.print("Platypus");
9:     }
10:    public static void main(String[] args) {
11:        new Mammal(5);
12:    }
13: }

A. Platypus
B. Mammal
C. PlatypusMammal
D. MammalPlatypus
E. The code will not compile because of line 8.
F. The code will not compile because of line 11.

E. The code will not compile because the parent class Mammal doesn’t define a no-argument constructor, so the first line
of a Platypus constructor should be an explicit call to super(int age). If there was such a call, then the output would
be MammalPlatypus, since the super constructor is executed before the child constructor.
*/