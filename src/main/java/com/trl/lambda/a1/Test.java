package com.trl.lambda.a1;

import java.util.function.Predicate;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 4/9/19
 */
public class Test {
    public static void main(String[] args) {
        // INSERT CODE HERE
        System.out.println(test(i -> i == 5));                     // A
//        System.out.println(test(i -> {i == 5;}));                  // B    ERROR
        System.out.println(test((i) -> i == 5));                   // C

//        System.out.println(test((int i) -> i == 5));                // D    ERROR
        System.out.println(test((Integer i) -> i == 5));                // D    NOT ERROR
//
//        System.out.println(test((int i) -> {return i == 5;}));     // E    ERROR
        System.out.println(test((Integer i) -> {
            return i == 5;
        }));     // E    NOT ERROR

        System.out.println(test((i) -> {
            return i == 5;
        }));         // F
    }

    private static boolean test(Predicate<Integer> p) {
        return p.test(5);
    }
}

/*
// Which of the following lines can be inserted at line 11 to print true? (Choose all that apply)

A. System.out.println(test(i -> i == 5));
B. System.out.println(test(i -> {i == 5;}));
C. System.out.println(test((i) -> i == 5));
D. System.out.println(test((int i) -> i == 5);
E. System.out.println(test((int i) -> {return i == 5;}));
F. System.out.println(test((i) -> {return i == 5;}));

A, C, F. The only functional programming interface you need to memorize for the exam is Predicate. It takes a single
parameter and returns a boolean. Lambda expressions with one parameter are allowed to omit the parentheses around
the parameter list, making options A and C correct. The return statement is optional when a single statement is in the
body, making option F correct. Option B is incorrect because a return statement must be used if braces are included
around the body. Options D and E are incorrect because the type is Integer in the predicate and int in the lambda.
Autoboxing works for collections not inferring predicates. If these two were changed to Integer , they would be correct.
*/