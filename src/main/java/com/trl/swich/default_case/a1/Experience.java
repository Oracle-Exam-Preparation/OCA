package com.trl.swich.default_case.a1;

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
    public static void main(String[] args) {
        method("A");
        System.out.println();
        method_2("A");
        System.out.println();
        method_3("A");
        System.out.println("\n=============");

        method("a");
        System.out.println();
        method_2("a");
        System.out.println();
        method_3("a");
        System.out.println("\n=============");

        method("b");
        System.out.println();
        method_2("b");
        System.out.println();
        method_3("b");
        System.out.println("\n=============");
    }

    private static void method(String str) {
        switch (str) {
            case "a":
                System.out.print(" a");
            case "A":
                System.out.print(" A");
            default:
                System.out.print(" Default");
        }
    }

    private static void method_2(String str) {
        switch (str) {
            case "a":
                System.out.print(" a");
            default:
                System.out.print(" Default");
            case "A":
                System.out.print(" A");
        }
    }

    private static void method_3(String str) {
        switch (str) {
            default:
                System.out.print(" Default");
            case "a":
                System.out.print(" a");
            case "A":
                System.out.print(" A");
        }
    }
}
