package com.trl.boolean_.constructors;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 06/08/19
 */
public class Experience {
    public static void main(String[] args) {
//        System.out.println(new Boolean());                      // not exist constructor without parameters
        System.out.println(new Boolean("true"));              // true
        System.out.println(new Boolean("trUE"));              // true
        System.out.println(new Boolean("TRue"));              // true
        System.out.println(new Boolean("TRUE"));              // true
        System.out.println(new Boolean(true));             // true
        System.out.println();
        System.out.println(new Boolean(null));                // false
        System.out.println(new Boolean("falSE"));             // false
        System.out.println(new Boolean("FALSE"));             // false
        System.out.println(new Boolean(false));           // false
    }
}
