package com.trl.collections.arrayList.methods.add.a3;

import java.util.ArrayList;
import java.util.List;

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
        List list = new ArrayList<Long>();
        list.add(1L);
        list.add(1.0);
        list.add(new Object());
        list.add("Hello");
        list.add(true);

        System.out.println(list.size());
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        List<Long> list_2 = new ArrayList<Long>();
        list_2.add(1L);
//        list_2.add(1.0);                                                        // Compilation Error !!!
//        list_2.add(new Object());                                               // Compilation Error !!!
//        list_2.add("Hello");                                                    // Compilation Error !!!
//        list_2.add(true);                                                       // Compilation Error !!!

        System.out.println(list_2.size());
        System.out.println();

        for (int i = 0; i < list_2.size(); i++) {
            System.out.println(list_2.get(i));
        }
    }
}
