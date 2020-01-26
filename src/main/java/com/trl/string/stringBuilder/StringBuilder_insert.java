package com.trl.string.stringBuilder;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 06/08/19
 */
public class StringBuilder_insert {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("12");

        builder.insert(2, "34");
        System.out.println(builder);

        builder.insert(4, "56");
        System.out.println(builder);

//        System.out.println(mateyMessage.insert(5, "78"));          // 12345786
//        System.out.println(mateyMessage.insert(6, "78"));          // 12345678
        System.out.println(builder.insert(7, "78"));          // ERROR
    }
}
