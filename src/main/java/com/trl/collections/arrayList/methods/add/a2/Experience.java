package com.trl.collections.arrayList.methods.add.a2;

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
        arrayList.add(1.0);
        arrayList.add(new Integer(3).doubleValue());
        arrayList.add(new Float(3.0).doubleValue());
        arrayList.add(new Long(3).doubleValue());
//        arrayList.add(1.0F);                                                      // Compilation Error !!!
//        arrayList.add(1);                                                         // Compilation Error !!!
//        arrayList.add(1L);                                                        // Compilation Error !!!
        arrayList.add((double) 1);                                                  // Not Compilation Error !!!
        arrayList.add((double) 1.0F);                                               // Not Compilation Error !!!
        arrayList.add((double) 1L);                                                 // Not Compilation Error !!!
    }
}
