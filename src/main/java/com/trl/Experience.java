package com.trl;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 11/8/19
 */
public class Experience {
    public static void main(String args[]) {
        int i = 0;
        boolean b_t = true;
        boolean b_f = false;

        System.out.println("==================================== & and &&");
        boolean b_1 = (b_t & method("1"));
        System.out.println("(b_t & method(\"1\")) --> " + b_1);
        boolean b_2 = (b_t && method("2"));
        System.out.println("(b_t && method(\"2\")) --> " + b_2);
        System.out.println();

        boolean b_3 = (b_f & method("3"));
        System.out.println("(b_f & method(\"3\")) --> " + b_3);
        boolean b_4 = (b_f && method("4"));
        System.out.println("(b_f && method(\"4\")) --> " + b_4);

        System.out.println("==================================== | and ||");
        boolean b_5 = (b_t | method("5"));
        System.out.println("(b_t | method(\"5\")) --> " + b_5);
        boolean b_6 = (b_t || method("6"));
        System.out.println("(b_t || method(\"6\")) -->  " + b_6);
        System.out.println();

        boolean b_7 = (b_f | method("7"));
        System.out.println("(b_f | method(\"7\")) --> " + b_7);
        boolean b_8 = (b_f || method("8"));
        System.out.println("(b_f || method(\"8\")) -->  " + b_8);
    }

    public static boolean method(String str) {
        System.out.println(str);
        return true;
    }
}
