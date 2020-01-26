package com.trl.initialization_members.a1.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 4/9/19
 */
public class WaterBottle {
    private String brand;
    private boolean empty;

    public static void main(String[] args) {
        WaterBottle wb = new WaterBottle();
        System.out.print("Empty = " + wb.empty);
        System.out.print(", Brand = " + wb.brand);
    }
}

/*
What is the output of the following program?

A. Line 6 generates a compiler error.
B. Line 7 generates a compiler error.
C. There is no output.
D. Empty = false, Brand = null
E. Empty = false, Brand =
F. Empty = null, Brand = null

D. Boolean fields initialize to false and references initialize to null , so empty is false
and brand is null . Brand = null is output.
 */