package com.trl.lambda.a2;

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
What is the result of the following class?
1: import java.util.function.*;
2:
3: public class Panda {
4:     int age;
5:     public static void main(String[] args) {
6:         Panda p1 = new Panda();
7:         p1.age = 1;
8:         check(p1, p -> p.age < 5);
9:     }
10:    private static void check(Panda panda, Predicate<Panda> pred) {
11:        String result = pred.test(panda) ? "match" : "not match";
12:        System.out.print(result);
13:    } }

A. match
B. not match
C. Compiler error on line 8.
D. Compiler error on line 10.
E. Compiler error on line 11.
F. A runtime exception is thrown.

A. This code is correct. Line 8 creates a lambda expression that checks if the age is less than 5. Since there is only
one parameter and it does not specify a type, the parentheses around the type parameter are optional. Line 10 uses the
Predicate interface, which declares a test() method.
*/