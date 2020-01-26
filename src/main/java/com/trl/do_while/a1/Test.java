package com.trl.do_while.a1;

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
What is the output of the following code snippet?

3: do {
4:   int y = 1;
5:   System.out.print(y++ + " ");
6: } while(y <= 10);

A. 1 2 3 4 5 6 7 8 9
B. 1 2 3 4 5 6 7 8 9 10
C. 1 2 3 4 5 6 7 8 9 10 11
D. The code will not compile because of line 6.
E. The code contains an infinite loop and does not terminate.

D. The variable y is declared within the body of the do-while statement, so it is out of scope on line 6. Line 6
generates a compiler error, so option D is the correct answer.
*/