package com.trl.string.stringBuilder;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 7/9/19
 */
public class StringBuilder_substring {
    public static void main(String[] args) {
        int total = 0;
        StringBuilder letters = new StringBuilder("abcdefg");
        total += letters.substring(1, 2).length();
        total += letters.substring(6, 6).length();
        total += letters.substring(6, 5).length();
        System.out.println(total);
    }
}

/*
What is the result of the following code?

4: int total = 0;
5: StringBuilder letters = new StringBuilder("abcdefg");
6: total += letters.substring(1, 2).length();
7: total += letters.substring(6, 6).length();
8: total += letters.substring(6, 5).length();
9: System.out.println(total);

A. 1
B. 2
C. 3
D. 7
E. An exception is thrown.
F. The code does not compile.

E. Line 6 adds 1 to total because substring() includes the starting index but not the ending index. Line 7 adds 0 to total.
Line 8 is a problem: Java does not allow the indexes to be specified in reverse order and the code throws a
StringIndexOutOfBoundsException.
*/