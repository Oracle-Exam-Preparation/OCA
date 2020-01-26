package com.trl.initialization_members;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 3/9/19
 */

// What is the result of the following program?
public class Egret {
    private String color;

    public Egret() {
        this("white");                        // line 4
    }

    public Egret(String color) {
        color = color;
    }

    public static void main(String[] args) {
        Egret e = new Egret();                       // line 10
        System.out.println("Color:" + e.color);      // line 11
    }
}

/*

A. Color:
B. Color:null
C. Color:White
D. Compiler error on line 4.
E. Compiler error on line 10.
F. Compiler error on line 11.

B. Line 10 calls the constructor on lines 3–5. That constructor calls the other construc-
tor. However, the constructor on lines 6–8 assigns the method parameter to itself,
which leaves the color instance variable on line 2 set to its default value of null

*/