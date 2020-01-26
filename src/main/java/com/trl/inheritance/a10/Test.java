package com.trl.inheritance.a10;

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
Which of the following statements can be inserted in the blank so that the code will compile successfully? (Choose all that apply)

public class Snake {}
public class Cobra extends Snake {}
public class GardenSnake {}
public class SnakeHandler {
    private Snake snake;
    public void setSnake(Snake snake) { this.snake = snake; }
    public static void main(String[] args) {
        new SnakeHandler().setSnake( ______ );
    }
}

A. new Cobra()
B. new GardenSnake()
C. new Snake()
D. new Object()
E. new String("Snake")
F. null

A, C, F. First off, Cobra is a subclass of Snake , so option A can be used. GardenSnake is not defined as a subclass of
Snake, so it cannot be used and option B is incorrect. The class Snake is not marked as abstract, so it can be instantiated
and passed, so option C is correct. Next, Object is a superclass of Snake, not a subclass, so it also cannot be used and
option D is incorrect. The class String is unrelated in this example, so option E is incorrect. Finally, a null value can
always be passed as an object value, regardless of type, so option F is correct.
*/