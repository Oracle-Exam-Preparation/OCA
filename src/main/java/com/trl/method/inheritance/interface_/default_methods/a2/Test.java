package com.trl.method.inheritance.interface_.default_methods.a2;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 18/9/19
 */
public class Test {
}

/*
What is the output of the following code? (Choose all that apply)

1: interface Aquatic {
2:     public default int getNumberOfGills(int input) { return 2; }
3: }
4: public class ClownFish implements Aquatic {
5:     public String getNumberOfGills() { return "4"; }
6:     public String getNumberOfGills(int input) { return "6"; }
7:     public static void main(String[] args) {
8:         System.out.println(new ClownFish().getNumberOfGills(-1));
9:     }
10: }

A. 2
B. 4
C. 6
D. The code will not compile because of line 5.
E. The code will not compile because of line 6.
F. The code will not compile because of line 8.

E. The code doesn’t compile because line 6 contains an incompatible override of the getNumberOfGills(int input) method
defined in the Aquatic interface. In particular, int and String are not covariant returns types, since int is not a
subclass of String. Note that line 5 compiles without issue; getNumberOfGills() is an overloaded method that is not
related to the parent interface method that takes an int value.
*/