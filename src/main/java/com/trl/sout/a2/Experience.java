package com.trl.sout.a2;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 27/9/19
 */
public class Experience {
    public static void main(String[] args) {
        System.out.println(1 + 2 + "3");                     // Output: 33
        System.out.println("1" + 2 + 3);                     // Output: 123

        System.out.println(1 + 1.0F);                        // Output: 2.0
        float f = 1 + 1.0F;
        double d = 1 + 1.0F;

        System.out.println(4/2);                            // Output: 2
        System.out.println(5/2);                            // Output: 2
        System.out.println((float) 5/2);                    // Output: 2.5

        System.out.println('a' + 1);                        // Output: 98
        System.out.println("" + 'a' + 1);                   // Output: 98
        System.out.println('a' + 1 + "");                   // Output: 98
        System.out.println("" + ((char)'a' + 1));           // Output: 98
    }
}
