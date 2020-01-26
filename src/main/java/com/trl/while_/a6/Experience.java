package com.trl.while_.a6;

import java.util.ArrayList;
import java.util.List;

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
        List<String> list = new ArrayList<>();
        try {
            while (true) {
                list.add("abc");                                      // java.lang.OutOfMemoryError: Java heap space
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());
    }
}
