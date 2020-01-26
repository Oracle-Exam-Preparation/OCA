package com.trl.collections.treeSet.a1;

import java.util.Set;
import java.util.TreeSet;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 16/8/19
 */
public class Experience {
    public static void main(String[] args) {
        // see compareTo()
        Set<Number> set = new TreeSet<>();
        set.add(1);
        set.add(1L);
        set.add(1.0);

        System.out.println(set.size());
    }
}
