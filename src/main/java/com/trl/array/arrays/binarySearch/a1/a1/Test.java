package com.trl.array.arrays.binarySearch.a1.a1;

import java.util.Arrays;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 16/07/19
 */
public class Test {
    public static void main(String[] argv) {
        int[] arg = {16, -41, 112, 10, -110};
        int a = 112;
        int b = Arrays.binarySearch(arg, a);
        System.out.println(b);
    }
}


/*

A. 2
B. 4
C. 6
D. The result is undefined.
E. An exception is thrown.
F. The code does not compile.

D. The code compiles and runs fine. However, an array must be sorted for binarySearch() to return a meaningful result.

The array must be sorted (as by the {@link #sort(int[])} method) prior to making this call. If it is not sorted, the
results are undefined.  If the array contains multiple elements with the specified value, there is no guarantee which
one will be found.
*/