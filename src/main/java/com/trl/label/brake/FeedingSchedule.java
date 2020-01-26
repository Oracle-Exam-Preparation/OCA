package com.trl.label.brake;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 3/9/19
 */

// What is the output of the following program?
public class FeedingSchedule {
    public static void main(String[] args) {
        int x = 5, j = 0;
        OUTER:
        for (int i = 0; i < 3; )     // line 4
            INNER:do {
                i++;
                x++;                  // line 6
                if (x > 10) break INNER;
                x += 4;
                j++;
            } while (j <= 2);

        System.out.println(x);
    }
}

/*

A. 10
B. 12
C. 13
D. 17
E. The code will not compile because of line 4.
F. The code will not compile because of line 6.

B. The code compiles and runs without issue; therefore, options E and F are incorrect.
This type of problem is best examined one loop iteration at a time:
■ On the first iteration of the outer loop i is 0 , so the loop continues.
■ On the first iteration of the inner loop, i is updated to 1 and x to 6 . The if-then
  statement branch is not executed, and x is increased to 10 and j to 1 .
■ On the second iteration of the inner loop (since j = 1 and 1 <= 2 ), i is updated
  to 2 and x to 11 . At this point, the if-then branch will evaluate to true for the
  remainder of the program run, which causes the flow to break out of the inner
  loop each time it is reached.
■ On the second iteration of the outer loop (since i = 2 ), i is updated to 3 and x to
  12 . As before, the inner loop is broken since x is still greater than 10 .
■ On the third iteration of the outer loop, the outer loop is broken, as i is already
  not less than 3 . The most recent value of x , 12 , is output, so the answer is option B.

*/