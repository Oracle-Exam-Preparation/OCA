package com.trl.initialization_members.a00;

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
What is the result of the following?
1: public class Order {
2:     String value = "t";
3:     { value += "a"; }
4:     { value += "c"; }
5:     public Order() {
6:         value += "b";
7:     }
8:     public Order(String s) {
9:         value += s;
10:    }
11:    public static void main(String[] args) {
12:        Order order = new Order("f");
13:        order = new Order();
14:        System.out.println(order.value);
15:    } }

A. tacb
B. tacf
C. tacbf
D. tacfb
E. tacftacb
F. The code does not compile.
G. An exception is thrown.

A. Line 4 instantiates an Order . Java runs the declarations and instance initializers first in the order they appear.
This sets value to tacf. Line 5 creates another Order and initializes value to tacb. The object on line 5 is stored in
the same variable line 4 used. This makes the object created on line 4 unreachable. When value is printed, it is the
instance variable in the object created on line 5.
*/