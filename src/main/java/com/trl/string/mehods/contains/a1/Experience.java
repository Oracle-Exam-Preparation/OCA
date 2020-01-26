package com.trl.string.mehods.contains.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 2/10/19
 */
public class Experience {
    public static void main(String[] args) {
        String str = "Always check the information you are learning.";
        System.out.println("str.contains(\"Always\") --> " + str.contains("Always"));                            // true
        System.out.println("str.contains(\"always\") --> " + str.contains("always"));                           // false
        System.out.println("str.contains(\".\") --> " + str.contains("."));                                      // true
        System.out.println("str.contains(\",\") --> " + str.contains(","));                                     // false
        System.out.println("str.contains(\"\") --> " + str.contains(""));                                        // true
        System.out.println("str.contains(\" \") --> " + str.contains(" "));                                      // true
        System.out.println("str.contains(\"a\") --> " + str.contains("a"));                                      // true
        System.out.println("str.contains(\"ar\") --> " + str.contains("ar"));                                    // true
        System.out.println("str.contains(\"ar\") --> " + str.contains("az"));                                   // false
        System.out.println("str.contains(\"al\") --> " + str.contains("al"));                                   // false
        System.out.println("str.contains(\"Al\") --> " + str.contains("Al"));                                    // true
    }
}
