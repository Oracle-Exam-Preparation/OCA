package com.trl.enum_;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 16/8/19
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(Values.A);
    }
}

enum Values {
    A(1), B(2), C(3);

    Values(int i) {
        System.out.print(i);
    }

    static {
        System.out.print("Static");
    }

}