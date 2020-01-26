package com.trl.boolean_.methods.static_.parseBoolean.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 14/9/19
 */
public class Experience {
    public static void main(String[] args) {
        System.out.println(Boolean.parseBoolean("true"));     // true
        System.out.println(Boolean.parseBoolean("TRue"));     // true
        System.out.println(Boolean.parseBoolean("trUE"));     // true
        System.out.println(Boolean.parseBoolean("TRUE"));     // true

        // Compilation Exception !!! Not exist method parseBoolean() with parameter type boolean.
//        System.out.println(Boolean.parseBoolean(true));

        System.out.println();
        System.out.println(Boolean.parseBoolean("false"));     // false
        System.out.println(Boolean.parseBoolean("falSE"));     // false
        System.out.println(Boolean.parseBoolean("FALse"));     // false
        System.out.println(Boolean.parseBoolean("FALse"));     // false
        System.out.println(Boolean.parseBoolean(null));        // false
    }
}
