package com.trl.string.a3;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 16/8/19
 */
public class Experience {
    public static void main(String[] args) {
        String string = "hello";
        StringBuilder builder = new StringBuilder("hello");
        StringBuilder builder_2 = new StringBuilder("hello");
        StringBuilder builder_3 = builder;

//        System.out.println(string == builder);          // ERROR. Not allowed comparing to distinct types with ==
        System.out.println(builder == builder_2);
        System.out.println(builder == builder_3);

        System.out.println(string.equals(builder));
        System.out.println(string.equals(builder.toString()));

        // method equal from StringBuilder is not override. See StringBuilder method equal()
        System.out.println(builder.equals(builder_2));
    }
}
