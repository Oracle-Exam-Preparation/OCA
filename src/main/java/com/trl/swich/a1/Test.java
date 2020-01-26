package com.trl.swich.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 7/9/19
 */
public class Test {
    public static void main(String[] args) {
        final char a = 'A', d = 'D';
        char grade = 'B';
        switch (grade) {
            case a:
            case 'B':
                System.out.print("great");
            case 'C':
                System.out.print("good");
                break;
            case d:
            case 'F':
                System.out.print("not good");
        }
    }
}

/*
What is the result of the following code snippet?

3:  final char a = 'A', d = 'D';
4:  char grade = 'B';
5:  switch(grade) {
6:  case a:
7:  case 'B': System.out.print("great");
8:  case 'C': System.out.print("good"); break;
9:  case d:
10: case 'F': System.out.print("not good");
11: }

A. great
B. greatgood
C. The code will not compile because of line 3.
D. The code will not compile because of line 6.
E. The code will not compile because of lines 6 and 9.

B. The code compiles and runs without issue, so options C, D, and E are not correct. The value of grade is 'B' and there
is a matching case statement that will cause "great" to be printed. There is no break statement after the case, though,
so the next case statement will be reached, and "good" will be printed. There is a break after this case statement, though,
so the switch statement will end. The correct answer is thus option B.
*/