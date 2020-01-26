package com.trl.temporary;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 21/8/19
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(method(5));
        System.out.println(method(10));
    }

    public static String method(int row) {
        StringBuilder sb = new StringBuilder();
        int vv = 0;
        for (int i = 0; i <= row * 2; i++) {
            if (i % 2 != 0) {
                vv++;
                sb.append("|");
                int tab = row - i;
                int x = 0;
                while (tab + vv >= x) {
                    sb.append(" ");
                    x++;
                }
                for (int j = 0; j < i; j++) {
                    sb.append("*");
                }
                sb.append(System.lineSeparator());
            }
        }
        return sb.toString();
    }
}
