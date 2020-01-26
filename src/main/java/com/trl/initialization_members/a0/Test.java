package com.trl.initialization_members.a0;

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
2:     static String result = "";
3:     { result += "c"; }
4:     static
5:     { result += "u"; }
6:     { result += "r"; }
7: }

1: public class OrderDriver {
2:     public static void main(String[] args) {
3:         System.out.print(Order.result + " ");
4:         System.out.print(Order.result + " ");
5:         new Order();
6:         new Order();
7:         System.out.print(Order.result + " ");
8:     }
9: }

A. curur
B. ucrcr
C. u ucrcr
D. u u curcur
E. u u ucrcr
F. ur ur urc
G. The code does not compile.

E. On line 3 of OrderDriver, we refer to Order for the first time. At this point the statics in Order get initialized.
In this case, the statics are the static declaration of result and the static initializer. result is u at this point. On
line 4, result is the same because the static initialization is only run once. On line 5, we create a new Order, which
triggers the instance initializers in the order they appear in the file. Now result is ucr. Line 6 creates another Order,
triggering another set of initializers. Now result is ucrcr . Notice how the static is on a different line than the
initialization code in lines 4–5 of Order. The exam may try to trick you by formatting the code like this to confuse you.
*/