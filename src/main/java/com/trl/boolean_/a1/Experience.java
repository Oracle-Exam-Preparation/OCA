package com.trl.boolean_.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 10/8/19
 */
public class Experience {
    public static void main(String[] args) {
        System.out.println(new Boolean(true) == new Boolean(true));

        System.out.println(new Boolean("true") == new Boolean("true"));
        System.out.println(new Boolean("true") == Boolean.valueOf("true"));
        System.out.println(new Boolean("true") == Boolean.parseBoolean("true"));

        System.out.println("===============");
        System.out.println(new Boolean(true).equals(new Boolean(true)));

        System.out.println(new Boolean("true").equals(new Boolean("true")));
        System.out.println(new Boolean("true").equals(Boolean.valueOf("true")));
        System.out.println(new Boolean("true").equals(Boolean.parseBoolean("true")));
    }
}