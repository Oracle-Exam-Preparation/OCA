package com.trl.main_.a6;

import java.util.Arrays;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 23/9/19
 */
public class Experience {
    public static void main(String[] args) {
        if (args[0].equals("open"))
            if (args[1].equals("someone"))
                System.out.println("Hello!");
            else System.out.println("Go away " + args[1]);
        System.out.println(Arrays.toString(args));
    }
}

/*
    java Experience Hello

*/