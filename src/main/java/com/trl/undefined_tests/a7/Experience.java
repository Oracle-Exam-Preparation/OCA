package com.trl.undefined_tests.a7;

import java.util.Arrays;

/**
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 * @since 7/8/19
 */
public class Experience {
    public static void main(String[] args) {
//        String[] arr = new String[2];
//        System.out.println(Arrays.toString(arr));
//        A.method(arr);                                                                         // NullPointException !!!
//        System.out.println(Arrays.toString(arr));

//        String[] arr_2 = new String[2];
//        arr_2[0] = "a";
//        System.out.println(Arrays.toString(arr_2));
//        A.method(arr_2);                                                                       // NullPointException !!!
//        System.out.println(Arrays.toString(arr_2));

        String[] arr_3 = new String[2];
        arr_3[0] = "a";
        arr_3[1] = "a";
        System.out.println(Arrays.toString(arr_3));
        // Not NullPointException !!!   array without changes
        A.method(arr_3);
        System.out.println(Arrays.toString(arr_3));

        String[] arr_4 = new String[2];
        arr_4[0] = "a";
        arr_4[1] = "a";
        System.out.println(Arrays.toString(arr_4));
        // Not NullPointException !!!   array without changes
        A.method_2(arr_4);
        System.out.println(Arrays.toString(arr_4));

        String[] arr_5 = new String[2];
        arr_5[0] = "a";
        arr_5[1] = "a";
        System.out.println(Arrays.toString(arr_5));
        // Not NullPointException !!!   array without changes
        A.method_3(arr_5);
        System.out.println(Arrays.toString(arr_5));

        String[] arr_6 = new String[2];
        arr_6[0] = "a";
        arr_6[1] = "a";
        System.out.println(Arrays.toString(arr_6));
        // Not NullPointException !!!   array without changes
        A.method_4(arr_6);
        System.out.println(Arrays.toString(arr_6));
    }
}

class A {
    public static void method(String[] arr) {
        int ind = 0;
        for (String str : arr) {
            str.concat(str + " " + ind);
            ind++;
        }
    }

    public static void method_2(String[] arr) {
        int ind = 0;
        for (String str : arr) {
            str = str.concat(str + " " + ind);
            ind++;
        }
    }

    public static void method_3(String[] arr) {
        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i].concat(arr[i] + " " + ind);
            ind++;
        }
    }

    public static void method_4(String[] arr) {
        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].concat(arr[i] + " " + ind);
            ind++;
        }
    }
}