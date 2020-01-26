package com.trl.do_while;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 17/8/19
 */
public class Test {
    public static void main(String[] args) {

        int count = 0, sum = 0;
        do {
            if (count % 3 == 0) continue;
            sum += count;
        }
        while (count++ < 11);
        System.out.println(sum);

    }
}
