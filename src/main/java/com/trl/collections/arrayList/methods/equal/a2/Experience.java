package com.trl.collections.arrayList.methods.equal.a2;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 8/9/19
 */
public class Experience {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("A");
        a.add("B");

        List<String> b = new ArrayList<>();
        b.add("B");
        b.add("A");

        List<String> c = new ArrayList<>();
        c.add("A");
        c.add("B");

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
    }
}
