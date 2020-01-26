package com.trl.collections.a1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 16/07/19
 */
public class Collections_1 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 4, -1, 5);
        Collections.sort(list);
        Integer array[] = list.toArray(new Integer[4]);
        System.out.println(array[0]);
        System.out.println(Arrays.toString(array));

    }
}

/*
What is the result of the following?

4: List<Integer> list = Arrays.asList(10, 4, -1, 5);
5: Collections.sort(list);
6: Integer array[] = list.toArray(new Integer[4]);
7: System.out.println(array[0]);

A. –1
B. 10
C. Compiler error on line 4.
D. Compiler error on line 5.
E. Compiler error on line 6.
F. An exception is thrown.

A. Line 4 creates a fixed size array of size 4. Line 5 sorts it. Line 6 converts it back to an array. The brackets aren’t
in the traditional place, but they are still legal. Line 7 prints the first element, which is now –1.
*/