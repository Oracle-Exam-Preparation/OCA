package com.trl.string.a6;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 4/10/19
 */
public class Experience {
    public static void main(String[] args) {
        String str = "aaa";
        StringBuilder sb = new StringBuilder("bbb");
        method(str, sb);
        System.out.println("str = " + str + ", sb = " + sb);
    }

    public static void method(String str, StringBuilder sb) {
        str = str + sb.toString();
        sb.append(str);
        str = null;
        sb = null;
    }
}
