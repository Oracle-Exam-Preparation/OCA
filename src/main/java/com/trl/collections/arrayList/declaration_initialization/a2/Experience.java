package com.trl.collections.arrayList.declaration_initialization.a2;

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
public class Experience {
    public static void main(String[] args) {
        ArrayList<Integer[]> arrayList_1 = new ArrayList<>();

        Integer[] arg_1 = {1, 2, 3};
        Integer[] arg_2 = {4, 5, 6};
        Integer[] arg_3 = {7, 8, 9};

        arrayList_1.add(arg_1);
        arrayList_1.add(arg_2);
        arrayList_1.add(arg_3);

        arrayList_1.forEach(n -> System.out.println(Arrays.toString(n)));

        System.out.println("=========");
        ArrayList<int[]> arrayList_2 = new ArrayList<>();

        int[] arg_11 = {1, 2, 3};
        int[] arg_22 = {4, 5, 6};
        int[] arg_33 = {7, 8, 9};

        arrayList_2.add(arg_11);
        arrayList_2.add(arg_22);
        arrayList_2.add(arg_33);

        arrayList_2.forEach(n -> System.out.println(Arrays.toString(n)));
    }
}
