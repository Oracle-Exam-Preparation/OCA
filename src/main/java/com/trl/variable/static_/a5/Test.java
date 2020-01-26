package com.trl.variable.static_.a5;

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
}

/*
What is the output of the following code?

1:  package rope;
2:  public class Rope {
3:      public static int LENGTH = 5;
4:      static {
5:          LENGTH = 10;
6:      }
7:      public static void swing() {
8:          System.out.print("swing ");
9:      }
10: }

1: import rope.*;
2: import static rope.Rope.*;
3: public class Chimp {
4:     public static void main(String[] args) {
5:         Rope.swing();
6:         new Rope().swing();
7:         System.out.println(LENGTH);
8:     }
9: }

A. swing swing 5
B. swing swing 10
C. Compiler error on line 2 of Chimp.
D. Compiler error on line 5 of Chimp.
E. Compiler error on line 6 of Chimp.
F. Compiler error on line 7 of Chimp.

B. Rope runs line 3, setting LENGTH to 5, then immediately after runs the static initializer, which sets it to 10.
Line 5 calls the static method normally and prints swing. Line 6 also calls the static method. Java allows calling a
static method through an instance variable. Line 7 uses the static import on line 2 to reference LENGTH.
*/