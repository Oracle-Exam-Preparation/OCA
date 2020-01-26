package com.trl.string.mehods.equals.a6;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 21/07/19
 */
public class Experience {
    public static void main(String[] args) {
        String str = "java";
        StringBuilder sb = new StringBuilder("java");

//        System.out.println(str == sb);                                                        // Compilation Error !!!
        System.out.println(str == sb.toString());                             // Not Compilation Error !!! Output: false
        System.out.println(str.equals(sb));                                                                     // false
        System.out.println(str.equals(sb.toString()));                                                           // true
    }
}
