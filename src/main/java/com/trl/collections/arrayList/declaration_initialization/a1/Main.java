package com.trl.collections.arrayList.declaration_initialization.a1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 06/08/19
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        arrayList.add(new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)));
        arrayList.add(new ArrayList<>(Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 18, 19)));
        arrayList.add(new ArrayList<>(Arrays.asList(20, 21, 22, 23, 24, 25, 26, 27, 28, 29)));
        arrayList.add(new ArrayList<>(Arrays.asList(30, 31, 32, 33, 34, 35, 36, 37, 38, 39)));

        System.out.println(arrayList);

        ArrayList<ArrayList<ArrayList<Integer>>> arrayList_1 = new ArrayList<>();
        arrayList_1.add(arrayList);
        arrayList_1.add(arrayList);
        arrayList_1.add(arrayList);

        System.out.println(arrayList_1);
    }
}
