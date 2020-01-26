package com.trl.inheritance.a5;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 12/9/19
 */
public class Test {
}

/*
Which of the following statements can be inserted in the blank line so that the code will compile successfully?
(Choose all that apply)

public interface CanHop {}
public class Frog implements CanHop {
    public static void main(String[] args) {
    _______ frog = new TurtleFrog();
    }
}
public class BrazilianHornedFrog extends Frog {}
public class TurtleFrog extends Frog {}

A. Frog
B. TurtleFrog
C. BrazilianHornedFrog
D. CanHop
E. Object
F. Long

A, B, D, E. The blank can be filled with any class or interface that is a supertype of TurtleFrog. Option A is a superclass
of TurtleFrog , and option B is the same class, so both are correct. BrazilianHornedFrog is not a superclass of TurtleFrog,
so option C is incorrect. TurtleFrog inherits the CanHope interface, so option D is correct. All classes inherit Object,
so option E is correct. Finally, Long is an unrelated class that is not a superclass of TurtleFrog , and is therefore
incorrect.
*/