package com.trl.label.cntinue.a1;

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
    public static void main(String[] args) {
        int count = 0;
        ROW_LOOP:
        for (int row = 1; row <= 3; row++)
            for (int col = 1; col <= 2; col++) {
                if (row * col % 2 == 0) continue ROW_LOOP;
                count++;
            }
        System.out.println(count);
    }
}

/*
What is the output of the following code snippet?

3: int count = 0;
4: ROW_LOOP: for(int row = 1; row <=3; row++)
5:    for(int col = 1; col <=2 ; col++) {
6:       if(row * col % 2 == 0) continue ROW_LOOP;
7:       count++;
8: }
9: System.out.println(count);

A. 1
B. 2
C. 3
D. 4
E. 6
F. The code will not compile because of line 6.

A. The expression on line 5 is true when row * col is an even number. On the first iteration, row = 1 and col = 1, so
the expression on line 6 is false , the continue is skipped, and count is incremented to 1 . On the second iteration,
row = 1 and col = 2 , so the expression on line 6 is true and the continue ends the outer loop with count still at 1.
On the third iteration, row = 2 and col = 1 , so the expression on line 6 is true and the continue ends the outer loop
with count still at 1 . On the fourth iteration, row = 3 and col = 1 , so the expression on line 6 is false , the
continue is skipped, and count is incremented to 2 . Finally, on the fifth and final iteration, row = 3 and col = 2, so
the expression on line 6 is true and the continue ends the outer loop with count still at 2 . The result of 2 is
displayed, so the answer is option B.
*/