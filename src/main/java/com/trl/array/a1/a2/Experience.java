package com.trl.array.a1.a2;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 12/8/19
 */
public class Experience {

    public static int[] method() {
        return null;
    }

    public static void main(String[] args) {
        int index = 1;
        try {
            int i = method()[index = 2]++;
            System.out.println(i);
        } catch (Exception e) { /* empty catch */ }
        System.out.println("index = " + index);
    }

}
