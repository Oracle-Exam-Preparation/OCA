package com.trl.array.initialization_declaration.a6;

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
        int[][] array = {{0, 1}, {10, 11}};
        int i = 99;
        try {
//            array[A.method()][i = 1]++;
//            array[i = 1][A.method()]++;
            array[i = 1][A.method_2()]++;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("i --> " + i);
            System.out.println("array[1][1] --> " + array[1][1]);
        }
    }
}


class A {
    static int method() throws Exception {
        throw new Exception();
    }

    static int method_2() {
        return 1;
    }
}