package com.trl.collections.arrayList.methods.a2;

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
        ArrayList<Double> arrayList = new ArrayList<>();
//        arrayList.add(111);                                                    // Compilation Error !!!
//        System.out.println(arrayList.get(arrayList.size()));                   // java.lang.IndexOutOfBoundsException
        System.out.println(arrayList.indexOf(1.0));
        System.out.println(arrayList.contains("A"));
    }
}
