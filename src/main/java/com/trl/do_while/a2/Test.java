package com.trl.do_while.a2;

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

3: boolean keepGoing = true;
4: int result = 15, i = 10;
5: do {
6:   i--;
7:   if(i==8) keepGoing = false;
8:   result -= 2;
9: } while(keepGoing);
10: System.out.println(result);

A. 7
B. 9
C. 10
D. 11
E. 15
F. The code will not compile because of line 8.

D. The code compiles without issue, so option F is incorrect. After the first execution of the loop, i is decremented
to 9 and result to 13 . Since i is not 8, keepGoing is false , and the loop continues. On the next iteration, i is
decremented to 8 and result to 11. On the second execution, i does equal 8, so keepGoing is set to false. At the conclusion
of the loop, the loop terminates since keepGoing is no longer true. The value of result is 11 , and the correct answer
is option D.
*/