package com.trl.integer.metthods.valueOf.a1;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 3/10/19
 */
public class Experience {
    public static void main(String[] args) {
        String value = "10.0";

        Float f = Float.parseFloat(value);
        String s = f.toString();
        // NumberFormatException: For input string: "10.0".
        int i = Integer.valueOf(s);
    }
}
