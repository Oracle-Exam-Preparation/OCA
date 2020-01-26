package com.trl.lambda.a4;

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
Which of the following lambda expressions can fill in the blank? (Choose all that apply)

List<String> list = new ArrayList<>();
list.removeIf(___________________);

A. s -> s.isEmpty()
B. s -> {s.isEmpty()}
C. s -> {s.isEmpty();}
D. s -> {return s.isEmpty();}
E. String s -> s.isEmpty()
F. (String s) -> s.isEmpty()

A, D, F. removeIf() expects a Predicate , which takes a parameter list of one parameter using the specified type.
Options B and C are incorrect because they do not use the return keyword. It is required inside braces for lambda bodies.
Option E is incorrect because it is missing the parentheses around the parameter list. This is only optional for a single
parameter with an inferred type.
*/