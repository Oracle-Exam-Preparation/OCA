package com.trl.collections.arrayList.methods.get.a1;

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
        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.get(arrayList.size());                                     // java.lang.IndexOutOfBoundsException
//        arrayList.get(arrayList.size() - 1);                                 // java.lang.IndexOutOfBoundsException
//
        ArrayList<String> arrayList_2 = new ArrayList<>();
        arrayList_2.add("A");
//        arrayList_2.get(arrayList_2.size());                                 // java.lang.IndexOutOfBoundsException
        arrayList_2.get(arrayList_2.size() - 1);                               // Not java.lang.IndexOutOfBoundsException
    }
}
