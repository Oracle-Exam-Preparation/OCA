package com.trl.collections.arrayList.methods.indexOf.a1;

import java.util.ArrayList;

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
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(3);

        System.out.println(arrayList.indexOf(3));
        System.out.println(arrayList.lastIndexOf(3));
        System.out.println(arrayList.indexOf(1111));
    }
}
