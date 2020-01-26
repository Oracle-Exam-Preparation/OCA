package com.trl.initialization_members.a9;

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
What is the output of the following application?

1: public class CompareValues {
2:   public static void main(String[] args) {
3:     int x = 0;
4:     while(x++ < 10) {}
5:       String message = x > 10 ? "Greater than" : false;
6:       System.out.println(message+","+x);
7:     }
8:   }

A. Greater than,10
B. false,10
C. Greater than,11
D. false,11
E. The code will not compile because of line 4.
F. The code will not compile because of line 5.

F. In this example, the ternary operator has two expressions, one of them a String and the other a boolean value. The
ternary operator is permitted to have expressions that don’t have matching types, but the key here is the assignment to
the String reference. The compiler knows how to assign the first expression value as a String , but the second boolean
expression cannot be set as a String ; therefore, this line will not compile.
*/